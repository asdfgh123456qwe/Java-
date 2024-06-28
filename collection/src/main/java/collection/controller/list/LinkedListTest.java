package collection.controller.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * LinkedList集合练习
 *
 * @author LENOVO
 * @since 2024/6/24 10:29
 */
public class LinkedListTest {
    public static void main(String[] args) {

        // 新建队列
        LinkedList<String> queue = new LinkedList<>();

        // 入队
        queue.addLast("第一号人");
        queue.addLast("第二号人");
        queue.addLast("第三号人");
        queue.addLast("第四号人");

//        System.out.println(queue);
//
//        // 出队
//        System.out.println(queue.removeFirst());
//
//        System.out.println(queue);
//
//        queue.forEach(System.out::println);

        System.out.println("-------------------------------------------------");

        // 创建一个栈对象
        LinkedList<String> stack = new LinkedList<>();

        // 压栈
        stack.push("1");
        stack.push("2");
        stack.push("3");
        stack.push("4");

        System.out.println(stack);

        // 出栈
        System.out.println(stack.pop());

        System.out.println(stack);

    }
}
