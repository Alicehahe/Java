package cn.com.shield.staging.Java;

import testAuthoration.Test;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * @Author：HanLu
 * @Description:这是练习常用类Date/DateFormat/Calender类都是和日期相关的类
 * Date最常用的两个操作
 *      1、获取当前时间的时间对象
 *               Date date = new Date();
 *               System.out.println("当前时间的毫秒数为："+date);
 *
 *      2、获取当前时间的毫秒字符串输出
 *              System.out.println(date.getTime()); //1589240092532
 *
 * DateFormat作用及实现类SimpleDateFormat
 *      DateFormat作用：
 *             1、将时间对象按格式转换成字符串输出，在构造起规定输出样式
 *             调用format()方法传入时间对象记性转换
 *
 *             2、将字符串按照样式转换成时间格式
 *             调用parse()方法，传入字符串
 *
 * Calendar抽象类及实现类GregorianCalendar
 *
 * @Date:Created in 7:26 AM 2020/5/12
 */
public class TestDate {
    public static void main(String[] args) throws ParseException {
        //TestDate.testDate();
        //TestDate.testDateFormat();
        TestDate.testCalender();
    }


    /**
     * 这是练习Date类的常用方法操作
     * 1、获取当前时间或将长整型的转换成北京时间
     *      Date date1 = new Date(1589240092532L);
     *      Date date = new Date();
     *
     * 2、获取当前时间的毫秒数
     *      调用.getTime()方法，返回当前时间毫秒数
     *
     */
    public static void testDate(){

        Date date = new Date();
        System.out.println("当前时间的毫秒数为："+date); //Tue May 12 07:34:52 CST 2020


        Date date1 = new Date(1589240092532L);
        System.out.println(date1);  //Tue May 12 07:34:52 CST 2020



        System.out.println(date.getTime()); //1589240092532

    }

    /**
     * 练习DateFormat类的常用操作
     * 1、时间对象转换成字符串format()方法
     *      DateFormat s2 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
     *      System.out.println(s2.format(new Date())); //为字符串格式：2020-05-12 07:50:27
     *
     * 2、将字符串转换成时间对象parse()方法
     *     String timeNow = "2020-05-13 7:5:6"; //必须按照格式化的格式进行书写
     *     DateFormat s3 = new SimpleDateFormat("yyyy-MM-dd h:mm:ss");
     *     Date a = s3.parse(timeNow);  //将字符串转换成时间对象
     */
    public static void testDateFormat() throws ParseException {

        /**
         * 不同格式的时间对象转换成字符串
         */
        DateFormat s1  = new SimpleDateFormat("yyyy-M-dd");
        System.out.println(s1.format(new Date())); //为字符串格式：2020-5-12

        DateFormat s2 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        System.out.println(s2.format(new Date())); //为字符串格式：2020-05-12 07:50:27

        /**
         * 字符串转换成时间对象
         */
        String timeNow = "2020-05-13 7:5:6"; //必须按照格式化的格式进行书写
        DateFormat s3 = new SimpleDateFormat("yyyy-MM-dd h:mm:ss");
        Date a = s3.parse(timeNow);  //将字符串转换成时间对象
        System.out.println("timeNow为："+a);



    }

    /**
     * 练习日历类常用操作-对年月日时间进行打印、计算操作
     * 1、设置当前对象的年、月、日
     *      calendar.set(2020,05,12); //方式一
     *      calendar1.set(Calendar.MONTH,01);
     *
     * 2、获取当前的对象的年、月、日
     *      calendar.get(Calendar.YEAR))；
     *
     * 3、日历对象和时间对象的互相转换
     *      Date date = calendar.getTime(); //日历对象转换成时间对象
     */
    public static void testCalender(){

        Calendar calendar = new GregorianCalendar();
        Calendar calendar1 = new GregorianCalendar();

        //设置年、月、日
        calendar.set(2020,05,12); //方式一
        calendar1.set(Calendar.YEAR,2000);
        calendar1.set(Calendar.MONTH,01);
        calendar1.set(Calendar.DATE,01);



        //获取当前对象的年、月 日
        System.out.println("calendar对象的年为："+calendar.get(Calendar.YEAR));
        System.out.println("calendar1对象的年为："+calendar1.get(Calendar.YEAR));


        //日历对象和时间对象的互相转换
        Date date = calendar.getTime(); //日历对象转换成时间对象
    }
}
