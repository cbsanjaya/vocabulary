package com.cbsanjaya.vocab;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class QuestionActivity extends AppCompatActivity {

    private ArrayList<Vocab> questions;
    private Vocab currentVocab;
    private int qNumber = 0;
    private int qScore = 0;
    private String qLevel;
    private int qChapter;
    private TextView mQuestion, mScore, mInfo;
    private EditText mAnswer1, mAnswer2, mAnswer3, mAnswer4;
    private Button mCheck;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question);

        Intent intent = getIntent();
        qLevel = intent.getStringExtra("LEVEL");
        qChapter = intent.getIntExtra("CHAPTER", 0);
        String chapterText = intent.getStringExtra("CHAPTER_TEXT");

        ActionBar ab = getSupportActionBar();
        if (ab != null) {
            ab.setDisplayHomeAsUpEnabled(true);
            ab.setSubtitle(qLevel + " " + chapterText);
        }

        mQuestion = findViewById(R.id.txQuestion);
        mScore = findViewById(R.id.txScore);
        mInfo = findViewById(R.id.txInfo);
        mAnswer1 = findViewById(R.id.edAnswer1);
        mAnswer2 = findViewById(R.id.edAnswer2);
        mAnswer3 = findViewById(R.id.edAnswer3);
        mAnswer4 = findViewById(R.id.edAnswer4);
        mCheck = findViewById(R.id.btnCheck);
        mCheck.setVisibility(View.VISIBLE);

        if (savedInstanceState == null) {
            generateQuestion();
        } else {
            questions = savedInstanceState.getParcelableArrayList("QUESTIONS_KEY");
            qNumber = savedInstanceState.getInt("NUMBER_KEY");
            qScore = savedInstanceState.getInt("SCORE_KEY");
        }
        updateQuestion();
    }

    @Override
    public void onSaveInstanceState(@NonNull Bundle outState) {
        outState.putInt("NUMBER_KEY", qNumber);
        outState.putInt("SCORE_KEY", qScore);
        outState.putParcelableArrayList("QUESTIONS_KEY", questions);
        super.onSaveInstanceState(outState);
    }

    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }

    private void generateQuestion() {
        switch (qLevel) {
            case "PreBasic":
                questions = new BasicQuestions(qChapter).gallery;
                break;
            case "Basic":
                questions = new BasicQuestions(qChapter).gallery;
                break;
            case "PreIntermediate":
                questions = new BasicQuestions(qChapter).gallery;
                break;
            case "Intermediate":
                questions = new BasicQuestions(qChapter).gallery;
                break;
        }
    }

    private void updateQuestion() {
        currentVocab = questions.get(qNumber);
        mQuestion.setText(currentVocab.getBahasa());
        mInfo.setVisibility(View.GONE);

        mAnswer1.requestFocus();
        mAnswer1.setText("");
        mAnswer2.setText("");
        mAnswer3.setText("");
        mAnswer4.setText("");

        if (currentVocab.isVerb()) {
            mAnswer1.setHint(R.string.verb_1);
            mAnswer2.setVisibility(View.VISIBLE);
            mAnswer3.setVisibility(View.VISIBLE);
            mAnswer4.setVisibility(View.VISIBLE);
        } else {
            mAnswer1.setHint(R.string.noun);
            mAnswer2.setVisibility(View.GONE);
            mAnswer3.setVisibility(View.GONE);
            mAnswer4.setVisibility(View.GONE);
        }
        mScore.setText(getResources().getString(R.string.correct_info, (qNumber+1), qScore, questions.size()));
    }

    public void reset(View view) {
        qNumber = 0;
        qScore = 0;
        mCheck.setVisibility(View.VISIBLE);
        generateQuestion();
        updateQuestion();
    }

    public void checkAnswer() {
        String lAnswer1 = mAnswer1.getText().toString().toLowerCase();

        if (currentVocab.isVerb()) {
            String lAnswer2 = mAnswer2.getText().toString().toLowerCase();
            String lAnswer3 = mAnswer3.getText().toString().toLowerCase();
            String lAnswer4 = mAnswer4.getText().toString().toLowerCase();

            if (lAnswer1.equals(currentVocab.getEnglish1())
                    & lAnswer2.equals(currentVocab.getEnglish2())
                    & lAnswer3.equals(currentVocab.getEnglish3())
                    & lAnswer4.equals(currentVocab.getEnglishIng())) {
                mInfo.setText(R.string.correct_answer);
                qScore++;
            } else {
                mInfo.setText(getResources()
                        .getString(R.string.wrong_answer,
                                currentVocab.getEnglish1() + ", " +
                                        currentVocab.getEnglish2() + ", " +
                                        currentVocab.getEnglish3() + ", " +
                                        currentVocab.getEnglishIng()));
            }
            mInfo.setVisibility(View.VISIBLE);
        } else {
            if (lAnswer1.equals(currentVocab.getEnglish1())) {
                mInfo.setText(R.string.correct_answer);
                qScore++;
            } else {
                mInfo.setText(getResources().getString(R.string.wrong_answer, currentVocab.getEnglish1()));
            }
            mInfo.setVisibility(View.VISIBLE);
        }
        mScore.setText(getResources().getString(R.string.correct_info, (qNumber+1), qScore, questions.size()));
        if (qNumber+1 == questions.size()) {
            mCheck.setVisibility(View.GONE);
        }
    }

    public void check(View view) {
        Button button = (Button) view;
        if (button.getText().toString().equals(getString(R.string.check))) {
            button.setText(R.string.next);
            checkAnswer();
        } else {
            qNumber++;
            button.setText(R.string.check);
            updateQuestion();
        }
    }
}
