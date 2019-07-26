package com.cbsanjaya.vocab;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Questions questions;
    private Vocab currentVocab;
    private int qNumber = 0;
    private int qScore = 0;
    private TextView mQuestion, mScore, mInfo;
    private EditText mAnswer1, mAnswer2, mAnswer3, mAnswer4;
    private Button mCheck, mReset, mNext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        questions = new Questions();
        mQuestion = findViewById(R.id.txQuestion);
        mScore = findViewById(R.id.txScore);
        mInfo = findViewById(R.id.txInfo);
        mAnswer1 = findViewById(R.id.edAnswer1);
        mAnswer2 = findViewById(R.id.edAnswer2);
        mAnswer3 = findViewById(R.id.edAnswer3);
        mAnswer4 = findViewById(R.id.edAnswer4);
        mCheck = findViewById(R.id.btnCheck);
        mNext = findViewById(R.id.btnNext);
        mReset = findViewById(R.id.btnReset);

        updateQuestion();
    }

    private void updateQuestion() {
        if (qNumber < questions.gallery.size()) {
            mCheck.setVisibility(View.VISIBLE);
            mNext.setVisibility(View.INVISIBLE);

            currentVocab = questions.gallery.get(qNumber);
            mQuestion.setText(currentVocab.getBahasa());
            mInfo.setVisibility(View.INVISIBLE);

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
                mAnswer2.setVisibility(View.INVISIBLE);
                mAnswer3.setVisibility(View.INVISIBLE);
                mAnswer4.setVisibility(View.INVISIBLE);
            }
            mScore.setText("Pertanyaan ke: " + (qNumber + 1) + ", Benar: " + qScore + " dari: " + questions.gallery.size());
        } else {
            mCheck.setVisibility(View.INVISIBLE);
        }
    }

    public void reset(View view) {
        questions = new Questions();
        qNumber = 0;
        qScore = 0;
        updateQuestion();
    }

    public void check(View view) {
        if (TextUtils.isEmpty(mAnswer1.getText())) {
            mAnswer1.setError("Field is Required");
            return;
        }

        String lAnswer1 = mAnswer1.getText().toString().toLowerCase();

        if (currentVocab.isVerb()) {
            if (TextUtils.isEmpty(mAnswer2.getText())) {
                mAnswer2.setError("Field is Required");
                return;
            }

            if (TextUtils.isEmpty(mAnswer3.getText())) {
                mAnswer3.setError("Field is Required");
                return;
            }

            if (TextUtils.isEmpty(mAnswer4.getText())) {
                mAnswer4.setError("Field is Required");
                return;
            }

            String lAnswer2 = mAnswer2.getText().toString().toLowerCase();
            String lAnswer3 = mAnswer3.getText().toString().toLowerCase();
            String lAnswer4 = mAnswer4.getText().toString().toLowerCase();

            if (lAnswer1.equals(currentVocab.getEnglish1())
                    & lAnswer2.equals(currentVocab.getEnglish2())
                    & lAnswer3.equals(currentVocab.getEnglish3())
                    & lAnswer4.equals(currentVocab.getEnglishIng())) {
                mInfo.setText(R.string.correct);
                qScore++;
            } else {
                mInfo.setText("the Correct Answers Are: " +
                        currentVocab.getEnglish1() + ", " +
                        currentVocab.getEnglish2() + ", " +
                        currentVocab.getEnglish3() + ", " +
                        currentVocab.getEnglishIng());
            }
            mInfo.setVisibility(View.VISIBLE);
        } else {
            if (lAnswer1.equals(currentVocab.getEnglish1())) {
                mInfo.setText(R.string.correct);
                qScore++;
            } else {
                mInfo.setText("the Correct Answer is: " + currentVocab.getEnglish1());
            }
            mInfo.setVisibility(View.VISIBLE);
        }
        mCheck.setVisibility(View.INVISIBLE);
        mNext.setVisibility(View.VISIBLE);
    }

    public void next(View view) {
        qNumber++;
        updateQuestion();
    }
}
