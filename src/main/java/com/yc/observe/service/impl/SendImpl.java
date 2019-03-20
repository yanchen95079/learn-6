package com.yc.observe.service.impl;

import com.google.common.eventbus.EventBus;
import com.yc.observe.pojo.Question;
import com.yc.observe.pojo.User;
import com.yc.observe.service.ISend;

/**
 * @author Yanchen
 * @ClassName ISend
 * @Date 2019/3/18 10:03
 */
public class SendImpl implements ISend {

    @Override
    public void send(User user, Question question){
        EventBus eventBus = new EventBus();
        ObserveImpl observeImpl = new ObserveImpl();
        eventBus.register(observeImpl);
        question.setContent(question.getUserName() + "在Gper上提交了一个问题。问题是："+question.getContent());
        eventBus.post(question);
    }
}
