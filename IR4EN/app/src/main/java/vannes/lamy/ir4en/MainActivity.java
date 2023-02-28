package vannes.lamy.ir4en;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void clicWelcome(View v){
        Toast.makeText(this, "Welcome",Toast.LENGTH_SHORT).show();
    }
}