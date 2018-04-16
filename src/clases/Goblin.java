/**Clase para generar entidades de la clase Goblin.
 * Estos tienen puntos de vida (hp), que pueden llegar a un maximo (hpMax) y puntos de ataque (ap)
 * Implementa la clase Attacker pues puede atacar y ser atacado
 *
 * @autor Jhon Salagado*/

package clases;

public class Goblin implements Attacker {
    public double hp, hpMax, ap;

    /**Constructor de la clase Goblin
     * Este constructor configura los puntos de vida maximos hpMax en 80, los puntos de vida actuales hp tambien en 80
     * y los puntos de ataque ap en 5
     * */
    public Goblin(){
        ap=5;
        hpMax=70;
        hp=70;
    }

    /**Metodo para saber si un goblin aun puede atacar
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
     * si el goblin puede pelear (se chequea con el metodo canFight)
     * se llama al metodo attackedBy(goblin) de la entidad atacada
     * @param attackable
     * */
    @Override
    public void attack(Attackable attackable) {
        if(this.canFight()) {
            attackable.attackedBy(this);
        }
    }

    /**Metodo que se llama cuando un goblin es atacado por un FireMage
     * se le bajan los puntos de vida al goblin segun la tabla de interacciones entre entidades
     * si la vida baja a menos de cero simplemente queda en cero
     * @param fireMage
     * */
    @Override
    public void attackedBy(FireMage fireMage) {
        hp-=2*fireMage.ap;
        if(hp<0){hp=0;}
    }

    /**Metodo que se llama cuando un goblin es atacado por un Knight
     * se le bajan los puntos de vida al goblin segun la tabla de interacciones entre entidades
     * si la vida baja a menos de cero simplemente queda en cero
     * @param knight
     * */
    @Override
    public void attackedBy(Knight knight) {
        hp-=1.25*knight.ap;
        if(hp<0){hp=0;}
    }

    /**Metodo que se llama cuando un goblin es atacado por un Priest
     * se le bajan los puntos de vida al goblin segun la tabla de interacciones entre entidades
     * en este caso un goblin no puede ser atacado por un Priest asi que no se hace nada
     * @param priest
     * */
    @Override
    public void attackedBy(Priest priest) {
        return;
    }

    /**Metodo que se llama cuando un goblin es atacado por un Goblin
     * se le bajan los puntos de vida al goblin segun la tabla de interacciones entre entidades
     * en este caso un goblin no puede ser atacado por otro goblin asi que no se hace nada
     * @param goblin
     * */
    @Override
    public void attackedBy(Goblin goblin) {
        return;
    }

    /**Metodo que se llama cuando un goblin es atacado por un IceGolem
     * se le bajan los puntos de vida al goblin segun la tabla de interacciones entre entidades
     * si la vida baja a menos de cero simplemente queda en cero
     * @param iceGolem
     * */
    @Override
    public void attackedBy(IceGolem iceGolem) {
        hp-=2*iceGolem.ap;
        if(hp<0){hp=0;}
    }

    /**Metodo que se llama cuando un goblin es atacado por un Undead
     * se le bajan los puntos de vida al goblin segun la tabla de interacciones entre entidades
     * si la vida baja a menos de cero simplemente queda en cero
     * @param undead
     * */
    @Override
    public void attackedBy(Undead undead) {
        hp-=undead.ap;
        if(hp<0){hp=0;}
    }
}
