package web;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class NotepadTest {

    /**
     * 无论我们是否主动获取bean对象，spring上下文一加载就会主动创建bean对象，
     * 无论我们获取或注入多少次拿到的都是同一个对象
     */
    @Test
    public void test() {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
//        Notepad notepad1 = (Notepad)context.getBean("notepad");
//        Notepad notepad2 = (Notepad)context.getBean("notepad");
//
//        System.out.println(notepad1 == notepad2);
        context.destroy();
    }
}
