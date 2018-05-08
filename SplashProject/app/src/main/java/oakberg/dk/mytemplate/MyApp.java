package oakberg.dk.mytemplate;

import android.app.Application;
import android.os.SystemClock;

public class MyApp extends Application {

    public void onCreate(){
        super.onCreate();
        SystemClock.sleep(2000);
    }
}
