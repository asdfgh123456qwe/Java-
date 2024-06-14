package demo.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 测试入参
 *
 * @author LENOVO
 * @since 2024/6/12 15:15
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class TestAO {
    private Integer age;
    private String name;
    private Double height;
}
