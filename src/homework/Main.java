package homework;

import java.util.Arrays;
import java.util.List;

public class Main {
    /*
    Написать метод, принимающий не пустой лист строк и возвращающий строку,
    которая встречается раньше в листе - самую короткую или самую длинную.
    Все строки в листе разной длины
     */
    public static void main(String[] args) {
        List<String> list = Arrays.asList("equals", "y", "method", "iterator", "interface", "int");
        System.out.println(findShortestOrLongest(list));

    }

    public static String findShortestOrLongest (List <String> list){
       String shortest = list.get(0);
       String longest = list.get(0);

        for (String l : list){
            if (l.length() < shortest.length()){
                shortest = l;
            }
            if (l.length() > longest.length()){
                longest = l;
            }
        }
        if (list.indexOf(shortest) < list.indexOf(longest)){
            return shortest;
        }
        else return longest;
    }
}
