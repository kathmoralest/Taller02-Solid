package Postres;

import java.util.ArrayList;
import Adicionales.Aderezo;

/**
 *
 * @author Pedro Mendoza
 */

public class Pastel extends Postre {
	
	public Pastel(String sabor) {
		super.precioParcial = 15.55;
		super.sabor = sabor;
		super.aderezos = new ArrayList<>();
	}
	
	public String toString() {
		return "Pastel{" + "sabor=" + sabor + ", precioParcial=" + precioParcial + ", aderezos=" + aderezos + '}';
	}
	
}

