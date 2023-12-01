package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView = findViewById(R.id.listview);

        List<String> list = new ArrayList<>();
        list.add("Kelinci");
        list.add("Kucing");
        list.add("Anjing");
        list.add("Sapi");
        list.add("Kambing");
        list.add("Gajah");
        list.add("Kuda");
        list.add("Kerbau");
        list.add("Beruang");
        list.add("Paus");
        list.add("Lumba-lumba");
        list.add("Berang-berang");
        list.add("Koala");
        list.add("harimau");
        list.add("Panda");
        list.add("Rusa");
        list.add("Singa");

        ArrayAdapter arrayAdapter = new ArrayAdapter(getApplicationContext(), android.R.layout.simple_list_item_1, list);
        listView.setAdapter(arrayAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0) {
                    //clicked Kelinci

                    startActivity(new Intent(MainActivity.this, kelinci.class));

                } else if (position == 1) {
                    //clicked Kucing

                    startActivity(new Intent(MainActivity.this, kucing.class));

                } else if (position == 2) {

                    startActivity(new Intent(MainActivity.this, anjing.class));

                } else if (position == 3) {

                    startActivity(new Intent(MainActivity.this, sapi.class));

                } else if (position == 4) {

                    startActivity(new Intent(MainActivity.this, kambing.class));

                } else if (position == 5) {

                    startActivity(new Intent(MainActivity.this, gajah.class));

                } else if (position == 6) {

                    startActivity(new Intent(MainActivity.this, kuda.class));

                } else if (position == 7) {

                    startActivity(new Intent(MainActivity.this, kerbau.class));

                } else if (position == 8) {

                    startActivity(new Intent(MainActivity.this, beruang.class));

                } else if (position == 9) {

                    startActivity(new Intent(MainActivity.this, paus.class));

                } else if (position == 10) {

                    startActivity(new Intent(MainActivity.this, lumbalumba.class));

                } else if (position == 11) {

                    startActivity(new Intent(MainActivity.this, pesut.class));

                } else if (position == 12) {

                    startActivity(new Intent(MainActivity.this, koala.class));

                } else if (position == 13) {

                    startActivity(new Intent(MainActivity.this, harimau.class));

                } else if (position == 14) {

                    startActivity(new Intent(MainActivity.this, panda.class));

                } else if (position == 15) {

                    startActivity(new Intent(MainActivity.this, rusa.class));

                } else if (position == 16) {

                    startActivity(new Intent(MainActivity.this, singa.class));

                }

            }
        });
    }
}
