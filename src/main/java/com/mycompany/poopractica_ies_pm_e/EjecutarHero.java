/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.poopractica_ies_pm_e;

/**
 *
 * @author luis
 */
public class EjecutarHero {

    /**
     * @param args the command line arguments
     */
    // TODO code application logic here
    public static void main(String[] args) {

        /**
         * heroes que vamos a jugar puedes declarar mas
         */
        Heroe luis = new Heroe();
        Heroe vinicius = new Heroe("Vinicus Lord");

        /**
         * Variables que se van a usar mientras jugamos
         */
        int vidaGeneralVinicus;
        int ataqueDanio;

        System.out.println(vinicius.getHealth()); //Muestrame tu salud de Vinicius
        vinicius.drinkPotion();//Se tiene que aumentar en 10
        System.out.println(vinicius.getHealth()); //Muestrame tu salud de Vinicius cuando ha bebido la poscion
        System.out.println("El heroe" + vinicius.getName() + " se ha enfrentando a un elfo");
        vidaGeneralVinicus = vinicius.rest();
        System.out.println("El heroe" + vinicius.getName() + " se ha enfrentando a un elfo y este le ha quitado vida " + vidaGeneralVinicus);
        //llamar al tostring
        System.out.println(vinicius);
        System.out.println("Vida del pheroe Luis " + luis.getHealth());
        System.out.println("Vinicius se encuentra en el camino a otro heroes y se enfrenta a él");
        ataqueDanio = vinicius.attack(luis);
        luis.setHealth(luis.getHealth() - ataqueDanio);
        System.out.println("Vida del pheroe Luis despues haber sido atacado por vinicius " + luis.getHealth());
    }
}
