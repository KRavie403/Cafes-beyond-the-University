package com.jaejae.cafe_jaerim;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class TakeOutCafeList  extends AppCompatActivity {

    //    private List<StudyCafeData> list;          // 데이터를 넣은 리스트변수
    private ListView listView;          // 검색을 보여줄 리스트변수
    private TextView title;             // title
    private StudyCafeAdapter adapter;      // 리스트뷰에 연결할 아답터
    private ArrayList<StudyCafeData> arraylist;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cafe_list);

        title = findViewById(R.id.title);
        listView = findViewById(R.id.listView);
        arraylist = new ArrayList<>();

        ImageButton back_button = (ImageButton) findViewById(R.id.back_button);

        back_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
            }
        });

        settingList();
//        arraylist.addAll(arraylist);
        adapter = new StudyCafeAdapter(this,R.layout.activity_itemlist, arraylist);
        listView.setAdapter(adapter);
    }

    private void settingList() {
        arraylist.add(new StudyCafeData(R.drawable.insole_pic1,"인솔커피", "X", "X", "X"));
        arraylist.add(new StudyCafeData(R.drawable.gong_cha_pic1,"공차", "O", "O", "X"));
        arraylist.add(new StudyCafeData(R.drawable.paiks_pic1,"빽다방 전북대1호점", "O", "O", "X"));
        arraylist.add(new StudyCafeData(R.drawable.ne_coffee_pic1,"네커피", "X", "X", "X"));
    }
}
