package br.com.hectonpdomingos.BoaCompra;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import android.view.View;
import android.widget.AutoCompleteTextView;
import android.widget.Button;


import android.support.v4.app.FragmentActivity;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

import br.com.hectonpdomingos.myapplication.R;


public class MainActivity extends FragmentActivity {

    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //textView = (TextView) findViewById(R.id.textView);
        button = (Button) findViewById(R.id.mapaOfertas);
        /*final AutoCompleteTextView acTextView = (AutoCompleteTextView) findViewById(R.id.autoComplete);
        acTextView.setAdapter(new SuggestionAdapter(this, acTextView.getText().toString()));
*/


        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent mapa = new Intent(getApplicationContext(), MapaOferta.class);
                startActivity(mapa);
            }
        });

    }

}