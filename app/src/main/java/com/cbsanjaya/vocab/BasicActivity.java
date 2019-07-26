package com.cbsanjaya.vocab;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class BasicActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basic);
        ListView lvChapter = findViewById(R.id.lvChapter);

        String[] values = {
                "Chapter 1",
                "Chapter 2",
                "Chapter 3",
                "Chapter 4",
                "Review 1",
                "Chapter 5",
                "Chapter 6",
                "Chapter 7",
                "Chapter 8",
                "Review 2",
                "Chapter 9",
                "Chapter 10",
                "Chapter 11",
                "Chapter 12",
                "Review 3",
                "Chapter 13",
                "Chapter 14",
                "Chapter 15",
                "Chapter 16",
                "Final Review",
        };

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, android.R.id.text1, values);

        lvChapter.setAdapter(adapter);

        lvChapter.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                Intent intent = new Intent(getApplicationContext(), QuestionActivity.class);
                intent.putExtra("LEVEL", "Basic");
                intent.putExtra("CHAPTER", position);
                startActivity(intent);
            }
        });
    }
}
