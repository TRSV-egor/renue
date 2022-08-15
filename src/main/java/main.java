import java.io.FileNotFoundException;
import java.util.Scanner;

public class main {
    public static void main(String[] args) throws FileNotFoundException {

        int column = Integer.valueOf(args[0]);
        column --;

        while (true) {

            Scanner scanner = new Scanner(System.in);
            System.out.print("Введите строку: ");
            String request = scanner.nextLine();

            if (request.equals("!quit")) {

            } else if (request.length() != 0) {
                FileSearch.searcher(request,column);
                continue;
            } else {
                continue;
            }
            break;
        }
    }
}
