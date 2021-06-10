package Postres;

import java.util.ArrayList;
import Adicionales.Aderezo;

/**
 *
 * @author Pedro Mendoza
 */

public class Helado extends Postre {
	
	public Helado(String sabor) {
		super.precioParcial = 7.85;
		super.sabor = sabor;
		super.aderezos= new ArrayList<>();
	}
	
	@Override
	public String toString() {
		return "Helado{" + "sabor=" + sabor + ", precioParcial=" + precioParcial + ", aderezos=" + aderezos + '}';
	}
}

