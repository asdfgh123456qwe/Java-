package demo.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalTime;

/**
 * 坐诊情况类
 *
 * @author LENOVO
 * @since 2024/6/14 14:57
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Schedule {

    private LocalDate today;
    // 上午
    private boolean morning;   //是否看诊
    private LocalTime mStart;
    private LocalTime mend;
    private Integer mTotalNumber;
    private Integer mAppointNumber;

    // 下午
    private boolean afternoon;   //是否看诊
    private LocalTime aStart;
    private LocalTime aend;
    private Integer aTotalNumber;
    private Integer aAppointNumber;

}
