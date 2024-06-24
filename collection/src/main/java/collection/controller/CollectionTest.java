package collection.controller;

import java.util.*;
import java.util.function.Consumer;

/**
 * Collection集合泛型接口练习
 *
 * @author LENOVO
 * @since 2024/6/19 17:35
 */
public class CollectionTest {
    public static void main(String[] args) {
//        List<String> list = new ArrayList<>();   // 有序，可重复，有索引
//        list.add("gggg1");
//        list.add("gggg2");
//        list.add("gggg3");
//        list.add("gggg2");
//        System.out.println(list);
//        System.out.println(list.get(0));
//        System.out.println(list.get(1));
//        System.out.println(list.get(2));
//        System.out.println(list.get(3));
//
//
//        HashSet<String> hashSet = new HashSet<>();   // 无序， 不可重复， 无索引
//        hashSet.add("gggg1");
//        hashSet.add("gggg2");
//        hashSet.add("gggg3");
//        hashSet.add("gggg2");
//        System.out.println(hashSet);

//        Collection<String> collection = new ArrayList<>();
//        Collection<String> c2 = new ArrayList<>();
//        collection.add("123");
//        collection.add("dfdsf");
//        Object[] array = collection.toArray();
//        System.out.println(Arrays.toString(array));
//        collection.remove("123");
//        System.out.println(collection.size());
//        System.out.println(collection.contains("dfdsf"));
//        System.out.println(collection);
//        c2.addAll(collection);
//        collection.clear();
//        System.out.println(collection.isEmpty());
//        System.out.println(c2);


//        Collection<String> c = new ArrayList<>();
//        c.add("www");
//        c.add(".hello world");
//        c.add("!!!");
//        for (String s : c) {
//            System.out.println(s);
//        }
//
//        for (Object o : c.toArray()) {
//            System.out.println(o);
//        }


        Collection<String> c = new ArrayList<>();
        c.add("赵敏");
        c.add("小昭");
        c.add("周芷若");
        c.add("灭绝师太");

        c.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });

        c.forEach(System.out::println);
    }

}
