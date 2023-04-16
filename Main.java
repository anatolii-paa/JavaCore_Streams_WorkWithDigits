import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4); //получаем массив
        List<Integer> newList = new ArrayList<>();
        for (int x : intList) {
            if (x <= 0) continue; //получаем положительные элементы
            if (x % 2 != 0) continue; //получаем кратные двум элементы
            newList.add(x);
        }
        Collections.sort(newList);
        for (int i : newList) System.out.println(i);
    }
}