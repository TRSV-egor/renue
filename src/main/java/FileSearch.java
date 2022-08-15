import java.io.*;
import java.net.URISyntaxException;


public class FileSearch  {
    public static void searcher(String request, int column) throws URISyntaxException {

        //Засекаем время
        long start = System.currentTimeMillis();

        //инициализируем
        BufferedReader reader;

        //Считаем найденые строки
        int lines = 0;

        try {
            reader = new BufferedReader(new FileReader(getFile.getPath2Jar()));

            //Инициализируем для получения строки
            String file;

            while ((file = reader.readLine()) != null) {

                //Убираем кавычки и разделяем по запятой
                String[] columns = file.replaceAll("\"", "").split(",");

                //Выводим результат поиска
                if (columns.length >= column) {
                    if (columns[column].toLowerCase().indexOf(request.toLowerCase()) == 0 ){
                        lines++;
                        System.out.println( columns[column] + "[" + file + "]");
                    }

                } else {
                    System.out.println("Выбранный столбец выходит за рамки таблицы!");
                    break;
                }

            }
            //Итоги
            System.out.println(
                    "Количество найденых строк: " + lines + ", затрачено время на поиск: " +
                            ((int) (System.currentTimeMillis() - start)) + " мс"
            );
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден! " + getFile.getPath2Jar());
        } catch (IOException e) {
            System.out.println("Ошибка доступа к файлу!");
        } catch (URISyntaxException e) {
            throw new RuntimeException(e);
        }



    }}
