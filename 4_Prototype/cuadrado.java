public class cuadrado implements figura{
	private String nombre;
	private int X;
	private int Y;

	public cuadrado(){}
	@Override
	public void setNombre(String nombre){
		this.nombre = nombre;
	}
	
	@Override
	public void setCords(int x,int y){
		this.X = x;
		this.Y = y;
	}

	@Override
	public void getNombre(){
		System.out.println(this.nombre);
	}

	@Override
	public void getCords(){
		System.out.println(this.X + this.Y);
	}

	@Override
	public figura clone(){
		figura copia = new cuadrado();
		copia.setNombre(this.nombre);
		copia.setCords(this.X,this.Y);
		return copia;
	}
}
