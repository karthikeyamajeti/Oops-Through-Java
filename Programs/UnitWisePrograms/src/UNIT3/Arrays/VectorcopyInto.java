import java.util.*;
public class VectorcopyInto {
	public static void main(String[] args) {
        Vector<Integer> v = new Vector<>();
        v.add(10);
        v.add(20);
        v.add(30);
        Object[] arr = new Object[3];
        v.copyInto(arr);
        System.out.println(Arrays.toString(arr));
    }
}
