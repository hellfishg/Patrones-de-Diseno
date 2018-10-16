public class main{
	public static void main(String[] args){
		
		cuadrado cuadri = new cuadrado();
		
		cuadri.setNombre("Triangulo");
		cuadri.setCords(23,35);
		
		figura copia = cuadri.clone();
		
		//Rectifico el nombre:
		cuadri.setNombre("Cuadrado");
		
		cuadri.getNombre();
		copia.getNombre();
	
	}
}
