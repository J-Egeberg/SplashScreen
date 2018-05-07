# SplashScreen - Article

## Indledning

Denne artikel består af to forskellige dele. 
I den første del beskrives hvad en SplashScreen er og hvorfor den er relevant i moderne app udvikling. En SplashScreen er en intro der skal vises inden selve appen starter.
Del nr. to skal betragtes som en slags "tutorial", som man kan følge hvis man ønsker at lave en SplashScreen i ens eget android projekt.

### Hvad og Hvorfor - SplashScreen

### Tutorial

Create a Splash Screen on Android : the Right Way !
At a certain moment in the past, Google advised against using a Splash Screen on Android Applications. It was useless. Then, when they have published the Material Design Specifications, some of us have seen that the Splash Screen was now a pattern known as Launch Screen. Ideal to display your brand logo during cold start of applications. So, what’s the difference between the bad Splash Screen and the good Splash Screen ?

The difference is just the way you implement if. Previously, developers implemented the Splash Screen by displaying their brand logo on the screen during a certain time. The right way to implement a Launch Screen is now just to display your brand logo the time the application starts and no more.

To create a correct Splash Screen, you need to create a background that will display your brand logo to the screen. For this, you must create an XML file in the res/drawable folder :

![alt text](https://github.com/J-Egeberg/SplashScreen/blob/master/Pictures/1.png)

Next step is to create a dedicated theme for your Splash Activity. For this, you must inherit from the Theme.AppCompat.NoActionBar theme :

![alt text](https://github.com/J-Egeberg/SplashScreen/blob/master/Pictures/2.png)

Note that your Splash Theme has just to define the android:windowBackground item and set up the background created previously.

Now, you can create your SplashActivity :

![alt text](https://github.com/J-Egeberg/SplashScreen/blob/master/Pictures/3.png)

No need to define a content view for the SplashActivity because you are going to apply the SplashTheme on it. So, you have just to launch the MainActivity of your Android Application and then finish the SplashActivity by calling the finish() method.

Don’t forget to define your SplashActivity in the Android Manifest and apply the SplashTheme on it :

![alt text](https://github.com/J-Egeberg/SplashScreen/blob/master/Pictures/4.png)

Then, you can write the code of your Android Application in your MainActivity as you want. You can try the application by seeing the demo in the previous video. Now, you could make Splash Screen on Android by following the right way !
