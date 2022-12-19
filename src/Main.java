import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        System.out.println("Hello World");

        List<Integer> arr = new ArrayList<>();

        arr.add(10);
        arr.add(11);
        arr.add(12);
        arr.add(13);
        arr.add(14);
        arr.add(15);

        Object[] sample =  arr.toArray();



        System.out.println(Arrays.toString(sample));

        List<Object> arrow = new ArrayList<>(Arrays.asList(sample));

//        List arrow = Arrays.asList(sample);

//        arrow = Arrays.asList(sample);

        arrow.add(Arrays.toString(sample));
        arrow.add(24);

        System.out.println(arrow);


    }
}
