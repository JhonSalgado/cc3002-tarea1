/**Clase para generar entidades de la clase Rock .
 * No tienen ningun atributo
 * Implementa la clase Attackable pues solo puede ser atacado
 *
 * @autor Jhon Salagado*/
package clases;

public class Rock implements Attackable{

    /**Metodo que se llama cuando un Rock es atacado por un FireMage
     * se bajan tantos puntos de vida hp al FireMage, como puntos de ataque ap tenga
     * @param fireMage
     * */
    @Override
    public void attackedBy(FireMage fireMage) {
        fireMage.hp-=fireMage.ap;
    }

    /**Metodo que se llama cuando un Rock es atacado por un Knight
     * se le bajan tantos puntos de vida hp al Knight, como puntos de ataque ap tenga
     * @param knight
     * */
    @Override
    public void attackedBy(Knight knight) {
        knight.hp-=knight.ap;
    }

    /**Metodo que se llama cuando un Rock es atacado por un Priest
     * se le bajan tantos puntos de vida hp al Priest, como puntos de ataque ap tenga
     * @param priest
     * */
    @Override
    public void attackedBy(Priest priest) {
        priest.hp-=priest.ap;
    }

    /**Para el resto de clases, atacar a una entidad Rock no hace nada
     * */

    @Override
    public void attackedBy(Goblin goblin) {
        return;
    }

    @Override
    public void attackedBy(IceGolem iceGolem) {
        return;
    }

    @Override
    public void attackedBy(Undead undead) {
        return;
    }
}
