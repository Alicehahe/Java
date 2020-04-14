package cn.com.shield.staging.java.Java;

/**
 * @Author：HanLu
 * @Description:用于测试同一个包下，不同关键字的封装作用域
 * @Date:Created in 11:43 AM 2020/4/14
 */
public class TestObjAuthoration002 {
    public static void main(String[] args) {
        Country country = new Country();

        country.localcation = "亚洲"; //default属性
        country.peopleNum = 500000;
        country.president = "特朗普";
    }




}
