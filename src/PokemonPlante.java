public class PokemonPlante extends Pokemon{

      public PokemonPlante(String nom,double hp, int atk){
      super (nom,hp,atk);

      }

      @Override
    public void attacker (Pokemon p) {
          if (p instanceof PokemonEau) {
              p.hp = atk * 2 - p.hp;
          }
          else if(p instanceof Pokemonfeu){
              p.hp = atk * 0.5 - p.hp;

          }

          else
              p.hp = atk - p.hp ;
      }

}





