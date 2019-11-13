package com.example.labspinner;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final String[] array_villes = { "Montréal", "LaSalle", "Saint-Laurent", "Québec-Ville" };


        // Spinners
        Spinner spinner = findViewById(R.id.provinces_spinner);
        Spinner spinnerVille = findViewById(R.id.spinnerVille);

        ArrayAdapter<String> spinnerVilles = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, array_villes);
        spinnerVilles.setDropDownViewResource(android.R.layout.simple_spinner_item);
        Spinner sItems = findViewById(R.id.spinnerVille);
        sItems.setAdapter(spinnerVilles);

        String selected = sItems.getSelectedItem().toString();
        if (selected.equals("Montréal")) {

            ImageView imageCity = findViewById(R.id.imageView);
            imageCity.setImageResource(R.drawable.quebec);

        }

        // Initilasion of the spinner of the provinces
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.provinces_array, android.R.layout.simple_spinner_item);

        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(this);
        //-------------------------------------------------------------------------------
    }



    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

        String choice = adapterView.getItemAtPosition(i).toString();
        Toast.makeText(adapterView.getContext(), choice, Toast.LENGTH_SHORT).show();

        if(choice.equals("Québec")){
            final String[] array_villes = { "Montréal", "LaSalle", "Saint-Laurent", "Québec-Ville" };
            ImageView imageCity = findViewById(R.id.imageView);
            imageCity.setImageResource(R.drawable.quebec);
            ArrayAdapter<String> spinnerVilles = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, array_villes);
            spinnerVilles.setDropDownViewResource(android.R.layout.simple_spinner_item);
            Spinner sItems = findViewById(R.id.spinnerVille);
            sItems.setAdapter(spinnerVilles);
        }
        else if (choice.equals("Ontario")){
            final String[] array_villes_ontario = { "Ottawa", "Toronto" };
            ImageView imageCity = findViewById(R.id.imageView);
            imageCity.setImageResource(R.drawable.ontario);
            ArrayAdapter<String> spinnerVilles = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, array_villes_ontario);
            spinnerVilles.setDropDownViewResource(android.R.layout.simple_spinner_item);
            Spinner sItems = findViewById(R.id.spinnerVille);
            sItems.setAdapter(spinnerVilles);
        }
        else if (choice.equals("Manitoba")){
            final String[] array_villes_manitoba = { "Winnipeg" };
            ImageView imageCity = findViewById(R.id.imageView);
            imageCity.setImageResource(R.drawable.manitiba);
            ArrayAdapter<String> spinnerVilles = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, array_villes_manitoba);
            spinnerVilles.setDropDownViewResource(android.R.layout.simple_spinner_item);
            Spinner sItems = findViewById(R.id.spinnerVille);
            sItems.setAdapter(spinnerVilles);

        }
        else if(choice.equals("Nouvelle-Écosse")){
            final String[] array_villes_scotia = { "Halifax" };
            ImageView imageCity = findViewById(R.id.imageView);
            imageCity.setImageResource(R.drawable.novascotia);
            ArrayAdapter<String> spinnerVilles = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, array_villes_scotia);
            spinnerVilles.setDropDownViewResource(android.R.layout.simple_spinner_item);
            Spinner sItems = findViewById(R.id.spinnerVille);
            sItems.setAdapter(spinnerVilles);

        }
        else if (choice.equals("Saskatchewan")){
            final String[] array_villes_sasc = { "Sascatoon", "Athabasca" };
            ImageView imageCity = findViewById(R.id.imageView);
            imageCity.setImageResource(R.drawable.saskatchewan);
            ArrayAdapter<String> spinnerVilles = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, array_villes_sasc);
            spinnerVilles.setDropDownViewResource(android.R.layout.simple_spinner_item);
            Spinner sItems = findViewById(R.id.spinnerVille);
            sItems.setAdapter(spinnerVilles);
        }
        else if(choice.equals("Yukon")){
            final String[] array_villes_yukon = { "Whitehorse", "Old Crow", "Skagway" };
            ImageView imageCity = findViewById(R.id.imageView);
            imageCity.setImageResource(R.drawable.yukon);
            ArrayAdapter<String> spinnerVilles = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, array_villes_yukon);
            spinnerVilles.setDropDownViewResource(android.R.layout.simple_spinner_item);
            Spinner sItems = findViewById(R.id.spinnerVille);
            sItems.setAdapter(spinnerVilles);
        }
        else if(choice.equals("Nunavut")){
            final String[] array_villes_nunawut = { "Iqaluit", "Dubawunt" };
            ImageView imageCity = findViewById(R.id.imageView);
            imageCity.setImageResource(R.drawable.nunavut);
            ArrayAdapter<String> spinnerVilles = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, array_villes_nunawut);
            spinnerVilles.setDropDownViewResource(android.R.layout.simple_spinner_item);
            Spinner sItems = findViewById(R.id.spinnerVille);
            sItems.setAdapter(spinnerVilles);

        }
        else if (choice.equals("Alberta")){
            final String[] array_villes_alberta = { "Calgary", "Edmonton" };
            ImageView imageCity = findViewById(R.id.imageView);
            imageCity.setImageResource(R.drawable.alberta);
            ArrayAdapter<String> spinnerVilles = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, array_villes_alberta );
            spinnerVilles.setDropDownViewResource(android.R.layout.simple_spinner_item);
            Spinner sItems = findViewById(R.id.spinnerVille);
            sItems.setAdapter(spinnerVilles);
        }

    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
}
