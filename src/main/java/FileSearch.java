import java.io.*;

public class FileSearch  {
    public static void searcher(String request, int column) throws FileNotFoundException {
        column--;
        long strt = System.currentTimeMillis();

//-------------------------------------------------------------------------------------------------
    //TreeSet hassh
        BufferedReader reader;

        int lines = 0;
        try {
            reader = new BufferedReader(new FileReader("src\\airports.dat"));
            String file;
            while ((file = reader.readLine()) != null) {
                String[] columns = file.split(",");

                if (columns[column].indexOf(request) == 1){
                lines++;
                System.out.println( columns[column] + "[" + file + "]");

            }


//                Collections.sort(rows);
//                int i = Collections.binarySearch(rows, request);
//                System.out.println(i);
//                System.out.println(rows.get(i));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


        //-------------------------------------------------------------------------------------------------

//        BufferedReader reader;
//
//        int lines = 0;
//        try {
//            reader = new BufferedReader(new FileReader("src\\main\\resources\\airports.dat"));
//            String file;
//            while ((file = reader.readLine()) != null) {
//                String[] columns = file.split(",");
//
//                if (columns[column].indexOf(request) == 1){
//                lines++;
//                System.out.println( columns[column] + "[" + file + "]");
//
//            }
//
//
////                Collections.sort(rows);
////                int i = Collections.binarySearch(rows, request);
////                System.out.println(i);
////                System.out.println(rows.get(i));
//            }
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }


        //-------------------------------------------------------------------------------------------------


//        File file = new File("src/main/resources/airports.dat");
//
//        Scanner scanner = new Scanner(file);
//
//        int lines = 0;
//
//        //ВЫбрать лучший способ поиска
//        while (scanner.hasNextLine()){
//            String line = scanner.nextLine();
//            String[] columns = line.split(",");
//
//            //Исправить как он ищет
//            if (columns[column].indexOf(request) == 1){
//                lines++;
//                System.out.println( columns[column] + "[" + line + "]");
//
//            }
//
//        }
//
//        scanner.close();

        //--------------------------------------------------------------------------------------------

        System.out.println(
                "Количество найденых строк: " + lines + ", затрачено время на поиск: " +
                        ((int) (System.currentTimeMillis() - strt)) + " мс"
        );
}}
