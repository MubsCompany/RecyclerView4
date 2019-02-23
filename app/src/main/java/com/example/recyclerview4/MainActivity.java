package com.example.recyclerview4;

import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
RecyclerView rvbarang;
BarangAdapter adapter;
FragmentManager fm;
ImageView imge;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );

    adapter = new BarangAdapter( this );
    rvbarang = findViewById( R.id.list );
    rvbarang.setLayoutManager( new GridLayoutManager( this,2 ) );
    rvbarang.setAdapter( adapter );
    fm = getSupportFragmentManager();


    }

}
