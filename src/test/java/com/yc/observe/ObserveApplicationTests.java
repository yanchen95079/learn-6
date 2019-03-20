package com.yc.observe;

import com.yc.observe.pojo.Question;
import com.yc.observe.pojo.User;
import com.yc.observe.service.ISend;
import com.yc.observe.service.impl.SendImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ObserveApplicationTests {

    @Test
    public void contextLoads() {
        ISend send=new SendImpl();
        Question question=new Question();
        question.setContent("我能不能参加101训练营");
        question.setTeacherName("TOM");
        question.setUserName("YC");
        send.send(new User(),question);
    }

}
