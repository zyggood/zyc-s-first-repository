import java.util.ArrayList;

public class sword13 {
    public void reOrderArray(int [] array) {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        ArrayList<Integer> arrayList2 = new ArrayList<Integer>();
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 1)arrayList.add(array[i]);
            else arrayList2.add(array[i]);
        }
        arrayList.addAll(arrayList2);
        for (int i = 0; i < array.length; i++) {
            array[i] = arrayList.get(i);
        }

    }
}
