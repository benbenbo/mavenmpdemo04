package org.example;

import org.example.beans.User;
import org.example.mapper.EmployeeMapper;
import org.example.mapper.UserMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@RunWith(JUnit4.class)
public class TestMp {
    ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
    EmployeeMapper employeeMapper=ctx.getBean("employeeMapper",EmployeeMapper.class);
    UserMapper userMapper=ctx.getBean("userMapper",UserMapper.class);

    public void testSql(){
        int i = employeeMapper.deleteAll();
        System.out.println("操作："+i);
    }

    @Test
    public void testLogicDelete(){
//        Integer integer = userMapper.deleteById(3);
//        System.out.println("操作："+integer);

        User user = userMapper.selectById(3);
        System.out.println(user);
    }
}
