package clases;

public class Knight extends Human implements Attacker {

    public Knight(String nombre){
        super.ap=8;
        super.hpMax=100;
        super.hp=100;
        super.nombre=nombre;
    }


    @Override
    public boolean CanFight() {
        if(this.hp<=0){
            return false;
        }
        else{return true;}
    }

    @Override
    public void attack(Attackable attackable) {
        if(this.CanFight()) {
            attackable.attackedBy(this);
        }
    }

    @Override
    public void attackedBy(FireMage fireMage) {
        hp-=2*fireMage.ap;
        if(hp<0){hp=0;}
    }

    @Override
    public void attackedBy(Knight knight) {
        hp-=knight.ap;
        if(hp<0){hp=0;}
    }

    @Override
    public void attackedBy(Priest priest) {
        return;
    }

    @Override
    public void attackedBy(Goblin goblin) {
        hp-=0.5*goblin.ap;
        if(hp<0){hp=0;}
    }

    @Override
    public void attackedBy(IceGolem iceGolem) {
        hp-=1.5*iceGolem.ap;
        if(hp<0){hp=0;}
    }

    @Override
    public void attackedBy(Undead undead) {
        hp-=undead.ap;
    }
}
