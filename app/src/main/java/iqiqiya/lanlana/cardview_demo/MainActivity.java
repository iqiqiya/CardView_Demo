package iqiqiya.lanlana.cardview_demo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ListView mLvMsgList;
    private List<Msg> mDatas = new ArrayList<>();
    private MsgAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mLvMsgList = findViewById(R.id.id_lv_msgList);

        mDatas.addAll(MsgLab.generateMockList());
        mDatas.addAll(MsgLab.generateMockList());// 多生成一次数据

        mAdapter = new MsgAdapter(this,mDatas);
        mLvMsgList.setAdapter(mAdapter);
    }
}
