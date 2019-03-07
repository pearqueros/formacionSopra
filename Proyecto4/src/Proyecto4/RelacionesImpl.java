package Proyecto4;

public class RelacionesImpl implements Relaciones {

	private Integer a;

	/* Get y set */


	@Override
	public boolean equals(Object obj) {
		if (obj instanceof RelacionesImpl) {
			RelacionesImpl other = (RelacionesImpl) obj;
			return this == other;
		}
		return false;
	}

	public Integer getA() {
		return a;
	}

	public void setA(Integer a) {
		this.a = a;
	}

	public boolean esIgual(Object b) {
		return this.equals(b);
	}

	public boolean esMenor(Object b) {
		Integer res;
		if (b instanceof RelacionesImpl) {
			RelacionesImpl r = (RelacionesImpl) b;
			res= this.a.compareTo(((RelacionesImpl) b).a);
			if (res == -1) {
				return true;
			}
		}
		return false;
	}

	public boolean esMayor(Object b) {
		Integer res;
		if (b instanceof RelacionesImpl) {
			res = this.a.compareTo(((RelacionesImpl) b).a);
			if (res == 1) {
				return true;
			}
		}
		return false;
	}

}
