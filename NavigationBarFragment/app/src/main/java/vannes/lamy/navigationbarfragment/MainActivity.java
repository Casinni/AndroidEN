package vannes.lamy.navigationbarfragment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class MainActivity extends AppCompatActivity {

    public final NavigationBarView.OnItemSelectedListener navListener = item->{
        Fragment selectedFragment=null;
        int itemId=item.getItemId();

        if(itemId==R.id.fragmentA){
            selectedFragment=new FragmentA();
        }
        else if(itemId==R.id.fragmentB){
            selectedFragment=new FragmentB();
        }
        else if(itemId==R.id.fragmentC){
            selectedFragment=new FragmentC();
        }
        else {
            selectedFragment = new FragmentHome();
        }
        if(selectedFragment!=null){
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.fragmentContainerView,selectedFragment).commit();
        }
        return true;
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        BottomNavigationView bottomNav=findViewById(R.id.navigationbar);
        bottomNav.setOnItemSelectedListener(navListener);
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.fragmentContainerView,new FragmentHome()).commit();
    }
}