package sae.model;


public class Case {
    private boolean sortie;

    private int posX;

    private ElementCase element;

    private int posY;

    public Case(int x, int y) {
        this.posX = x;
        this.posY = y;
        this.sortie = false;

    }

    public void ajouterElementCase(ElementCase elementCase){
        this.element = elementCase;
    }

    public ElementCase getElement(){
        return this.element;
    }
    public int getPosX() {
        return this.posX;
    }

    public int getPosY() {
        return this.posY;
    }

    public void getVoisinNord(int vision) {
        // TODO implement here
    }

    public void getVoisinSud(int vision) {
        // TODO implement here
    }

    public void getVoisinEst(int vision) {
        // TODO implement here
    }

    public void getVoisinOuest(int vision) {
        // TODO implement here
    }


}