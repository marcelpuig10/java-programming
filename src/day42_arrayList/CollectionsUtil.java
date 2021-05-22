package day42_arrayList;
import java.util.*;

public class CollectionsUtil {
    public static void main(String[] args) {
        List<Character> letters = new ArrayList<>();
        letters.addAll(Arrays.asList('j','a','v','a','i','s','f','u','n'));
        System.out.println("size = " + letters.size());
        System.out.println(letters);

        Collections.reverse(letters);
        System.out.println("reversed = " +letters);

        Collections.frequency(letters,'a');
        System.out.println("frequency of a = " + Collections.frequency(letters, 'a'));

        int vCount = Collections.frequency(letters,'v');
        System.out.println("letter v= "+ vCount);

        System.out.println("Max char = "+ Collections.max(letters));

        System.out.println("Min char = "+ Collections.min(letters));

        Collections.reverse(letters);

        Collections.replaceAll(letters, 'a','u');
        System.out.println(letters);

        Collections.replaceAll(letters,'i','j');
        System.out.println(letters);

    }

}
