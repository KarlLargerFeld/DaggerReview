package com.android.stanlyfang.daggerreview.step1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.android.stanlyfang.daggerreview.R;
import com.android.stanlyfang.daggerreview.step1.bean.User;
import com.android.stanlyfang.daggerreview.step1.component.DaggerUserComponent;
import com.android.stanlyfang.daggerreview.step1.moudle.TextViewModule;
import com.android.stanlyfang.daggerreview.step2.bean.Cpu;
import com.android.stanlyfang.daggerreview.step2.bean.Usb;
import com.android.stanlyfang.daggerreview.step2.component.DaggerComputerComponent;

import javax.inject.Inject;

import dagger.Lazy;

public class MainActivity extends AppCompatActivity {

    @Inject
    User mUser;

    @Inject
    TextView mTextView;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DaggerUserComponent.builder()
                .textViewModule(new TextViewModule(this))
                .build().inject(this);
        System.out.println(mUser.getName());
        System.out.println(mTextView.getText().toString());
    }


}
