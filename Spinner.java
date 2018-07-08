
package com.example.Pacasian.pacy;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by sumith on 16-10-2017.
 */

public class about extends AppCompatActivity {

 private Spinner spinner;
    private static final String[]path = {"1", "2", "3"};

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.about);

        spinner = (Spinner)findViewById(R.id.spinner);
        ArrayAdapter<String>adapter = new ArrayAdapter<String>(about.this,
                android.R.layout.simple_spinner_item,path);

        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(this);

    }

    public void onItemSelected(AdapterView<?> parent, View v, int position, long id) {

        switch (position) {
            case 0:
               Toast.makeText(about.this, "one", Toast.LENGTH_SHORT).show();
                break;
            case 1:
                Toast.makeText(about.this, "two", Toast.LENGTH_SHORT).show();
                break;
            case 2:
                Toast.makeText(about.this, "three", Toast.LENGTH_SHORT).show();
                break;

        }
    }

}
