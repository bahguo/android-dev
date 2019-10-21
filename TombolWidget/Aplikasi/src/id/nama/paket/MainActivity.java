package id.nama.paket;

import android.app.Activity;
import android.os.Bundle;
import android.view.animation.TranslateAnimation;
import android.view.View;

public class MainActivity extends Activity
{
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState)
	{
        super.onCreate(savedInstanceState);

        // Set main.xml as user interface layout
        setContentView(R.layout.main);
    }

    /** Called when the new exit button is clicked. */
    public void onExitButtonClick(View view) 
    {
        finish();
	}

    /** Called when the new drop button is clicked. */
    public void onDropButtonClick(View view) 
    {
    	// Do some fancy animation...
        TranslateAnimation animation = new TranslateAnimation(0, 0, 0, 1000);
		animation.setDuration(1000);
		view.startAnimation(animation);
	}
}
