package com.jaejae.cafe_jaerim;

import android.content.Context;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.MotionEvent;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class SearchList extends AppCompatActivity {

    private List<String> list;          // 데이터를 넣은 리스트변수
    private ListView listView;          // 검색을 보여줄 리스트변수
    private EditText editSearch;        // 검색어를 입력할 Input 창
    private searchlistAdapter adapter;      // 리스트뷰에 연결할 아답터
    private ArrayList<String> arraylist;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_searchlist);

        editSearch = findViewById(R.id.editSearch);
        listView = findViewById(R.id.listView);
        list = new ArrayList<>();

        settingList();

        arraylist = new ArrayList<>();
        arraylist.addAll(list);
        adapter = new searchlistAdapter(list, this);
        listView.setAdapter(adapter);

//        settingList();

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView adapterView, View view, int i, long l) {
                String selected_item = (String)adapterView.getItemAtPosition(i);
                Intent intent;
                if(selected_item != null && selected_item.equals("이디야 커피 전북대점")) {
                    intent = new Intent(getApplicationContext(), Ediya.class);
                }
                else if(selected_item != null && selected_item.equals("이디야커피 전북대구정문점")) {
                    intent = new Intent(getApplicationContext(), Ediya_jbnu.class);
                }
                else if(selected_item != null && selected_item.equals("인앤아웃")) {
                    intent = new Intent(getApplicationContext(), In_out.class);
                }
                else if(selected_item != null && selected_item.equals("인솔커피")) {
                    intent = new Intent(getApplicationContext(), Insole.class);
                }
                else if(selected_item != null && selected_item.equals("할리스 전북대 덕진광장점")) {
                    intent = new Intent(getApplicationContext(), Hollys.class);
                }
                else if(selected_item != null && selected_item.equals("작은곰자리")) {
                    intent = new Intent(getApplicationContext(), Little_bear.class);
                }
                else if(selected_item != null && selected_item.equals("명륜")) {
                    intent = new Intent(getApplicationContext(), Myeongnyun.class);
                }
                else if(selected_item != null && selected_item.equals("빽다방")) {
                    intent = new Intent(getApplicationContext(), Paiks_coffee.class);
                }
                else if(selected_item != null && selected_item.equals("알엘 커피")) {
                    intent = new Intent(getApplicationContext(), Ralee.class);
                }
                else if(selected_item != null && selected_item.equals("로이")) {
                    intent = new Intent(getApplicationContext(), Roy.class);
                }
                else if(selected_item != null && selected_item.equals("Ivy586")) {
                    intent = new Intent(getApplicationContext(), Ivy.class);
                }
                else if(selected_item != null && selected_item.equals("스타벅스 전북대점")) {
                    intent = new Intent(getApplicationContext(), StarBucks.class);
                }
                else if(selected_item != null && selected_item.equals("모모의 다락방")) {
                    intent = new Intent(getApplicationContext(), Momo.class);
                }
                else{
                    intent = new Intent(getApplicationContext(), MainActivity.class);
                }

                startActivity(intent);
            }
        });

        editSearch.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            }

            @Override
            public void afterTextChanged(Editable editable) {
                String text = editSearch.getText().toString();
                search(text);
            }
        });
        list.clear();
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        InputMethodManager inputmethod = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
        inputmethod.hideSoftInputFromWindow(getCurrentFocus().getWindowToken(), 0);
        return true;
    }

    // 검색을 수행하는 메소드
    public void search(String charText) {
        list.clear();
        if (charText.length() == 0) {
        } else {
            for(int i = 0; i < arraylist.size() ; i++) {
                if (arraylist.get(i).toLowerCase().contains(charText)) { list.add(arraylist.get(i)); }
            }
        }
        adapter.notifyDataSetChanged();
    }

    private void settingList() {
        list.add("우노의 정원");
        list.add("예쁜하루 전북대점");
        list.add("할리스 전북대 덕진광장점");
        list.add("모모의 다락방");
        list.add("인앤아웃");
        list.add("스타벅스 전북대점");
        list.add("드롭탑 커피");
        list.add("투썸플레이스 전주전북대점");
        list.add("이디야커피 전북대구정문점");
        list.add("커피디딤");
        list.add("로이");
        list.add("고매드비");
        list.add("토프레소 전북대점");
        list.add("어느날의 오후");
        list.add("성근커피바");
        list.add("카페구디");
        list.add("작은곰자리");
        list.add("명륜");
        list.add("인솔커피");
        list.add("공차");
        list.add("텐퍼센트커피 전주전북대점");
        list.add("도란도란");
        list.add("빽다방");
        list.add("포멀커피");
        list.add("노트릭");
        list.add("케이빈");
        list.add("이디야 커피 전북대점");
        list.add("오늘과 오늘 사이");
        list.add("몽레브");
        list.add("카페 프로바이더");
        list.add("카페 이프온리");
        list.add("할리스 전주백제대로점");
        list.add("Ivy586");
        list.add("2:in");
        list.add("팬도로시");
        list.add("파인땡큐");
        list.add("플레인빈커피");
        list.add("스위머");
        list.add("그남자네");
        list.add("네커피");
        list.add("메리엔다");
        list.add("스노잉 본점");
        list.add("알엘 커피");
    }
}

