package cn.com.shield.staging.java.Java;

/**
 * @Author：HanLu
 * @Description:这段代码用于练习类的封装的知识点
 * 1、封装的作用
 * 高内聚、低耦合的作用
 *
 * 2、java中不同类型封装、作用于不同的地方
 * private      只能在本类中访问
 * default      在本类、同一个包下类文件都可以访问
 * protected    在本类型、同一个包下类文件、不同包的子类可以访问
 * public       所有地方都可以访问
 *
 * 3、java中javaBean规则(类中属性、方法的封装规则)、属性的set、get方法
 *属性一般是private，通过set、get方法来获取和设置属性
 * 方法一般是public
 *
 * @Date:Created in 11:14 AM 2020/4/14
 */
public class TestObjAuthoration {

    protected  int aa = 54; //protected关键字本类、同一个包下类、不同包子类可以访问
    int bb = 67;


}

class  Country { //默认是default，不同包的子类可以访问



    private String countryName;
    String localcation;
    protected int peopleNum;
    public String president;


   Country(){}


    public Country(String countryName,String localcation,int peopleNum,String president){
        this.countryName = countryName;
        this.localcation = localcation;
        this.peopleNum = peopleNum;
        this.president = president;
    }

    public void transport(){
        System.out.println("Country.transport");
    }

}

class China extends Country{

    China(){
        super("中国","亚洲",1000000000,"习近平");
    }

    public  void  test(){

        //System.out.println(countryName); //私有属性或方法只能在定义的类中访问，子类没有权限

        System.out.println(localcation);//default，在子类中可以访问
        System.out.println(peopleNum);  //protected在子类中可以访问
        System.out.println(president);  //public，在子类中可以访问
    }

}
