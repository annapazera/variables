package it.motfoza.java101.pokemon;

/**
 * Created by Anna Kacprzak on 2016-07-29.
 */
public class Pokemon {

    private  String name;
    private long health =  1000;

    public Pokemon(String name) {
        this.name = name;
    }
    public String toString(){
        return "Pokemon: " +name + " health: "     + health;
    }

    public void takeAttack() {
        health -= 100;
    }

    public boolean isAlive() {
       if (health > 0){
           return true;
       }
         else {
           return false;
       }

       }}