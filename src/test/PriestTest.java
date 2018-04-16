package test;

import org.junit.*;
import clases.*;

import static junit.framework.TestCase.assertEquals;

public class PriestTest {
    private Priest priest;
    private FireMage mage;
    private Knight knight;
    private Rock rock;
    private Undead undead;
    private Goblin goblin;
    private IceGolem golem;
    private FruitTree tree;


    @Before
    public void setUp(){
        priest=new Priest("larry");
        mage=new FireMage("hector");
        knight=new Knight("paco");
        rock=new Rock();
        undead=new Undead();
        goblin=new Goblin();
        golem=new IceGolem();
        tree=new FruitTree();
    }

    @Test
    public void testAttackRockAndTree(){

        double healExpected1=74;
        priest.attack(rock);
        double result1=priest.hp;
        assertEquals(healExpected1,result1,0);

        double healExpected2=80;
        priest.attack(tree);
        double result2=priest.hp;
        assertEquals(healExpected2,result2,0);

        double healExpected3=74;
        priest.attack(rock);
        priest.attack(rock);
        priest.attack(rock);
        priest.attack(rock);
        priest.attack(rock);
        priest.attack(tree);
        double result3=priest.hp;
        assertEquals(healExpected3,result3,0);
    }

    @Test
    public void testAttackAttackers(){
        double healExpected1=120;
        priest.attack(golem);
        double result1=golem.hp;
        assertEquals(healExpected1,result1,0);

        double healExpected2=50;
        priest.attack(undead);
        double result2=undead.hp;
        assertEquals(healExpected2,result2,0);
    }

    @Test
    public void testAttackedBy(){
        double healExpected1=80;
        priest.attackedBy(knight);
        double result1=priest.hp;
        assertEquals(healExpected1,result1,0);

        double healExpected2=70;
        priest.attackedBy(mage);
        double result2=priest.hp;
        assertEquals(healExpected2,result2,0);

        double healExpected3=65;
        priest.attackedBy(goblin);
        double result3=priest.hp;
        assertEquals(healExpected3,result3,0);
    }

    @Test
    public void testCanFight(){
        assertEquals(true,priest.canFight());
        priest.attackedBy(golem);
        priest.attackedBy(golem);
        priest.attackedBy(golem);
        priest.attackedBy(golem);
        priest.attackedBy(golem);
        priest.attackedBy(golem);
        priest.attackedBy(golem);
        priest.attackedBy(golem);
        assertEquals(false,priest.canFight());
    }
}
