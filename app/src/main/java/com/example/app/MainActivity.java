package com.example.app;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity implements MyAdapter.OnItemClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView recyclerView = findViewById(R.id.rec_view);
        recyclerView.setLayoutManager(new GridLayoutManager(this, 2));
        ArrayList<String> items = new ArrayList<>();
        items.add("List1");
        items.add("List2");
        items.add("List3");
        items.add("List4");
        items.add("Favorites");
        items.add("ADD");
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
            case 2:
                selectedFragment = new FragmentTree();
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