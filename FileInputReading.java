package Java_programs;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.util.Scanner;

public class FileInputReading  {

    @SuppressWarnings("fallthrough")
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(Path.of("C:\\Users\\gathadi\\Downloads\\RCA.docx"),
                StandardCharsets.UTF_8);
        System.out.println(scanner);
    }
}
