package lt.sdacademy.fundamentalscoding.practicalexcercises.windspeed;

import java.util.Scanner;
/*
1. Ivedamas vejo greitis km/h
2. Paverciamas vejo greitis is kmh i mazgus
3.Vejo greitis Beauforto skaleje Math.pow(greitis, laipsnis) Beuforto skales formule  = (vejo greitis / 3.01)^1.5
4. Jei vejo greitis didesnis nei 2km/h -> stiprus
5. Atspausdint rezultatus
---
6. Sukurti tris f-jas, kurios konvertuotu km/h i mazgus/boforta
* */

public class WindSpeedMain {
    public static final double NAUTIC_MILE = 1.852;
    public static final double BEAUFORT_CONSTANT = 3.01;

    public static void main(String[] args) {

        Scanner speedScanner = new Scanner(System.in);

        System.out.println("Iveskite vejo greiti km/h:");

        int windSpeed = speedScanner.nextInt();
        System.out.println("Ivedete " + windSpeed + " km/h");

        //double windSpeedNauticMile = windSpeed * NAUTIC_MILE;
        System.out.println("Ivestas vejo greitis lygus " + kilometersPerHourToKnot(windSpeed) + " mazgo");
        System.out.println("Vejo stiprumas pagal Boforto skale lygus " + kilometersPerHourToBeuafortScale(windSpeed));

        if (windSpeed >= 20) {
            System.out.println("Atsargiai, vejas stiprus!");
        } else {
            System.out.println("Ramiai, vejas nestiprus.");
        }


    }

    private static double kilometersPerHourToKnot(int windSpeed) {
        return windSpeed * NAUTIC_MILE;
    }

    private static int kilometersPerHourToBeuafortScale(int windSpeed) {
        return (int) Math.pow(windSpeed / BEAUFORT_CONSTANT, 1.5);

    }
}

