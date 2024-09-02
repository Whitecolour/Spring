package web.util;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import web.config.AppConfig;
import web.config.WebConfig;
import web.dao.UserDao;
import web.service.UserService;


public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(WebConfig.class);
        UserService service  = (UserService) context.getBean("userService");
        service.createTableUsers();


    }


}
