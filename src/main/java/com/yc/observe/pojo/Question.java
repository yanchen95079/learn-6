package com.yc.observe.pojo;

import lombok.Getter;
import lombok.Setter;


/**
 * @author Yanchen
 * @ClassName Queation
 * @Date 2019/3/18 10:00
 */
@Setter
@Getter
public class Question {
    private Long id;
    private String userName;
    private String userId;
    private String teacherName;
    private Long teacherId;
    private String content;
}
