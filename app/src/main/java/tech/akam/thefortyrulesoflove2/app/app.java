package tech.akam.thefortyrulesoflove2.app;

import android.util.Log;
import android.widget.Toast;

import tech.akam.thefortyrulesoflove2.app.Application;

public class app {

    public static class main {
        public static final String TAG = "Season5";

    }

    public static void l(String message) {
        Log.e (main.TAG , message);

    }

    public static void t(String message) {
        Toast.makeText ( Application.getContext () , message , Toast.LENGTH_SHORT ).show ();

    }
}
