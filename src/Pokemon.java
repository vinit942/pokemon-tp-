public class Pokemon{

    protected Pokemon p;
    protected String nom;
    protected double hp;
    protected int atk;

    public Pokemon(String nom,int hp, int atk) {
        this.nom = nom;
        this.hp = hp;
        this.atk = atk;

    }

    public String getNom() {
        return nom;
    }

    public double gethp() {
        return hp;
    }

    public int getAtk() {
        return atk;
    }
    public boolean isDead(){
        if (this.hp == 0){
            return true;}
            else
                return false;
    }
    public void attacker(Pokemon p){

        p.hp = this.atk - p.hp;

    }
    public void toString(String nom,int hp, int atk) {

        System.out.println(this.nom);
        System.out.println(this.hp);
        System.out.println(this.atk);

    }
}
