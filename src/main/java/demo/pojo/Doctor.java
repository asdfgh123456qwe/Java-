package demo.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 * 医生类
 *
 * @author LENOVO
 * @since 2024/6/13 17:47
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Doctor {
    private String doctorId;  //编号
    private String name;
    private String departmentName;
    private char gender;
    private Integer age;
    private String spetialty;
    private LocalDate joinDate;
    private ArrayList<String> schedules;
}
