/**Clase para generar entidades de la clase Knight .
 * Estos tienen puntos de vida (hp), que pueden llegar a un maximo (hpMax) y puntos de ataque (ap)
 * Implementa la clase Attacker pues puede atacar y ser atacado
 * Extiende a la clase abstracta AbstractHuman porque los caballeros son humanos
 *
 * @autor Jhon Salagado*/
package clases;

public class Knight extends AbstractHuman implements Attacker {

    /**Constructor de la clase Kngiht
     * Recibe un string que sera el nombre delKnight
     * Este constructor configura los puntos de vida maximos hpMax en 70, los puntos de vida actuales hp tambien en 70
     * y los puntos de ataque ap en 5
     * Las variables fueron declaradas en la superclase abstracta AbstractHuman por lo que se usa super
     * @param nombre
     *
     * */
    public Knight(String nombre){
        super.ap=8;
        super.hpMax=100;
        super.hp=100;
        super.nombre=nombre;
    }

    /**Metodo para saber si un Knight aun puede atacar
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
     * si el Knight puede pelear (se chequea con el metodo canFight)
     * se llama al metodo attackedBy(knight) de la entidad atacada
     * @param attackable
     * */
    @Override
    public void attack(Attackable attackable) {
        if(this.canFight()) {
            attackable.attackedBy(this);
        }
    }

    /**Metodo que se llama cuando un Knight es atacado por un FireMage
     * se le bajan los puntos de vida al Knight segun la tabla de interacciones entre entidades
     * si la vida baja a menos de cero simplemente queda en cero
     * @param fireMage
     * */
    @Override
    public void attackedBy(FireMage fireMage) {
        hp-=2*fireMage.ap;
        if(hp<0){hp=0;}
    }

    /**Metodo que se llama cuando un Knight es atacado por un Knight
     * se le bajan los puntos de vida al Knight segun la tabla de interacciones entre entidades
     * si la vida baja a menos de cero simplemente queda en cero
     * @param knight
     * */
    @Override
    public void attackedBy(Knight knight) {
        hp-=knight.ap;
        if(hp<0){hp=0;}
    }

    /**Metodo que se llama cuando un Knight es atacado por un Priest
     * se le bajan los puntos de vida al Knight segun la tabla de interacciones entre entidades
     * en este caso un Knight no puede ser atacado por un Priest asi que no se hace nada
     * @param priest
     * */
    @Override
    public void attackedBy(Priest priest) {
        return;
    }

    /**Metodo que se llama cuando un Knight es atacado por un Goblin
     * se le bajan los puntos de vida al Knight segun la tabla de interacciones entre entidades
     * si la vida baja a menos de cero simplemente queda en cero
     * @param goblin
     * */
    @Override
    public void attackedBy(Goblin goblin) {
        hp-=0.5*goblin.ap;
        if(hp<0){hp=0;}
    }

    /**Metodo que se llama cuando un Knight es atacado por un IceGolem
     * se le bajan los puntos de vida al Knight segun la tabla de interacciones entre entidades
     * si la vida baja a menos de cero simplemente queda en cero
     * @param iceGolem
     * */
    @Override
    public void attackedBy(IceGolem iceGolem) {
        hp-=1.5*iceGolem.ap;
        if(hp<0){hp=0;}
    }

    /**Metodo que se llama cuando un Knight es atacado por un Undead
     * se le bajan los puntos de vida al Knight segun la tabla de interacciones entre entidades
     * si la vida baja a menos de cero simplemente queda en cero
     * @param undead
     * */
    @Override
    public void attackedBy(Undead undead) {
        hp-=undead.ap;
        if(hp<0){hp=0;}
    }
}
