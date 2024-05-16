package org.lessons.java.abstractAnimals;

abstract class Animale { // superclasse astratta con metodi base degli animali
	    public void dormi() {
	        System.out.println("Zzz");
	    }

	    public abstract void verso();
	    public abstract void mangia();
	    public abstract String getTipo();
}
