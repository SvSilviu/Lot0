package Loto;

import java.util.Scanner;

public class Joc {
    //todo: o metoda ce genereze 6 numere  radom intre 1 si 49
    //todo: un set-up de 6 numere predefinit intre 1 si 49
    //todo: o metoda unde daca s-au nimerit minim 3 numere sa afiseze un text , apoi la 4 numere s.a.m.d.


    //todo functie ce verifica daca un anumit numar exista in vector

    public static boolean verificareNumar(int[] arr, int numar) {
        int[] vec = new int[6];
        for (int i = 0; i < 6; i++) {
            if (numar == arr[i]) {

                return true;

            }

        }
        return false;

    }

    public static int[] generareNumere() {

        int[] nou = new int[6];
        int pozitie = 0;
        for (int i = 0; pozitie < 6; i++) {

            int numar = (int) Math.round(Math.random() * 49 + 1);//generam un numar random intre 1 si 49

            if (verificareNumar(nou, numar) == false) {//verific daca in  nou nu exista numarul generat iar daca nu exista il adaug si cresc pozitia

                nou[pozitie] = numar;

                pozitie++;

            }


        }

        return nou;

    }

    public static void afisare(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }


    //todo o functie ce citeste de la tastatura 6 numere disticnte intre 1 si 49

    public static void introducereNumere (){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti 6 numere :");
        Integer.parseInt(scanner.nextLine());
        System.out.println("Ati introdus numerele"+scanner.nextLine());


    }
}
