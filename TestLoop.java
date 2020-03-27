package Java;

/**
 * @Author：HanLu
 * @Description:这个文件是while、for、do while、break、continue的知识的练习
 * @Date:Created in 12:26 PM 2020/3/27
 */
public class TestLoop {
    public static void main(String[] args) {

       // TestLoop.TestWhile();
       // TestLoop.TestFor();
       // TestLoop.TestDoWhile();
       // TestLoop.TestBreakContinue();
        TestLoop.TestDoubleLoop();
       // TestLoop.TestLoopPractice();


    }

    public static void TestWhile(){
        /**
         * while循环 迭代因子一定不能忘！！！
         */
        //1、初始化变量、判断条件、迭代因子控制循环变量的增减
        int x = 1;
        int sum = 0;

        while (x<=100){
            sum += x;
            x++;        //!!一定要有迭代因子，否则就是死循环
        }
        System.out.println("1+2+3..100 = " + sum);
    }

    public static void TestFor(){
        /**
         * for循环
         * 执行顺序和while循环一致
         * 1、先是变量的初始化
         * 2、再是进行循环条件的判断
         * 3、如果循环条件成立，执行循环体，如果不成立，进行迭代因子的增或减
         * 4、再进行再一次的循环条件判断，直到循环条件不成立，结束循环
         */
        //1、初始化变量、判断条件、迭代因子控制循环变量的增减
        int sum = 0;

        for (int x =1;x<=100;x++){
            sum += x;
        }
        System.out.println("1+2+3...100 = "+sum);
    }

    public static void TestDoWhile(){
        /**
         * do..while循环
         */
        int x = 1;
        int sum = 0;
        do{
            sum += x;
            x++;
        }while (x<=100);

        System.out.println("1+2+3...100 = "+sum);

    }

    public static void TestBreakContinue(){
        /**
         * 普通的break和continue、带标签的跳转的break、continue
         * break和continue区别
         * 1、break是结束一个循环体的执行，结束后跳出循环体
         * 2、continue是结束一次的循环体的执行，再进行下一次的循环
         */

        //1、分别输出1-100内可以被3整除的数
        for (int x =1;x<=100;x++){

            if (x % 3 != 0){
                continue;     //当x不可以被3整除时，结束本次循环，再进行下一次的判断
            }else {
                System.out.print(x + " "); //注意：这里不可以用'\t'来表示，因为x是整形，会进行自动类型转换，会把'\t'转换成对应数值
            }
        }
        System.out.println();

        //2、当随机数为8时，计算随机次数，被结束循环

        int count = 1;
        while (true) {


            int x = (int) (10 * Math.random());
            System.out.println("此次x的值为： "+ x);

            if (x == 8){
                System.out.println("恭喜你，数字8，大奖");
                break;   //当条件成立后，执行到break，后面打印和count++语句不执行，直接跳出while循环
            }

            System.out.println("这是你的第 " + count + "次抽奖");
            count++;

        }
        System.out.println("共抽奖："+count + "次，中到大奖");
    }

    public static void TestDoubleLoop(){
        /**
         * 嵌套循环
         */
        //1、使用两层for循环输出一个5*5的方形图案
        for (int y=1;y<=5;y++) { //外层控制循环次数
            for (int x = 1; x <= 5; x++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }

        //2、使用while和for循环结合输出一个5*5的方形图案
        int count = 1; //count用于计数循环输出了几次
        int y = 1;     //y用于每次都1开始循环
        while (true){
            for (int x = y; x <= 5; x++) { //每次循环5次
                System.out.print("*" + " ");
            }
            System.out.println();
            count++;
            if (count == 5){
                break;
            }



        }


        //3、输出9*9乘法表
        for (int j = 1;j<=9;j++) {
            for (int i = 1; i <= j; i++) {
                System.out.print(i + "*" + j + "=" + j*i + "\t");
            }
            System.out.println();
        }

    }

    public static void TestLoopPractice(){

        //1、输出100以内奇数及偶数的和
        int sumOuShu = 0;
        int sumJiShu = 0;
        for (int x = 1;x<=100;x++){

            if (x % 2 == 0){
                sumOuShu += x;
            }else {
                sumJiShu += x;
            }
        }
        System.out.println("1...100奇数的和为：" + sumJiShu);
        System.out.println("1...100偶数的和为：" + sumOuShu);


        //2、输出1-100以内能被5整除的数，且每行输出5个
        int count = 0;
        for (int x = 1;x<=100;x++){

            if ( x % 5 == 0){
                System.out.print(x + " ");
                count++;
                if (count == 5){
                    count = 0;
                    System.out.println();
                }
            }
        }
    }

}
