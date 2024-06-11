package com.example.app;

import static com.example.app.R.*;

import android.annotation.SuppressLint;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class FragmentTwo extends Fragment {
    public FragmentTwo() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        ArrayList<ImageItem> list = new ArrayList<>();
        list.add(new ImageItem(R.drawable.ic_launcher_background, "Text for 1 object"));
        list.add(new ImageItem(R.drawable.ic_launcher_background, "Text for 2 object"));
        list.add(new ImageItem(R.drawable.ic_launcher_background, "Text for 3 object"));
        list.add(new ImageItem(R.drawable.ic_launcher_background, "Text for 4 object"));
        list.add(new ImageItem(R.drawable.ic_launcher_background, "Text for 5 object"));
        list.add(new ImageItem(R.drawable.ic_launcher_background, "Text for 6 object"));
        list.add(new ImageItem(R.drawable.ic_launcher_background, "Text for 7 object"));
        list.add(new ImageItem(R.drawable.ic_launcher_background, "Text for 8 object"));
        list.add(new ImageItem(R.drawable.ic_launcher_background, "Text for 9 object"));
        list.add(new ImageItem(R.drawable.ic_launcher_background, "Text for 10 object"));
        list.add(new ImageItem(R.drawable.ic_launcher_background, "Text for 11 object"));
        list.add(new ImageItem(R.drawable.ic_launcher_background, "Text for 12 object"));
        list.add(new ImageItem(R.drawable.ic_launcher_background, "Text for 13 object"));
        list.add(new ImageItem(R.drawable.ic_launcher_background, "Text for 14 object"));
        list.add(new ImageItem(R.drawable.ic_launcher_background, "Text for 15 object"));
        View view1 = inflater.inflate(R.layout.fragment_two, container, false);
        RecyclerView recyclerView2 = view1.findViewById(R.id.rec_view3);
        LinearLayoutManager layoutManager = new LinearLayoutManager(requireContext(), LinearLayoutManager.VERTICAL, false);
        recyclerView2.setLayoutManager(layoutManager);
        SecAdapter adapter = new SecAdapter(requireContext(), list);
        recyclerView2.setAdapter(adapter);

        return view1;
    }
}