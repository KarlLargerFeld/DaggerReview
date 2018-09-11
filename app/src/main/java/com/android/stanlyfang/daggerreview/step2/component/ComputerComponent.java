package com.android.stanlyfang.daggerreview.step2.component;

import com.android.stanlyfang.daggerreview.step2.Main2Activity;
import com.android.stanlyfang.daggerreview.step2.moudle.MouseModule;

import javax.inject.Singleton;

import dagger.Component;

/**
 * 如果被注入的对象使用了@singleton修饰，那么对应的component也要使用@Singleton进行修饰
 */
@Singleton
@Component(modules = MouseModule.class)
public interface ComputerComponent {
    void inject(Main2Activity activity);
}
