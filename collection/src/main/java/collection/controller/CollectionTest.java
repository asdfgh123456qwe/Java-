package collection.controller;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/**
 * Collection集合泛型接口练习
 *
 * @author LENOVO
 * @since 2024/6/19 17:35
 */
public class CollectionTest {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();   // 有序，可重复，有索引
        list.add("gggg1");
        list.add("gggg2");
        list.add("gggg3");
        list.add("gggg2");
        System.out.println(list);
        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.get(2));
        System.out.println(list.get(3));


        HashSet<String> hashSet = new HashSet<>();   // 无序， 不可重复， 无索引
        hashSet.add("gggg1");
        hashSet.add("gggg2");
        hashSet.add("gggg3");
        hashSet.add("gggg2");
        System.out.println(hashSet);
    }
}
