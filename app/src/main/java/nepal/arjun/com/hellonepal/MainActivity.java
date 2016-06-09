package nepal.arjun.com.hellonepal;

import android.support.annotation.IdRes;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;
import android.widget.EditText;
import android.widget.Toast;
import android.widget.EditText;
import android.text.TextUtils;

public class MainActivity extends AppCompatActivity {
     Button signup;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        signup = (Button) findViewById(R.id.signup);
        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText et1,et2;
                et1=(EditText)findViewById(R.id.etfirstname);
                et2=(EditText)findViewById(R.id.etlasttname);
                String firstName = et1.getText().toString();
                String lastNmae = et2.getText().toString();
                String fullName = firstName+" "+lastNmae;

                if(firstName.trim().isEmpty()){
                    et1.setError("Required field");

                }
               else if(lastNmae.trim().isEmpty()){
                    et2.setError("Required field");
                }
                else {
                    toast("Thank You");
                    Intent intent = new Intent(MainActivity.this, Main2Activity.class);
                    intent.putExtra("Username", fullName);
                    startActivity(intent);
                }
            }
        });



    }

    public void toast (String message)
    {

        Toast.makeText(this,message,Toast.LENGTH_SHORT).show();

    }


}
