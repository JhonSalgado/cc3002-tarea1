/**Clase para generar entidades de la clase IceGolem.
 * Estos tienen puntos de vida (hp), que pueden llegar a un maximo (hpMax) y puntos de ataque (ap)
 * Implementa la clase Attacker pues puede atacar y ser atacado
 *
 * @autor Jhon Salagado*/
package clases;

public class IceGolem implements Attacker {
    public double hp, hpMax, ap;

    /**Constructor de la clase IceGolem
     * Este constructor configura los puntos de vida maximos hpMax en 120, los puntos de vida actuales hp tambien en 120
     * y los puntos de ataque ap en 6
     * */
    public IceGolem(){
        ap=6;
        hpMax=120;
        hp=120;
    }

    /**Metodo para saber si un IceGolem aun puede atacar
     * consiste en comprobar si aun tiene puntos de vida (hp>0)
     * */
    @Override
    public boolean canFight() {
        if(this.hp<=0){
            return false;
        }
        else{return true;}
    }

/**Metodo para atacar a una entidad Attackable
 * si el Golem puede pelear (se chequea con el metodo canFight)
 * se llama al metodo attackedBy(iceGolem) de la entidad atacada
 * @param attackable
 * */
    @Override
    public void attack(Attackable attackable) {
        if(this.canFight()) {
            attackable.attackedBy(this);
        }
    }

    /**Metodo que se llama cuando un IceGolem es atacado por un FIreMage
     * se le bajan los puntos de vida al IceGolem segun la tabla de interacciones entre entidades
     * si la vida baja a menos de cero simplemente queda en cero
     * @param fireMage
     * */
    @Override
    public void attackedBy(FireMage fireMage) {
        hp-=5*fireMage.ap;
        if(hp<0){hp=0;}
    }

    /**Metodo que se llama cuando un IceGolem es atacado por un Knight
     * se le bajan los puntos de vida al IceGolem segun la tabla de interacciones entre entidades
     * si la vida baja a menos de cero simplemente queda en cero
     * @param knight
     * */
    @Override
    public void attackedBy(Knight knight) {
        hp-=0.5*knight.ap;
        if(hp<0){hp=0;}
    }

    /**Metodo que se llama cuando un IceGolem es atacado por un Priest
     * se le bajan los puntos de vida al IceGolem segun la tabla de interacciones entre entidades
     * en este caso un goblin no puede ser atacado por un Priest asi que no se hace nada
     * @param priest
     * */
    @Override
    public void attackedBy(Priest priest) {
        return;
    }

    /**Metodo que se llama cuando un IceGolem es atacado por un Goblin
     * se le bajan los puntos de vida al IceGolem segun la tabla de interacciones entre entidades
     * en este caso un goblin no puede ser atacado por un Priest asi que no se hace nada
     * @param goblin
     * */
    @Override
    public void attackedBy(Goblin goblin) {
        return;
    }

    /**Metodo que se llama cuando un IceGolem es atacado por un IceGolem
     * se le bajan los puntos de vida al IceGolem segun la tabla de interacciones entre entidades
     * si la vida baja a menos de cero simplemente queda en cero
     * @param iceGolem
     * */
    @Override
    public void attackedBy(IceGolem iceGolem) {
        hp-=iceGolem.ap;
        if(hp<0){hp=0;}
    }

    /**Metodo que se llama cuando un IceGolem es atacado por un Undead
     * se le bajan los puntos de vida al IceGolem segun la tabla de interacciones entre entidades
     * si la vida baja a menos de cero simplemente queda en cero
     * @param undead
     * */
    @Override
    public void attackedBy(Undead undead) {
        return;
    }
}
