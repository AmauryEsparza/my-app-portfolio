package com.example.udacityportfolio;

import android.app.Activity;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends Activity implements View.OnClickListener {

    Button buttonSpotifyStreamer;
    Button buttonScoresApp;
    Button buttonLibraryApp;
    Button buttonBuildBigger;
    Button buttonXYZReader;
    Button buttonMyOwnApp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonSpotifyStreamer = (Button) findViewById(R.id.buttonSpotifyStreamer);
        buttonScoresApp = (Button) findViewById(R.id.buttonScoresApp);
        buttonLibraryApp = (Button) findViewById(R.id.buttonLibraryApp);
        buttonBuildBigger = (Button) findViewById(R.id.buttonBuiltBigger);
        buttonXYZReader = (Button) findViewById(R.id.buttonXYZReader);
        buttonMyOwnApp = (Button) findViewById(R.id.buttonCapstone);

        buttonSpotifyStreamer.setOnClickListener(this);
        buttonScoresApp.setOnClickListener(this);
        buttonLibraryApp.setOnClickListener(this);
        buttonBuildBigger.setOnClickListener(this);
        buttonXYZReader.setOnClickListener(this);
        buttonMyOwnApp.setOnClickListener(this);


    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View v){
        switch(v.getId()){
            case R.id.buttonSpotifyStreamer:
                Toast.makeText(this, "This button will launch spotify streamer app", Toast.LENGTH_LONG).show();
                break;
            case R.id.buttonScoresApp:
                Toast.makeText(this, "This button will launch scores app", Toast.LENGTH_LONG).show();
                break;
            case R.id.buttonLibraryApp:
                Toast.makeText(this, "This button will launch library app", Toast.LENGTH_LONG).show();
                break;
            case R.id.buttonBuiltBigger:
                Toast.makeText(this, "This button will launch build it bigger app", Toast.LENGTH_LONG).show();
                break;
            case R.id.buttonXYZReader:
                Toast.makeText(this, "This button will launch XYZ Reader app", Toast.LENGTH_LONG).show();
                break;
            case R.id.buttonCapstone:
                Toast.makeText(this, "This button will launch my capstone app", Toast.LENGTH_LONG).show();
                break;
            default:
                break;
        }
    }
}
