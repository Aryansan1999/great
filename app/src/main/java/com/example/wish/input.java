package com.example.wish;

import static android.R.layout.simple_spinner_item;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

public class input extends AppCompatActivity {

    EditText name, mess;
    Spinner spinner;
    Button button;
public int i=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_input);
        spinner = findViewById(R.id.spinner);
        button = findViewById(R.id.button);
        name = findViewById(R.id.inpname);
        mess = findViewById(R.id.mess);

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.fest, simple_spinner_item);
        adapter.setDropDownViewResource(simple_spinner_item);
        spinner.setAdapter(adapter);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = spinner.getSelectedItem().toString();
                String text1 = name.getText().toString();
                String text2 = mess.getText().toString();
                if(text.equals("Holi"))
                    i=1;
                else if(text.equals("Diwali"))
                    i=2;
                else if(text.equals("Rakshabandhan"))
                    i=3;
                else if(text.equals("Birthday"))
                    i=4;
                else if(text.equals("Anniversary"))
                    i=5;

                switch (i){
                    case 1:
                    {
                        Intent intent = new Intent(getApplicationContext(), last.class);
                        intent.putExtra("text1", text1);
                        intent.putExtra("text2", text2);
                        startActivity(intent);
                        break;
                    }
                    case 2:
                    {
                        Intent intent = new Intent(getApplicationContext(), diwali.class);
                        intent.putExtra("text1", text1);
                        intent.putExtra("text2", text2);
                        startActivity(intent);
                        break;
                    }
                    case 3:
                    {
                        Intent intent = new Intent(getApplicationContext(), Rakshabandhan.class);
                        intent.putExtra("text1", text1);
                        intent.putExtra("text2", text2);
                        startActivity(intent);
                        break;
                    }
                    case 4:
                    {
                        Intent intent = new Intent(getApplicationContext(), Birthday.class);
                        intent.putExtra("text1", text1);
                        intent.putExtra("text2", text2);
                        startActivity(intent);
                        break;
                    }
                    case 5:
                    {
                        Intent intent = new Intent(getApplicationContext(), Anniversary.class);
                        intent.putExtra("text1", text1);
                        intent.putExtra("text2", text2);
                        startActivity(intent);
                        break;
                    }
                }
            }
        });
    }
}