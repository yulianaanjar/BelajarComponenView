package anjaryuliana.ya.gmail.belajarcomponenview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.support.v7.app.AlertDialog ;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText username, Password;
    Button button3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        username = (EditText) findViewById(R.id.username);
        Password = (EditText) findViewById(R.id.password);
        button3 = (Button) findViewById(R.id.button3);

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (username.getText().toString().equals("Yuliana Anjarwaty") && Password.getText().toString().equals("165410037")) {
                    Toast.makeText(MainActivity.this, "Welcome Yuliana", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(MainActivity.this, dataanjar.class);
                    startActivity(intent);
                        //pada syntax text "Welcome Yuliana" akan ditampilkan saat kita berhasil login dengan username dan pasword yang sesuai pada syntax diatas

                } else {

                    AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                    builder.setMessage("Username atau password Anda salah")
                            .setNegativeButton("Retry", null).create().show();
                }
                       //jika login gagal maka akan menampilkan pesan seperti diatas
            }
        });
    }
}
