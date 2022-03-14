import com.zm.mapper.UserMapper;
import com.zm.pojo.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test {
    @org.junit.Test
    public void test(){
        ApplicationContext classPathXmlApplicationContext =
                new ClassPathXmlApplicationContext("beans.xml");
        UserMapper userService = classPathXmlApplicationContext.getBean("userService", UserMapper.class);
        List<User> userList = userService.getUserList();
        for (User user : userList) {
            System.out.println(user);
        }
    }

    @org.junit.Test
    public void test1(){
        ApplicationContext classPathXmlApplicationContext =
                new ClassPathXmlApplicationContext("beans.xml");

        UserMapper userService =
                classPathXmlApplicationContext.getBean("userService", UserMapper.class);

        Map<String,Object> map = new HashMap<>();
        map.put("user_name","");
        map.put("user_role",2);

        int userCounts = userService.getUserCounts(map);
        System.out.println(userCounts);

    }
}
