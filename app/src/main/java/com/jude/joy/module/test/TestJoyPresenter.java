package com.jude.joy.module.test;

import android.os.Bundle;
import android.support.annotation.NonNull;

import com.jude.beam.bijection.Presenter;
import com.jude.joy.model.server.DaggerServiceModelComponent;
import com.jude.joy.model.server.SchedulerTransform;
import com.jude.joy.model.server.ServiceAPI;

import javax.inject.Inject;

/**
 * author：Administrator on 2016/9/30 15:22
 * company: xxxx
 * email：1032324589@qq.com
 */

public class TestJoyPresenter extends Presenter<TestJoyFragment>{
    @Inject
    ServiceAPI mServer;
    @Override
    protected void onCreate(@NonNull TestJoyFragment view, Bundle savedState) {
        super.onCreate(view, savedState);
        DaggerServiceModelComponent.builder().build().inject(this);
        getData();
    }
    private void getData(){
        mServer.getTestJoyList("快訊",1,1)
                .compose(new SchedulerTransform<>());
    }
}
