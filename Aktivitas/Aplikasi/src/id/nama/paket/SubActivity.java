package id.nama.paket;

import android.app.Activity;
import android.os.Bundle;

public class SubActivity extends Activity
{
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState)
	{
        super.onCreate(savedInstanceState);
        
        // Set sub.xml as user interface layout
        setContentView(R.layout.sub);
    }
}
