package Multithreading;

import java.util.AbstractMap;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapIterate {
    public static void main(String[] args) throws InterruptedException {
        Map<Integer, String> maps = new HashMap<>();
       AbstractMap<Integer, String> map = new ConcurrentHashMap<>();
        map.put(1, "Max");
        map.put(2, "Paul");
        map.put(3, "Paulus");
        map.put(4, "Romulus");

        Runnable run = () -> {
            Iterator<Integer> iterator = map.keySet().iterator();
            while (iterator.hasNext()) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                int i = iterator.next();
                System.out.println(i + ":" + map.get(i));
            }
        };
        Runnable run2 = () -> {
            Iterator<Integer> iterator = map.keySet().iterator();
            while (iterator.hasNext()) {
                try {
                    Thread.sleep(1500);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                int i = iterator.next();
                map.put(5, "Mark");
                map.put(7, "Markus");
                map.put(6, "Maximus");
            }

        };

        Thread thread1 = new Thread(run);
        Thread thread2 = new Thread(run2);
        thread1.start();
        thread2.start();
        System.out.println(map);
    }
}
