package demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;

@SpringBootTest
class JavaTestApplicationTests1 {

    /**
     * 算法练习
     */

    public static void main(String[] args) {
        System.out.println(testRegex("05964866"));
        System.out.println(testRegex1("665488546"));
    }


    // 冒泡排序
    @Test
    public void testBubblingSort() {
        Integer[] arr = {5, 3, 2, 6};
        Integer temp;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    //选择排序
    @Test
    public void testSelectSort() {
        int[] arr = {5, 3, 2, 6};
        int location;
        for (int i = 0; i < arr.length - 1; i++) {
            location = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[location]) {
                    location = j;
                }
            }
            if (location != i) {
                int temp = arr[i];
                arr[i] = arr[location];
                arr[location] = temp;
            }
        }
        System.out.println(Arrays.toString(arr));
    }


    // 二分查找
    @Test
    public void binarySearch() {
        int[] arr = {56, 52, 26, 70, 5, 17, 20};
        Arrays.sort(arr);
        System.out.println(Arrays.binarySearch(arr, 52));
        int data = 52;
        int l = 0, r = arr.length - 1;
        while(l <= r) {
            int mid = (l + r) >>> 1;
            if (arr[mid] > data) {
                r = mid - 1;
            } else if (arr[mid] < data) {
                l = mid + 1;
            } else {
                System.out.println(mid);
                break;
            }
        }
    }

    // 正则表达式
    public static boolean testRegex(String qq){
        if(qq == null || qq.startsWith("0") || qq.length() > 20 || qq.length() < 6){
            return false;
        }

        for (int i = 0; i < qq.length(); i++) {
            char ch = qq.charAt(i);
            if (ch < '0' || ch > '9'){
                return false;
            }
        }

        return true;
    }

    // 正则表达式
    public static boolean testRegex1(String qq){
        return qq != null && qq.matches("[1-9]\\d{5,19}");
    }

    // 正则表达式
    @Test
    public void testRegex2(){
        String email = "1090247102@qq.com";
        String reg = "\\w{2,}@\\w{2,20}(\\.\\w{2,10}){1,2}";
        System.out.println(email.matches(reg));
    }
}
