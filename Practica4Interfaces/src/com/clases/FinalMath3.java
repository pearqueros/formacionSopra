package com.clases;

import com.interfaces.Extremos;

public class FinalMath3 implements Extremos {

	@Override
	public int min(int[] a) {
		int min = a[0];
		for (int d : a) {
			if (min > d) {
				min = d;
			}
		}
		return min;
	}

	@Override
	public int max(int[] a) {
		int max = a[0];
		for (int d : a) {
			if (d > max) {
				max = d;
			}
		}
		return max;
	}

	@Override
	public double min(double[] a) {
		double min = a[0];
		for (double d : a) {
			if (min > d) {
				min = d;
			}
		}
		return min;
	}

	@Override
	public double max(double[] a) {
		double max = a[0];
		for (double d : a) {
			if (d > max) {
				max = d;
			}
		}
		return max;
	}

}
