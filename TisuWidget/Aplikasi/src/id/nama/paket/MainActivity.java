package id.nama.paket;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

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

    public void onYesButtonClick(View view) 
    {
    	// This Java code shows a toast
    	Toast.makeText(this, "Benar!", Toast.LENGTH_SHORT).show();
	}
	public void onNoButtonClick(View view) 
    {
    	// This Java code shows a toast
    	Toast.makeText(this, "Salah!", Toast.LENGTH_SHORT).show();
	}

}
