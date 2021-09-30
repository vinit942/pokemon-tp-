public class PokemonEau extends Pokemon {


    public PokemonEau(String nom, int hp, int atk) {
        super(nom, hp, atk);
    }

    @Override
    public void attacker(Pokemon p) {
        if (p = Pokemonfeu) {

            p.hp = this.atk * 2 - p.hp;

        }
        else if (p = PokemonPlante) {

            p.hp = this.atk * 0.5 - p.hp;
        }
        else
            p.hp = this.atk - p.hp;



    }

}