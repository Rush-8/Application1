package com.example.a01;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.a01.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void navigateToAddBook(View view) {
        Intent intent = new Intent(this, com.example.a01.AddBookActivity.class);
        startActivity(intent);
    }

    public void navigateToAddMember(View view) {
        Intent intent = new Intent(this, com.example.a01.AddMemberActivity.class);
        startActivity(intent);
    }


    public void navigateToViewBook(View view) {
        Intent intent = new Intent(this, com.example.a01.BookManagementActivity.class);
        startActivity(intent);
    }

    public void navigateToViewMember(View view) {
        Intent intent = new Intent(this, com.example.a01.MemberManagementActivity.class);
        startActivity(intent);
    }


}
