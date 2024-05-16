package org.lessons.java.abstractAnimals;

class Cane extends Animale implements INuotante  {  //la sottoclasse cane estende la superclasse (animale) astratta e implementa l interfaccia i nuotante 
	

	public String getTipo() {
        return "Cane";     //metodo animale superclasse
	}
    public void verso() {
        System.out.println("Bau");  //metodo animale superclasse
    }

    public void mangia() {
        System.out.println("Mangio carne"); //metodo animale superclasse
    }
    public void nuota() {
        System.out.println("Sto nuotando!!!");  // metodo richiama interfaccia 
    }
}
