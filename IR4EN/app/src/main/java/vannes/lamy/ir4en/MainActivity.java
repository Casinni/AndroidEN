package vannes.lamy.ir4en;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
EditText login, password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //get widget from layout
        login= findViewById(R.id.login);
        password=findViewById(R.id.pwd);
    }
    public void actionValidate(View v){
        Toast.makeText(this, "Welcome",Toast.LENGTH_SHORT).show();
    }
    public void actionClear(View v){
        //reset login and password
        login.setText("");
        password.setText("");
    }
    public void actionClose(View v){
        finish();
    }
}