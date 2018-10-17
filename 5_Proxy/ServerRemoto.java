import java.io.*;
import java.net.*;

public class ServerRemoto implements Runnable{
	private Thread thread;
	ServerSocket socket;
	PrintWriter salida;
	Socket comunicacionSocket;
	
	public ServerRemoto(){
		try{
			socket = new ServerSocket(45454);
			comunicacionSocket = socket.accept();
			salida = new PrintWriter(comunicacionSocket.getOutputStream(),true);
			thread = new Thread(this);
			thread.start();

		}catch(Exception e){
			System.out.println("Error:  " + e.getMessage());
		}
	}

	@Override
	public void run(){
		String textoEntrada;
		try{
			BufferedReader in = new BufferedReader(new InputStreamReader(comunicacionSocket.getInputStream()));
			while((textoEntrada = in.readLine()) != null){
				if(textoEntrada.equals("saludar")){
					saludar();
				}else if(textoEntrada.equals("decirEstado")){
					decirEstado();
				}else if(textoEntrada.equals("despedirse")){
					despedirse();
				}
			}

		}catch (Exception e){
			System.out.println("Error general" + e.getMessage());
		}
	}

	public void saludar(){
		salida.println("hola!!");
	}
	public void decirEstado(){
		salida.println("Estoy contento");
	}
	public void despedirse(){
		salida.println("Chao!!");
	}

	public static void main(String[] Args){
		ServerRemoto ser = new ServerRemoto();
	}
}


