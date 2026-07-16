package ph.edu.dlsu.lbycpob.pokemonwebapp.model;

public abstract class AbstractPokemon implements PokemonOperations{
    protected int instanceId;
    protected String name;
    protected double weight;
    protected double height;
    protected double attack;
    protected double defense;
    protected double stamina;
    protected String type;

    public AbstractPokemon(int instanceId, String name, double weight, double height,
                           double attack, double defense, double stamina, String type) {
        this.instanceId = instanceId;
        this.name = name;
        this.weight = weight;
        this.height = height;
        this.attack = attack;
        this.defense = defense;
        this.stamina = stamina;
        this.type = type;
    }

}
