package com.greenman_journey.helloworld;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

/**
 * This class demonstrate the Hello world program.
 * 
 * @author Sumit Patel
 * 
 */
public class MainActivity extends Activity {

	// Local Variables
	private TextView helloWorld_TextView1 = null;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		/* Setting text from code. */

		// We have to find the view and initialize the Text View.
		helloWorld_TextView1 = (TextView) findViewById(R.id.helloWorldTextView1);
		// Set the text string from string.xml file.
		helloWorld_TextView1.setText(getResources().getString(R.string.hello_world));

	}

}
