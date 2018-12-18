package com.test.uitestcases;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = (EditText) findViewById(R.id.inputField);

        Contact contact = new Contact();
        contact.setFirstName("poonam");
        contact.setLastName("singh");
        contact.setPhoneNumber("88021766977");
        AppDataBase.getDatabase(this).contactDao().insert(contact);

        Contact contacts = new Contact();
        contact.setFirstName("pappu");
        contact.setLastName("singh");
        contact.setPhoneNumber("88021766977");

        AppDataBase.getDatabase(this).contactDao().update(contacts);


    }

    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.changeText:
                editText.setText("Lalala");
                Contact contact1 = AppDataBase.getDatabase(this).contactDao().getContactFromPhoneNumber("88021766977");

                Log.d("papu", "onCreate: "+contact1.getFirstName());
                Log.d("papu", "onCreate: "+contact1.getLastName());
                Log.d("papu", "onCreate: "+contact1.getPhoneNumber());

                break;
            case R.id.switchActivity:
                Intent intent = new Intent(this, SecondActivity.class);
                intent.putExtra("input", editText.getText().toString());
                startActivity(intent);
                break;
        }

    }
}
