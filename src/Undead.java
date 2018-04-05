public class Undead extends Entidad implements Attacker{

    public Undead(){
        super.ataque=5;
        super.hpMax=80;
        super.hpActual=80;
    }

    @Override
    public void Attack(Entidad entidad) {
        if (!this.CanFight()){return;}
        if(entidad instanceof Goblin){
            entidad.hpActual-=this.ataque;
        }
        else if(entidad instanceof Human){
            entidad.hpActual-=this.ataque;
        }
        else{return;}
    }
}
