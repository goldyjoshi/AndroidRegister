package com.example.registerapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onRegister(View view) {
        TextView personFName = findViewById(R.id.textPersonFirstName);
        String fName = personFName.getText().toString();
        TextView firstName = findViewById(R.id.fName);
        firstName.setText(firstName.getText() + fName);

        TextView personLName = findViewById(R.id.textPersonLastName);
        CharSequence lName = personLName.getText();
        TextView lastName = findViewById(R.id.lName);
        lastName.setText(lastName.getText().toString() + " " + personLName.getText());

        TextView personEmail = findViewById(R.id.textPersonEmail);
        String email = personEmail.getText().toString();
        TextView eMail = findViewById(R.id.eMail);
        eMail.setText(eMail.getText() +  email);

        Button registerbutton = findViewById(R.id.buttonRegister);
        registerbutton.setText("Thanks for registration");
    }


}