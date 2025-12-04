import java.util.concurrent.ConcurrentHashMap;


public class ConcurrentHashMapEksempel {

    public static void main(String[] args) throws Exception {
        ConcurrentHashMap<String, Integer> map = new ConcurrentHashMap<>();

        Thread writer = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                map.put("key" + i, i);
            }
        });

        Thread reader = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                map.get("key" + i);
            }
        });

        writer.start();
        reader.start();
        writer.join();
        reader.join();

        System.out.println("Size: " + map.size()); // 1000
    }
}
