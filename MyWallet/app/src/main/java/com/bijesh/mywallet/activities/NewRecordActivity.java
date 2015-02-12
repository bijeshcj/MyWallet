package com.bijesh.mywallet.activities;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;

import com.bijesh.mywallet.R;

/**
 * Created by Bijesh on 12-02-2015.
 */
public class NewRecordActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle("New Record");
        setContentView(R.layout.activity_newrecord);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.new_record,menu);
        return true;
    }
}
