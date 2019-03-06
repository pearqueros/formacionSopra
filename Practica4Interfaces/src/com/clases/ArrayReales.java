package com.clases;

import com.interfaces.Estadisticas;

public class ArrayReales implements Estadisticas {

	private double[] array;

	public ArrayReales() {
	}

	public ArrayReales(double[] array) {
		this.array = array;
	}

	public double[] getArray() {
		return array;
	}

	public void setArray(double[] array) {
		this.array = array;
	}

	@Override
	public double minimo() {
		double min = array[0];
		for (double d : array) {
			if (min > d) {
				min = d;
			}
		}
		return min;
	}

	@Override
	public double maximo() {
		double max = array[0];
		for (double d : array) {
			if (d > max) {
				max = d;
			}
		}
		return max;
	}

	@Override
	public double sumatorio() {
		double sum = 0.0;
		for (double d : array) {
			sum+=d;
		}
		return sum;
	}

}
