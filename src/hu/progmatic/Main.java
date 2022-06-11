package hu.progmatic;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        List<FociVB> List = new ArrayList<>();

        File file = new File("src/Filek/matches_all.csv");

        try{
            Scanner scanner = new Scanner(file);
            while(scanner.hasNextLine()){
                String line = scanner.nextLine();
                FociVB fociVB = new FociVB(line);
                List.add(fociVB);
            }
            scanner.close();
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }
        System.out.println("FociVB száma: " + List.size());





        List<WorldCups> worldCupsList = new ArrayList<>();
        try(BufferedReader reader = new BufferedReader(new FileReader("src/hu/progmatic/WorldCups.java"))){
            String sor;

            reader.readLine();

            while((sor= reader.readLine()) != null){
                WorldCups worldCups = new WorldCups(sor);
                worldCupsList.add(worldCups);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("WorldCup száma: " + worldCupsList.size());

    }
}
