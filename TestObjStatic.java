package Java;

/**
 * @Author：HanLu
 * @Description:这段代码用于练习static关键字，可用于修饰变量、方法
 * 一：static关键字：表示静态变量或者静态方法，存储于方法区，属于类
 * @Date:Created in 12:36 PM 2020/4/9
 */
public class TestObjStatic {

    //成员变量
    int age;

    //静态成员变量
    static int name;


    void testStatic(){
        System.out.println("TestObjStatic.testStatic");
        System.out.println(name); //普通方法调用静态变量，因为普通方法属于对象，静态方法属于类
    }

    static void testStatic001(){ //静态方法，内存块中存储在方法区，丛属于类
        System.out.println("TestObjStatic.testStatic001");
       // System.out.println(age); //静态方法不可调用普通成员变量
        System.out.println(name);
    }

    public static void main(String[] args) {
        TestObjStatic testObjStatic = new TestObjStatic();
        testObjStatic.testStatic(); //普通方法从属于对象，需要创建对象来调用
        TestObjStatic.testStatic001(); //静态方法可通过类直接调用
    }
}
