package org.lessons.java.abstractAnimals;

class Aquila extends Animale implements IVolante {
	
	public String getTipo() {
        return "Aquila";
	}
    public void verso() {
        System.out.println("Screee!");
    }   
    public void mangia() {
        System.out.println("Mangio carne");
    }
    public void vola() {
        System.out.println("Sto volando!!!");
    }
}