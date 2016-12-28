package tw.louislu.project1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class BikeActivity extends AppCompatActivity {
    private String _city = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bike);
        _city = getIntent().getStringExtra(MainActivity.CITY_MESSAGE);
    }
}
