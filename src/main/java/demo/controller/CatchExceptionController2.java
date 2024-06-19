package demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.FileInputStream;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * 捕获异常Controller
 *
 * @author LENOVO
 * @since 2024/6/19 10:50
 */
public class CatchExceptionController2 {

    public static void main(String[] args) {
        while (true){
            try {
                System.out.println(getMoney());
                break;
            } catch (Exception e) {
                System.out.println("请输入合法数字！！");
            }
        }
    }

    public static double getMoney() throws Exception {

        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("请输入合适的价格");
            double money = scanner.nextDouble();
            if (money >= 0){
                return money;
            } else {
                System.out.println("您输入的价格是不合适的！！！");
            }
        }
    }
}
