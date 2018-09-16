public final class Singleton{
	//Se crea la instancia del objeto unico cuando se instancie la clase:
	private static final Singleton singleton = new Singleton();

	//Creamos un constructor de tipo privado para que no pueda ser llamado desde otra clase:
	private Singleton(){
		System.out.println("Hola miguel");
	}

	//Creamos una metodo publico que regrese el unico objeto instanciado:
	public static Singleton obtenerSingleton(){
		return singleton;
	}
}
