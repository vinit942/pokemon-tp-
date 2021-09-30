public class PokemonEau extends Pokemon {


    public PokemonEau(String nom, double hp, int atk) {
        super(nom, hp, atk);
    }

    @Override
    public void attacker(Pokemon p) {
        if (p instanceof Pokemonfeu) {

            p.hp = (this.atk * 2) - p.hp;

        }
        else if (p instanceof PokemonPlante) {

            p.hp = (this.atk * 0.5) - p.hp;
        }
        else
            p.hp = this.atk - p.hp;



    }

}