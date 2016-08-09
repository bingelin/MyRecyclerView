package com.binge.myrecyclerview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Toast;

import com.binge.myrecyclerview.Adapter.MyRecyclerAdapter;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView mRecycle;
    private MyRecyclerAdapter mAdapter;
    private ArrayList<String> dataList;
    private static final int TOTAL_COUNT = 36;
    private static final int QUEST_COUNT = 10;
    private static int mCurrentCount = 0;

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        initView();
        initEvent();
    }

    private void initEvent() {
        dataList = new ArrayList<>();
        for (int i = 0; i <50; i++) {
            if (dataList.size() + mCurrentCount >= TOTAL_COUNT) {
                break;
            }
            dataList.add("item" + i);
        }
        mAdapter = new MyRecyclerAdapter(this, dataList);
        mRecycle.setAdapter(mAdapter);
        mAdapter.setmOnItemClickListener(new MyRecyclerAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(View view, int position) {
                Toast.makeText(MainActivity.this, position+" 被按下", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onItemLongClick(View view, int position) {
                Toast.makeText(MainActivity.this, position+" 被长按", Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void initView() {
        mRecycle = (RecyclerView) findViewById(R.id.main_rcyclerView);
        mRecycle.setLayoutManager(new LinearLayoutManager(this));

    }


}
