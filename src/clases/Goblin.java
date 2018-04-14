package clases;

public class Goblin extends Entidad implements Attacker {

    public Goblin(){
        super.ataque=5;
        super.hpMax=70;
        super.hpActual=70;
    }

    @Override
    public void Attack(Entidad entidad) {
        if (!this.CanFight()){return;}
        if (entidad instanceof Knight){
            entidad.hpActual-=0.5*this.ataque;
        }
        else if(entidad instanceof Priest){
            entidad.hpActual-=this.ataque;
        }
        else if(entidad instanceof FireMage){
            entidad.hpActual-=1.5*this.ataque;
        }
        else if(entidad instanceof FruitTree){
            if(hpActual+0.15*this.hpMax>=hpMax){this.hpActual=this.hpMax;}
            else{this.hpActual+=0.15*this.hpMax;}
        }
        else{return;}
    }
}
