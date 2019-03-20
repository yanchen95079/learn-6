package com.yc.observe.service.impl;

import com.google.common.eventbus.Subscribe;
import com.yc.observe.pojo.Question;
import com.yc.observe.service.IObserve;

/**
 * @author Yanchen
 * @ClassName IObservice
 * @Date 2019/3/18 10:03
 */
public class ObserveImpl implements IObserve {


    @Override
    @Subscribe
    public void observe(Object str) {
        Question question=(Question)str;
        System.out.println(question.getContent()+"解决老师为"+question.getTeacherName());
    }
}
