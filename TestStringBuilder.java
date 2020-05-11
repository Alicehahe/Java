package cn.com.shield.staging.Java;

/**
 * @Author：HanLu
 * @Description:练习String类、StringBuilder、StringBuffer类的使用
 *
 *String类的定义和使用
 *      String类的对象内容是不可以修改的，因为数据是被存储在了被final修饰的byte[]数组中
 *              private final byte[] value;
 *      所以我们可以重新赋值，表示的是指向新的对象地址
 *      但是不可以修改已经定义好的元素内容
 *
 *String类常见的操作
 *      1、将修改后字符串返回一个新的对象：replace()、toLowerCase()、toUpper()、trim()
 *      2、查找功能方法：indexOf()、endsWith()、startWith()
 *      3、比较方法:equals()、
 *      4、其他方法：charAt() 、length()
 *
 * StringBuilder类对String类的改进
 *      StringBuilder底层的原理，是一个可变的byte[]数组
 *             byte[] value;
 *      所以可以进行字符的增加、修改、删除等操作；
 *
 *
 *
 * StringBuilder常用的操作方法
 * 增加(默认末尾添加、指定位置添加)
 * 删除(指定位置删除、区间删除)
 *
 * @Date:Created in 5:54 PM 2020/5/11
 */
public class TestStringBuilder {

    public static void main(String[] args) {
        TestStringBuilder.testString();
        TestStringBuilder.testStringFind();
        TestStringBuilder.testStringBuilder();
    }

    /**
     * String常用方法一：这些方法操作后返回一个新的对象
     */
    public  static void  testString(){

        String str1 = " Hello World! ";

        /**
         * 1、返回一个新的对象地址，未改变str1存储的内容，因为String内容是final类型的数组
         * 2、替换某一个字符
         */

        String str2 = str1.replace("H","hh");
        System.out.println("str2内容为："+str2);
        System.out.println("str1内容为："+str1+",未发生改变");
        System.out.println("===========================");

        /**
         * 将字符全部转换成大写、小写
         */
        String str3= str1.toLowerCase();
        System.out.println("str3内容为："+str3);
        System.out.println("str1内容为："+str1+",未发生改变");
        System.out.println("===========================");


        String str4 = str1.toUpperCase();
        System.out.println("str4内容为："+str4);
        System.out.println("str1内容为："+str1+",未发生改变");
        System.out.println("===========================");


        /**
         * 去除字符串首尾空格
         */
        String str5 = str1.trim();
        System.out.println("str5内容为："+str5);
        System.out.println("str1内容为："+str1+",未发生改变");
        System.out.println("===========================");



    }


    /**
     * String常用方法二：
     * 1、返回某一个下标位置的字符内容 charAt()
     * 2、返回字符串的长度
     * 3、字符串比较
     */
    public static void testStringFind(){

        String a = "My name is HanLu";
        String b = "My name is HanLu";

        //1、返回下标5位置的字符内容
        System.out.println(a.charAt(5));


        //2、返回字符串长度
        System.out.println(a.length());

        //3、字符串比较,地址指向的值比较
        System.out.println(a.equals(b));


    }


    /**
     * StringBuilder底层是：byte[] vaule;
     *
     * 常见操作：
     *
     * 1、增加元素/插入元素 append()  insert()
     * 2、删除元素
     */
    public static void testStringBuilder(){

        /**
         * 将String类型转化成StringBuilder类型
         */
        StringBuilder str = new StringBuilder("hello world");

        //默认末尾增加字符
        str.append(2);
        System.out.println(str); //hello world2


        //指定位置插入元素
        str.insert(0,'a');
        str.insert(0,1);
        System.out.println(str); //1ahello world2

        //删除元素(删除某一个下标的元素)(删除某一区间元素)
        str.deleteCharAt(0);
        System.out.println(str); //ahello world2

        //删除某一个区间的所有元素（下标2的位置元素内容不删除）
        str.delete(0,2);
        System.out.println(str); //ello world2

        //倒序输出字符
        str.reverse();
        System.out.println(str); //2dlrow olle

        //修改可变序列StringBuilder中字符内容
        str.setCharAt(0,'3');
        System.out.println(str); //3dlrow olle

        /**
         * 和String类似的方法
         */
        System.out.println(str.indexOf("d"));


        System.out.println(str.toString());





    }

}
