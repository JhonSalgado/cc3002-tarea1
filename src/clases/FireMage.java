/**Clase para generar entidades de la clase FireMage .
 * Estos tienen puntos de vida (hp), que pueden llegar a un maximo (hpMax) y puntos de ataque (ap)
 * Implementa la clase Attacker pues puede atacar y ser atacado
 * Extiende a la clase abstracta AbstractHuman porque los magos de fuego son humanos
 *
 * @autor Jhon Salagado*/
package clases;

public class FireMage extends AbstractHuman implements Attacker {

    /**Constructor de la clase FireMage
     * Recibe un string que sera el nombre del FireMage
     * Este constructor configura los puntos de vida maximos hpMax en 70, los puntos de vida actuales hp tambien en 70
     * y los puntos de ataque ap en 5
     * Las variables fueron declaradas en la superclase abstracta AbstractHuman por lo que se usa super
     * @param nombre
     *
     * */
    public FireMage(String nombre) {
        super.ap = 5;
        super.hpMax = 70;
        super.hp = 70;
        super.nombre = nombre;
    }

    /**Metodo para saber si un fireMage aun puede atacar
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
     * si el FireMage puede pelear (se chequea con el metodo canFight)
     * se llama al metodo attackedBy(fireMage) de la entidad atacada
     * @param attackable
     * */
    @Override
    public void attack(Attackable attackable) {
        if(this.canFight()) {
            attackable.attackedBy(this);
        }
    }

    /**Metodo que se llama cuando un FireMage es atacado por un FireMage
     * se le bajan los puntos de vida al FireMage segun la tabla de interacciones entre entidades
     * si la vida baja a menos de cero simplemente queda en cero
     * @param fireMage
     * */
    @Override
    public void attackedBy(FireMage fireMage) {
        hp-=2*fireMage.ap;
        if(hp<0){hp=0;}
    }

    /**Metodo que se llama cuando un FireMage es atacado por un Knight
     * se le bajan los puntos de vida al FireMage segun la tabla de interacciones entre entidades
     * si la vida baja a menos de cero simplemente queda en cero
     * @param knight
     * */
    @Override
    public void attackedBy(Knight knight) {
        hp-=1.5*knight.ap;
        if(hp<0){hp=0;}
    }

    /**Metodo que se llama cuando un FireMage es atacado por un Priest
     * se le bajan los puntos de vida al FireMage segun la tabla de interacciones entre entidades
     * en este caso un FireMage no puede ser atacado por un Priest asi que no se hace nada
     * @param priest
     * */
    @Override
    public void attackedBy(Priest priest) {
        return;
    }

    /**Metodo que se llama cuando un FireMage es atacado por un Goblin
     * se le bajan los puntos de vida al FireMage segun la tabla de interacciones entre entidades
     * si la vida baja a menos de cero simplemente queda en cero
     * @param goblin
     * */
    @Override
    public void attackedBy(Goblin goblin) {
        hp-=1.5*goblin.ap;
        if(hp<0){hp=0;}
    }

    /**Metodo que se llama cuando un FireMage es atacado por un IceGolem
     * se le bajan los puntos de vida al FireMage segun la tabla de interacciones entre entidades
     * si la vida baja a menos de cero simplemente queda en cero
     * @param iceGolem
     * */
    @Override
    public void attackedBy(IceGolem iceGolem) {
        hp-=2*iceGolem.ap;
        if(hp<0){hp=0;}
    }

    /**Metodo que se llama cuando un FireMage es atacado por un Undead
     * se le bajan los puntos de vida al FireMage segun la tabla de interacciones entre entidades
     * si la vida baja a menos de cero simplemente queda en cero
     * @param undead
     * */
    @Override
    public void attackedBy(Undead undead) {
        hp-=undead.ap;
        if(hp<0){hp=0;}
    }
}