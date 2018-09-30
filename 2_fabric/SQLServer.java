public class SQLServer extends BDD{
   public SQLServer(){
      super.nombreID="SQLServer";
  }
  @Override
  public void conectar (String tipo){
     System.out.println("Conecto a la BDD "+super.nombreID);
  }
  @Override
  public void desconectar(){
    System.out.println("Desconneccion a la BDD "+super.nombreID);
  }
}
