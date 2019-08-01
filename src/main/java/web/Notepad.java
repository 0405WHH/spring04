package web;

public class Notepad {

    public Notepad() {
        super();
        System.out.println("Notepad的无参构造方法......" + this.toString());
    }

    public void init() {
        System.out.println("Notepad的初始化方法");
    }

    public void destory() {
        System.out.println("Notepad的销毁方法");
    }
}
