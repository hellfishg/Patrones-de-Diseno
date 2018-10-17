import java.io.*;
import java.net.*;

public class Proxy implements Runnable{
	private Thread thread;
	Socket socket;
	InputStream in;
	PrintWriter salida;
	int character;

	public Proxy(){
		try{
			socket = new Socket("10.0.0.10", 45454);
			System.out.println("Conectando....");
			in = socket.getInputStream();
			salida = new PrintWriter(socket.getOutputStream(),true);
			thread = new Thread(this);
			thread.start();
		
		}catch(IOException ioe){
			System.err.println("Error al conectarse: "+ioe.getMessage());
		}catch(Exception e){
			System.err.println("Error general: "+e.getMessage());
		}

		if(socket != null && socket.isConnected()){
			System.out.println("Conectado!!!");
		}
	}
	
	@Override
	public void run(){
		try{
			while((character = in.read()) != -1){
				System.out.println((char) character);
			}
		}catch(Exception ex){
			System.out.println(ex.getMessage());
		}
	}
	//crean metodos de comunicacion:
	public void saludar(){
		salida.println("saludar");
	}
	public void decirEstado(){
		salida.println("decirEstado");
	}
	public void despedirse(){
		salida.println("despedirse");
	}
}	














