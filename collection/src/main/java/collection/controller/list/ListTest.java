package collection.controller.list;

import java.util.ArrayList;
import java.util.List;

/**
 * List集合练习
 *
 * @author LENOVO
 * @since 2024/6/24 10:29
 */
public class ListTest {
    public static void main(String[] args) {

        // 创建一个List集合，有序，可重复，有索引
        List<String> list = new ArrayList<>();  // 经典代码
        list.add("蜘蛛精");
        list.add("黄袍怪");
        list.add("白骨精");
        list.add("蜘蛛精");

        System.out.println(list);

        // 依据索引添加数据
        list.add(1, "黄风怪");
        System.out.println(list);

        // 根据索引删除数据
        System.out.println(list.remove(3));
        System.out.println(list);

        // 返回集合中指定索引的值
        System.out.println(list.get(2));

        // 修改某个索引处的值
        System.out.println(list.set(1, "金角大王"));
        System.out.println(list);
    }
}
