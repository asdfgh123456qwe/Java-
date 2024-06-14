package demo.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;

/**
 * 医院部门类
 *
 * @author LENOVO
 * @since 2024/6/14 9:33
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Department {
    private String departmentId;
    private String departmentName;
    private ArrayList<Doctor> doctors;
}
