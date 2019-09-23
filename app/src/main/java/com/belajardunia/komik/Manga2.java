package com.belajardunia.komik;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Manga2 extends AppCompatActivity {

    public static String EXTRA_NAME = "extra_name";
    private TextView GetText;
    private TextView GetTextData;
    private ImageView GetIcon;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_manga2);
        getSupportActionBar().setTitle("Data Bola");
        GetText = (TextView)findViewById(R.id.getText);
        String deskripsi = getIntent().getStringExtra(EXTRA_NAME);
        GetText.setText(deskripsi);

    }


}
