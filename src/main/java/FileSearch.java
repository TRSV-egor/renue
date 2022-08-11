import java.io.*;
import java.util.Scanner;

public class FileSearch  {
    public static void searcher(String request, int column) throws FileNotFoundException {

        File file = new File("src/main/resources/airports.dat");

        Scanner scanner = new Scanner(file);

        long strt = System.currentTimeMillis();
        int lines = 0;

        //ВЫбрать лучший способ поиска
        while (scanner.hasNextLine()){
            String line = scanner.nextLine();
            String[] columns = line.split(",");



            //Исправить как он ищет
            if (columns[column].contains(request)){
                lines++;
                System.out.println( columns[column] + "[" + line + "]");

            }

        }

        long fnsh = System.currentTimeMillis();
        long result = fnsh - strt;
        System.out.println("Затрачено " + ((int) result) + " мс");
        System.out.println("НАйдено строк" + lines);

        scanner.close();


}}
