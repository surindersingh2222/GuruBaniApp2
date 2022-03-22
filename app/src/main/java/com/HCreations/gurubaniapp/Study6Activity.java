package com.HCreations.gurubaniapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class Study6Activity extends AppCompatActivity {

    PDFView study6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_study6);

        study6=(PDFView) findViewById(R.id.pdfView6);
        study6.fromAsset("part6.pdf").load();
    }
}