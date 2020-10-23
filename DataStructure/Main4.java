import java.util.ArrayList;
import java.util.Collections;

public class Main4 {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("A");
        arrayList.add("B");
        arrayList.add("C");
        arrayList.add("D");
        arrayList.add("E");
        System.out.println("Before reverse sequence: " + arrayList);
        Collections.reverse(arrayList);
        System.out.println("After reverse sequence: " + arrayList);
    }
}
