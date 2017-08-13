package br.com.hectonpdomingos.BoaCompra;

import android.Manifest;
import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Color;
import android.provider.SyncStateContract;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.maps.CameraUpdate;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.CircleOptions;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

import br.com.hectonpdomingos.myapplication.R;

import static android.R.attr.duration;

public class MapaOferta extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mapa_oferta);
        final AutoCompleteTextView acTextView = (AutoCompleteTextView) findViewById(R.id.autoComp);
        acTextView.setAdapter(new SuggestionAdapter(this, acTextView.getText().toString()));

         textView = (TextView) findViewById(R.id.textView3);


        acTextView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> arg0, View arg1, int position,
                                    long arg3) {

                textView.setText(acTextView.getText());

            }
        });









        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }


    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;


        //Adicionando latitude e log, zoom 16 e adicionado macadores
        LatLng coelho = new LatLng(-20.2579302, -42.0338666);
        mMap.addMarker(new MarkerOptions().position(coelho).title("Coelho Diniz"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(coelho));
        mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(coelho, 16));

        LatLng paxa = new LatLng(-20.2561528, -42.030564);
        //mMap.addMarker(new MarkerOptions().position(paxa).title("Paxa")).showInfoWindow();
        mMap.animateCamera(CameraUpdateFactory.newLatLng(paxa));
        mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(paxa, 16));

        mMap.addMarker(new MarkerOptions()
                .position(paxa)
                .title("Supermercados Paxa")

                .snippet("Recomendado")

                .icon(BitmapDescriptorFactory.fromResource(R.drawable.cart)));
        mMap.addMarker(new MarkerOptions().position(paxa)).showInfoWindow();


/*
      mMap.addCircle(new CircleOptions()
                .center(new LatLng(-20.2561528,-42.030564))
                .radius(50)

                .strokeColor(Color.RED));
                //.fillColor(Color.BLUE));
    }
*/


    }
}