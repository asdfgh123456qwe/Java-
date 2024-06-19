package demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 捕获异常Controller
 *
 * @author LENOVO
 * @since 2024/6/19 10:50
 */
@RestController
@RequestMapping("/member")
public class CatchExceptionController {

    @GetMapping("/test")
    public void test(String[] args){
        try {
            test1();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public void test1() throws Exception {
//        DateTimeFormatter sdf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
//        LocalDateTime dateTime = LocalDateTime.parse("2024-06-19 15:28:30", sdf);

        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = format.parse("2024-06-19 15:38");
        System.out.println(date);
        test2();
    }

    public void test2() throws Exception {
        InputStream is = new FileInputStream("D:/文件/黄丹枫的简历.pdf");
    }

}
