
import java.util.*;

public class Main{
    public static void main(String[] args){


        // Creation et ajout dans la liste de type ArrayList
        List<Membre> membres = new ArrayList<Membre>();
        membres.add(new Membre(1,"JULES", 21));
        membres.add(new Membre(2,"PAUL", 22));
        membres.add(new Membre(3,"PIERRE", 22));
        membres.add(new Membre(4,"ALICE", 23));
        membres.add(new Membre(5,"BOB", 14));
        membres.add(new Membre(6,"MARC", 12));
        membres.add(new Membre(7,"LUC", 22));
        membres.add(new Membre(8,"JEAN", 16));
        membres.add(new Membre(9,"DAVID", 18));
        membres.add(new Membre(10,"ETIENNE", 19));

        //Affichage avec for classique
        System.out.println("=== AFFICHAGE AVEC FOR CLASSIQUE===");
        for(int i=0; i<membres.size();i++){
            membres.get(i).presenteToi();
        }


        //Affichage avec for each
        System.out.println("\n=== AFFICHAGE AVEC FOR EACH ===");
        for(Membre m : membres){
            System.out.println(m);
        }



        //Creation et ajout dans la liste de type Vector
        List<Membre> vip = new Vector<Membre>();
        vip.add(new Membre(1,"KOFFI", 21));
        vip.add(new Membre(2,"KODJO", 22));
        vip.add(new Membre(3,"KOSSI", 22));

        System.out.println("\nTaille du vector = " + vip.size());
        vip.set(2, new Membre(3,"YAO", 22));

        System.out.println("\n=== AFFICHAGE DES MEMBRES VIP===");
        for(Membre v : vip) {
                System.out.println(v);
        }

        //Creation de l'Iterator
        Iterator<Membre> it = membres.iterator();
        while(it.hasNext()){
            Membre mb = it.next();
            if(mb.getAge() < 18){
                it.remove();
            }
        }


        System.out.println("\n=== AFFICHAGE APRES SUPPRESSION ===");
        for(Membre m : membres){
            System.out.println(m);
        }

        //Creation et ajout dans le HashMap
        HashMap<Integer, Membre> hsh = new HashMap<>();
        for(Membre m : membres){
            hsh.put(m.id, m);
        }

        System.out.println("\n=== AFFICHAGE APRES MAP ===");
        System.out.println(hsh.get(2));

    }
}