package it.motfoza.java101.pokemon;

/**
 * Created by Anna Kacprzak on 2016-07-29.
 */
public class Pokemon {

    private String name;
    private long health = 1000;
    private long combatPower;

    public Pokemon(String name, long combatPower) {
        this.name = name;
        this.combatPower = combatPower;
    }

    public String toString() {
        return "Pokemon: " + name + " health: " + health;
    }

    public void takeAttack(long attackStrenght) {
        health -= attackStrenght;
    }

    public boolean isAlive() {
        if (health > 0) {
            return true;
        } else {
            return false;
        }

    }

    public void attack(Pokemon enemy) {
        enemy.takeAttack(combatPower);
    }
}