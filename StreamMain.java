import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class StreamMain {

    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4); //создаем массив
        Stream<Integer> stream = intList.stream(); //получаем поток
        stream.filter(x -> x > 0)               //используем стримы из библиотеки чтобы получить положительные,
                .filter(x -> x % 2 == 0)        //, кратные 2,
                .sorted(Comparator.naturalOrder()) //, отсортированные в порядке возрастания элементы
                .forEach(System.out::println);
    }
}