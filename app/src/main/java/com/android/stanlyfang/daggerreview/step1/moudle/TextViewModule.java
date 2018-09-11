package com.android.stanlyfang.daggerreview.step1.moudle;

import android.content.Context;
import android.widget.TextView;

import dagger.Module;
import dagger.Provides;

@Module
public class TextViewModule {

    private Context mContext;

    public TextViewModule(Context context){
        this.mContext = context;
    }

    /**
     * 由于实例化TextView 需要传入Context对象，
     * 所以这里还要声明一个Context对象的提供者
     * @param context
     * @return
     */
    @Provides
    TextView provideTextView(Context context){
        TextView textView = new TextView(context);
        textView.setText("我是新创建的TextView");
        return textView;
    }

    @Provides
    Context provideContext(){
        return mContext;
    }
}
