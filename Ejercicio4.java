import java.util.Scanner; //se importo el java.util.Scanner


public class Ejercicio4 {
	public static void main(String[] args) {//se creo el main


    Scanner s = new Scanner(System.in);//se agrego el System.in
    String j1 = s.nextLine();
    String j2 = s.nextLine();
    
    System.out.print("Turno del jugador 1 (introduzca piedra, papel o tijeras): ");
    
    
    System.out.print("Turno del jugador 2 (introduzca piedra, papel o tijeras): ");
   
   
    if (j1.equals(j2)) {
        System.out.println("Empate");
    } else {
      int g = 2;
      
      switch(j1) {
        case "piedra":
        if (j2.equals("tijeras")) {//se cambio el == por equals
            g = 1;
          }
        break;//se agrego el break

        case "papel":
          if (j2.equals("piedra")) {//se cambio el == por equals
            g = 1;}
          
        case "tijeras"://se agrego la s
          if (j2.equals("papel")) {//se cambio el == por equals
            g = 1;
          }
          break;
        default:
      }
          System.out.println("Gana el jugador " + g);
    }
    
      s.close();
    } 
}
