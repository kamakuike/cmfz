import com.baizhi.cmfz.entity.Picture;
import com.baizhi.cmfz.service.PictureService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Date;


/**
 * Created by 13659 on 2018/7/5.
 */
public class testPicture {
    @Test
    public void t(){
        ApplicationContext context= new ClassPathXmlApplicationContext("applicationContext.xml");
        PictureService pictureService=(PictureService)context.getBean("pictureServiceImpl");
        Picture picture=new Picture();

        picture.setPictureDescription("经院正殿");
        picture.setPictureName("1.jpg");
        System.out.println(pictureService.addPicture(picture));

    }
    @Test
    public void t2(){
        ApplicationContext context= new ClassPathXmlApplicationContext("applicationContext.xml");
        PictureService pictureService=(PictureService)context.getBean("pictureServiceImpl");
        System.out.println(pictureService.queryByPage(1,2));
    }
}
