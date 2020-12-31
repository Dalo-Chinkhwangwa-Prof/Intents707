package com.fishco.mysecondapplication.view;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.fishco.mysecondapplication.R;
import com.fishco.mysecondapplication.model.AppUser;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    private Button mainButton;

    private TextView nameTextView, userIdTextView, locationTextView;

    private final int REQUEST_CODE = 707;
    /*
     * Android Intents
     * are the way the android operating system performs actions
     *
     * 2 Types
     * Implicit Intent: handled by the Operating system - e.g opening system settings from app
     *
     * Explicit Intent: application declares action to be performed - eg Opening an activity
     * */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mainButton = findViewById(R.id.main_button);
        nameTextView = findViewById(R.id.name_textview);
        userIdTextView = findViewById(R.id.user_id);
        locationTextView = findViewById(R.id.location_textview);

        mainButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, DetailsActivity.class);
                //startActivity(intent);
                startActivityForResult(intent, REQUEST_CODE);
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode == REQUEST_CODE) {
            AppUser appUser = (AppUser) data.getSerializableExtra(DetailsActivity.DATA_TAG);
            updateInfo(appUser);
        }
    }

    private void updateInfo(AppUser appUser) {
        nameTextView.setText(appUser.getName());
        locationTextView.setText(appUser.getLocation());
        userIdTextView.setText(appUser.getUserId());
    }
}














