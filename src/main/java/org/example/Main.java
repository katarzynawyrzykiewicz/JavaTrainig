package org.example;
//import jdk.jshell.SourceCodeAnalysis;
import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
///tworzenie obiektów kalsy Aktor
// zrób 2 obiekty Angeline Joli i Brad Pitt
        //Actor angelinaJoli2 = new Actor();
       Actor jimCarey = new Actor();

        Actor angelinaJoli2 = new Actor("Angelina", "Joli", 3, false);
        Actor bradPitt = new Actor("Brad", "Pitt", 5, true);
        int salaryAngelina;

        salaryAngelina=angelinaJoli2.calulateSalary(5, 1000);
        System.out.println(salaryAngelina);

        int salaryBrad;
        salaryBrad=bradPitt.calulateSalary(7, 10000);
        System.out.println("Brad" + salaryBrad + "zł");


        int salaryJim;
        salaryBrad=jimCarey.calulateSalary (8, 30000);
        System.out.println("Jim" + salaryBrad + "zł");

        List <Actor> actors = new ArrayList<>();
        actors.add(angelinaJoli2);
        actors.add(bradPitt);
        actors.add(jimCarey);
        for (Actor actor : actors)
        {
            System.out.println(actor.calulateSalary(5, 1000));
        }

//        System.out.println(bradPitt.getRating());
//        jimCarrey.setRating(18);
//        System.out.println("Rating Brada Pita to:" + bradPitt.getRating());
//        System.out.println("Rating Angeliny to :" + angelinaJoli.getRating());
//        System.out.println("Rating Jima to:" + jimCarrey.getRating());
//        System.out.println("Oskar Jima to:" + jimCarrey.isOskarPrized());
//        System.out.println("Nazwisko Jim to:" + jimCarrey.getLastName());
//        int age = 33;
//        String imie = "Darek";
//        String aktorka = "Angelina";
//        System.out.println(imie + "" + aktorka + "to dobrzy znajomi!");
//        System.out.println(aktorka + "ms" + age + "lata");
//        System.out.println(age + age);
//        Movie esyRider = new Movie("Esy Rider", 1989, 5);
//        Movie titanic = new Movie("Titanic", 1999, 8);
//        Movie harryPotter = new Movie("Harry Potter", 2005, 3);
//        if (titanic.getRating() >= harryPotter.getRating()) {
//            System.out.println("titanick jest popularniejszy");
//        } else {
//            System.out.println("Harry Potter jest popularnielszy");
//        }
//        //Potrzebuje 2 tablic
//        int ratings[]= new int[3];
//        String movies[] = new String[3];
//        movies [0]="Diuna";
//        movies [1]="Psy";
//        movies [2]="Bill";
//// Ocenianie filmów
//        System.out.println("tprosze ocenić fimy");
//        System.out.println("ocen 1 film" + movies[0]);
//
//
//
//        Scanner scaner = new Scanner(System.in);
//        System.out.println("ocen 1 film" + movies[0]);
//        ratings[0]= scaner.nextInt();
//        System.out.println("ocen 1 film" + movies[1]);
//        ratings[1]= scaner.nextInt();
//        System.out.println("ocen 1 film" + movies[2]);
//        ratings[2]= scaner.nextInt();
//
//        /// Podsumowanie
//        System.out.println("Podsumowanie rankingu:");
//        System.out.println("Film" + movies[0] + "oceniłeś na:" + ratings[0]);
//        System.out.println("Film" + movies[1] + "oceniłeś na:" + ratings[1]);
//        System.out.println("Film" + movies[2] + "oceniłeś na:" + ratings[2]);
//    }
//}
// 2 listy
//        List<Integer> ratings = new ArrayList<>();
//        List<String> movies = new ArrayList<>();
//        movies.add("Diuna");
//        movies.add("Pulp Fiction");
//        movies.add("Kill Bill");
//        //Ocenianie filmów
//        System.out.println("Proszę ocenić filmy:");
//        Scanner scaner = new Scanner(System.in);
//        System.out.println("Jak oceniasz pierwszy film: " + movies.get(0));
//        ratings.add(scaner.nextInt());
//        System.out.println("Jak oceniasz drugi film: " + movies.get(1));
//        ratings.add(scaner.nextInt());
//        System.out.println("Jak oceniasz trzeci film: " + movies.get(2));
//        ratings.add(scaner.nextInt());
////Podsumowanie System.out.println("Podsumowanie Twojego rankingu: ");
//        System.out.println("Film: " + movies.get(0) + " oceniłeś na: " + ratings.get(0));
//        System.out.println("Film: " + movies.get(1) + " oceniłeś na: " + ratings.get(1));
//        System.out.println("Film: " + movies.get(2) + " oceniłeś na: " + ratings.get(2));
//    }}

//
        // petla for

//        System.out.println("Proszę podać od jakiej liczby odliczamy");
//        int sekundy;
//        Scanner scaner = new Scanner(System.in);
//        sekundy = scaner.nextInt();
//        for (int i = sekundy; i >= 0; i--) {
//            System.out.println("Bomba wybuchnie za: " + i);
//            try {
//                Thread.sleep(1000);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//        }
//        System.out.println("Bum!");
//    }}
// przykład for each

//        List<String> movies = new ArrayList<>();
//        movies.add("Diuna");
//        movies.add("Pulp Fiction");
//        movies.add("Kill Bill");
//        System.out.println("Rozmiar listy filmów!" + movies.size());
//        // Wypisanie  wszytkich filmów z lity
//        for (String movie : movies) {
//            System.out.println("Filmy na liście" + movie);
//        }
    }
}




