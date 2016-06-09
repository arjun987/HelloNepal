package nepal.arjun.com.hellonepal;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        String username = getIntent().getStringExtra("Username");

        TextView tv = (TextView) findViewById(R.id.tvUsername);
        tv.setText(username);

    }
}
