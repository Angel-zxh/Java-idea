package Chap13_5;

import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        // TODO 自动生成的方法存根
        while (true) {

            MainFrame f = new MainFrame();
            Scanner scan = new Scanner(System.in);
            System.out.println("请输入ON进行开机：");
            String str = scan.nextLine();
            if (str.equals("ON")) {
                f.fun();
            } else {
                System.out.println("输入的信息有误！！！请重新输入");
            }
        }
    }

}
