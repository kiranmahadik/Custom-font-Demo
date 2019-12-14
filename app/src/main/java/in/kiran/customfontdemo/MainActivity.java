package in.kiran.customfontdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Typeface;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv = findViewById(R.id.tvOne);
        Typeface myCustomFont = Typeface.createFromAsset(getAssets(),"fonts/Raleway-ExtraBold.ttf");
        tv.setTypeface(myCustomFont);

        tv = findViewById(R.id.tvTwo);
        Typeface myCustomFont2 = Typeface.createFromAsset(getAssets(),"fonts/Raleway-Thin.ttf");
        tv.setTypeface(myCustomFont2);

        tv = findViewById(R.id.tvThree);
        Typeface myCustomFont3 = Typeface.createFromAsset(getAssets(),"fonts/Rounded Elegance.ttf");
        tv.setTypeface(myCustomFont3);


    }
}
