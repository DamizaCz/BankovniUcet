package cz.zacpalsps;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("přihlaste se do vašeho bankovního účtu");
        System.out.println("zadejte jméno účtu");
        String jmeno = sc.next();
        BankovniUcet bu01 = new BankovniUcet("121-125888/0100",jmeno,0);
        BankovniUcetZpoplatneny buz01 = new BankovniUcetZpoplatneny("121-125888/0100",jmeno,20);
            System.out.println("zadejte prosím částku kterou si přejete vlozit");
            double vlozCastku = sc.nextInt();
            bu01.vloz(vlozCastku);
            buz01.vloz(vlozCastku);
            buz01.vypisInfo();


        }
    }
