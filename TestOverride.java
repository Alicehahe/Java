package cn.com.shield.staging.java;

/**
 * @Author：HanLu
 * @Description:这段代码用于练习类的继承中方法重写
 * @Date:Created in 5:19 PM 2020/4/13
 */
class Transport{

    String name;

    public void countPeopleNum(){
        System.out.println("Transport.countPeopleNum");
    }

}

class Car extends Transport{

    String name;

    @Override
    public void countPeopleNum(){
        super.countPeopleNum();
        System.out.println("Car.countPeopleNum,共容纳4-7人");
    }
}

public class TestOverride {
    public static void main(String[] args) {
        Car car = new Car();

        car.countPeopleNum(); //子类重写的父类的方法

    }
    }

