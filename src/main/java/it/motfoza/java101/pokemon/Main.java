package it.motfoza.java101.pokemon;

/**
 * Created by Anna Kacprzak on 2016-07-29.
 */
public class Main {
    public static void main(String[] args) {
        Pokemon pokemon= new Pokemon("Pikachu", 100 );
        Pokemon pokemon2= new Pokemon("Charizard", 200);
        Pokemon pokemon3= new Pokemon("Bulbasaur", 300);

        System.out.println(pokemon);
        System.out.println(pokemon2);
        System.out.println(pokemon3);

//        pokemon.takeAttack(1000);

        pokemon.attack(pokemon);
        pokemon2.attack(pokemon);

        System.out.println(pokemon);
        System.out.println(pokemon2);
        System.out.println(pokemon3);

        if (pokemon.isAlive()){
            System.out.println("Pokemon is alive");
        } else {
            System.out.println("Pokemon is unconscious");
        }
    }

}

