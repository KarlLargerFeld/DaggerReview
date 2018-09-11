package com.android.stanlyfang.daggerreview.step2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.android.stanlyfang.daggerreview.R;
import com.android.stanlyfang.daggerreview.step2.bean.Cpu;
import com.android.stanlyfang.daggerreview.step2.bean.MainBoard;
import com.android.stanlyfang.daggerreview.step2.bean.NetWork;
import com.android.stanlyfang.daggerreview.step2.bean.Usb;
import com.android.stanlyfang.daggerreview.step2.bean.mouse.Mouse;
import com.android.stanlyfang.daggerreview.step2.component.DaggerComputerComponent;

import javax.inject.Inject;
import javax.inject.Provider;

import dagger.Lazy;

public class Main2Activity extends AppCompatActivity {

    @Inject
    Cpu mCpu;

    @Inject
    Lazy<Usb> mUsb;

    @Inject
    Provider<NetWork> mNetWork;


    @Inject
    @MouseType
    Mouse mMouse;


    @Inject
    MainBoard mMainboard1;

    @Inject
    MainBoard mMainboard2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

       invoke();
       invoke();
    }

    void invoke(){
        DaggerComputerComponent.builder().build().inject(this);


        //懒加载，每次生成的实例都是一样的，仅存在一个
        System.out.println(mUsb.get());
        System.out.println(mUsb.get());

        //使用Provider的实例，仅存在一个实例，每次获取时都会创建一个新的实例
        System.out.println(mNetWork.get());
        System.out.println(mNetWork.get());


        //使用@Qualifier定义注解
        System.out.println(mMouse.name());


        //使用@singleton修饰的单例，初始化时就会被加载，但是仅有一个实例
        System.out.println(mMainboard1);
        System.out.println(mMainboard2);
    }
}
