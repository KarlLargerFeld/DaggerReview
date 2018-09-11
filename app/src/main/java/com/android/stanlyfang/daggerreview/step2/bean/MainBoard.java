package com.android.stanlyfang.daggerreview.step2.bean;

import javax.inject.Inject;
import javax.inject.Singleton;

/**
 * 创建主板类，每台电脑只有一个主板，但是如果使用Lazy来实现只有一个主板实例的话
 * 主板实例在一开始是不会被初始化的，那么计算机就无法正常工作
 * 这个时候就要使用注解@Singleton
 */
@Singleton
public class MainBoard {

    @Inject
    public MainBoard(){}
}
