/**
 * @author dhanush n
 * @version 1.0
 */


package com.huawei.dhanush.accountkit;

import android.content.Intent;

import android.os.Bundle;


import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent intent = new Intent(this,QuickStartActivity.class);
        startActivity(intent);
    }


}