package shubhangi.loginanimationscreen;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;

public class LoginActivity extends AppCompatActivity {

    Button btnRegister,btnLogin;

    RelativeLayout rellay1,rellay2;

    Handler handler = new Handler();
    Runnable runnable = new Runnable() {
        @Override
        public void run() {

        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        btnRegister = findViewById(R.id.btnRegister);
        btnLogin = findViewById(R.id.btnLogin);

        rellay1 = findViewById(R.id.rellay1);
        rellay2 = findViewById(R.id.rellay2);

        handler.postDelayed(runnable,2000);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent intent = new Intent(getApplicationContext(),NavigationActivity.class);
                startActivity(intent);



            }
        });

        btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getApplicationContext(),RegisterActivity.class);
                startActivity(intent);


            }
        });


    }
}
