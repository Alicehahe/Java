package cn.com.shield.staging.Java;

import testAuthoration.TestReader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @Author：HanLu
 * @Description:这是练习JavaIO字符流中FileReader/FileWriter对文件进行读写
 * 知识点：
 * 1、继承关系
 *  Reader抽象类-InputStreamReader子类-FileReader子类
 *  Writer抽象类-OutputStreamWriter子类-FileWriter子类
 *
 *  2、文件读写完成后，必须关掉文件流，否则回会出现文件内容缺失的情况
 *
 *  3、追加文件尾部添加内容
 *  true参数表示尾部追加，默认为false，会清空文件内容
 * @Date:Created in 4:33 PM 2020/6/3
 */
public class TestReaderWriter {

    public static void main(String[] args) throws IOException {
//        TestReaderWriter.testFileReaderWriter("/Users/qingjiao/Desktop/test.txt","/Users/qingjiao/Desktop/test11.txt");

        TestReaderWriter.testFileWriteAppend();
    }


    public static void testFileReaderWriter(String readPath,String writePath) throws IOException {

        FileReader fd =null;
        FileWriter fw= null;
        try {
            fd = new FileReader(readPath);
            fw = new FileWriter(writePath);
            char[] content = new char[1024];
            while ((fd.read(content)>-1)){
                System.out.println(new String(content));
                fw.write(content,0,content.length);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }finally {
            if (fd != null){
                fd.close();
            }

            if (fw!=null){
                fw.close();
            }
        }

    }

    /**
     * 不清空文件内容，在尾部追加内容添加
     * @throws IOException
     */
    public static void testFileWriteAppend() throws IOException {

        String str = "\n"+"这是追加的内容";

        FileWriter fw = new FileWriter("/Users/qingjiao/Desktop/test.txt",true);

        fw.write(str,0,str.length());


        fw.close();

    }
}
