package cn.com.shield.staging.java.Java;

/**
        * @Author：HanLu
        * @Description:练习java中实现模板接口的知识点
        *1、接口的定义及实现
        *使用关键字 interface关键字
        *接口中只能定义：抽象方法、静态常量
        *
        * 2、接口的特点
        * 接口可以继承多个接口，使用extends
        * 类只能继承一个父类，也使用extends
        *
        * @Date:Created in 3:14 PM 2020/4/14
        */
public interface TestInterface {
    public static void main(String[] args) {
        D dTest = new D();
        dTest.printNum();
        dTest.printNumB();
        dTest.test();
    }
}


interface A{

    public static int MAX_NUM = 100; //公开、静态的常量必须初始化

    public abstract void printNum(); //公开、抽象的方法

}

interface B{
    public static int MAX_B = 200; //必须初始化

    public abstract void printNumB();
}

interface C extends A,B{ //接口C可以继承多个接口，如A，B
    public abstract void test();
}


class D implements C{ //类再实现接口时，必须重写所有的抽象方法

    @Override
    public void printNum() {
        System.out.println("D.printNum");
    }

    @Override
    public void printNumB() {
        System.out.println("D.printNumB");
    }

    @Override
    public void test() {
        System.out.println("D.test");
    }
}