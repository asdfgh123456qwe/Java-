package demo.exception;

/**
 * 年龄异常自定义运行时异常类
 *
 * @author LENOVO
 * @since 2024/6/19 10:25
 */
public class AgeIllegalRunTimeException extends RuntimeException{
    public AgeIllegalRunTimeException(){}

    public AgeIllegalRunTimeException(String message){
        super(message);
    }
}
