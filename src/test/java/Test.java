import com.alibaba.fastjson.JSONObject;
import org.example.basic.MapApi;

import java.util.HashMap;
import java.util.Map;

public class Test {

    public static void main(String[] args) {
        Map<String, Map<String, Integer>> mapMap = new HashMap<>();
        Map<String, Integer> a1 = new HashMap<>();
        a1.put("b-1", 11);

        mapMap.put("b", a1);
        String s = JSONObject.toJSONString(mapMap);
        System.out.println(s);
        mapMap = JSONObject.parseObject(s, Map.class);
        System.out.println(MapApi.testMap(mapMap));
    }
}
