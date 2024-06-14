package demo.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

/**
 * 医院挂号预约类
 *
 * @author LENOVO
 * @since 2024/6/14 14:43
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Appointment {

    private String userName;
    private Integer age;
    private char gender;
    private String tel;
    private String desc;
    private String department;
    private String doctorId;
    private LocalDateTime appointDateTime;
}
