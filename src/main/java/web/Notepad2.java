package web;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
//@Scope("prototype")
//@Scope(scopeName = "prototype")
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
@Lazy
public class Notepad2 {

    public Notepad2() {
        super();
        System.out.println("Notepad2的无参构造方法......" + this.toString());
    }

    @PostConstruct
    public void init() {
        System.out.println("Notepad的初始化方法");
    }

    @PreDestroy
    public void destory() {
        System.out.println("Notepad的销毁方法");
    }
}
