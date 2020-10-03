import java.util.ArrayList;
import java.util.List;

public class Filter {
    protected int treshold;

    public Filter(int treshold) {
        this.treshold = treshold;
    }

    public List<Integer> filterOut(List<Integer> source) {
        Logger logger = Logger.getInstance();
        List<Integer> result = new ArrayList<>();
        for (Integer integer : source) {
            if (integer <= treshold) {
                result.add(integer);
                logger.log("Элемент + " + integer + " проходит!");
            } else {
                logger.log("Элемент " + integer + " не проходит и не будет добавлен в список");
            }
        }
        logger.log("Готовый список - " + result);
        return result;
    }
}