public class Main {
    public static void main(String[] args){
        Entidad goblin=new Goblin();
        Entidad undead=new Undead();
        Entidad icegolem=new IceGolem();
        Entidad knight=new Knight("Arturo");
        Entidad priest=new Priest("LadyLake");
        Entidad mage=new FireMage("Merlin");
        Entidad rock=new Rock();
        Entidad ft=new FruitTree();
        System.out.println("puntos de vida del goblin: ");
        System.out.println(goblin.hpActual);
        ((Knight) knight).Attack(goblin);
        System.out.println("puntos de vida del goblin: ");
        System.out.println(goblin.hpActual);
    }
}
