package ru.startandroid.develop.multiscreen;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class OSTROVA extends Activity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ostrova);
    }
    public void onClick(View v){
        Intent intent = new Intent(OSTROVA.this, MainActivity.class);
        startActivity(intent);
    }
}