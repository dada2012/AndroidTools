package com.example.tools;

import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

/*
    定义 Activity 共有方法,方便以后的 Activity 继承
    onCreate 说明当前在哪个 Activity,并添加到 活动集合中 -- > ActivityCollector
    onDestroy 把当前活动从活动集合中移除
 */
public class BaseActivity extends AppCompatActivity {

    private static final String TAG = "BaseActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(TAG, "onCreate: --- > 当前Activity :" + getActivityName());
        ActivityCollector.addActivity(this);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        ActivityCollector.removeActivity(this);
    }

    // 获取当前活动名称
    private String getActivityName() {
        return getClass().getSimpleName();
    }

}
