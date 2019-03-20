package com.yc.observe.pojo;

import lombok.Getter;
import lombok.Setter;


/**
 * @author Yanchen
 * @ClassName User
 * @Date 2019/3/18 9:58
 */
@Setter
@Getter
public class User {
    private Long id;
    private String name;
    //1老师 2学生
    private Integer type;
}
