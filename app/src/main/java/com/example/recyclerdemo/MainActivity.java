package com.example.recyclerdemo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        rv = findViewById(R.id.rv_id);

        LinearLayoutManager obj= new LinearLayoutManager(this);
        obj.setOrientation(LinearLayoutManager.VERTICAL);
        rv.setLayoutManager(obj);

        List<SingerModelClass> singerList =new ArrayList<>();
        singerList.add(new SingerModelClass(R.drawable.b,"Arjit","Melody"));
        singerList.add(new SingerModelClass(R.drawable.ic_launcher_background,"S","Metal"));
        singerList.add(new SingerModelClass(R.drawable.ic_launcher_background,"Vt","POP"));
        singerList.add(new SingerModelClass(R.drawable.ic_launcher_background,"ArFt","Melody"));
        singerList.add(new SingerModelClass(R.drawable.ic_launcher_background,"YUt","Jazz"));

        singerAdapter  hamroAdapter =new singerAdapter(singerList);
        rv.setAdapter(hamroAdapter);

    }
}
