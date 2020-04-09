package Java;

/**
 * @Author：HanLu
 * @Description:这段代码是用于练习this关键字
 * 一：this关键字--指向创建对象的地址，存在于堆内存
 * @Date:Created in 12:05 PM 2020/4/9
 */
public class TestObjThis {

    TestObjThis(){

    }

    TestObjThis(int a,int b){ //构造方法，用于初始化对象
        this.a = a;
        this.b = b;
    }

    TestObjThis(int a,int b,int c){ //构造方法重载
        this(a,b); //用this可以调用构造方法
        this.c = c;
    }

    //1、成员变量--属于类
    int age;
    int a;
    int b;
    int c;
    String name;

    //2、方法
    void test001(int age,String name /*形参-局部变量-从属于方法*/){
        this.age = age; //** this指向创建对象的地址，用于区分成员变量和局部变量区别
        this.name = name;
        System.out.println("Age is "+ age + ","+ "Name is " + name);
    }



    public static void main(String[] args) {
        TestObjThis testObjThis = new TestObjThis(); //如果已经创建了带参数的构造方法，调用没有参数的构造方法，必须手动加上无参的构造方法
        testObjThis.test001(15,"LWT");
    }
}