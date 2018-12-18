package com.kmu.memo_to_do;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class AddMemoActivity extends AppCompatActivity{

    private EditText editText;
    private String memo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_memo);

        editText = findViewById(R.id.memo_text);
        Button btn = findViewById(R.id.addFinish);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                memo = editText.getText().toString();
                Intent add = new Intent();
                add.putExtra("memo",memo);
                setResult(RESULT_OK,add);
                finish();
            }
        });

    }
}

