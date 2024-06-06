package com.example.app;

import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity implements MyAdapter.OnItemClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.rec_view);
        recyclerView.setLayoutManager(new GridLayoutManager(this, 3));
       // Log.d("TAG","mess");
        List<String> items = Arrays.asList("Item 1", "Item 2", "Item 3", "Item 4", "Favorites", "ADD");
        MyAdapter adapter = new MyAdapter(items, this);
        recyclerView.setAdapter(adapter);
    }

    @Override
    public void onItemClick(int position) {
        Fragment selectedFragment = null;
        switch (position) {
            case 0:
                selectedFragment = new FragmentFirst();
                break;
            case 1:
                selectedFragment = new FragmentTwo();
                break;
        }
        if (selectedFragment != null) {
            FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
            transaction.replace(R.id.fragment_container, selectedFragment);
            transaction.addToBackStack(null);
            transaction.commit();
        }
    }
}