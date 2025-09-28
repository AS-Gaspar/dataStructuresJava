package misc.pointers;
import java.util.HashMap;
import java.util.Map;

public class Pointer {
    public static void main(String[] args) {

        HashMap<String, Integer> map1 = new HashMap<>();
        HashMap<String, Integer> map2 = new HashMap<>();

        map1.put("value", 1);
        map1.put("value2", 2);

        HashMap<String, Integer> map3 = new HashMap<>(Map.of(
                "value3", 3,
                "value4", 4
        ));

        map2 = map3;
        map1 = map3;

        map1.remove("value3");
        map2.put("value5", 10);
        map3.remove("value4");

        System.out.println(map1);
        System.out.println(map2);
        System.out.println(map3);
    }
}
