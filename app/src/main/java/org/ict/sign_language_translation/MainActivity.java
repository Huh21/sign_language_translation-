package org.ict.sign_language_translation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.ict.sign_language_translation.mlkit.OCRActivity;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // OCR 기능 불러오기
        Button bt_ocr = findViewById(R.id.bt_ocr);

        // Translation 기능 불러오기
        Button bt_trn = findViewById(R.id.bt_trn);

        bt_ocr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), OCRActivity.class);
                startActivity(intent);
            }
        });

        bt_trn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Translation.class);
                startActivity(intent);
            }
        });
    }
}

/*
        // Json 처리
        TextView textView = findViewById(R.id.text);
        DatabaseReference db;
        db = FirebaseDatabase.getInstance().getReference().child("data").child("0").child("attributes").child("0").child("name");
        String sentence = "실습실";

        db.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                String value = snapshot.getValue(String.class);
                Log.d("TAG", "Value is: " + value);
                // textView.setText(value);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {
            }
        }); */