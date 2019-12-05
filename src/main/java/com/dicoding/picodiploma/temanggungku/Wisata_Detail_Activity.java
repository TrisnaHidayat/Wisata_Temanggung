package com.dicoding.picodiploma.temanggungku;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

public class Wisata_Detail_Activity extends AppCompatActivity implements View.OnClickListener{

    public static String Extra_Name = "nama_wisata";
    public static String Extra_Description = "deskripsi_wisata";
    public static String Extra_Fee = "fee_wisata";
    public static String Extra_Time = "time_wisata";
    public static String Extra_Address = "address_wisata";
    public static String Extra_Map = "map_wisata";
    public static String Extra_Photo = "photo_wisata";

    private String title = "Tentang Wisata";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wisata_detail);
        setActionBarTitle(title);

        Button btnMaps = findViewById(R.id.look_on_map);
        btnMaps.setOnClickListener(this);

        ImageView wisataImg = findViewById(R.id.img_item_photo);
        TextView wisataName = findViewById(R.id.tv_wisata_name);
        TextView wisataDescription = findViewById(R.id.tv_wisata_description);
        TextView wisataFee = findViewById(R.id.tv_wisata_fee);
        TextView wisataTime = findViewById(R.id.tv_wisata_time);
        TextView wisataAddress = findViewById(R.id.tv_wisata_address);

        Glide.with(this)
                .load (getIntent().getIntExtra(Extra_Photo,0))
                .apply(new RequestOptions().override(370,200))
                .into(wisataImg);
        wisataName.setText(getIntent().getStringExtra(Extra_Name));
        wisataDescription.setText(getIntent().getStringExtra(Extra_Description));
        wisataFee.setText(getIntent().getStringExtra(Extra_Fee));
        wisataTime.setText(getIntent().getStringExtra(Extra_Time));
        wisataAddress.setText(getIntent().getStringExtra(Extra_Address));

    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return super.onCreateOptionsMenu(menu);
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        setMode(item.getItemId());
        return super.onOptionsItemSelected(item);
    }
    public void setMode(int selectedMode) {
        switch (selectedMode) {
            case R.id.action_list:
                Intent moveIntent = new Intent(Wisata_Detail_Activity.this, MainActivity.class);
                startActivity(moveIntent);
                break;

            case R.id.action_about:
                Intent moveIntent2 = new Intent(Wisata_Detail_Activity.this, About.class);
                startActivity(moveIntent2);
                break;
        }
    }
    private void setActionBarTitle(String title) {
        if (getSupportActionBar() !=null) {
            getSupportActionBar().setTitle(title);
        }
    }
    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.look_on_map:
                Uri mapAdress = Uri.parse(getIntent().getStringExtra(Extra_Map));
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, mapAdress);
                mapIntent.setPackage("com.google.android.apps.maps");
                startActivity(mapIntent);
                break;
        }
    }

}
