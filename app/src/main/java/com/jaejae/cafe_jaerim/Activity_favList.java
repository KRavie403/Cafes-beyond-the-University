package com.jaejae.cafe_jaerim;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class Activity_favList extends AppCompatActivity {

    private List<String> list;
    private ListView listView;          // 검색을 보여줄 리스트변수
    private searchlistAdapter adapter;      // 리스트뷰에 연결할 아답터

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_favlist);
        listView = findViewById(R.id.listView2);

        Intent favlist = getIntent();
        String receiveStr = favlist.getStringExtra("cafe");

        list = new ArrayList<>();
        list.add(receiveStr);


        adapter = new searchlistAdapter(list, this);
        listView.setAdapter(adapter);
    }
}
