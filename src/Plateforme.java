import java.io.Serializable;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;

public class Plateforme implements Serializable {
    String nom;
    HashMap<String, Mois> dicoMois;

    public Plateforme(String nom){
        this.nom = nom;
        dicoMois = new HashMap<String, Mois>();
    }

    public void ajouteMois(){
        Mois tmpMois = new Mois(verifMois());

        if(dicoMois.get(tmpMois.getNom())  == null){
            dicoMois.put(tmpMois.getNom(), tmpMois);
        }else{
            System.out.println("Ce mois existe déja sur cette platforme");
        }
    }

    public void affichePlateforme(){
        System.out.println("Plateforme : " + nom);
        if(dicoMois.size() != 0){
            Collection<Mois> colDico = dicoMois.values();
            for(Mois mois : colDico){
                mois.afficherMois();
            }
        }
    }

    private String verifMois(){
        String tmp = "";
        boolean valide = false;

        do {
            System.out.println("Quel et le mois :");
            tmp = Sc.next();

            switch (tmp.toLowerCase()){
                case "janvier":
                    tmp = "Janvier";
                    valide = true;
                    break;
                case "fevrier":
                    tmp = "Fevrier";
                    valide = true;
                    break;
                case "mars":
                    tmp = "Mars";
                    valide = true;
                    break;
                case "avril":
                    tmp = "Avril";
                    valide = true;
                    break;
                case "mai":
                    tmp = "Mai";
                    valide = true;
                    break;
                case "juin":
                    tmp = "Juin";
                    valide = true;
                    break;
                case "juillet":
                    tmp = "Juillet";
                    valide = true;
                    break;
                case "aout":
                    tmp = "Aout";
                    valide = true;
                    break;
                case "septembre":
                    tmp = "Septembre";
                    valide = true;
                    break;
                case "octobre":
                    tmp = "Octobre";
                    valide = true;
                    break;
                case "novembre":
                    tmp = "Novembre";
                    valide = true;
                    break;
                case "decembre":
                    tmp = "Decembre";
                    valide = true;
                    break;
            }
        }while(!valide);
        return tmp;
    }
}
