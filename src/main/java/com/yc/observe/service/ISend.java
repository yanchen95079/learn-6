package com.yc.observe.service;

import com.yc.observe.pojo.Question;
import com.yc.observe.pojo.User;

/**
 * @author Yanchen
 * @ClassName ISend
 * @Date 2019/3/18 10:03
 */
public interface ISend {
    void send(User user, Question question);
}
