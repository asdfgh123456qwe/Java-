package collection.controller.set;

import collection.pojo.Student;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * set集合练习
 *
 * @author LENOVO
 * @since 2024/6/25 9:33
 */
public class HashSetTest {
    public static void main(String[] args) {
//        Set<Integer> set = new HashSet<>();  // 创建了一个HashSet的集合对象

//        set.add(111);
//        set.add(555);
//        set.add(333);
//        set.add(777);
//        set.add(888);
//        set.add(777);
//        set.add(666);
//
//        System.out.println(set);
//
//        set.forEach(System.out::println);

//        HashSet<Student> students = new HashSet<>();
//        students.add(new Student("张三", 15, '男'));
//        students.add(new Student("张三", 15, '男'));
//        students.add(new Student("王五", 12, '男'));
//        students.add(new Student("赵六", 25, '男'));
//
//        System.out.println(students);

        Set<Integer> set = new TreeSet<>();
        set.add(77);
        set.add(22);
        set.add(66);
        set.add(22);
        set.add(66);

        System.out.println(set);
    }
}
