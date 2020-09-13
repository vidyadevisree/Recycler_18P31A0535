package com.example.myrecyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    RecyclerView recycler;
    String titles[];
    int img[];
    MyAdaptor adaptor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recycler=findViewById(R.id.recyclerview);
        titles=getResources().getStringArray(R.array.titles);
        img=new int[]{R.drawable.apple,
                R.drawable.banana,
                R.drawable.custardapple,
                R.drawable.gauva,
                R.drawable.grapes,
                R.drawable.mango,
                R.drawable.pineapple,
                R.drawable.pomegrante,
                R.drawable.strawberry,
                };
        adaptor=new MyAdaptor(this,titles,img);
        recycler.setLayoutManager(new LinearLayoutManager(this));
        recycler.setAdapter(adaptor);

    }
}