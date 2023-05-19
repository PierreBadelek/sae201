package sae.model;

import java.util.ArrayList;


public class Labyrinthe {

    private int nbcolonne;
    private int nbligne;
    private ArrayList<Case> lesCases;

    public Labyrinthe(int nbl, int nbc) {
        this.nbcolonne = nbc;
        this.nbligne = nbl;
        genererLab();
    }

    public void genererLab() {
        System.out.println("création");
        System.out.println(this.nbcolonne);
        System.out.println(this.nbligne);
        this.lesCases = new ArrayList<>();
        for (int i = 0; i <= this.nbcolonne - 1; i++) {
            for (int j = 0; j <= this.nbligne - 1; j++) {

                this.lesCases.add(new Case(i, j));
            }
        }
        initCase();
    }

    public void initCase() {
        for (Case macase : this.lesCases) {

            if (macase.getPosX() == 0) {
                Rocher r = new Rocher(macase);
                macase.ajouterElementCase(r);
            } else if (macase.getPosX() == this.nbcolonne - 1) {
                Rocher r = new Rocher(macase);
                macase.ajouterElementCase(r);
            } else if (macase.getPosY() == 0) {
                Rocher r = new Rocher(macase);
                macase.ajouterElementCase(r);
            } else if (macase.getPosY() == this.nbligne - 1) {
                Rocher r = new Rocher(macase);
                macase.ajouterElementCase(r);
            } else {
                Herbe h = new Herbe(macase);
                macase.ajouterElementCase(h);
            }
        }

    }


    public void afficherLab() {
        System.out.println("ok");
        System.out.println(this.lesCases.size());
        for (Case macase : this.lesCases) {

            if (macase.getPosY() == nbligne-1) {

                System.out.println(macase.getElement().toString() +"\n ");
            } else {
                System.out.print(macase.getElement().toString() + "\t");
            }
        }
        /*
        for (int i = 0; i>= this.nbcolonne; i++){
            for (int j = 0; i>= this.nbligne; i++){

            }
        }*/
    }
}
