import java.io.FileNotFoundException;
import java.util.Scanner;

public class main {
    public static void main(String[] args) throws FileNotFoundException {

        //Column - выбранный столбец
        int column = Integer.valueOf(args[0]);

        while (true) {

            Scanner scanner = new Scanner(System.in);
            System.out.println("Selected column is " + column);
            System.out.print("Enter request: ");
            String request = scanner.nextLine();
            //Request - что искать

            if (request.equals("!quit")) {

            } else if (request.length() != 0) {

                FileSearch.searcher(request,column);

                continue;
            } else {
                System.out.println("Введите запрос");
                continue;
            }
            break;
        }
    }
}
