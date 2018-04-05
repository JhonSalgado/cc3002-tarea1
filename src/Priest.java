public class Priest extends Human implements Attacker {

    public Priest(String nombre){
        super.ataque=6;
        super.hpMax=80;
        super.hpActual=80;
        super.nombre=nombre;
    }

    @Override
    public void Attack(Entidad entidad) {
        if (!this.CanFight()){return;}
        if(entidad instanceof Undead){
            entidad.hpActual-=5*this.ataque;
        }
        else if(entidad instanceof Rock){
            this.hpActual-=this.ataque;
        }
        else if(entidad instanceof FruitTree){
            if(hpActual+0.3*this.hpMax>=hpMax){this.hpActual=this.hpMax;}
            else{this.hpActual+=0.3*this.hpMax;}
        }
        else{}
    }
}
