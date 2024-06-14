package demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import demo.pojo.TestAO;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.UUID;

@SpringBootTest
class JavaTestApplicationTests {

    /**
     * Arrays工具类练习
     */
    @Test
    public void testArrays(){
        int[] arr = {12,30,66,58,99,62};
        System.out.println(Arrays.toString(arr));

        int[] arr2 = Arrays.copyOfRange(arr, 1, 4);
        System.out.println(Arrays.toString(arr2));

        int[] arr3 = Arrays.copyOf(arr, 10);
        System.out.println(Arrays.toString(arr3));

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        TestAO[] testAOS = new TestAO[3];
        testAOS[0] = new TestAO(18, "张三", 15.2);
        testAOS[1] = new TestAO(15, "李四", 18.2);
        testAOS[2] = new TestAO(21, "张三", 11.2);


//        Arrays.sort(testAOS, new Comparator<TestAO>() {
//            @Override
//            public int compare(TestAO o1, TestAO o2) {
//                return Double.compare(o1.getHeight(), o2.getHeight());
//            }
//        });

//        Arrays.sort(testAOS, (TestAO o1, TestAO o2) -> {
//                return Double.compare(o1.getHeight(), o2.getHeight());
//        });

//        Arrays.sort(testAOS, (o1, o2) -> Double.compare(o1.getHeight(), o2.getHeight()));
//        Arrays.sort(testAOS, (o1, o2) -> CompareByData.compareByAge(o1, o2));

        // 静态方法引用
        Arrays.sort(testAOS, CompareByData::compareByAge);
        System.out.println(Arrays.toString(testAOS));

        // 实例方法引用
        CompareByData compare = new CompareByData();
//        Arrays.sort(testAOS, (o1, o2) -> compare.compareByAgeDesc(o1, o2));
        Arrays.sort(testAOS, compare::compareByAgeDesc);
        System.out.println(Arrays.toString(testAOS));

        String[] names = {"Andy", "angela", "Babo", "body", "caocao", "CiCi"};
    /*    Arrays.sort(names, new Comparator<String>(){
            @Override
            public int compare(String o1, String o2) {
                return o1.compareToIgnoreCase(o2);
            //    return 0;
            }
        });*/

    //    Arrays.sort(names, (o1, o2) -> o1.compareToIgnoreCase(o2));
        Arrays.sort(names, String::compareToIgnoreCase);

        System.out.println(Arrays.toString(names));
    }

    @Test
    public void testLambda(){
//        Swimming s = new Swimming(){
//            @Override
//            public void swim() {
//                System.out.println("swim");
//            }
//        };
//        s.swim();

        Swimming s = () -> {
             System.out.println("swim");
        };
        s.swim();

        System.out.println(UUID.randomUUID());
    }

    @Test
    public void testLocalDateTime(){
        String date = "2024-05-23 15:15:13";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        LocalDateTime dateTime = LocalDateTime.parse(date, formatter);
        System.out.println(dateTime);
    }

    @FunctionalInterface
    public interface Swimming{
        void swim();
    }

    public class CompareByData{
        public static int compareByAge(TestAO o1, TestAO o2){
            return Double.compare(o1.getHeight(), o2.getHeight());
        }

        public int compareByAgeDesc(TestAO o1, TestAO o2){
            return Double.compare(o2.getHeight(), o1.getHeight());
        }
    }

}
