package org.lessons.java.abstractAnimals;

class Passerotto extends Animale implements IVolante {
	
	public String getTipo() {
		 return "Passerotto";
		 }
    public void verso() {
        System.out.println("Cip cip");
    }

    public void mangia() {
        System.out.println("Mangio semi");
    }
    public void vola() {
        System.out.println("Sto volando!!!");
    }
}