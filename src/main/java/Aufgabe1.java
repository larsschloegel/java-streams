import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Aufgabe1 {

    public static void main(final String[] args) throws Exception {
        //1. Liste einlesen und ausgeben
        /*Files.lines(Path.of("students.csv"))
                .forEach(System.out::println);*/

        //2. Überschrift entfernen.
        /*Files.lines(Path.of("students.csv"))
                .skip(1)
                .forEach(System.out::println);*/

        //3. Zu Klasse student umwandeln
        //
        Files.lines(Path.of("students.csv"))
                .skip(1)
                .filter(string -> !string.isEmpty())
                //4. Duplikat entfernen.
                .distinct()
                //3. Zu Klasse student umwandeln
                .map(line -> {
                    String[] arr = line.split(",");
                    return new Student(
                            Integer.parseInt(arr[0]),
                            arr[1],
                            arr[2],
                            Integer.parseInt(arr[3]));
                }).forEach(System.out::println);


    }
}
