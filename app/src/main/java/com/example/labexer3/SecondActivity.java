package com.example.labexer3;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;
import com.example.labexer3.R;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class SecondActivity extends AppCompatActivity {
    String data = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        try {
            FileInputStream reader = openFileInput("data.txt");
            int token;

            while ((token = reader.read()) != -1) {
                data = data + (char) token;
            }

            try {

                String[] list = data.split(" ");
                ((CheckBox) (findViewById(R.id.checkbox))).setText(list[0]);
                ((CheckBox) (findViewById(R.id.checkbox1))).setText(list[1]);
                ((CheckBox) (findViewById(R.id.checkbox2))).setText(list[2]);
                ((CheckBox) (findViewById(R.id.checkbox3))).setText(list[3]);
                ((CheckBox) (findViewById(R.id.checkbox4))).setText(list[4]);
                ((CheckBox) (findViewById(R.id.checkbox5))).setText(list[5]);
                ((CheckBox) (findViewById(R.id.checkbox6))).setText(list[6]);
                ((CheckBox) (findViewById(R.id.checkbox7))).setText(list[7]);

            } finally {
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


