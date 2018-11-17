package app.calcounter.com.fragment_sendingdata;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ExampleFragment fragment = ExampleFragment.newInstace("example text", 123);
        


        getSupportFragmentManager().beginTransaction().replace(R.id.container, fragment).commit();
    }
}
