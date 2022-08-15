import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Scanner;


public class main {
    public static void main(String[] args) throws NumberFormatException, URISyntaxException {

        while (true) {

            //Проверяем полученые аргументы
            try {
                if (args.length == 0){
                    System.out.println("Не задан столбец!");
                    break;
                } else if (Integer.valueOf(args[0]) < 0){
                    System.out.println("Столбец не может быть меньше 1!");
                    break;
                }
            } catch (NumberFormatException ex) {
                System.out.println("Столбец должен быть указан цифрой!");
                break;
            }

            //Получаем нужную колонку таблицы
            int column = Integer.valueOf(args[0]);
            column --;

            //Ввод
            Scanner scanner = new Scanner(System.in);
            System.out.print("Введите строку: ");
            String request = scanner.nextLine();

            if (request.equals("!quit")) {

            } else if (request.length() != 0) {
                FileSearch.searcher(request, column);
                continue;
            } else {
                continue;
            }
            break;
        }
    }
}
