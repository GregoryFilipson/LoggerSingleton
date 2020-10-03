import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) throws IOException {
        Logger logger = Logger.getInstance();
        System.out.println("Привет! Введи размер списка");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int sizeList = Integer.parseInt(reader.readLine());
        System.out.println("Введите верхнюю границу для значений:");
        int maxValue = Integer.parseInt(reader.readLine());
        logger.log("Создаем и наполняем список");
        List<Integer> sourse = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < sizeList; i++) {
            sourse.add(random.nextInt(maxValue));
        }
        logger.log("Вот список - " + sourse);
        System.out.println(sourse);
        System.out.println("Введите порог для фильтра: ");
        int treshold = Integer.parseInt(reader.readLine());
        Filter filter = new Filter(treshold);
        filter.filterOut(sourse);
    }
}
