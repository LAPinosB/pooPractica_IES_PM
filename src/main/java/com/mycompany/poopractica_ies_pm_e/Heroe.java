/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poopractica_ies_pm_e;

/**
 *
 * @author luis
 */
public class Heroe {
    /**
     * name(String):Elnombredelhéroe.-
     * level (int):Elniveldelhéroe.-
     * health(int):Lacantidadactualdesaluddelhéroe.-
     * maxHealth(int):Lacantidadmáximadesaluddelhéroe.-
     * experience(int):Lacantidaddeexperienciaacumuladaporelhéroe.-
     * attack(int):Elvalordeataquedelhéroe.-
     * defense(int):Elvalordedefensadelhéroe
     */
    private String name;
    private int level;
    private int health;
    private int maxHealth;
    private int experience;
    private int attack;
    private int defense;

    //Constructor o constructores.
    //Constructor por defecto viene definidio con los parametros por defecto.
    public Heroe() {
        this.name = "user";
        this.level = 1;
        this.health = 150;
        this.maxHealth = 500;
        this.experience = 0;
        this.attack = 30;
        this.defense = 100;
    }

    //Sirve para constructor modificar el nombre
    public Heroe(String name) {
        this.name = name;
        this.level = 1;
        this.health = 170;
        this.maxHealth = 500;
        this.experience = 40;
        this.attack = 25;
        this.defense = 100;
    }

    //drinkPotion(), lesuma10puntosalasalud. Yo voy a devolver el mensaje de ha sumado 10
    public String drinkPotion() {
        health = this.health + 10;
        String mensaje = "ha aumentado la salud en 10 puntos ahora tinene: " + health;
        return mensaje;
    }

    //rest(), le suma 50 puntos a la salud. //Le tenemos que devolver un int un valor numerico
    public int rest() {
        health = this.health - 50;
        return health;
    }


    /**
     * attack(), recibe como parámetro otro héroe y le quitará vida entre 1 y
     * Max(ataqueDelAtacante-defensaDelAtacado,10).
     * Cadaataquelesuma10 deexperienciaalpersonaje
     * .Trasacumular50deexperienciasubeunnivel.
     */
    public int attack(Heroe otroHeroe) {
        int daniooAtaque = Math.max(1, attack - otroHeroe.defense); //Calcular el ataque

        System.out.println("EL MAXIMO ES " + daniooAtaque);

        //Si hay daño suma de experiencia 10
        if (daniooAtaque >= 1) {
            experience = experience + 10;
            System.out.println("Has ganado experiencia, tienes "+experience);
        }

        //Si la experiencia es mayor a 49 le sumamos un nivel.
        if (experience > 49) {
            level = level + 1;
            System.out.println("Subido de nivel, tinenes "+level);
            experience = 0; //Reset cada vez que se sube de nivel(50xp)para controlar la subida de niveles
        }
        return daniooAtaque;
    }

    //levelUp(),sube un nivel al
    // personaje:sumándole 5 puntos a lasalud,1punto alataqueyunpuntoaladefensa.
    public void levelUp(){
        health=health+5;
        attack=attack+1;
        defense=defense+1;

    }

    //GETTER Y SETTERS
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getMaxHealth() {
        return maxHealth;
    }

    public void setMaxHealth(int maxHealth) {
        this.maxHealth = maxHealth;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    @Override
    public String toString() {
        return "Heroe{" +
                "name='" + name + '\'' +
                ", level=" + level +
                ", health=" + health +
                ", maxHealth=" + maxHealth +
                ", experience=" + experience +
                ", attack=" + attack +
                ", defense=" + defense +
                '}';
    }
}
