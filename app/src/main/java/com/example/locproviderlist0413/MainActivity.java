package com.example.locproviderlist0413;

import androidx.appcompat.app.AppCompatActivity;

import android.location.LocationManager;
import android.os.Bundle;
import android.widget.TextView;

import java.util.List;

public class MainActivity extends AppCompatActivity {
    TextView mtxtInfo;
    LocationManager locationManager;
    List<String> LocProviderList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mtxtInfo =findViewById(R.id.TxtInfo);

        locationManager = (LocationManager)getSystemService(LOCATION_SERVICE);

        LocProviderList = locationManager.getAllProviders();
        mtxtInfo.setText("");
        for(String locProvider : LocProviderList){
            mtxtInfo.append("Loc: "  +locProvider + "\n");
            mtxtInfo.append("Enable: "+locationManager.isProviderEnabled((locProvider)) +"\n\n");
        }
    }
}