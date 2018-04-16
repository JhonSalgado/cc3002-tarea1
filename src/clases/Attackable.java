/**Attackable es la interfaz a implementar en todas las clases que generan entidades atacables (por ahora todas).
 *
 * @autor Jhon Salagado*/

package clases;

public interface Attackable {

    /**FireMage ataca a una entidad Attackable
     * @param fireMage
     * */
    void attackedBy(FireMage fireMage);

    /**Knghit ataca a una entidad Attackable
     * @param knight
     * */
    void attackedBy(Knight knight);

    /**Priest ataca a una entidad Attackable
     * @param priest
     * */
    void attackedBy(Priest priest);

    /**Goblin ataca a una entidad Attackable
     * @param goblin
     * */
    void attackedBy(Goblin goblin);

    /**IceGolem ataca a una entidad Attackable
     * @param iceGolem
     * */
    void attackedBy(IceGolem iceGolem);

    /**Undead ataca a una entidad Attackable
     * @param undead
     * */
    void attackedBy(Undead undead);
}
