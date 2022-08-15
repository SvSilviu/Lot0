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

    public static int[] introducereNumere() {

        int[] nou = new int[6];
        int pozitie = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti 6 numere :");

        for (int i = 0; pozitie < 6; i++) {
            System.out.println("Introduceti un numar :(Mai aveti " + (6 - pozitie) + " numere de introdus)");
            int numar = Integer.parseInt(scanner.nextLine());

            if (numar <= 49 && numar >= 1 && verificareNumar(nou, numar) == false) {
                nou[pozitie] = numar;
                pozitie++;
            } else if (numar >= 49 || numar <= 1) {

                System.out.println("Numar incorect");
            } else {

                System.out.println("Nuamrul a mai fost introdus odata");
            }
        }

        return nou;
    }


    //todo functie ce primeste ca parametru 2 vectori si returneaza un vector cu elementele comune
    public static int[] returnareNumereComune(int[] a, int[] b) {
        int[] vec = new int[nrElementeComune(a, b)];
        int numarComun = 0;
        for (int i = 0; i < a.length; i++) {
            //verificam ca lementul din a este in b
            if (verificareNumar(b, a[i]) == true) {

                vec[numarComun] = a[i];

                numarComun++;
            }
        }
        return vec;
    }

    //todo  fucntie ce primeste ca parametru 2 vectori si returneaza numarul de elemente comune

    public static int nrElementeComune(int[] a, int[] b) {
        int contor = 0;
        for (int i = 0; i < a.length; i++) {
            if (verificareNumar(b, a[i])) {

                contor++;
            }
        }
        return contor;
    }

    public static void play(){

        int[]generare=generareNumere();
        int[]introduse=introducereNumere();
        int[]comune=returnareNumereComune(generare,introduse);
        int contor = 0;


        System.out.println("\nA-ti introdus");

        afisare(introduse);

        System.out.println("\nNumerele extrase sunt");

        afisare(generare);

        System.out.println("\nNumerele   ghicite sunt");

        afisare(comune);


        if(comune.length==3){
            System.out.println("Cu 3 numre castigati o plimbare cu capra");
        }else if(comune.length==4){
            System.out.println("Cu 4 numere a-ti castigat 10 lei");
        }else if (comune.length==5){
            System.out.println("Cu 5 numre schimbati loganul in BMW");
        }else if (comune.length==6){
            System.out.println("Nu mai muncim toata viata");
        }



    }
    public static void numereCastigatoare(int []a , int[]b){
        int contor = 0;
       int[] generate = generareNumere();
       int[] introduse = introducereNumere();

       if(generate==introduse){

       }
    }
}






