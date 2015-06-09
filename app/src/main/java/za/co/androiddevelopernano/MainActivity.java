package za.co.androiddevelopernano;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends Activity implements View.OnClickListener{

    public static final String TAG = MainActivity.class.getSimpleName();

    private String text = "This button will launch my ";

    private Button spotifyBtn, scoresBtn, libraryBtn, buildBtn, readerBtn, capstoneBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spotifyBtn = (Button) findViewById(R.id.spotify);
        spotifyBtn.setOnClickListener(this);
        scoresBtn = (Button) findViewById(R.id.scores);
        scoresBtn.setOnClickListener(this);
        libraryBtn = (Button) findViewById(R.id.library);
        libraryBtn.setOnClickListener(this);
        buildBtn = (Button) findViewById(R.id.build);
        buildBtn.setOnClickListener(this);
        readerBtn = (Button) findViewById(R.id.reader);
        readerBtn.setOnClickListener(this);
        capstoneBtn = (Button) findViewById(R.id.capstone);
        capstoneBtn.setOnClickListener(this);
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
    public void onClick(View view) {
        switch(view.getId()){
            case R.id.spotify :
                createToast("Spotify Streamer App");
                break;
            case R.id.scores :
                createToast("Football Scores App");
                break;
            case R.id.library :
                createToast("Library App");
                break;
            case R.id.build :
                createToast("Build it Bigger App");
                break;
            case R.id.reader :
                createToast("XYZ Reader App");
                break;
            case R.id.capstone :
                createToast("Capstone App");
                break;
        }
    }

    private void createToast(String msg){
        Toast.makeText(this, text + msg, Toast.LENGTH_LONG).show();
    }
}
