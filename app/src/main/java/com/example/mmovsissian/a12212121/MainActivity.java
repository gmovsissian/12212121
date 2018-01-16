package com.example.mmovsissian.a12212121;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private ListAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView=findViewById(R.id.rv);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        adapter=new ListAdapter(getPersonList(),this);
        recyclerView.setAdapter(adapter);
    }

    private List<Persons> getPersonList(){
        List<Persons> personList=new ArrayList<>();
        personList.add(new Persons("Vaxo","Karapetyan",true,"https://cdn-images-1.medium.com/fit/c/36/36/0*m8eYUA8hxoCIDIrU.jpeg"));
        personList.add(new Persons("Gago","Alexanyan",true,"https://i1.rgstatic.net/ii/profile.image/272579155984397-1441999343548_Q64/John_Hart9.jpg"));
        personList.add(new Persons("Armine","Ghevondyan",false,"https://i1.rgstatic.net/ii/profile.image/569303440924674-1512743925674_Q64/Samara_Danel.jpg"));
        personList.add(new Persons("Gayane","Karapetyan",false,"https://cdn.slidesharecdn.com/profile-photo-carologic-48x48.jpg?cb=1512956919"));
        personList.add(new Persons("Vaxo","Karapetyan",true,"https://cdn-images-1.medium.com/fit/c/36/36/0*m8eYUA8hxoCIDIrU.jpeg"));
        personList.add(new Persons("Gago","Alexanyan",true,"https://i1.rgstatic.net/ii/profile.image/272579155984397-1441999343548_Q64/John_Hart9.jpg"));
        personList.add(new Persons("Armine","Ghevondyan",false,"https://i1.rgstatic.net/ii/profile.image/569303440924674-1512743925674_Q64/Samara_Danel.jpg"));
        personList.add(new Persons("Gayane","Karapetyan",false,"https://cdn.slidesharecdn.com/profile-photo-carologic-48x48.jpg?cb=1512956919"));
        personList.add(new Persons("Vaxo","Karapetyan",true,"https://cdn-images-1.medium.com/fit/c/36/36/0*m8eYUA8hxoCIDIrU.jpeg"));
        personList.add(new Persons("Gago","Alexanyan",true,"https://i1.rgstatic.net/ii/profile.image/272579155984397-1441999343548_Q64/John_Hart9.jpg"));
        personList.add(new Persons("Armine","Ghevondyan",false,"https://i1.rgstatic.net/ii/profile.image/569303440924674-1512743925674_Q64/Samara_Danel.jpg"));
        personList.add(new Persons("Gayane","Karapetyan",false,"https://cdn.slidesharecdn.com/profile-photo-carologic-48x48.jpg?cb=1512956919"));
        return personList;
    }
    }

