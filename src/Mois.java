import java.io.Serializable;
import java.util.Scanner;

public class Mois implements Serializable {
    private final String nom;
    private double depot;
    private double bonus;
    private double interet;
    private double perte;
    private double rendement;

    public Mois(String mois){
        nom = mois;

        depot = verifDepot();
        bonus = verifBonus();
        interet = verifInteret();
    }

    public void afficherMois(){
        System.out.println("Mois de " + nom);
        System.out.println("Dépot : " + depot);
        System.out.println("Bonus : " + bonus);
        System.out.println("Interet : " + interet);
    }

    private double verifDepot(){
        double tmp;
        do{
            System.out.println("Combien avez vous déposé :");
            tmp = Sc.nextDouble();
        }while(tmp < 0);
        return tmp;
    }

    private double verifBonus(){
        double tmp;
        do{
            System.out.println("Combien de bonus avez vous touché :");
            tmp = Sc.nextDouble();
        }while(tmp < 0);
        return tmp;
    }

    private double verifInteret(){
        double tmp;
        do{
            System.out.println("Combien d'interet avez vous touché :");
            tmp = Sc.nextDouble();
        }while(tmp < 0);
        return tmp;
    }

    public String getNom(){
        return nom;
    }
}
