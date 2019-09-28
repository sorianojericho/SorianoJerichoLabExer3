package com.example.labexer3;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class MainActivity extends AppCompatActivity {
    EditText course1, course2, course3, course4, course5, course6, course7, course8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        course1 = findViewById(R.id.E1);
        course2 = findViewById(R.id.E2);
        course3 = findViewById(R.id.E3);
        course4 = findViewById(R.id.E4);
        course5 = findViewById(R.id.E5);
        course6 = findViewById(R.id.E6);
        course7 = findViewById(R.id.E7);
        course8 = findViewById(R.id.E8);
    }

    public void writeData(View v) {
        String inp1 = course1.getText().toString() + ",";
        String inp2 = course2.getText().toString() + ",";
        String inp3 = course3.getText().toString() + ",";
        String inp4 = course4.getText().toString() + ",";
        String inp5 = course5.getText().toString() + ",";
        String inp6 = course6.getText().toString() + ",";
        String inp7 = course7.getText().toString() + ",";
        String inp8 = course8.getText().toString() + ",";
        FileOutputStream writer = null;
        try {
            writer = openFileOutput("data.txt", MODE_PRIVATE);
            writer.write(inp1.getBytes());
            writer.write(inp2.getBytes());
            writer.write(inp3.getBytes());
            writer.write(inp4.getBytes());
            writer.write(inp5.getBytes());
            writer.write(inp6.getBytes());
            writer.write(inp7.getBytes());
            writer.write(inp8.getBytes());

        } catch (FileNotFoundException e) {
            Log.d("error", "file not found");
        } catch (IOException e) {
            Log.d("error", "io error");
        } finally {
            try {
                writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        Toast.makeText(this, "data saved", Toast.LENGTH_LONG).show();
    }
    public void showData(View v) {
        Intent i = new Intent(this, com.example.labexer3.SecondActivity.class);
        startActivity(i);

    }

}
