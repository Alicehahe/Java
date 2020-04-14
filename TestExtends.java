package cn.com.shield.staging.java.Java;

/**
 * @Author：HanLu
 * @Description:这是用于练习类的继承
 * @Date:Created in 5:10 PM 2020/4/13
 */
class Person{
    String name;
    int age;

    public void voice(){
        System.out.println("Person.voice");
    }
}

class Student extends Person{

    int height;

    public void eat(){
        System.out.println("Student.eat");
    }
}

public class TestExtends {
    public static void main(String[] args) {
        Student student = new Student();
        student.name = "小明"; //通过继承可以在本包中直接使用父类的属性
        student.voice(); //通过继承可以在本包中直接使用父类的方法

        student.eat(); //调用自己独有的方法或属性
    }


}
