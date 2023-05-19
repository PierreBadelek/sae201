package sae.model;

public class ElementCase {
    protected Case lacase;
    public ElementCase(Case c) {
        this.lacase = c;
    }

    public Case getLacase(){
        return this.lacase;
    }

    public void changeCase(Case newCase){
        this.lacase = newCase;
    }



}