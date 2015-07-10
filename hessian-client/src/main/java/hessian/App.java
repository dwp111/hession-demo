package hessian;

import com.caucho.hessian.client.HessianProxyFactory;
import hessian.my.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.net.MalformedURLException;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
//        String url = "http://localhost:8080/userService";
//        HessianProxyFactory factory = new HessianProxyFactory();
//        try {
//            UserService userService = (UserService) factory.create(UserService.class, url);
//            System.out.print(userService.loadUser(1));
//        } catch (MalformedURLException e) {
//            e.printStackTrace();
//        }
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath*:spring/spring-client.xml");
        UserService userService = (UserService)context.getBean("userService");
        System.out.print(userService.loadUser(1));
    }
}
