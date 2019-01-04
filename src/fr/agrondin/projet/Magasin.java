package fr.agrondin.projet;

import java.util.ArrayList;
import java.util.List;

import fr.agrondin.object.Animal;

public class Magasin {

	private String monStock;
	List <Animal> stock = new ArrayList<Animal>();
	
	
	protected Magasin(String monStock, List<Animal> stock) {
		super();
		this.monStock = monStock;
		this.stock = stock;
	}
	
	
	
}
