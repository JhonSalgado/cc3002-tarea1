/**Interfaz a implementar en todas las clases que pueden atacar (por ahora todas excepto Rock y FruitTree
 * Extiende a la interfaz Attackable pues los atacantes tambien pueden ser atacados
 *
 * @autor Jhon Salagado*/
package clases;

public interface Attacker extends Attackable{

    /**Metodo para saber si la entidad que ataca puede hacerlo, es decir si su vida es mayor que cero.
     * */
    boolean canFight();

    /**una entidad Atacker ataca a una entidad Attackable.
     * @param attackable
     * */
    void attack(Attackable attackable);
}
