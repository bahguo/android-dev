package id.nama.paket;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
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
	
	public void onBatonKlik(View view)
    {
    	Uri uri = Uri.parse("http://www.bahramlighting.com");
    	Intent intent = new Intent(Intent.ACTION_VIEW, uri);
		startActivity(intent);
    }
	
	public void onKirimBatonKlik(View view)
    {
    	Intent intent = new Intent(Intent.ACTION_SEND);
		intent.setType("text/plain");
		intent.putExtra(Intent.EXTRA_TEXT, "Ini pesan yang saya kirim");
		startActivity(intent);
    }
}
