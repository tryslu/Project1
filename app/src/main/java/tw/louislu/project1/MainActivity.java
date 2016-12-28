package tw.louislu.project1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {
    private ImageButton _taipeiImageButton;
    private ImageButton _changhwaImageButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        InitFindViewById();


    }

    public void TaipeiImageButtonOnClick(View view){
        
    }

    public void ChanghwaImageButtonOnClick(View view){

    }

    private void InitFindViewById(){
        _taipeiImageButton = (ImageButton) this.findViewById(R.id.taipei_imageButton);
        _changhwaImageButton = (ImageButton) this.findViewById(R.id.changhwa_imageButton);
    }
}
