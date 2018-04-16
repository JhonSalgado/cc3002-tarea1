/**Clase abstracta para agrupar a los humanos.
 * Esta clase se extiende a Priest, FireMage y Kngiht por ahora, pues etsos son humanos
 * aca se declaran los atributos que tendran estos, es decir los doubles hp, hpMax, ap
 * y a diferencia de las demás clases tendrán un String nombre
 *
 * @autor Jhon Salagado*/
package clases;

public abstract class AbstractHuman implements Attacker {
    public double hp, hpMax, ap;
    public String nombre;
}

