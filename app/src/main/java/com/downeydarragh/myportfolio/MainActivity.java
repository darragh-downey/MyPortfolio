package com.downeydarragh.myportfolio;

import android.content.Context;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.Formatter;
import java.util.List;
import java.util.Map;


public class MainActivity extends ActionBarActivity {
    Toast toast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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
        //Unnecessary - user doesn't require settings
        //if (id == R.id.action_settings) {
        //    return true;
        //}

        return super.onOptionsItemSelected(item);
    }

    public void sendMessage(View view) {

        Context context = getApplicationContext();
        int duration = Toast.LENGTH_LONG;
        String base_text = "This button will launch my %s app!";
        String text = "";

        if(toast != null){
            toast.cancel();
        }
        
        switch (view.getId()){
            case R.id.capstone_app_name:
                text = String.format(base_text, getString(R.string.capstone));
                toast = Toast.makeText(context, text, duration);
                toast.show();
                break;
            case R.id.xyz_reader:
                text = String.format(base_text, getString(R.string.xyz));
                toast = Toast.makeText(context, text, duration);
                toast.show();
                break;
            case R.id.spotify_streamer:
                text = String.format(base_text, getString(R.string.spotify));
                toast = Toast.makeText(context, text, duration);
                toast.show();
                break;
            case R.id.build_it_bigger:
                text = String.format(base_text, getString(R.string.buildit));
                toast = Toast.makeText(context, text, duration);
                toast.show();
                break;
            case R.id.library_app:
                text = String.format(base_text, getString(R.string.library));
                toast = Toast.makeText(context, text, duration);
                toast.show();
                break;
            case R.id.scores_app:
                text = String.format(base_text, getString(R.string.scores));
                toast = Toast.makeText(context, text, duration);
                toast.show();
                break;
        }
    }
}
