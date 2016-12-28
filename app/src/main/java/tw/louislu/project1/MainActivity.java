package tw.louislu.project1;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {
    public final static String CITY_MESSAGE = "tw.louislu.ubike.city";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void TaipeiImageButtonOnClick(View view){
        Intent intent  = new Intent(this, BikeActivity.class);
        intent.putExtra(CITY_MESSAGE, getString(R.string.taipei));
        startActivity(intent);
    }

    public void ChanghwaImageButtonOnClick(View view){
        /*
        Intent intent  = new Intent(this, BikeActivity.class);
        intent.putExtra(CITY_MESSAGE, getString(R.string.changhwa));
        startActivity(intent);
        */
        AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
        builder.setPositiveButton(R.string.ok, new DialogInterface.OnClickListener(){
            @Override
            public void onClick(DialogInterface dialogInterface, int i){

            }
        })
                .setMessage(getString(R.string.buddaMessage))
                .show();
    }
}
