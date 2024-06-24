package collection.controller.collection;

import collection.pojo.Movie;

import java.util.ArrayList;
import java.util.Collection;

/**
 * 完成电影信息展示
 *
 * @author LENOVO
 * @since 2024/6/24 10:03
 */
public class MovieTest {
    public static void main(String[] args) {
        Collection<Movie> movies = new ArrayList<>();
        movies.add(new Movie("《肖生克的救赎》", 9.7, "罗宾斯"));
        movies.add(new Movie("《霸王别姬》", 9.6, "张国荣，张丰毅"));
        movies.add(new Movie("《阿甘正传》", 9.5, "汤姆.汉克斯"));
//        System.out.println(movies);

//        for (Movie movie : movies) {
//            System.out.println(movie);
//        }

        movies.forEach(System.out::println);
    }
}
