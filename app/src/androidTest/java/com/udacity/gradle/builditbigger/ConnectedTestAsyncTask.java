package com.udacity.gradle.builditbigger;

import android.content.Context;
import android.os.AsyncTask;
import android.support.test.InstrumentationRegistry;
import android.support.test.runner.AndroidJUnit4;

import com.example.jokesproviderlibrary.JokesProvider;

import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.concurrent.ExecutionException;

import static junit.framework.Assert.assertNotNull;
import static org.hamcrest.Matchers.isEmptyString;
import static org.hamcrest.Matchers.not;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

@RunWith(AndroidJUnit4.class)
    public class ConnectedTestAsyncTask {
        @Test
        public void AsyncTaskTest (){
            String randomJoke = "";
            AsyncTask<Context, Void, String> async = new EndpointsAsyncTask().execute(InstrumentationRegistry.getContext());

            try {

                randomJoke = async.get();
            } catch (InterruptedException e){
                e.printStackTrace();
            } catch (ExecutionException e){
                e.printStackTrace();
            }

            assertNotNull(randomJoke);
            assertThat(randomJoke, not(isEmptyString()));
            assertTrue(JokesProvider.getJokesCollection().contains(randomJoke));
        }
    }