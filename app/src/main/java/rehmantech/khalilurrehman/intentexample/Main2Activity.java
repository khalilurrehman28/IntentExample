package rehmantech.khalilurrehman.intentexample;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    TextView name,rollnumber,password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        name = findViewById(R.id.name1);
        rollnumber = findViewById(R.id.rollNumber1);
        password = findViewById(R.id.password1);


        Intent prev = getIntent();

        name.setText(prev.getStringExtra("name"));
        rollnumber.setText(prev.getStringExtra("rollnumber"));
        password.setText(prev.getStringExtra("password"));

    }
}
