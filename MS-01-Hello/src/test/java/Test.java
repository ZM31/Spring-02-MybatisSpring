import com.zm.Mapper.UserMapper;
import com.zm.pojo.User;
import com.zm.util.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.HashMap;
import java.util.Map;

public class Test {
    static Logger logger = Logger.getLogger(Test.class);
    @org.junit.Test
    public void test(){
        ApplicationContext Context = new ClassPathXmlApplicationContext("beans.xml");
        UserMapper userService = (UserMapper) Context.getBean("userService");
        HashMap<String, Object> map = new HashMap<>();
        map.put("id",2);
        User userById = userService.getUserById(map);
        System.out.println(userById);
    }
}
