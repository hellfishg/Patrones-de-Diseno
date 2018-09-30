public class Main{

   public static void main(String[] args) {

      Fabrica fabrica= new Fabrica();
      BDD coneccion = fabrica.devolverConeccion("MySQL");
      System.out.println(coneccion.nombreID);
   }
}
