package homework;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class ModifiedCache {
    private static Map<String, String> cache = new ConcurrentHashMap<>();

    public static void main(String[] args) {

        writeAndReadCache("https://www.google.com");
        writeAndReadCache("https://yandex.ru");
        writeAndReadCache("https://yandex.ru");
        writeAndReadCache(null);
        System.out.println("Cache contains: " + cache.toString());
    }
    private static void writeAndReadCache(String url) {
        /*I think, using Optional as an argument of a method is not a good idea
        because value of its object may be null and during method implementation
        we will have to add additional checks for null values*/
        if(Optional.ofNullable(url).isEmpty()) {
            System.out.println("URL can not be null");
        } else {
            cache.putIfAbsent(url + " ", " some content here");
        }
    }
}