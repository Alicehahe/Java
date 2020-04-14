package cn.com.shield.staging.java.Java;

/**
 * @Author：HanLu
 * @Description:练习抽象类和抽象方法
 * 1、抽象类作用
 * 为子类的实现提供模板
 *
 * 2、抽象类特点及使用规则
 * 含有抽象方法的一定是抽象类
 * 抽象方法只有声明，没有实现
 * 抽象类不可创建对象，可通过继承来重写抽象方法
 *
 * @Date:Created in 2:11 PM 2020/4/14
 */
abstract public class TestAbstract {
    int a;
    int b;
    int num;

    //1、定义抽象方法
    abstract void addNum(int a,int b);

    abstract int addresult();

    public static void main(String[] args) {
        ATest aTest = new ATest();
        aTest.addNum(3,4);
        System.out.println(aTest.addresult());
    }

}


class ATest extends TestAbstract{

    @Override
    void addNum(int a,int b) {
        this.num = a + b;
    }

    @Override
    int addresult() {
        return num;
    }
}
