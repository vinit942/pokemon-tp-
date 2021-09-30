public class PokemonPlante extends Pokemon{
      public PokemonPlante(String nom,int hp, int atk){
      super (nom,hp,atk);

      }

      @Override
    public void attacker (Pokemon p) {
          if (p = PokemonEau) {
              p.hp = atk * 2 - p.hp;
          }
          else if(Pokemonfeu){
              p.hp = atk * 0.5 - p.hp;

          }

          else
              p.hp = atk - p.hp ;

      }

}





