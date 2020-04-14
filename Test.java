package testAuthoration;

import cn.com.shield.staging.java.Java.TestObjAuthoration;


/**
 * @Author：HanLu
 * @Description:测试不同包下不同的关键字访问权限
 * private default protected public
 * @Date:Created in 11:58 AM 2020/4/14
 */
public class Test extends TestObjAuthoration{ //Test类就是一个子类

    public static void main(String[] args) {
        Test test = new Test();

        //aa为protected属性，本类、同一个包、不同包子类可以访问和使用
        System.out.println(test.aa); //访问cn.com.shield.staging.java.Java包下TestObjAuthoration类的属性
       // System.out.println(test.bb); //bb为default修饰，只可在本类、同一个包下使用



    }


}
