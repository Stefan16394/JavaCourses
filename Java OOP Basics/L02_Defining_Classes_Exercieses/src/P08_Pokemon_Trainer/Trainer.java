package P08_Pokemon_Trainer;

import java.util.List;

public class Trainer {
    private  String name;
    private  int badges=0;
    private List<Pokemon> pokemonsList;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBadges() {
        return badges;
    }

    public void setBadges() {
        this.badges = ++badges;
    }

    public List<Pokemon> getPokemonsList() {
        return pokemonsList;
    }

    public void setPokemonsList(List<Pokemon> pokemonsList) {
        this.pokemonsList = pokemonsList;
    }

    public Trainer(String name, List<Pokemon> pokemonsList) {
        this.name = name;
        this.pokemonsList = pokemonsList;
    }
}
