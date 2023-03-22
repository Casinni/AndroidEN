package vannes.lamy.ir4en;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.AlarmClock;
import android.view.View;
import android.widget.TextView;

public class HomeActivity extends AppCompatActivity {
TextView welcome;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        //get intent from MainActivity
        Intent i = getIntent();
      // get msg
        String login = i.getStringExtra("msg");
        //get widget webcome
        welcome=findViewById(R.id.welcomeHome);
        welcome.setText("Welcome" + login);
    }

    public void actionAlarm(View v){
        Intent i =new Intent(AlarmClock.ACTION_SET_ALARM);
        i.putExtra(AlarmClock.EXTRA_MESSAGE,"Alarme ESAIP");
        i.putExtra(AlarmClock.EXTRA_HOUR,18);
        i.putExtra(AlarmClock.EXTRA_MINUTES,15);
        startActivity(i);
    }

    public void actionBrowser(View v){
        String url= "https://www.esaip.org";
        Intent i =new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse(url));
        startActivity(i);
    }
    public void callPhone(View v){
        startActivity(new Intent(Intent.ACTION_CALL, Uri.parse("tel:0102030203")));
    }
    public void callVideo(View v){
        Intent i=new Intent(HomeActivity.this,VideoActivity.class);
        startActivity(i);
    }

}