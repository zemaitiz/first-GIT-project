/*
package main.sdacademy.SandBox.skaitliukai;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MeterMain {

    public static void main(String[] args) {

        boolean finished = false;
        List<Meter> meterList = new ArrayList<>();


        while (!finished) {
            //pasisveikinam
            System.out.println("Sveiki! Kurio skaitiklio parodymus norite įvesti?");
            System.out.println("VK : VS : TK : TS : ED : EN");
            //inicializuojam objekta
            Scanner input = new Scanner(System.in);
            String label = input.nextLine().toLowerCase();


            System.out.println("Dabar įveskite rodmenis");
            float value = input.nextFloat();

            switch (label) {
                case "vk":
                    meterList.add(new Meter(Meter.Label.VIRTUVE_KARSTAS, value));
                    break;
                case "vs":
                    meterList.add(new Meter(Meter.Label.VIRTUVE_SALTAS, value));
                    break;
                case "tk":
                    meterList.add(new Meter(Meter.Label.TUALETAS_KARSTAS, value));
                    break;
                case "ts":
                    meterList.add(new Meter(Meter.Label.TUALETAS_SALTAS, value));
                    break;
                case "ed":
                    meterList.add(new Meter(Meter.Label.ENERGIJA_DIENINIS, value));
                    break;
                case "en":
                    meterList.add(new Meter(Meter.Label.ENERGIJA_NAKTINIS, value));
                    break;
                default:
                    System.out.println("Neteisingai įvedėte skaitiklio tipą!");
                    break;
            }
            System.out.println("Ar norite tęsti?");
            String answer = input.nextLine();
            System.out.println("Taip : Ne");
            if (input.nextLine().equalsIgnoreCase("ne")) {
                finished = true;
            }
        }
        for (Meter m : meterList) {
            System.out.println(m.getLabel() + ": " + m.getValue());
        }
    }
}
*/
