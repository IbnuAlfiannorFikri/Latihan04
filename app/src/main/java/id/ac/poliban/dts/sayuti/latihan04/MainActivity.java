package id.ac.poliban.dts.sayuti.latihan04;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.optionmenu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.miFile :
                Toast.makeText(this, "File di Klick", Toast.LENGTH_SHORT).show();
                break;
            case R.id.miEdit :
                Toast.makeText(this, "Edit di Klick", Toast.LENGTH_SHORT).show();
                break;
            case R.id.miSave :
                Toast.makeText(this, "Save Di Klick", Toast.LENGTH_SHORT).show();
                break;
            case R.id.miExit :
                Toast.makeText(this, "Edit DI Klick", Toast.LENGTH_SHORT).show();
                finish();
                break;
        }
        return true;

    }
}
