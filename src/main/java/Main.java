import java.util.*;

public class Main {
    public static Scanner scanner;

    public static void main(String[] args) {
        Logger logger = Logger.getInstance();
        logger.log("Запускаем программу");

        Random random = new Random();
        scanner = new Scanner(System.in);

        logger.log("Просим пользователя ввести входные данные для списка");
        System.out.println("Введите размер списка");
        int size = scanner.nextInt();
        System.out.println("Введите верхнюю границу для значений");
        int maxValue = scanner.nextInt();

        logger.log("Создаём и наполняем список");
        List<Integer> source = new ArrayList<>(size);
        for (int i = 0; i < size; i++) {
            source.add(random.nextInt(maxValue));
        }
        System.out.println("Вот случайный список: " + source);

        logger.log("Просим пользователя ввести входные данные для фильтрации");
        System.out.println("Введите порог для фильтра");
        int f = scanner.nextInt();
        Filter filter = new Filter(f);
        //хм, а стоит ли так делать, просто новую переменную не хочется заводить, да и не нужна она здесь в дальнейшем.
        source = filter.filterOut(source);

        logger.log("Выводим результат на экран");
        System.out.println("Отфильтрованный список: " + source);

        logger.log("Завершаем программу");

    }
}