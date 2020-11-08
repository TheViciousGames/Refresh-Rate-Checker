package com.theviciousgames.refreshratechecker;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView refreshRateTextView;
    private Button refreshButton;
    private String rateVal=null,rateValShortened=null;
    private int dotChar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        declareVars();
        buttonFunctions();
        getRefreshRateFunct();
    }

    protected void declareVars()
    {
        refreshRateTextView=findViewById(R.id.refreshRateTextView);
        refreshButton=findViewById(R.id.refreshButton);
    }

    protected void buttonFunctions()
    {
        refreshButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                getRefreshRateFunct();
            }
        });
    }

    protected void getRefreshRateFunct()
    {
        rateVal=(Tools.Utils.getRefreshRate(MainActivity.this));
        dotChar=rateVal.indexOf(".");
        rateValShortened="";
        if(dotChar!=-1)
        {
            rateValShortened=rateVal.substring(0,dotChar)+" hz";
        }
        refreshRateTextView.setText(rateValShortened);

        Tools.Utils.vibrate(MainActivity.this);
    }
}