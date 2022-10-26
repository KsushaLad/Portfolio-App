package com.ksusha.portfolioapp.team;

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

public class TeamFragment extends Fragment {

    RecyclerView RvTeam;
    TeamAdapter adapter;
    List<TeamItem> mdata;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_team, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        RvTeam = view.findViewById(R.id.rv_team);
        TeamItem item = new TeamItem("ZNO",getString(R.string.to_do),R.drawable.user);
        TeamItem item2 = new TeamItem("Histology",getString(R.string.histology),R.drawable.user);
        TeamItem item3 = new TeamItem("To Do",getString(R.string.to_do),R.drawable.userspace);
        mdata = new ArrayList<>();
        mdata.add(item);
        mdata.add(item2);
        mdata.add(item3);
        RvTeam.setLayoutManager(new LinearLayoutManager(getContext()));
        adapter = new TeamAdapter(mdata);
        RvTeam.setAdapter(adapter);
    }
}
