package com.ksusha.portfolioapp.cv;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.ksusha.portfolioapp.R;
import java.util.ArrayList;
import java.util.List;

public class CVFragment extends Fragment {

    RecyclerView RvCv;
    CVAdapter adapter ;
    List<CVItem> items;

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        RvCv = view.findViewById(R.id.recyclerview_cv);
        items = new ArrayList<>();
        items.add(new CVItem("November 2021 - February 2022, Evernetica",getString(R.string.exp_1)));
        items.add(new CVItem("February 2022 - June 2022, Natife",getString(R.string.exp_2)));
        items.add(new CVItem("July 2022 - now, Freelance",getString(R.string.lorem_text)));
        adapter = new CVAdapter(items);
        RvCv.setLayoutManager(new LinearLayoutManager(getContext()));
        RvCv.setAdapter(adapter);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_cv, container, false);
    }
}
