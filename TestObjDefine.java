package Java;

/**
 * @Author：HanLu
 * @Description:该文件是记录对象数据类型的发展史和定义一个基础的类
 * 一：对象数据发展史
 * 1、第一个阶段：数据无管理时代
 * 有基础的数据类型、变量、运算符、常量、控制语句、循环语句即可
 *
 * 2、第二个阶段：类比企业部门管理制
 * 需要对统一种功能代码、数据进行统一、重复多次使用，所以有了数组、方法
 *
 * 3、第三个阶段：类比企业项目制
 * 即需要有一种数据类型可以重复使用多种变量、多种方法，类比一个项目中有不同的部门，就有了对象类型
 *
 *二：对象和类的关系
 * 对象是从类中实例话出来的，可以根据类创建多个对象，每一个对象都是占用独立的内存地址
 * 类是对实际生活中事物抽象出相同的属性、和方法形成模板，所以要创建对象，我们需要先定义类
 * @Date:Created in 11:50 AM 2020/4/9
 */

public class TestObjDefine /*类名*/{

    /**
     * 类要素：1、类名 2、属性  3、方法 4、main方法
     */
    //1、属性：成员变量-有默认值
    int a;
    char b;


    //2、方法
    void test(){
        System.out.println("TestObjDefine.test");
    }

    //3、main方法是类执行的入口
    public static void main(String[] args) {
        TestObjDefine testObjDefine = new TestObjDefine();
        testObjDefine.test();
    }
}
