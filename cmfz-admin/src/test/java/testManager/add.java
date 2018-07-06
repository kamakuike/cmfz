package testManager;

import com.baizhi.cmfz.ServiceImpl.ManagerServiceImpl;
import com.baizhi.cmfz.dao.ManagerDao;
import com.baizhi.cmfz.entity.Manager;
import com.baizhi.cmfz.service.ManagerService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.lang.management.ManagementFactory;

/**
 * Created by 13659 on 2018/7/4.
 */
public class add {
    @Test
    public void addManager(){
       ApplicationContext cl=new ClassPathXmlApplicationContext("applicationContext.xml");
       ManagerService ms=(ManagerService)cl.getBean("managerServiceImpl");
       /*Manager manager=new Manager();

        manager.setManagerName("ls");
        manager.setManagerPassword("123");
        System.out.println(ms.addManager(manager));*/

        System.out.println( ms.queryManager("ls","123"));






    }

}
