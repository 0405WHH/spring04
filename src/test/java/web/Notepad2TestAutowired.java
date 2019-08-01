package web;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class Notepad2TestAutowired {

    @Autowired
    private Notepad2 notepad1;

    @Autowired
    private Notepad2 notepad2;

    /**
     * 无论我们是否主动获取bean对象，spring上下文一加载就会主动创建bean对象，
     * 无论我们获取或注入多少次拿到的都是同一个对象
     */
    @Test
    public void test() {
        System.out.println(notepad1 == notepad2);
    }
}
