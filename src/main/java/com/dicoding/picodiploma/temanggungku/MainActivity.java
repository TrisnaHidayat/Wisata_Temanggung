package com.dicoding.picodiploma.temanggungku;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvWisata;
    private ArrayList<Wisata> list = new ArrayList<>();
    private String title = "Daftar Wisata Temanggung";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setActionBarTitle(title);

        rvWisata=findViewById(R.id.rv_wisata);
        rvWisata.setHasFixedSize(true);

        list.addAll(WisataData.getListData());
        showRecyclerList();

    }

    private void showRecyclerList() {
        rvWisata.setLayoutManager(new LinearLayoutManager(this));
        ListWisataAdapter listWisataAdapter=new ListWisataAdapter(list);
        rvWisata.setAdapter(listWisataAdapter);

        listWisataAdapter.setOnItemClickCallback(new ListWisataAdapter.OnItemClickCallback() {
            @Override
            public void onItemClicked(Wisata data) {
                showSelectedItem(data);

                Intent moveIntent = new Intent(MainActivity.this, Wisata_Detail_Activity.class);
                moveIntent.putExtra(Wisata_Detail_Activity.Extra_Name, data.getName());
                moveIntent.putExtra(Wisata_Detail_Activity.Extra_Description, data.getDescription());
                moveIntent.putExtra(Wisata_Detail_Activity.Extra_Fee, data.getFee());
                moveIntent.putExtra(Wisata_Detail_Activity.Extra_Time, data.getTime());
                moveIntent.putExtra(Wisata_Detail_Activity.Extra_Address, data.getAddress());
                moveIntent.putExtra(Wisata_Detail_Activity.Extra_Photo, data.getPhoto());
                moveIntent.putExtra(Wisata_Detail_Activity.Extra_Map, data.getMap());
                startActivity(moveIntent);
            }
        });
    }
    private void showSelectedItem(Wisata wisata) {
        Toast.makeText(this, "Berikut informasi wisata " + wisata.getName(), Toast.LENGTH_SHORT).show();
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

            case R.id.action_about:
                Intent moveIntent2 = new Intent(MainActivity.this, About.class);
                startActivity(moveIntent2);
                break;
        }
    }
    private void setActionBarTitle(String title) {
        if (getSupportActionBar() !=null) {
            getSupportActionBar().setTitle(title);
        }
    }
}
