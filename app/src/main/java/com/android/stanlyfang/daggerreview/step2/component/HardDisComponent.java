package com.android.stanlyfang.daggerreview.step2.component;

import com.android.stanlyfang.daggerreview.step2.Main2Activity;
import com.android.stanlyfang.daggerreview.step2.bean.harddisk.HardDisk250G;
import com.android.stanlyfang.daggerreview.step2.moudle.HardDiskModule;

import dagger.Component;

@Component(modules = HardDiskModule.class)
public interface HardDisComponent {

    HardDisk250G getHardDisk250G();
}
