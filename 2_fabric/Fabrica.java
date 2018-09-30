public class Fabrica {
   BDD coneccion;
   public Fabrica(){
   }

   public BDD devolverConeccion(String tipo){
      if(tipo.equals("MySQL")){
         coneccion=new MySQL();
      }else if(tipo.equals("SQLServer")){
         coneccion=new SQLServer();
      }else{
         coneccion=null;
         System.out.println("Fallo");
      }
      return coneccion;
   }
}
