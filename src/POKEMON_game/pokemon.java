package POKEMON_game;

public class pokemon {
    // Attributes (characteristics)
    private String name;
    private String type;
    private int hp; // Hit points
    private int attack;
    private int defense;

    // Constructor (to create Pokemon objects)
    public pokemon(String name, String type, int hp, int attack, int defense) {
        this.name = name;
        this.type = type;
        this.hp = hp;
        this.attack = attack;
        this.defense = defense;
    }

    // Methods (behaviors)
    public void attack(pokemon otherPokemon) {
        int damage = this.attack - otherPokemon.defense;
        if (damage > 0) {
            otherPokemon.hp -= damage;
            System.out.println(this.name + " attacked " + otherPokemon.name + " for " + damage + " damage!");
        } else {
            System.out.println(this.name + "'s attack was ineffective!");
        }
    }

    // Getters (to access attributes)
    public String getName() {
        return name;
    }

    // ... (Getters for type, hp, attack, defense)

public static void main(String[] args) {
    // Create some Pokemon
    pokemon pikachu = new pokemon("Pikachu", "Electric", 35, 55, 40);
    pokemon charmander = new pokemon("Charmander", "Fire", 39, 52, 43);

    // Let's have a battle!
    pikachu.attack(charmander); 
    charmander.attack(pikachu); 
}
}