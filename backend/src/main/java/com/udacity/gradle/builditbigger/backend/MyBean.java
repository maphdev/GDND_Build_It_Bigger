package com.udacity.gradle.builditbigger.backend;

import com.example.jokesproviderlibrary.JokesProvider;

/** The object model for the data we are sending through endpoints */
public class MyBean {

    private String randomJoke;
    private JokesProvider jokesProvider = new JokesProvider();

    public String getData() {
        randomJoke = jokesProvider.getRandomJoke();
        return randomJoke;
    }

    public void setData(String data) {
        randomJoke = data;
    }
}