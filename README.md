# Build It Bigger : Gradle for Android and Java project

This project is an app with multiple flavors that uses
multiple libraries and Google Cloud Endpoints. The finished app consists
of four modules. A Java library that provides jokes, a Google Cloud Endpoints
(GCE) project that serves those jokes, an Android Library containing an
activity for displaying jokes, and an Android app that fetches jokes from the
GCE module and passes them to the Android Library for display.

## Why this Project

![gradle logo](http://www.tutos-android.com/wp-content/uploads/2015/02/gradle.png)

As Android projects grow in complexity, it becomes necessary to customize the
behavior of the Gradle build tool, allowing automation of repetitive tasks.
Particularly, factoring functionality into libraries and creating product
flavors allow for much bigger projects with minimal added complexity.

## Concepts

- Gradle
- multi project build
- dependencies
- creation of Java libraries
- creation of Android libraries
- Gradle App Engine plugin in order to deploy a backend
- Google Cloud Endpoints (GCE)
- asyncTask
- connected test / JUnit
- free and paid flavors
- Google Play Services / Google AdMob
