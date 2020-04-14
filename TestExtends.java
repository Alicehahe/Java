package cn.com.shield.staging.java.Java;
/**
     * @Author：HanLu
     * @Description:练习类的继承知识点
     * 1、继承作用、定义，instanceof关键字判断对象和类的关系
     *类的继承可用于使用重复的代码，从而更快捷的去定义属于自己的方法实现
     * 2、重写-对父类方法进行逻辑重写
     *
     * 3、Object-超类
     *
     * 4、super关键字用于调用父类的构造方法、属性和普通方法
     * @Date:Created in 5:10 PM 2020/4/13
 */

public class TestExtends { //TestExtends类的父类是Object，他是所有类的父类
    public static void main(String[] args) {
        Teacher teacher = new Teacher();
        teacher.job();

        //子类对象是属于父类对象的子类--结果为true
        System.out.println(teacher instanceof Object);
        System.out.println(teacher instanceof Man);
        System.out.println(teacher instanceof Teacher);

        //父类对象不属于子类--结果为false
        System.out.println(new Man() instanceof Teacher);
    }
}

class Man{

    public Man(){
        System.out.println("父类构造方法");
    }

    String name;
    final String SEX = "男";
    int age;

    public void job(){
        System.out.println("Man.job");
    }

}

/**
 * 1、extends关键字表示继承
 * 2、和父类同名的方法，表示重写，用@override表示
 * 3、子类中想要使用父类的构造方法、属性、方法，可以使用关键字super
 */
class Teacher extends Man{

    public Teacher(){
        super(); //调用父类的构造方法
        System.out.println("子类构造方法");
    }

    @Override
    public void job(){
        super.job(); //调用父类的job方法
        System.out.println("teacher job is teach child");
    }

}