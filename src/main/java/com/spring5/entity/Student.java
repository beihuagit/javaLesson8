package com.spring5.entity;

import com.spring5.common.SensitiveTypeEnum;
import com.spring5.config.Desensitized;
import lombok.Data;

/**
 * @author xiaole.chen
 * @date 2021/11/3 17:17
 * */
@Data
public class Student {

    private Long sid;
    private String sname;
    @Desensitized(type = SensitiveTypeEnum.EMAIL)
    private String email;
    @Desensitized(type = SensitiveTypeEnum.MOBILE_PHONE)
    private String phone;

    public Student(Long sid, String sname, String email, String phone) {
        this.sid = sid;
        this.sname = sname;
        this.email = email;
        this.phone = phone;
    }
}
