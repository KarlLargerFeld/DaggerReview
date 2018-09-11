package com.android.stanlyfang.daggerreview.step1.component;

import com.android.stanlyfang.daggerreview.step1.MainActivity;
import com.android.stanlyfang.daggerreview.step1.moudle.TextViewModule;

import dagger.Component;

@Component(modules = TextViewModule.class)
public interface UserComponent {
    void inject(MainActivity activity);
}
