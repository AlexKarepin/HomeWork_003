package com.karepin.homework_003;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button button;
    private TextView textView;
    private TextView vievName;
    private TextView vievEmail;
    //    String name = vievName.getText().toString();
    //    String email = vievEmail.getText().toString();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        add();
        clear();
        vievName = findViewById(R.id.editText);
        vievEmail = findViewById(R.id.editText2);
    }
    private void add() {
        button = findViewById(R.id.buttonOk);
        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                textView.setText("Подписка успешно оформлена для пользователя " + vievName.getText().toString() + " , почта: " + vievEmail.getText().toString());
            }
        });
        textView = findViewById(R.id.window);
    }
    private void clear() {
        button = findViewById(R.id.buttonClear);
        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                textView.setText("Данные удалены");
            }
        });
        textView = findViewById(R.id.window);
    }
}