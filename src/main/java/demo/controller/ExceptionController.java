package demo.controller;

import demo.exception.AgeIllegalException;
import demo.exception.AgeIllegalRunTimeException;

/**
 * 测试编译时异常Controller
 *
 * @author LENOVO
 * @since 2024/6/19 10:50
 */
public class ExceptionController {

    public static void main(String[] args) {
        try {
            setAge2(266);
            System.out.println("底层执行成功");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("底层出现了bug");
        }

        try {
            setAge2(256);
            System.out.println("setAge2底层执行成功");
        } catch (AgeIllegalException e) {
            e.printStackTrace();
            System.out.println("setAge2底层出现了bug");
        }
    }

    public static void setAge2(int age) throws AgeIllegalException {
        if (age > 0 && age < 150){
            System.out.println("保存age成功：" + age);
        } else {
            throw new AgeIllegalException("/age is illegal, your age is " + age);
        }
    }

}
