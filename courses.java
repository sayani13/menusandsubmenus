package com.example.mahe.lab6q1;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class courses extends Activity {
    String[] acc_date = {"CCE", "IT", "CSE", "ECE", "EEE"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_courses);
        ListView lv = (ListView) findViewById(R.id.listview);
        ArrayList<String> values = new ArrayList<String>();
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, values);
        for(int i=0;i<acc_date.length;i++)
            values.add(acc_date[i]);
        lv.setAdapter(adapter);
    }
    public boolean onCreateOptionsMenu(Menu menu)
    {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.menu, menu);
        return true;
    }
    public boolean onOptionsItemSelected(MenuItem item)
    {

        switch (item.getItemId())
        {
            case R.id.admission:
                Intent intent = new Intent(this, admission.class);
                Toast.makeText(this, "Bookmark is Selected", Toast.LENGTH_SHORT).show();
                startActivity(intent);
                return true;

            case R.id.faculty:
                Intent intent1 = new Intent(this, faculty.class);
                Toast.makeText(this, "Save is Selected", Toast.LENGTH_SHORT).show();
                startActivity(intent1);
                return true;
            case R.id.about_us:
                Toast.makeText(this, "Welcome to manipal institute of technology,manipal,karnataka,india", Toast.LENGTH_SHORT).show();
                return true;

            case  R.id.contact_us:
                String[] acc_date = {"Ph no:9008165615/7208456491", "email_id:abcd@gmail.com", "website:Mit.in"};
                ListView lv = (ListView) findViewById(R.id.listview);
                ArrayList<String> values = new ArrayList<String>();
                ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, values);
                for(int i=0;i<acc_date.length;i++)
                    values.add(acc_date[i]);
                lv.setAdapter(adapter);
                return true;
            case R.id.homepage:
                Intent intent4 = new Intent(this,MainActivity.class);
                startActivity(intent4);


                return true;

            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
