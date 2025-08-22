//juego piedra, papel o tijeras, se juega entre dos jugadores. cada uno debe ingresas su opcion, se comparan las dos opciones
//empate si ambos eligen lo mismo
//gana el jugador segun las reglas del juego normal piedra le gana a tijeras, tijeras a papel y papel a piedra.

import java.util.Scanner; //se importo el java.util.Scanner


public class Ejercicio4 {
	public static void main(String[] args) {//se creo el main


    Scanner s = new Scanner(System.in);//se agrego el System.in
   
   
    
    System.out.print("Turno del jugador 1 (introduzca piedra, papel o tijeras): ");
     String j1 = s.nextLine();
    
    System.out.print("Turno del jugador 2 (introduzca piedra, papel o tijeras): ");
    String j2 = s.nextLine();
   
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
            break; //se agrego el break
          
        case "tijeras"://se agrego la s
          if (j2.equals("papel")) {//se cambio el == por equals
            g = 1;
          }
          break;
        default:
          //
          System.out.println("Entrada no valída.");
          s.close();
          return;
      }
          System.out.println("Gana el jugador " + g);
    }
    
      s.close();
    } 
}
