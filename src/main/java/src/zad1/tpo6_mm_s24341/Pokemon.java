package src.zad1.tpo6_mm_s24341;

public class Pokemon {
    int pokemon_id;
    String name;
    String type_primary;
    String type_secondary;
    String hp;
    String attack;
    String defense;
    String speed;

    public Pokemon(int pokemon_id, String name, String type_primary, String type_secondary, String hp, String attack, String defense, String speed) {
        this.pokemon_id = pokemon_id;
        this.name = name;
        this.type_primary = type_primary;
        this.type_secondary = type_secondary;
        this.hp = hp;
        this.attack = attack;
        this.defense = defense;
        this.speed = speed;
    }

    public int getPokemon_id() {
        return pokemon_id;
    }

    public void setPokemon_id(int pokemon_id) {
        this.pokemon_id = pokemon_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType_primary() {
        return type_primary;
    }

    public void setType_primary(String type_primary) {
        this.type_primary = type_primary;
    }

    public String getType_secondary() {
        return type_secondary;
    }

    public void setType_secondary(String type_secondary) {
        this.type_secondary = type_secondary;
    }

    public String getHp() {
        return hp;
    }

    public void setHp(String hp) {
        this.hp = hp;
    }

    public String getAttack() {
        return attack;
    }

    public void setAttack(String attack) {
        this.attack = attack;
    }

    public String getDefense() {
        return defense;
    }

    public void setDefense(String defense) {
        this.defense = defense;
    }

    public String getSpeed() {
        return speed;
    }

    public void setSpeed(String speed) {
        this.speed = speed;
    }
}