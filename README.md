# SplashScreen - Article

## Intro

The Point of this article is to give the reader an insight in SplashScreens. Both what it is and why it is usefull.

The article consists of two different parts.
The first parts describes what is a SplashScreen and why it is Relevant in modern app development. A SplashScreen is the intro that runs before the app itself.
The second part of this article is meant to be a tutorial, one can follow if he/she wishes to create a SplashScreen with a logo, cinematic etc. in an android project.

### What and Why - SplashScreen

### Tutorial

Create a Splash Screen on Android:

A Splash Screen is as mentioned better described with the "launch screen" term. The idea is to display a logo or whatever in the start of an application. So how do we create a good launch screen. What is the difference between a good and a bad launch screen. 
It all depends on how you implement the launch screen.

Previously developers implemented the launch screen by displaying their brand logo during a certain amount of time. 
However the right way of doing it is different. Now the ideal way to display, for instance a brand logo, is during the cold start of your application.

The right way is to display the logo as the application starts and no more.

What follows is to be a short guide on how to implement a splash screen:

When creating a correct Splash screen you need to follow a few steps:
  - Create Screen
  - Create Theme
  - Create SplashActivity
  - Create MainActivity to run code afterwards
  - Run Code
  
These Steps is explained and documented by images for transparency below.

To create a correct Splash Screen, you need to create a background that will display your brand logo to the screen. For this, you must create an XML file in the res/drawable folder like so:

![alt text](https://github.com/J-Egeberg/SplashScreen/blob/master/Pictures/1.png)

Next step is to create a dedicated theme for your Splash Activity. For this, you must inherit from the Theme.AppCompat.NoActionBar theme like shown:

![alt text](https://github.com/J-Egeberg/SplashScreen/blob/master/Pictures/2.png)

Note that your Splash Theme has just to define the android:windowBackground item and set up the background created previously.

Now, you can create your SplashActivity just like in the photo below:

![alt text](https://github.com/J-Egeberg/SplashScreen/blob/master/Pictures/3.png)

No need to define a content view for the SplashActivity because you are going to apply the SplashTheme on it. So, you have just to launch the MainActivity of your Android Application and then finish the SplashActivity by calling the finish() method.

Don’t forget to define your SplashActivity in the Android Manifest and apply the SplashTheme on it:

![alt text](https://github.com/J-Egeberg/SplashScreen/blob/master/Pictures/4.png)

Then, you can write the code of your Android Application in your MainActivity as you want. 

You can try this application simply by cloning or downloading it as a zip file and run the project.

Now, you could make Splash Screen on Android by following the right way !

PS. If this guide isnt enough you can try this link, 
if you are more into a visual explanation: https://youtu.be/E5k696ekXwg 
