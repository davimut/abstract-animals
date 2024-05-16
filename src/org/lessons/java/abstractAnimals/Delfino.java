package org.lessons.java.abstractAnimals;

class Delfino extends Animale implements INuotante{
	
	public String getTipo() {
        return "Delfino";
	}

    public void verso() {
        System.out.println("CrrCrrCrr!");
    }

    public void mangia() {
        System.out.println("Mangio pesce");
    }
    public void nuota() {
        System.out.println("Sto nuotando!!!");
    }
}