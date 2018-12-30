package rehmantech.khalilurrehman.intentexample;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {


    EditText name,rollnumber,password;
    Button gotoBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name = findViewById(R.id.name);
        rollnumber = findViewById(R.id.rollNumber);
        password = findViewById(R.id.password);

        gotoBtn = findViewById(R.id.gotoBtn);


        gotoBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, Main2Activity.class);
                i.putExtra("name",name.getText().toString());
                i.putExtra("rollnumber",rollnumber.getText().toString());
                i.putExtra("password",password.getText().toString());
                startActivity(i);

            }
        });

    }
}
