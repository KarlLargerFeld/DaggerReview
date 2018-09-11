package com.android.stanlyfang.daggerreview.step2.moudle;

import com.android.stanlyfang.daggerreview.step2.bean.harddisk.HardDisk250G;
import com.android.stanlyfang.daggerreview.step2.bean.harddisk.HardDisk500G;

import dagger.Module;
import dagger.Provides;

@Module
public class HardDiskModule {

    @Provides
    HardDisk250G provideHardDisk250G(){
        return new HardDisk250G();
    }

    HardDisk500G provideHardDisk500G(){
        return new HardDisk500G();
    }
}
