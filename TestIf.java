package Java;


/**
 * @Author：HanLu
 * @Description:这个脚本是if if..else if...else if...else、switch的练习
 * @Date:Created in 7:37 AM 2020/3/27
 */
public class TestIf {

    public static void main(String args[]){

        //1、使用java.lang包里自带的Math类(不是java.math包)生成[0,1)随机double数
        //2、10*Math.random()生成[0,10)随机double数后(int)强制类型转换成整数
        int num = (int)(10*Math.random()+1);
        System.out.println(num);

        /**
         * IF单结构
         */
        //1、单结构IF 表示形式
        if (num < 5){
            System.out.println("太小啦");
            System.out.println("小于5才会打印01"+num);
        }


        //2、单结构 也可以不写{},那么if中的判断条件只对下面的第一句有效，其他的语句一定会按顺序执行
        if (num < 5 )
            System.out.println("太小啦");
            System.out.println("小于5才会打印02"+num); //这一句一定会打印，因为没有{},判断条件只对第一句有效

        /**
         * if..else结构 5<x<10 ==num>5 & num<10
         */
        if (num < 5){
            System.out.println("小于5，输啦");
        }else {
            System.out.println("大于5，恭喜你");
            System.out.println(num);
        }

        //初学者需要注意一点，在判断条件为 5<x<10这种判断条件时需要分开写且使用&逻辑与联接
        if (num>=3 & num<=5){
            System.out.println("请猜测，此数字在3-5之间");
            System.out.println(num);
        }else {
            System.out.println("请猜测，此数字在1-2、5-9之间");
            System.out.println(num);
        }

        /**
         * if..else if..else..结构
         */
        if (num==2){
            System.out.println("num is: "+ num);
        }else if (num == 4){
            System.out.println("num is: "+ num);
        }else if (num == 6){
            System.out.println("num is: "+ num);
        }else if (num == 8){
            System.out.println("num is: "+ num);
        }else if (num == 10){
            System.out.println("num is: "+ num);
        }else{
            System.out.println("num 是 奇数，为  "+num);
        }


        /**
         * switch结构 switch()表达式后接上{}表示方法体
         * case后的标签：可以整数、枚举、也可以是字符串类型
         */
        int numUnicode = (int)(98*Math.random()); //生成[0,98)之间的随机整数
        System.out.println(numUnicode);

        switch (numUnicode){
            case 97://case后的标签：可以整数、枚举、也可以是字符串类型
                System.out.println("为大写字母最后一位："+(char)numUnicode);
                break;
            case 65:
                System.out.println("为大写字母最开始一位："+(char)numUnicode);
                break;
            default:
                System.out.println("为其他字符："+(char)numUnicode);




        }
    }
}
