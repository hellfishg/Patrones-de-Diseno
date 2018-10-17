public class Cliente{
	Proxy proxy;
	
	public Cliente(){
		proxy = new Proxy();
		proxy.saludar();
		proxy.decirEstado();
		proxy.despedirse();
	}

	public static void main(String[] Args){
		Cliente cli = new Cliente();
	}
}
