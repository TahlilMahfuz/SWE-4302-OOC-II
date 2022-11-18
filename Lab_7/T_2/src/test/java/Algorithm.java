import java.util.ArrayList;

public class Algorithm {
    public static int count(ArrayList<Integer> arrayList){
        int count=0;
        for(int elem:arrayList){
            if(elem%2!=0){
                count++;
            }
        }
        return count;
    }
    public static <T> int countIf(ArrayList<T>arrayList, Property<T> p) {

        int count = 0;
        for (T elem : arrayList)
            if (p.test(elem)){
                count++;
            }
        return count;
    }
}
