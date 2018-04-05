public class Entidad {
    int ataque;
    int hpMax;
    int hpActual;

    public boolean CanFight() {
        if(this.hpActual<=0){
            return false;
        }
        else{return true;}
    }
}
