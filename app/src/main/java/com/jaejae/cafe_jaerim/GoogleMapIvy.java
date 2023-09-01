package com.jaejae.cafe_jaerim;

import android.location.Location;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.location.FusedLocationProviderClient;
import com.google.android.gms.location.LocationServices;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class GoogleMapIvy extends AppCompatActivity implements OnMapReadyCallback {

    private com.google.android.gms.maps.GoogleMap googleMap;
    FusedLocationProviderClient fusedLocationProviderClient;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map_ivy);

        fusedLocationProviderClient= LocationServices.getFusedLocationProviderClient(this);

        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager().findFragmentById(R.id.map);
        if (mapFragment != null) {
            mapFragment.getMapAsync(this);
        }
    }

    @Override
    public void onMapReady(com.google.android.gms.maps.GoogleMap googleMap) {
        this.googleMap = googleMap;
        // 35.84097710437324, 127.13393565534601 Ivy586
        LatLng latlng = new LatLng(35.84097710437324, 127.13393565534601);
        googleMap.moveCamera(CameraUpdateFactory.newLatLng(latlng));
        googleMap.moveCamera(CameraUpdateFactory.zoomTo(15));
        MarkerOptions marketOptions = new MarkerOptions().position(latlng).title("Ivy586");
        googleMap.addMarker(marketOptions);
    }
}