package demo.controller;

import demo.exception.AgeIllegalRunTimeException;

/**
 * 测试运行时异常Controller
 *
 * @author LENOVO
 * @since 2024/6/19 10:50
 */
public class RunTimeExceptionController {

    public static void main(String[] args) {
        try {
            setAge(266);
            System.out.println("底层执行成功");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("底层出现了bug");
        }
    }

    public static void setAge(int age) throws RuntimeException{
        if (age > 0 && age < 150){
            System.out.println("保存age成功：" + age);
        } else {
            throw new AgeIllegalRunTimeException("/age is illegal, your age is " + age);
        }
    }

}
