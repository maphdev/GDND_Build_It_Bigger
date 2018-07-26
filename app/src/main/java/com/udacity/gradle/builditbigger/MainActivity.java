package com.udacity.gradle.builditbigger;

import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.example.jokesdisplayerlibrary.JokesDisplayer;
import com.example.jokesproviderlibrary.JokesProvider;

import java.util.concurrent.ExecutionException;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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

    public void tellJoke(View view) {
        /*
        JokesProvider jokesProvider = new JokesProvider();
        String random = jokesProvider.getRandomJoke();

        Toast.makeText(this, random, Toast.LENGTH_SHORT).show();

        Intent startJokeActivity = new Intent(getApplicationContext(), JokesDisplayer.class);
        startJokeActivity.putExtra(JokesDisplayer.INTENT_STRING, random);
        startActivity(startJokeActivity);*/

        String randomJoke = "";
        AsyncTask<Context, Void, String> async = new EndpointsAsyncTask().execute(getApplicationContext());
        try {
            randomJoke = async.get();
        } catch (InterruptedException e){
            e.printStackTrace();
        } catch (ExecutionException e){
            e.printStackTrace();
        }

        Context context = getApplicationContext();
        Class destinationClass = JokesDisplayer.class;

        Intent startJokeActivity = new Intent(context, destinationClass);
        startJokeActivity.putExtra(JokesDisplayer.INTENT_STRING, randomJoke);

        startActivity(startJokeActivity);
    }


}
