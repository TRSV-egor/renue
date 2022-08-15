import java.net.URISyntaxException;

public class getFile {

    public static String getPath2Jar() throws URISyntaxException {


        //Получаем путь откуда запускается jar
        String path2jar = main.class
                .getProtectionDomain()
                .getCodeSource()
                .getLocation()
                .toURI()
                .getPath();

        //Проверяем есть ли название файла jar в пути и удаляем при наличии
        if (path2jar.lastIndexOf(".jar") >= 0) {
            path2jar = path2jar.substring(0, path2jar.lastIndexOf("/"));
        }

        //Добавляем название файла БД
        String path2file = path2jar + "/airports.dat";

        return path2file;
    }

}


