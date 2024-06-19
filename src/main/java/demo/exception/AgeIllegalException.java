package demo.exception;

/**
 * 年龄异常自定义编译时异常类
 *
 * @author LENOVO
 * @since 2024/6/19 10:25
 */
public class AgeIllegalException extends Exception{
    public AgeIllegalException(){}

    public AgeIllegalException(String message){
        super(message);
    }
}
