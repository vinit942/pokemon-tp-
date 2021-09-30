public class Pokemonfeu extends Pokemon{

    private Pokemon Pokemon;

    public Pokemonfeu(String nom, int hp, int atk){
        super(nom,hp,atk);


    }
    @Override
    public void attacker(Pokemon p) {
        if (p = PokemonPlante) {
            p.hp = atk * 2 - p.hp;
        }
        else if(p = PokemonEau) {
            p.hp = atk * 0.5 - p.hp;
        }



        else
            p.hp = atk - p.hp;



    }    
    



}
