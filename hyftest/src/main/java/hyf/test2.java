package hyf;

import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.Collections;

public class test2 {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("1");
        list.add("2");
        String[] array = list.toArray(new String[0]);
        String[] array1 = list.toArray(new String[2]);
        String[] array3 = (String[]) list.toArray();
       // String[] array = CollectionUtils.toArray(list);


        //String strp = String.join(",", array);

        System.err.println(1);
    }

}
