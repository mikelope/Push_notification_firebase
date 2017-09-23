package pe.push_notification.alumno.push_notification;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;
import android.widget.Button;
import android.view.View;
import android.util.Log;

import com.google.firebase.iid.FirebaseInstanceId;


public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnShowToken = (Button)findViewById(R.id.button_show_token);

        btnShowToken.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                //get token
                String token = FirebaseInstanceId.getInstance().getToken();
                Log.d(TAG,"Token" + token);
                Toast.makeText(MainActivity.this,token,Toast.LENGTH_SHORT).show();
            }

        });

    }
}
