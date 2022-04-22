package com.dim.college_student_managementcsm;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;


public class MainActivity extends AppCompatActivity {

    ImageButton student_btn;
    ImageButton attendance_btn;
    ImageButton faculty_btn;
    ImageButton pdf_btn;
    ImageButton notice_btn;
    ImageButton events_btn;
    ImageButton about_btn;
    ImageButton achievement_btn;
    ImageButton placement_btn;
    ImageButton contact_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

// this is Add student button start ------
 student_btn = findViewById(R.id.student);
 student_btn.setOnClickListener(new View.OnClickListener() {
     @Override
     public void onClick(View v) {
         Intent intent_one= new Intent(MainActivity.this,StudentI_btn.class);
         startActivity(intent_one);
     }
 });
 // this is Add student button end  ------

        // this is Add attendance button start  ------
        attendance_btn = findViewById(R.id.attendance);
        attendance_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent_one= new Intent(MainActivity.this,Attendance_btn.class);
                startActivity(intent_one);
            }
        });
        // this is Add attendance button end  ------


        // this is Add Faculty button start  ------
        faculty_btn = findViewById(R.id.faculty);
        faculty_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent_one= new Intent(MainActivity.this,Faculty_btn.class);
                startActivity(intent_one);
            }
        });
       // this is Add Faculty button end  ------

        // this is Add pdf button start  ------
        pdf_btn = findViewById(R.id.pdf);
        pdf_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent_one= new Intent(MainActivity.this,Pdf_btn.class);
                startActivity(intent_one);
            }
        });
        // this is Add pdf button end  ------

        // this is Add notice button start  ------
        notice_btn = findViewById(R.id.notice);
        notice_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent_one= new Intent(MainActivity.this,Notice_btn.class);
                startActivity(intent_one);
            }
        });
        // this is Add notice button end  ------

        // this is Add events button start  ------
        events_btn = findViewById(R.id.events);
        events_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent_one= new Intent(MainActivity.this,Events_btn.class);
                startActivity(intent_one);
            }
        });
        // this is Add events button end  ------

        // this is Add about button start  ------
        about_btn = findViewById(R.id.about);
        about_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent_one= new Intent(MainActivity.this,About_btn.class);
                startActivity(intent_one);
            }
        });
        // this is Add about button end  ------

        // this is Add achievements button start  ------
        achievement_btn = findViewById(R.id.achievements);
        achievement_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent_one= new Intent(MainActivity.this,Achievents_btn.class);
                startActivity(intent_one);
            }
        });
        // this is Add achievements button end  ------

        // this is Add Placements button start  ------
        placement_btn = findViewById(R.id.placements);
        placement_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent_one= new Intent(MainActivity.this,Placement_btn.class);
                startActivity(intent_one);
            }
        });
        // this is Add Placements button end  ------

        // this is Add contact button start  ------
        contact_btn = findViewById(R.id.contact);
        contact_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent_one= new Intent(MainActivity.this,Contact_btn.class);
                startActivity(intent_one);
            }
        });
        // this is Add contact button end  ------

    }
}