package com.neelesh.demomesibo;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.neelesh.demomesibo.databinding.ActivityDemoBinding;

public class DemoActivity extends AppCompatActivity {

    private ActivityDemoBinding mBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mBinding = DataBindingUtil.setContentView(this, R.layout.activity_demo);
    }
}
