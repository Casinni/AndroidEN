package vannes.lamy.ir4en;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
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
        //get login and pwd from strings.xml
        String loginOk=getResources().getString(R.string.login);
        String pwdOk=getResources().getString(R.string.pwd);
        if(login.getText().toString().equals(loginOk) &&
        password.getText().toString().equals(pwdOk)) {
            Intent i = new Intent(MainActivity.this, HomeActivity.class);
            //define a message with login in the intent to send HomeActivity
            i.putExtra("msg", login.getText().toString());
            //start HomeActivity
            startActivity(i);
        }
        else {
            Toast.makeText(this, "Error Login and pwd", Toast.LENGTH_SHORT).show();
            this.actionClear(v);
        }
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