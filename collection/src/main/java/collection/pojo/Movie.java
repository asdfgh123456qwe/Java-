package collection.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 最长的电影
 *
 * @author LENOVO
 * @since 2024/6/24 9:50
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Movie {
    private String name;
    private Double score;
    private String actor;
}
