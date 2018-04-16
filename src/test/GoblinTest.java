package test;
import org.junit.*;
import clases.*;

import static junit.framework.TestCase.assertEquals;

public class GoblinTest {
    private Goblin goblin;
    private FireMage mage;
    private Knight knight;
    private Priest priest;
    private Rock rock;
    private Undead undead;
    private IceGolem golem;
    private FruitTree tree;


    @Before
    public void setUp(){
        goblin=new Goblin();
        mage=new FireMage("hector");
        knight=new Knight("paco");
        priest=new Priest("larry");
        rock=new Rock();
        undead=new Undead();
        golem=new IceGolem();
        tree=new FruitTree();
    }

    @Test
    public void testAttackRockAndTree(){

        double healExpected1=70;
        goblin.attack(rock);
        double result1=goblin.hp;
        assertEquals(healExpected1,result1,0);

        double healExpected2=70;
        undead.attack(goblin);
        goblin.attack(tree);
        double result2=goblin.hp;
        assertEquals(healExpected2,result2,0);

        double healExpected3=68.5;
        golem.attack(goblin);
        goblin.attack(tree);
        double result3=goblin.hp;
        assertEquals(healExpected3,result3,0);
    }

    @Test
    public void testAttackAttackers(){
        double healExpected1=75;
        goblin.attack(priest);
        double result1=priest.hp;
        assertEquals(healExpected1,result1,0);

        double healExpected2=97.5;
        goblin.attack(knight);
        double result2=knight.hp;
        assertEquals(healExpected2,result2,0);

        double healExpected3=120;
        goblin.attack(golem);
        double result3=golem.hp;
        assertEquals(healExpected3,result3,0);
    }

    @Test
    public void testAttackedBy(){
        double healExpected1=70;
        goblin.attackedBy(goblin);
        double result1=goblin.hp;
        assertEquals(healExpected1,result1,0);

        double healExpected2=60;
        goblin.attackedBy(knight);
        double result2=goblin.hp;
        assertEquals(healExpected2,result2,0);

        double healExpected3=48;
        goblin.attackedBy(golem);
        double result3=goblin.hp;
        assertEquals(healExpected3,result3,0);
    }

    @Test
    public void testCanFight(){
        assertEquals(true,goblin.canFight());
        goblin.attackedBy(golem);
        goblin.attackedBy(golem);
        goblin.attackedBy(golem);
        goblin.attackedBy(golem);
        goblin.attackedBy(golem);
        goblin.attackedBy(golem);
        assertEquals(false,goblin.canFight());
    }
}
