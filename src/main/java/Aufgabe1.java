import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Aufgabe1 {

    public static void main(String[] args) {
        //Array
        final int[] zahlen = new int[] {9,1,8,2,7,3,6,4,5};

        //Liste "natürliche" sortiert ausgeben
        Arrays.stream(zahlen).sorted().forEach(System.out::println);

        //mit Liste
        /*List<Integer> list = Arrays.asList(9,1,8,2,7,3,6,4,5);
        List<Integer> sortedList = list.stream()
                .sorted()
                .collect(Collectors.toList());
        sortedList.forEach(System.out::println);*/

        //Summe aller Zahlen ausgeben
        System.out.println(Arrays.stream(zahlen).sum());
        //Bonus: Produkt aller Zahlen ausgeben
        System.out.println(Arrays.stream(zahlen).reduce(1,(x,y)->x*y));
    }
}
