package pattern.behavioral.command;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @Author: suxun
 * @Date: 2018/12/9 17:55
 * @Description:
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class CourseVideo {

    private String name;

    public void open() {
        System.out.println("open");
    }

    public void close() {
        System.out.println("close");
    }
}
