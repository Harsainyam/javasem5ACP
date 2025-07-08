package college.EightJuly;

import java.util.ArrayList;
import java.util.List;

public class SuppressWarning {
    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        List list = new ArrayList();  // raw type warning
        list.add("Hello");
        list.add(123);

        System.out.println(list);
    }
}
