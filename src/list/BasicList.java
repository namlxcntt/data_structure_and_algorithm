package list;

import java.util.ArrayList;
import java.util.List;

public class BasicList {

    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<Integer>();
        arr.add(1);
        arr.remove(12);
        arr.clear();
        arr.contains(1);
        System.out.println("done ->" + false);
    }
}
