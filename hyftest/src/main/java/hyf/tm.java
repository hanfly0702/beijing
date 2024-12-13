package hyf;

import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

public class tm {

    public static void main(String[] args) {

            String str = "12";
            str.substring(0, 3);


        HashMap hashMap = new HashMap(4);

        ConcurrentHashMap a = new ConcurrentHashMap();

        //String str = "1";

        hashMap.put("a", "aaaa");
        hashMap.put("a", "aaaa");
        hashMap.put("1", "1111");

        hashMap.get("1");
        hashMap.put("b", "4");
        hashMap.put("c", "3");
        hashMap.put("abc", "5");
        hashMap.put("bac", "6");
        hashMap.put("cab", "7");
        hashMap.get("1");

    }
}
