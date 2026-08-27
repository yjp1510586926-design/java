package collection;

import java.util.ArrayList;
import java.util.LinkedHashMap;

public class UserCacheMap {

    private final LinkedHashMap<String, Object> cache = new LinkedHashMap<>(16, 0.75f, true);

    public void put(String key, Object value) {
        cache.put(key, value);
        if (cache.size() > 100) {
            String eldestKey = new ArrayList<>(cache.keySet()).get(0);// 获取map第一个
            cache.remove(eldestKey);
            System.out.println("缓存满删除最旧数据: " + eldestKey);
        }
    }

    public Object get(String key) {
        return cache.get(key);
    }

    public int size() {
        return cache.size();
    }

    public static void main(String[] args) {
        UserCacheMap map = new UserCacheMap();

        for (int i = 1; i <= 101; i++) {
            map.put("user" + i, "data" + i);
        }
        System.out.println("当前缓存大小: " + map.size());
        System.out.println("获取被淘汰的 user1 的结果: " + map.get("user1"));

    }
}
