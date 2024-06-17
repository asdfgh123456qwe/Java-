package demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;

@SpringBootTest
class JavaTestApplicationTests1 {

    /**
     * 算法练习
     */


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

}
