import java.util.*;

public class Membre {

    // Attributs
    protected int id;
    protected String nom;
    protected int age;

    //Constructeur
    public Membre(int id, String nom, int age){
        this.id = id;
        this.nom = nom;
        this.age = age;
    }

    //Getters
    public int getId(){return id;}
    public String getNom(){return nom;}
    public int getAge(){return age;}

    //Setters
    public void setId(int id){this.id = id;}
    public void setNom(String nom){this.nom = nom;}
    public void setAge(int age){this.age = age;}

    //Methodes
    void presenteToi(){
         System.out.println("Je suis " + nom + ", j'ai " + age + " ans et mon ID est " + id);
    }
    @Override
    public String toString(){
        return nom + " (" + age + " ans, ID:" + id + ")";
    }

}
