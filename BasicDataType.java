package Java;
import java.lang.reflect.Type;
import java.math.*;

/**
 * @Author：HanLu
 * @Description:这一个练习是用于巩固数据类型及进制转换、运算符、类型转换、变量、标识符 关键字、常量知识点
 * @Date:Created in 2:54 PM 2020/3/25
 */
public class BasicDataType {

    int num2;               //成员变量，从属于对象
    static  boolean num3;   //静态变量，从属于类

    public static void main(String[] args) {

        /**
         * 第一章：数据类型及进制转换
         */
        //1、整形 byte-1字节、short-2字节、int-4字节、long-8字节
        System.out.println((byte)1);
        System.out.println((short)2);
        System.out.println(4);  //数值默认是int类型
        System.out.println(5L); //想要表示long类型，需在结尾加上L
        /*
        * 这里说明一下进制之间的转换：
        * 1、八进制、十六进制转换成十进制，都可以通过先转换成二进制(区别在于一个是按照3位划分
        * 一个是按照4位划分)
        * 2、转换成二进制后，再按照对应位数2的阶乘结果，进行累加
        *
        *example：0x0011
        *转换为二进制：0000 0000 0001 0001
        *转换为十进制：为1的位置对应的数值为2^(n-1)==16+1=17
        *
        *
        * 由二进制转换为其他进制，也是同样的道理，通过3位划分、4位划分后结果进行累加
        * */
        System.out.println(0x0011); //17，整数可以用不同进制表示，0x表示十六进制
        System.out.println(0b1111); //15，整数可以用不同进制表示，0b表示二进制
        System.out.println(0107);   //71，整数可以用不同进制表示，0表示八进制

        //浮点型 float-4字节、double-8字节
        System.out.println(4.15F); //想要表示float类型，需在结尾加上F
        System.out.println(5.16); //小数默认是double类型

        //字符型-- char 占2个字节 使用unicode编码，可以表示数字、字母、汉字、符号等等
        System.out.println('A');
        System.out.println('中');
        System.out.println('\u1102'); //使用unicde编码表示
        System.out.println('\t');     //使用转义字符表示特殊含义，也对应unicode编码表里面数值

        //布尔类型 true、false 占1bit，注意不是一个字节
        System.out.println(true); //只有true和false，不可用0或1代替
        System.out.println(false);

        /**
         * 第二章：运算符
         */
        //1、算术运算符 + - * / %

        /*规则1：byte short char做算术运算时，会自动转成int类型*/
        System.out.println('a'+4); //a对应unicode码+4运算 97+4=101
        /*int a;
        a=4+5L;*/  //这段代码会报错，因为4+5L结果为long类型，接收的变量为int，类型不匹配

       /*规则2：整数运算时，只要由long类型，运算结果一定为long*/
        System.out.println(4+5L);

        /*规则3：小数只要有一个是double类型，结果一定是double类型*/
        System.out.println(4.5+3.4);

        /*规则4：只有当两个操作数都是float类型，结果才是float类型*/
        System.out.println(3.4F+5.4F);

        //2、赋值运算符 = 扩展运算符+= -=
        int a = 3+4; //表示将3+4的结果赋值给a变量
        a += 5; //表示a = a+5;

        //3、关系运算符 > < >= <= == != --运行的结果一定是boolean类型
        System.out.println(3==4); //==表示判断两边是否相等，注意和=区分
        System.out.println(3>5); //关系运算符运行的结果一定是boolean类型，即true或false


        //4、逻辑运算符 & | (&& ||) ! ^(异或) --逻辑运算符两边的操作数一定是boolean类型
        System.out.println((3<5) & (5==5)); //逻辑与 true & true == true
        System.out.println((3>5) | (5==5)); //逻辑或 false | true == true

        System.out.println((3>5) && (5>3/0)); //短路与 当前面一个操作数为false时，后面不再计算，结果直接为false
        System.out.println((3==3) || (5<3/0)); //短路或 当前面一个操作数为true时，后面的不再计算，所以3/0不会报错，结果为true

        System.out.println(true ^ false); //异或 当两个操作数结果不同时，最后结果为true

        System.out.println(!true); //取反，true取反就是false 对单个操作数进行运算

        //5、位运算符   &  | ^ ~ << >>
        /* & | ^也可以当作位运算符，区别在于两边的操作数，当两边操作数为数值时，就是位运算符，对数值的每一位进行运算*/

        System.out.println(2 & 5); //0010 & 0101 = 0000 最后结果为0
        System.out.println(2 | 5); //0010 | 0101 = 0111 最后结果为7
        System.out.println(2 ^ 5); //0010 ^ 0101 = 0111 最后结果为7


        /*<< 移动n位相当于乘以2^n次幂 >>移动n位相当于除以2^n次幂*/
        System.out.println(5<<3); //5*(2^3)=40
        System.out.println(6>>1); //6/(2^1)=3

        //6、三目运算符 (表达式)?A:B
        System.out.println((3==5?"相等":"不等"));

        /**
         * 第三章：类型转换
         */
        //1、自动类型转换[运算时自动将取值范围小的转向范围大的类型]

        /*规则1：如果定义的int类型没有超过byte、short范围，仍然可以用byte类型变量存储*/
        byte oneNum =  3 + 4;    //3+4结果为int类型 oneNum为byte类型

        /*规则2：short、byte、char类型和int运算，都会转为int类型，char转换成对应unicode编码*/
        int threeNum = 'A' + 4;

        /*运算时自动将取值范围小的转向范围大的类型*/
        double twoNum = 4 + 5.2;     //4转换成double类型后，与5.2相加，用double类型变量接收

        /*错误示范*/
        //float four = 4 + 5.2;    //后面计算的结果为double类型，前面用float类型接收，不可以由范围大的转成范围小的


        //2、强制类型转换[(类型)值 (int)5.2]
        int five = (int)5.2; //=5 由大范围强制转换成小范围，会有精度损失

        int six = (int)5.2*6; //=5*6=30 先类型转换，再进行运算

        System.out.println(six);
        System.out.println(five);


        /**
         * 第四章：变量(变量的分类)和常量、标识符、关键字
         */
        //1、变量的定义 --给内存中一块存储单元取名字，下次使用内存块的值可以通过变量名使用值

        /*规则1：变量类型 变量名  变量初始值*/
       int age = 20;

       char x,y = 'a'; //x未赋值、y的值为'a'


        //2、变量的命名规范[标识符-变量、常量、方法、类、对象、接口的名字叫做标识符]

        /*规则2：使用字母、下划线、$开头；不可以用数字开头、由于字母、下划线、数字、$组成；不可和java关键字一致*/

       int childAge = 3; //变量用小驼峰式规则命名

       final double PI = 3.1415926;    //常量通过关键字final修饰 变量名全部大写，中间可以用下划线隔开 MAX_NUM

       class TestClass{} //类名用大驼峰式，每个单词首字母大写

       //3、关键字--代表java有特殊作用的变量，一般用特殊颜色标识 if else break等等


        //4、变量分类 局部变量、成员变量、静态变量
        int num;      //方法体内部，局部变量，从属于方法
       // System.out.println(num);     //没有初始化，使用会报错

       BasicDataType basicDataType = new BasicDataType();
       System.out.println(basicDataType.num2);    //成员变量num2没有赋值，可以使用，值为0

        System.out.println(BasicDataType.num3);   //静态变量num3没有实例话，可直接通过类名来调用
        
    }



}



