package com.fbw.test;

import com.fbw.mapper.ClassMapper;
import com.fbw.po.User;
import com.fbw.util.MybatisUtils;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class Classtest {
    public static void main(String[] args) {
        SqlSession sqlSession= MybatisUtils.getSqlSession(false);
        ClassMapper classMapper=sqlSession.getMapper(ClassMapper.class);
      User user=classMapper.getUser(5);
        System.out.println(user.getId()+" "+user.getUserName()+" ");
        System.out.println(user.getCourses().get(0).getCourseName()+" ");
        System.out.println(user.getCourses().get(0).getTeacher().getTeacherName());
    }

}
