package Chap5_7;

import org.w3c.dom.*;
import javax.xml.parsers.*;
import java.io.*;

public class XMLUtil {
    // 该方法用于从XML配置文件中提取具体类的类名，并返回一个实例对象
    public static Object getBean()  {
        try {
            // 创建DOM文档对象
            DocumentBuilderFactory dFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = dFactory.newDocumentBuilder();
            Document doc;
            doc = (Document) builder.parse(new File("D://2学习资料//idea作业//src//Chap5_7//config.xml"));

            // 获取包含类名的文本结点
            NodeList n1 = doc.getElementsByTagName("className");
            Node classNode = n1.item(0).getFirstChild();
            String cName = classNode.getNodeValue();

            //  通过类名生成实例对象，并将其返回
            Class c = Class.forName(cName);
            Object obj = c.newInstance();
            return obj;

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("XMlUtil类解析出现错误情况");
            return null;
        }
    }
}
