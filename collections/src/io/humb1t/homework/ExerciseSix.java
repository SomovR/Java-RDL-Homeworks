package io.humb1t.homework;

import java.util.*;

public class ExerciseSix {
    private static Map<String, String> cache = new HashMap<>();

    public static void main(String[] args) {
        List<String> urls = new ArrayList<>();
        urls.add("https://youtube.com");
        urls.add("https://github.com");
        urls.add("https://www.google.com");
        urls.add("https://vk.com");
        urls.add("https://yandex.ru");
        urls.add("https://yandex.ru");

        for (String url : urls) {
            System.out.println(url + writeAndReadCache(url));
        }

        //System.out.println(cache.values());
    }

    private static String writeAndReadCache(String url) {
        cache.putIfAbsent(url, " ...content is loading from cache");
        return cache.get(url);
    }
}
