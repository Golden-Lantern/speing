 package com.test.test;
 
  import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.test.dao.UserDao;
import com.test.model.User;
  


 public class UserController {
    
    /**
     * @param args
     */
     public static void main(String[] args) {
        ApplicationContext ctx=null;
         ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
        UserDao userDao=(UserDao) ctx.getBean("userDao");
       
        
        for(int i = 0;i < 100;i++){

        	 User user=new User();
            user.setId(1);
            user.setUsername("Jessica");
            user.setPassword("123");
            userDao.addUser(user);
        }

        
        User user=new User();

        System.out.println("添加成功");
        //查询数据
        user.setUsername("Jessica");
        user.setPassword("123");
        System.out.println(userDao.getUser(user).toString());
        user.setUsername("Jessica2");
        user.setPassword("123");

         
    }
 
}