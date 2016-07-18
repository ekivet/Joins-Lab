package com.example.erickivet.joinslab;

import android.os.Bundle;
import android.provider.ContactsContract;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        DatabaseHelper helper = DatabaseHelper.getInstance(MainActivity.this);

        Employee employee1 = new Employee("123-04-5678","John","Smith",1973,"NY");
        Employee employee2 = new Employee("123-04-5679","David","McWill",1982,"Seattle");
        Employee employee3 = new Employee("123-04-5680","Katerina","Wise",1973,"Boston");
        Employee employee4 = new Employee("123-04-5681","Donald","Lee",1992,"London");
        Employee employee5 = new Employee("123-04-5682","Gary","Henwood",1987,"Las Vegas");
        Employee employee6 = new Employee("123-04-5683","Anthony","Bright",1963,"Seattle");
        Employee employee7 = new Employee("123-04-5684","William","Newey",1995,"Boston");
        Employee employee8 = new Employee("123-04-5685","Melony","Smith",1970,"Chicago");

        Job job1 = new Job("123-04-5678","Fuzz",60,1);
        Job job2 = new Job("123-04-5679","GA",70,2);
        Job job3 = new Job("123-04-5680","Little Place",120,5);
        Job job4 = new Job("123-04-5681","Macy's",78,3);
        Job job5 = new Job("123-04-5682","New Life",65,1);
        Job job6 = new Job("123-04-5683","Believe",158,6);
        Job job7 = new Job("123-04-5684","Macy's",200,8);
        Job job8 = new Job("123-04-5685","Stop",299,12);

        helper.insertRowEmployee(employee1);
        helper.insertRowEmployee(employee2);
        helper.insertRowEmployee(employee3);
        helper.insertRowEmployee(employee4);
        helper.insertRowEmployee(employee5);
        helper.insertRowEmployee(employee6);
        helper.insertRowEmployee(employee7);
        helper.insertRowEmployee(employee8);

        helper.insertRowJob(job1);
        helper.insertRowJob(job2);
        helper.insertRowJob(job3);
        helper.insertRowJob(job4);
        helper.insertRowJob(job5);
        helper.insertRowJob(job5);
        helper.insertRowJob(job6);
        helper.insertRowJob(job7);
        helper.insertRowJob(job8);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
