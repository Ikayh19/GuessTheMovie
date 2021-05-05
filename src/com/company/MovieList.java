package com.company;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class MovieList {
    Random random = new Random();
    private ArrayList<String> movies = new ArrayList();
    //Constructor
    public MovieList(String pathname) {
        File file = new File(pathname);

        String line;
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                line = scanner.nextLine();
                movies.add(line);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File does not exist!");
        }
    }

    public String getRandomMovie(){
        int randomMovie = random.nextInt(movies.size());
        return movies.get(randomMovie);
    }
}