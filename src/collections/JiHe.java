package collections;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.concurrent.*;

public class JiHe {
    ArrayList<Integer> arrayList;
    HashMap<String, String> hashMap;
    CopyOnWriteArrayList<Integer> copyOnWriteArrayList;
    ConcurrentHashMap<String, Integer> concurrentHashMap;
    LinkedHashMap<String, String> linkedHashMap;
    ThreadPoolExecutor poolExecutor = new ThreadPoolExecutor(10, 10, 60, TimeUnit.SECONDS, new LinkedBlockingQueue<>(20));
    ClassLoader classLoader;
    FileInputStream fileInputStream;
    BufferedInputStream bufferedInputStream;
    ThreadPoolExecutor threadPoolExecutor;
}
