package Java;

/**
 * @Author：HanLu
 * @Description:这个脚本是java-方法的练习
 * @Date:Created in 8:31 AM 2020/3/27
 */
public class TestMehtod {

    public static void main(String[] args) {
        TestMehtod.methodOne();

        int num = TestMehtod.methodTwo();
        System.out.println(num);

        int num002 = TestMehtod.methodFour(520,124); //方法调用的地方传入的参数-实际参数
        System.out.println(num002);

        TestMehtod.addNum(3,4);
        TestMehtod.addNum(3,4,5);
        TestMehtod.addNum(3,4.5);
        TestMehtod.addNum(5.5,4.5);

    }

    /**
     * 定义一个方法:涉及到知识点：
     * 1、返回值、返回类型
     * 2、形参、实参(调用)
     * 3、return语句
     *
     */
    //1、无返回值、无参数方法，使用void关键字表示无返回值
    public static void methodOne(){
        System.out.println("TestMehtod.methodOne");
    }

    //2、有返回值并确定类型，无参数方法
    public  static int methodTwo(){
        int sum = 3+4;
        return sum; //通过return语句来返回值结果
    }


    //3、定义一个有返回值、并有形参的方法
    public static int methodFour(int a,int b){ //方法定义的地方传入的参数：形式参数
        int sum = a + b;
        return sum;
    }


    /**
     * 方法的重构overload：方法名相同，但是根据参数的差异性，可以实现不同的功能
     * 每一个方法都是独立的方法
     */

    //1、通过重构实现数(整数+整数、小数+小数、整数+小数)的相加功能
    public static void addNum(int a,int b){
        int sum = a+b;
        System.out.println(sum);
    }

    public static void addNum(int a,int b,int c){
        int sum = a+b+c;
        System.out.println(sum);
    }


    public static void addNum(double a,double b){
        double sum = a + b;
        System.out.println(sum);
    }

    public static void addNum(int a,double b){
        double sum = a + b;
        System.out.println(sum);
    }





    //2、不可以构成重构的场景 1、方法返回值不同 2、形参名称不同
    /*public static int addNum(int a,int b){ //会提示，已经定义过
        int sum = a + b;
        return sum;
    }*/

}
