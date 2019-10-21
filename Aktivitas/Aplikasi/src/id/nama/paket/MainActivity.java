package id.nama.paket;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
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
    
    public void onComposeButtonClick(View view) 
    {
    	Intent intent = new Intent(this, SubActivity.class);
    	startActivity(intent);
	}
}
