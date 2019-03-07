package interfaces;

public class OrdenaObjetos implements Relaciones {

	private int obj;
	
	
	public int getObj() {
		return obj;
	}

	public void setObj(int obj) {
		this.obj = obj;
	}

	@Override
	public boolean esMayor(Object b) {
		// TODO Auto-generated method stub
		boolean esMayor = false;
		if (b instanceof Integer) 
		{
			if(obj>(int)b)
			{
				esMayor = true;
			}
		}
		
		return esMayor;
	}

	@Override
	public boolean esMenor(Object b) {
		// TODO Auto-generated method stub
		boolean esMenor = false;
		if (b instanceof Integer) 
		{
			if(obj<(int)b)
			{
				esMenor = true;
			}
		}
		return esMenor;
	}

	@Override
	public boolean esIgual(Object b) {
		// TODO Auto-generated method stub
		boolean esIgual = false;
		if (b instanceof OrdenaObjetos) 
		{
			OrdenaObjetos s =(OrdenaObjetos)b;
			if(this.obj==(s.obj))
			{
				esIgual =true;
			}
		}
		return esIgual;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + obj;
		return result;
	}
}
