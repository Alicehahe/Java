package cn.com.shield.staging.Java;

import testAuthoration.TestObjetStream;

import java.io.*;

/**
 * @Author：HanLu
 * @Description:这是练习JavaIO中-序列/反序列化类 ObjectInputStream/ObjectOutputStream
 * 知识点：
 * 1、都是继承InputStream/OutputStream抽象类的子类
 * 2、序列和反序列化用于实现：
 *      1、将一个对象(内部包含属性和方法)序列化成二进制存储在磁盘中
 *      2、反序列化是将通过序列化的文件恢复成原来的文件内容(必须是序列化的文件，其他的二进制文件不可以反序列化)
 *      3、和BufferedInputStream一样都是基于FileInputStream之上
 * 3、**要实现序列化文件的类必须要实现序列化类，否则无法正确执行implements Serializable
 *
 *
 * @Date:Created in 3:54 PM 2020/6/3
 */
public class TestObjectIOStream implements Serializable{

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        TestObjectIOStream.testObjectIOStream("/Users/qingjiao/Desktop/test002.txt","/Users/qingjiao/Desktop/test002.txt");
    }

    public static void testObjectIOStream(String readPath,String writePath) throws IOException, ClassNotFoundException {


        //序列化，写入文件到磁盘新文件中
        FileOutputStream fos = new FileOutputStream(writePath);
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        //new一个Student对象，序列化写入到磁盘文件中-二进制形式
        Student stu = new Student(18,"girl");


        oos.writeObject(stu);

        //反序列化，将文件内容打印到控制台输出
        FileInputStream fis = new FileInputStream(readPath);
        ObjectInputStream ois = new ObjectInputStream(fis);


        //将序列化的对象进行反序列化拿出，输出到屏幕打印
        Student stu1 = (Student)ois.readObject();

        stu1.printInfo();

    }

}


class Student implements Serializable{

    static  int  age;
    static String name;

    Student(int age,String name){
        this.age = age;
        this.name = name;
    }

    public static void printInfo(){
        System.out.println(age);
        System.out.println(name);
    }

}

