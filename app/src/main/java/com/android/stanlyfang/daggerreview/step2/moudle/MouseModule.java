package com.android.stanlyfang.daggerreview.step2.moudle;

import com.android.stanlyfang.daggerreview.step2.MouseType;
import com.android.stanlyfang.daggerreview.step2.bean.mouse.Mouse;
import com.android.stanlyfang.daggerreview.step2.bean.mouse.WiredMouse;
import com.android.stanlyfang.daggerreview.step2.bean.mouse.WirelessMouse;

import dagger.Module;
import dagger.Provides;

@Module
public class MouseModule {

    @Provides
    @MouseType("wired")
    Mouse provideWiredMouse(){
        return new WiredMouse();
    }

    @Provides
    @MouseType("wireless")
    Mouse provideWirelessMouse(){
        return new WirelessMouse();
    }
}
