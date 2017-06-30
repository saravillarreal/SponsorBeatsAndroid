package app.sponsorbeats.com.sponsorbeats;

import android.view.View;

import com.daimajia.androidanimations.library.Techniques;
import com.daimajia.androidanimations.library.YoYo;

/**
 * Created by Sara Villarreal on 6/30/2017.
 */

public class Animation {

    public static void shakeAnimation(View v)
    {
        YoYo.with(Techniques.Shake).delay(100)
                .duration(1000)
                .playOn(v);
    }

    public static void pulseAnimation( View v)
    {
        YoYo.with(Techniques.Pulse)
                .duration(375)
                .playOn(v);
    }
}
