package com.sda.algorytmy;


import java.util.Scanner;

public class App
{
    public static void main( String[] args )
    {
        double wynik = 0.0;
        int iloscSkładników = 0;
        double suma = 0;
        int liczba;
        Scanner sc = new Scanner(System.in);

        System.out.println("Podaj ilość liczb do zsumowania");
        liczba = sc.nextInt();
        iloscSkładników = liczba;

        for (int i =0; i<iloscSkładników; i++){
            System.out.println("podaj "+(i+1)+" liczbę");
            liczba = sc.nextInt();
            suma = suma + liczba;

        }
            wynik = suma/iloscSkładników;

        System.out.println("średnia arytmetyczna podanych liczb wynosi "+ wynik);

    }
}
