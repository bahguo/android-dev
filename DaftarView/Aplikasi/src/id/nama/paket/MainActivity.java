package id.nama.paket;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
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

        String[] companies = new String[] { "Bahram", "Sebastian", "Wahyu",
        	"Bella", "Aulia", "Erik", "Klio", "Viana", "Grace" };

        ListAdapter adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, companies);
        ListView listView = (ListView) findViewById(R.id.mainListView1);
		listView.setAdapter(adapter);

		listView.setOnItemClickListener(new OnItemClickListener() {

				@Override
				public void onItemClick(AdapterView<?> l, View v, int position, long id)
				{
					String s = (String) l.getItemAtPosition(position);
					Toast.makeText(MainActivity.this, s,Toast.LENGTH_SHORT).show();
				}
			});
    }
}
