package _16_io_text_file.exercise.copy_file;

import java.io.*;
import java.util.Scanner;

public class CopyFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("input link of file3");
        String path1 = scanner.nextLine();
        System.out.println("input link of filecopy");
        String path2 = scanner.nextLine();
        try {
            File file = new File(path1);
            if (!file.exists()) {
                throw new FileNotFoundException();
            }
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            String line = "";
            FileWriter fileWriter = new FileWriter(path2, true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            int count = 0;
            while ((line = bufferedReader.readLine()) != null) {
                bufferedWriter.write(line);
                bufferedWriter.newLine();
                for (int i = 0; i < line.length(); i++) {
                    count++;
                }
            }
            bufferedReader.close();
            bufferedWriter.close();
            System.out.println(count);
        } catch (Exception e) {
            System.out.println("file not founded");
        }

    }
}
