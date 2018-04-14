package clases;

public class IceGolem extends Entidad implements Attacker {

    public IceGolem(){
        super.ataque=6;
        super.hpMax=120;
        super.hpActual=120;
    }

    @Override
    public void Attack(Entidad entidad) {
        if (!this.CanFight()){return;}
        if(entidad instanceof Knight){
            entidad.hpActual-=1.5*this.ataque;
        }
        else if(entidad instanceof IceGolem){
            entidad.hpActual-=this.ataque;
        }
        else if(entidad instanceof FruitTree || entidad instanceof Rock){
            return;
        }
        else{
            entidad.hpActual-=2*this.ataque;
        }
    }
}
