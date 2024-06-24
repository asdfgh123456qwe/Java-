package collection.controller.list;

import java.util.ArrayList;
import java.util.List;

/**
 * ArrayList集合练习
 *
 * @author LENOVO
 * @since 2024/6/24 10:29
 */
public class ArrayListTest1 {
    public static void main(String[] args) {

        // 创建一个List集合，有序，可重复，有索引
        List<String> list = new ArrayList<>();  // 经典代码
        list.add("蜘蛛精");
        list.add("黄袍怪");
        list.add("白骨精");
        list.add("蜘蛛精");

//        for (int i = 0; i < list.size(); i++) {
//            System.out.println(list.get(i));
//        }
//
//        for (String s : list) {
//            System.out.println(s);
//        }

        list.forEach(System.out::println);
    }
}
