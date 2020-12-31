package com.fishco.mysecondapplication.view;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.fishco.mysecondapplication.R;
import com.fishco.mysecondapplication.model.AppUser;

public class DetailsActivity extends AppCompatActivity {

    private EditText personName;
    private EditText personLocation;
    private EditText personId;

    public static final String DATA_TAG = "data_tag";

    private Button savePerson;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        personName = findViewById(R.id.person_name_edittext);
        personLocation = findViewById(R.id.person_location_edittext);
        personId = findViewById(R.id.person_id_edittext);

        savePerson = findViewById(R.id.save_user_button);
        savePerson.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name = personName.getText().toString();
                String location = personLocation.getText().toString();
                String id = personId.getText().toString();

                AppUser user = new AppUser(name, location, id);

                Intent intent = new Intent();
                intent.putExtra(DATA_TAG, user);

                setResult(RESULT_OK, intent);
                finish();
            }
        });
    }
}