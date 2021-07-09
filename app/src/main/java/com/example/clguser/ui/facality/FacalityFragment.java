package com.example.clguser.ui.facality;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.example.clguser.R;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.List;


public class FacalityFragment extends Fragment {
    private RecyclerView csDep, eceDep, meDep, ceeDep, eeDep, phyDep, cheDep, mathDep;
    private LinearLayout csNoData, eceNoData, ceeNoData, eeNoData, meNoData, phyNoData, cheNoData, mathNoData;
    private List<TeacherData> list1, list2, list3, list4, list5, list6, list7, list8;
    private DatabaseReference reference, dbRef;
    private TeacherAdapter adapter;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_facality, container, false);

        csDep = view.findViewById(R.id.csDep);
        eceDep = view.findViewById(R.id.eceDep);
        ceeDep = view.findViewById(R.id.ceeDep);
        meDep = view.findViewById(R.id.meDep);
        eeDep = view.findViewById(R.id.eeDep);
        cheDep = view.findViewById(R.id.cheDep);
        phyDep = view.findViewById(R.id.phyDep);
        mathDep = view.findViewById(R.id.mathDep);
        csNoData = view.findViewById(R.id.csNoData);
        eceNoData = view.findViewById(R.id.eceNoData);
        ceeNoData = view.findViewById(R.id.ceeNoData);
        meNoData = view.findViewById(R.id.meNoData);
        eeNoData = view.findViewById(R.id.eeNoData);
        phyNoData = view.findViewById(R.id.phyNoData);
        cheNoData = view.findViewById(R.id.cheNoData);
        mathNoData = view.findViewById(R.id.mathNoData);

        reference = FirebaseDatabase.getInstance().getReference().child("teacher");

        CsDep();
        EeDep();
        EceDep();
        CeeDep();
        MeDep();
        MathDep();
        PhyDep();
        CheDep();

        return view;
    }

    private void CsDep() {
        dbRef = reference.child("CSE");
        dbRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                list1 = new ArrayList<>();
                if (!dataSnapshot.exists()) {
                    csNoData.setVisibility(View.VISIBLE);
                    csDep.setVisibility(View.GONE);
                } else {
                    csNoData.setVisibility(View.GONE);
                    csDep.setVisibility(View.VISIBLE);
                    for (DataSnapshot snapshot : dataSnapshot.getChildren()) {
                        TeacherData data = snapshot.getValue(TeacherData.class);
                        list1.add(data);
                    }
                    csDep.setHasFixedSize(true);
                    csDep.setLayoutManager(new LinearLayoutManager(getContext()));
                    adapter = new TeacherAdapter(list1, getContext());
                    csDep.setAdapter(adapter);
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

                Toast.makeText(getContext(), "Database Error", Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void EceDep() {
        dbRef = reference.child("ECE");
        dbRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                list3 = new ArrayList<>();
                if (!dataSnapshot.exists()) {
                    eceNoData.setVisibility(View.VISIBLE);
                    eceDep.setVisibility(View.GONE);
                } else {
                    eceNoData.setVisibility(View.GONE);
                    eceDep.setVisibility(View.VISIBLE);
                    for (DataSnapshot snapshot : dataSnapshot.getChildren()) {
                        TeacherData data = snapshot.getValue(TeacherData.class);
                        list3.add(data);
                    }
                    eceDep.setHasFixedSize(true);
                    eceDep.setLayoutManager(new LinearLayoutManager(getContext()));
                    adapter = new TeacherAdapter(list3, getContext());
                    eceDep.setAdapter(adapter);
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

                Toast.makeText(getContext(), "Database Error", Toast.LENGTH_SHORT).show();
            }
        });
    }


    private void MeDep() {
        dbRef = reference.child("ME");
        dbRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                list4 = new ArrayList<>();
                if (!dataSnapshot.exists()) {
                    meNoData.setVisibility(View.VISIBLE);
                    meDep.setVisibility(View.GONE);
                } else {
                    meNoData.setVisibility(View.GONE);
                    meDep.setVisibility(View.VISIBLE);
                    for (DataSnapshot snapshot : dataSnapshot.getChildren()) {
                        TeacherData data = snapshot.getValue(TeacherData.class);
                        list4.add(data);
                    }
                    meDep.setHasFixedSize(true);
                    meDep.setLayoutManager(new LinearLayoutManager(getContext()));
                    adapter = new TeacherAdapter(list4, getContext());
                    meDep.setAdapter(adapter);
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

                Toast.makeText(getContext(), "Database Error", Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void CeeDep() {
        dbRef = reference.child("CE");
        dbRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                list2 = new ArrayList<>();
                if (!dataSnapshot.exists()) {
                    ceeNoData.setVisibility(View.VISIBLE);
                    ceeDep.setVisibility(View.GONE);
                } else {
                    ceeNoData.setVisibility(View.GONE);
                    ceeDep.setVisibility(View.VISIBLE);
                    for (DataSnapshot snapshot : dataSnapshot.getChildren()) {
                        TeacherData data = snapshot.getValue(TeacherData.class);
                        list2.add(data);
                    }
                    ceeDep.setHasFixedSize(true);
                    ceeDep.setLayoutManager(new LinearLayoutManager(getContext()));
                    adapter = new TeacherAdapter(list2, getContext());
                    ceeDep.setAdapter(adapter);
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

                Toast.makeText(getContext(), "Database Error", Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void EeDep() {
        dbRef = reference.child("EE");
        dbRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                list8 = new ArrayList<>();
                if (!dataSnapshot.exists()) {
                    eeNoData.setVisibility(View.VISIBLE);
                    eeDep.setVisibility(View.GONE);
                } else {
                    eeNoData.setVisibility(View.GONE);
                    eeDep.setVisibility(View.VISIBLE);
                    for (DataSnapshot snapshot : dataSnapshot.getChildren()) {
                        TeacherData data = snapshot.getValue(TeacherData.class);
                        list8.add(data);
                    }
                    eeDep.setHasFixedSize(true);
                    eeDep.setLayoutManager(new LinearLayoutManager(getContext()));
                    adapter = new TeacherAdapter(list8, getContext());
                    eeDep.setAdapter(adapter);
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

                Toast.makeText(getContext(), "Database Error", Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void PhyDep() {
        dbRef = reference.child("PHY");
        dbRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                list5 = new ArrayList<>();
                if (!dataSnapshot.exists()) {
                    phyNoData.setVisibility(View.VISIBLE);
                    phyDep.setVisibility(View.GONE);
                } else {
                    phyNoData.setVisibility(View.GONE);
                    phyDep.setVisibility(View.VISIBLE);
                    for (DataSnapshot snapshot : dataSnapshot.getChildren()) {
                        TeacherData data = snapshot.getValue(TeacherData.class);
                        list5.add(data);
                    }
                    phyDep.setHasFixedSize(true);
                    phyDep.setLayoutManager(new LinearLayoutManager(getContext()));
                    adapter = new TeacherAdapter(list5, getContext());
                    phyDep.setAdapter(adapter);
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

                Toast.makeText(getContext(), "Database Error", Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void CheDep() {
        dbRef = reference.child("CHE");
        dbRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                list6 = new ArrayList<>();
                if (!dataSnapshot.exists()) {
                    cheNoData.setVisibility(View.VISIBLE);
                    cheDep.setVisibility(View.GONE);
                } else {
                    cheNoData.setVisibility(View.GONE);
                    cheDep.setVisibility(View.VISIBLE);
                    for (DataSnapshot snapshot : dataSnapshot.getChildren()) {
                        TeacherData data = snapshot.getValue(TeacherData.class);
                        list6.add(data);
                    }
                    cheDep.setHasFixedSize(true);
                    cheDep.setLayoutManager(new LinearLayoutManager(getContext()));
                    adapter = new TeacherAdapter(list6, getContext());
                    cheDep.setAdapter(adapter);
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

                Toast.makeText(getContext(), "Database Error", Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void MathDep() {
        dbRef = reference.child("MATH");
        dbRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                list7 = new ArrayList<>();
                if (!dataSnapshot.exists()) {
                    mathNoData.setVisibility(View.VISIBLE);
                    mathDep.setVisibility(View.GONE);
                } else {
                    mathNoData.setVisibility(View.GONE);
                    mathDep.setVisibility(View.VISIBLE);
                    for (DataSnapshot snapshot : dataSnapshot.getChildren()) {
                        TeacherData data = snapshot.getValue(TeacherData.class);
                        list7.add(data);
                    }
                    mathDep.setHasFixedSize(true);
                    mathDep.setLayoutManager(new LinearLayoutManager(getContext()));
                    adapter = new TeacherAdapter(list7, getContext());
                    mathDep.setAdapter(adapter);
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

                Toast.makeText(getContext(), "Database Error", Toast.LENGTH_SHORT).show();
            }
        });
    }

}

