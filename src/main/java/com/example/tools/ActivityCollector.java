package com.example.tools;

import android.app.Activity;

import java.util.ArrayList;
import java.util.List;

/*
  管理Activity
 */
public final class ActivityCollector {

    private static List<Activity> activityList = new ArrayList<>();

    // 一般用在 onCreate方法中
    public static void addActivity(Activity activity) {
        activityList.add(activity);
    }

    // 一般用在 活动 最后一个生命周期中
    public static void removeActivity(Activity activity) {
        activityList.remove(activity);
    }

    // 方便一键退出
    public static void removeAll() {
        for (Activity activity : activityList) {
            if (!activity.isFinishing()) activity.finish();
        }
    }

}
