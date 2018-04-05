public class Knight extends Human implements Attacker{

    public Knight(String nombre){
        super.ataque=8;
        super.hpMax=100;
        super.hpActual=100;
        super.nombre=nombre;
    }

    @Override
    public void Attack(Entidad entidad) {
        if (!this.CanFight()){return;}
        if(entidad instanceof Goblin){
            entidad.hpActual-=1.25*this.ataque;
        }
        else if(entidad instanceof IceGolem){
            entidad.hpActual-=0.5*this.ataque;
        }
        else if(entidad instanceof Undead || entidad instanceof Knight){
            entidad.hpActual-=this.ataque;
        }
        else if (entidad instanceof FireMage){
            entidad.hpActual-=1.5*this.ataque;
        }
        else if(entidad instanceof FruitTree){
            if(hpActual+0.3*this.hpMax>=hpMax){this.hpActual=this.hpMax;}
            else{this.hpActual+=0.3*this.hpMax;}
        }
        else if(entidad instanceof Rock){
            this.hpActual-=this.ataque;
        }
        else{return;}
    }
}
