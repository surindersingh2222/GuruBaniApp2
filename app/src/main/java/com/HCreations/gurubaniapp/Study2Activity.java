package com.HCreations.gurubaniapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class Study2Activity extends AppCompatActivity {

    PDFView study2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_study2);

        study2=(PDFView) findViewById(R.id.pdfView2);
        study2.fromAsset("part2.pdf").load();
    }
}