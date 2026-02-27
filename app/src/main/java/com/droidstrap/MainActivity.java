package com.droidstrap;

import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    CheckBox checkDark, checkFps;
    Button btnLaunch;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        checkDark = findViewById(R.id.checkDarkTheme);
        checkFps = findViewById(R.id.checkFpsBoost);
        btnLaunch = findViewById(R.id.btnLaunch);

        btnLaunch.setOnClickListener(v -> {
            // Запускаем процесс модификации
            PatchEngine engine = new PatchEngine();
            engine.applyModifications(checkDark.isChecked(), checkFps.isChecked());
            
            Toast.makeText(this, "Применяем патчи... Подождите", Toast.LENGTH_LONG).show();
        });
    }
}

