package _16_io_text_file.exercise.read_csv_file;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Country country = new Country();
        Scanner scanner = new Scanner(System.in);
        System.out.println("input file's link: ");
        String path = scanner.nextLine();
        ArrayList<Country> list = new ArrayList<>();
        try {
            File file = new File(path);
            if (!file.exists()) {
                throw new FileNotFoundException();
            }
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = " ";
            while ((line = bufferedReader.readLine()) != null) {
                String[] temp = new String[1];
                temp = line.split(",");
                country = new Country(Integer.parseInt(temp[0]), temp[1], temp[2]);
                list.add(country);
            }
            bufferedReader.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
        for (Country country1 : list) {
            System.out.println(country1.getInfoToCSV());
        }
    }
}