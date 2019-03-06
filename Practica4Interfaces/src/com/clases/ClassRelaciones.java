package com.clases;

import com.interfaces.Relaciones;

public class ClassRelaciones implements Relaciones {

	private Integer numero;

	public ClassRelaciones() {
	}

	public ClassRelaciones(Integer numero) {
		this.numero = numero;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	@Override
	public boolean esMayor(Object b) {
		if (b instanceof ClassRelaciones) {
			return getNumero().compareTo(((ClassRelaciones) b).getNumero()) == 1;
		}
		return false;
	}

	@Override
	public boolean esMenor(Object b) {
		if (b instanceof ClassRelaciones) {
			return getNumero().compareTo(((ClassRelaciones) b).getNumero()) == -1;
		}
		return false;
	}

	@Override
	public boolean esIgual(Object b) {
		return this.equals(b);
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof ClassRelaciones) {
			ClassRelaciones objeto = (ClassRelaciones) obj;
			return this == objeto;
		}
		return false;
	}

}
