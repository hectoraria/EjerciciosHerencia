package ejercicio03;

public class Perecedero extends Productos {
	
	private int caduca;
	public Perecedero() {

	}

	public Perecedero(String nombre, double precio, int caduca) {
		super(nombre,precio);
		
		if(caduca>0) {
			this.caduca=caduca;
		}
		
	}

	

	public int getCaduca() {
		return caduca;
	}

	public void setCaduca(int caduca) {
		if(caduca>0) {
			this.caduca=caduca;
		}
	}

	@Override
	public String toString() {
		String cad = super.toString();
		
		return cad;
	}
	@Override
	public double calcular(int cantidad) {

		double precioCalculado = super.calcular(cantidad);
		
		if(caduca==1) {
			precioCalculado/=4;
		}
		if(caduca==2) {
			precioCalculado/=3;
		}
		if(caduca==3) {
			precioCalculado/=2;
		}
		

		return precioCalculado;

	}
}
