package com.jaejae.cafe_jaerim;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class StudyCafeList extends AppCompatActivity {

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
        adapter = new StudyCafeAdapter(this,R.layout.activity_itemlist, arraylist);
        listView.setAdapter(adapter);
    }

    private void settingList() {
        arraylist.add(new StudyCafeData(R.drawable.unos_garden_pic1,"우노의 정원", "O", "O", "X"));
        arraylist.add(new StudyCafeData(R.drawable.hollys_pic1,"할리스 전북대 덕진광장점", "O", "O", "O"));
        arraylist.add(new StudyCafeData(R.drawable.momo_pic1,"모모의 다락방", "X", "O", "O"));
        arraylist.add(new StudyCafeData(R.drawable.in_out_pic3,"인앤아웃", "O", "O", "O"));
        arraylist.add(new StudyCafeData(R.drawable.starbucks_pic1,"스타벅스 전북대점", "O", "O", "O"));
        arraylist.add(new StudyCafeData(R.drawable.droptop_pic1,"드롭탑 전북대점", "O", "O", "O"));
        arraylist.add(new StudyCafeData(R.drawable.twosome_place_pic1,"투썸플레이스 전주전북대점", "O", "O", "O"));
        arraylist.add(new StudyCafeData(R.drawable.ediya_pic0,"이디야커피 전북대구정문점", "O", "O", "O"));
        arraylist.add(new StudyCafeData(R.drawable.coffee_didim_pic1,"커피디딤", "O", "O", "O"));
        arraylist.add(new StudyCafeData(R.drawable.roy_pic1,"로이", "O", "O", "O"));
        arraylist.add(new StudyCafeData(R.drawable.go_mad_pic1,"고매드비", "O", "O", "O"));
        arraylist.add(new StudyCafeData(R.drawable.to_presso_pic1,"토프레소 전북대점", "O", "O", "O"));
        arraylist.add(new StudyCafeData(R.drawable.someday_afternoon_pic1,"어느날의 오후", "X", "O", "X"));
        arraylist.add(new StudyCafeData(R.drawable.sg_coffee_bar_pic1,"성근커피바", "X", "X", "X"));
        arraylist.add(new StudyCafeData(R.drawable.cafe_goody_pic1,"카페구디", "O", "O", "O"));
        arraylist.add(new StudyCafeData(R.drawable.little_bear_pic1,"작은곰자리", "X", "O", "O"));
        arraylist.add(new StudyCafeData(R.drawable.doran_doran_pic1,"도란도란", "O", "O", "O"));
        arraylist.add(new StudyCafeData(R.drawable.hollys_pic1,"할리스 전주백제대로점", "O", "O", "O"));
        arraylist.add(new StudyCafeData(R.drawable.the_man_pic1,"그남자네", "X", "O", "X"));
        arraylist.add(new StudyCafeData(R.drawable.ediya_pic0,"이디야 커피 전북대점", "O", "O", "O"));
        arraylist.add(new StudyCafeData(R.drawable.merienda_pic1,"메리엔다", "O", "O", "O"));
        arraylist.add(new StudyCafeData(R.drawable.snowing_pic1,"스노잉 본점", "O", "O", "O"));
    }
}
