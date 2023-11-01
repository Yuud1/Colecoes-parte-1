package br.edu.uft.poo.colecoes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class App_main {

	public static void main(String[] args) {
		List<String> L1 = new ArrayList();
		
		L1.add("Lucas Yudi");
		L1.add("Mucas Moreira");
		L1.add("Lucas Sheilla");
		L1.add("Ykaro Silva");
		L1.add("Ikaro Laura");
		L1.add("Ana Ykaro");
		L1.add("Sheilla Arruda");
		
		Collections.sort(L1);
		System.out.println(L1);
		
	}

}
