package com.example.recyclerview4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.Toast;

import com.synnapps.carouselview.CarouselView;
import com.synnapps.carouselview.ImageClickListener;
import com.synnapps.carouselview.ImageListener;

public class DetaiActivity extends AppCompatActivity {
    CarouselView carouselView;
int[] arrayimage = new int[]
        {R.drawable.matebookforsale,R.drawable.macbookforsale,R.drawable.thirdcharger,R.drawable.dell};

String[] imagetitle = new String[] {"matebook","macbook","charger","Dell"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_detai );

        carouselView = findViewById( R.id.carousel );
        carouselView.setPageCount( arrayimage.length );
        carouselView.setImageListener( new ImageListener() {
            @Override
            public void setImageForPosition(int position, ImageView imageView) {
imageView.setImageResource( arrayimage[position] );
            }
        } );
        carouselView.setImageClickListener( new ImageClickListener() {
            @Override
            public void onClick(int position) {
                Toast.makeText( DetaiActivity.this, imagetitle[position], Toast.LENGTH_SHORT ).show();
            }
        } );
    }
}
