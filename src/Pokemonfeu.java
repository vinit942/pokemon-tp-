public class Pokemonfeu extends Pokemon{

    public Pokemonfeu(String nom, double hp, int atk){
        super(nom,hp,atk);


    }
    @Override
    public void attacker(Pokemon p) {
        if (p instanceof PokemonPlante) {
            p.hp = (atk * 2) - p.hp;
        }
        else if(p instanceof PokemonEau) {
            p.hp = (atk * 0.5) - p.hp;
        }

        else
            p.hp = atk - p.hp;

    }    
    



}
