package com.company;
import java.util.*;

public class Main{
    private static Scanner sc;

    //1)
    //Scrieti un program care sa afiseze toate numerele pare din intervalul [0, n],
    //unde n este un numar citit de la tastatura.
    public static void evenNumbers(Scanner sc)
    {
        int i;
        int n = sc.nextInt();

        for(i = 0; i <= n; i = i + 2)
        {
            System.out.print(i + "\t");
        }
    }

    ////////////////////////////////////////////////////////////////////////////////

    //2)
    // Scrieti un program care sa compare doua numere a si b citite de la tastatura
    //si sa afiseze numarul mai mare
    public static void compare(Scanner sc) {
        int a = sc.nextInt();
        int b = sc.nextInt();

        if (a > b)
        {
            System.out.print(a);
        }
        else
        {
            System.out.print(b);
        }
    }

    ////////////////////////////////////////////////////////////////////////////////

    //3)
    // Scrieti o metoda care sa calculeze factorialul unui numar n citit de la tastatura
    public static void factorial(Scanner sc) {
        int i;
        int n = sc.nextInt();
        long fact = 1;
        for(i = 2; i <= n; i = i + 1)
        {
            fact = fact * (long)i;
        }
        System.out.print(fact);
    }

    ///////////////////////////////////////////////////////////////////////////////////////////////////

    //4)
    // Fiind dat un numar n, scrieti o metoda care insumeaza toti multiplii de 3 si 5 pana la n(inclusiv).
    public static void suma35(Scanner sc) {
        int i;
        int n = sc.nextInt();
        long sum = 0;
        for(i = 1; i <= n; i = i + 1)
            if(i%3 == 0 || i%5 ==0)
            {
                sum = sum + (long)i;
            }
        System.out.print(sum);
    }

    /////////////////////////////////////////////////////////////////////////////////////////////////////

    //5)
    // Cititi de la tastatura n numere. Elementele citite vor fi organizate in doi vectori diferiti,
    //in functie de paritate
    public static void organizareParitate(Scanner sc)
    {
        int i;
        int n = sc.nextInt();
        int[] x = new int[100];
        int[] y = new int[100];
        int ctx = 0, cty = 0;
        for(i = 0; i < n; i = i + 1)
        {
            int nr = sc.nextInt();
            if (nr % 2 == 0) {
                x[ctx] = nr;
                ctx++;
            } else {
                y[cty] = nr;
                cty++;
            }
        }
        for (i=0; i<ctx; i++)
        {
            System.out.print(x[i]+"\t");
        }
        System.out.print("\n");
        for (i=0; i<cty; i++)
        {
            System.out.print(y[i]+"\t");
        }
    }

    //6)
    // Cititi de la tastatura n note, numere intregi, intr-un vector.
    // Cand cititi valoarea -1 de la tastatura citirea notelor se opreste si programul afiseaza media acestora.
    public static void media(Scanner sc)
    {
        int i;
        int n = sc.nextInt();
        int[] arr = new int[n];
        int x = sc.nextInt();
        int ct = 0;
        int sum = 0;
        while(x != -1)
        {
            arr[ct] = x;
            sum  = sum + arr[ct];
            ct++;
            x = sc.nextInt();
        }
        float avg = (float) sum / ct;
        if(ct!=0)
            System.out.print(avg);
        else
            System.out.print(0);
    }



    public static void main(String[] args) {
        sc = new Scanner(System.in);
        media(sc);
    }
}
