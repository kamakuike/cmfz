package testMenu;

import com.baizhi.cmfz.service.MenuService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by 13659 on 2018/7/5.
 */
public class find {
    @Test
    public void t(){
        ApplicationContext context =new ClassPathXmlApplicationContext("applicationContext.xml");
       MenuService ms =(MenuService)context.getBean("menuServiceImpl");
        System.out.println(ms.queryMenu());
    }
}
