package com.jude.joy.module.test;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.jude.beam.bijection.BeamFragment;
import com.jude.beam.bijection.RequiresPresenter;
import com.jude.joy.R;

/**
 * author：Administrator on 2016/9/30 15:20
 * company: xxxx
 * email：1032324589@qq.com
 */
@RequiresPresenter(TestJoyPresenter.class)
public class TestJoyFragment extends BeamFragment<TestJoyPresenter> {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.test, container, false);
        return view;
    }
}
