package com.example.customview;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.customview.views.CustomViews;
public class MainActivity extends AppCompatActivity {

    CustomViews customViews;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );
        button = findViewById( R.id.button );
        customViews = findViewById( R.id.custom );
        
        button.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                customViews.swapColor();
            }
        } );
    }
}
