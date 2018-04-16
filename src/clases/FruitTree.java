/**Clase para generar entidades de la clase FruitTree .
 * No tienen ningun atributo
 * Implementa la clase Attackable pues solo puede ser atacado
 *
 * @autor Jhon Salagado*/
package clases;

public class FruitTree implements Attackable{

    /**Metodo que se llama cuando un Rock es atacado por un FireMage
     * se le suma un 30% de la vida maxima al hp del FireMage
     * si se pasa el maximo, simplemente se deja en hpMax
     * @param fireMage
     * */
    @Override
    public void attackedBy(FireMage fireMage) {
        if(fireMage.hp+fireMage.hpMax*0.3>fireMage.hpMax){
            fireMage.hp=fireMage.hpMax;
        }
        else{
            fireMage.hp+=fireMage.hpMax*0.3;
        }
    }

    /**Metodo que se llama cuando un Rock es atacado por un Knight
     * se le suma un 30% de la vida maxima al hp del Knight
     * si se pasa el maximo, simplemente se deja en hpMax
     * @param knight
     * */
    @Override
    public void attackedBy(Knight knight) {
        if(knight.hp+knight.hpMax*0.3>knight.hpMax){
            knight.hp=knight.hpMax;
        }
        else{
            knight.hp+=knight.hpMax*0.3;
        }
    }

    /**Metodo que se llama cuando un Rock es atacado por un Priest
     * se le suma un 30% de la vida maxima al hp del Priest
     * si se pasa el maximo, simplemente se deja en hpMax
     * @param priest
     * */
    @Override
    public void attackedBy(Priest priest) {
        if(priest.hp+priest.hpMax*0.3>priest.hpMax){
            priest.hp=priest.hpMax;
        }
        else{
            priest.hp+=priest.hpMax*0.3;
        }
    }

    /**Metodo que se llama cuando un Rock es atacado por un Goblin
     * se le suma un 15% de la vida maxima al hp del Goblin
     * si se pasa el maximo, simplemente se deja en hpMax
     * @param goblin
     * */
    @Override
    public void attackedBy(Goblin goblin) {
        if(goblin.hp+goblin.hpMax*0.15>goblin.hpMax){
            goblin.hp=goblin.hpMax;
        }
        else{
            goblin.hp+=goblin.hpMax*0.15;
        }
    }

    /**Para el resto de clases, atacar a una entidad Rock no hace nada
     * */

    @Override
    public void attackedBy(IceGolem iceGolem) {
        return;
    }

    @Override
    public void attackedBy(Undead undead) {
        return;
    }
}
