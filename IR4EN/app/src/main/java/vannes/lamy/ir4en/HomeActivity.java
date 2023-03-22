package vannes.lamy.ir4en;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
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
}