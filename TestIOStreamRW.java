package cn.com.shield.staging.Java;

import java.io.*;

/**
 * @Author：HanLu
 * @Description:这是javaIO字符流中带有缓存的对文件的读写
 * 1、知识点
 * Reader-BufferedReader
 * Writer-BufferWriter
 *
 * @Date:Created in 5:16 PM 2020/6/3
 */
public class TestIOStreamRW {
    public static void main(String[] args) throws IOException {
        TestIOStreamRW.testZiFuBufferRW();
    }


    public static void testZiFuBufferRW() throws IOException {
        FileReader fd = null;
        BufferedReader bd = null;


        try {
            fd = new FileReader("/Users/qingjiao/Desktop/test.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


        bd = new BufferedReader(fd);

        while (true){
            System.out.print(bd.readLine());
            //一行一行的读取数据，读到结尾是返回null
            if (bd.readLine() == null){
                break;
            }
        }

    }
}
