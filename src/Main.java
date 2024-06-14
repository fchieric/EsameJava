import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean esci = false;
        Scanner sc = new Scanner(System.in);
        ArrayList<String> prop = new ArrayList<>();
        prop.add("Fare più attività fisica");
        prop.add("Esercitarsi sulla OOP");
        prop.add("Meditare");
        prop.add("Fare yoga");
        prop.add("Leggere almeno un capitolo");

        while(!esci) {
            System.out.println("\nEcco i tuoi propositi: \n");
            for (String proposito : prop) {
                System.out.println(prop.indexOf(proposito) + 1 + ". " + proposito);
            }
            System.out.print("\nScegli quale proposito hai conseguito (0 per uscire) ");
            String scelta = sc.nextLine();
            switch(scelta) {
                case "0":
                    System.out.println("Arrivederci!");
                    esci = true;
                    break ;
                case "1":
                case "2":
                case "3":
                case "4":
                case "5":
                    int i = Integer.parseInt(scelta) - 1;
                    if (i >= 0 && i < prop.size()) {
                        System.out.println("Hai conseguito il proposito: " + prop.get(i) + "Complimenti!");
                        prop.remove(i);
                    } else {
                        System.out.println("Indice del proposito non in lista.");
                    }
                    break;
                default:
                    System.out.println("Scelta non valida. Riprova.");
                    break;
            }
            if (!prop.isEmpty()) {
                System.out.println("Ti restano " +  prop.size() + " propositi da conseguire oggi.\n");
            } else {
                System.out.println("\nComplimenti! Tutti i propositi di oggi sono stati conquistati!.\n");
                esci = true;
            }
        }
        sc.close();
    }
}