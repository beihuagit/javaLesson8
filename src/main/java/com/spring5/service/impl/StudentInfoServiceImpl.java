package com.spring5.service.impl;

import com.spring5.entity.Student;
import com.spring5.service.StudentInfoService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author xiaole.chen
 * @date 2021/11/3 17:21
 * */
@Service
public class StudentInfoServiceImpl implements StudentInfoService {
    @Override
    public List<Student> list() {
        return new ArrayList<Student>(){
            private static final long serialVersionUID = 6328779725017905887L;
            {
            add(new Student(111L, "小张", "1121354253@qq.com", "19899625532"));
            add(new Student(112L, "小李", "119900053@qq.com", "13699905531"));
            }
        };
    }
}
