public class FireMage extends Human implements Attacker{

    public FireMage(String nombre){
        super.ataque=5;
        super.hpMax=70;
        super.hpActual=70;
        super.nombre=nombre;
    }

    @Override
    public void Attack(Entidad entidad) {
        if (!this.CanFight()){return;}
        if(entidad instanceof IceGolem){
            entidad.hpActual-=5*this.ataque;
        }
        else if(entidad instanceof Undead){
            entidad.hpActual-=0.5*this.ataque;
        }
        else if(entidad instanceof FruitTree){
            if(hpActual+0.3*this.hpMax>=hpMax){this.hpActual=this.hpMax;}
            else{this.hpActual+=0.3*this.hpMax;}
        }
        else if(entidad instanceof Rock){
            this.hpActual-=this.ataque;
        }
        else{
            entidad.hpActual-=2*this.ataque;
        }
    }
}
