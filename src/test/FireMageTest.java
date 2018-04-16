package test;
import org.junit.*;
import clases.*;

import static junit.framework.TestCase.assertEquals;

public class FireMageTest {
    private FireMage mage;
    private Knight knight;
    private Priest priest;
    private Rock rock;
    private Undead undead;
    private Goblin goblin;
    private IceGolem golem;
    private FruitTree tree;


    @Before
    public void setUp(){
        mage=new FireMage("hector");
        knight=new Knight("paco");
        priest=new Priest("larry");
        rock=new Rock();
        undead=new Undead();
        goblin=new Goblin();
        golem=new IceGolem();
        tree=new FruitTree();
    }

    @Test
    public void testAttackRockAndTree(){

        double healExpected1=65;
        mage.attack(rock);
        double result1=mage.hp;
        assertEquals(healExpected1,result1,0);

        double healExpected2=70;
        mage.attack(tree);
        double result2=mage.hp;
        assertEquals(healExpected2,result2,0);

        double healExpected3=61;
        mage.attack(rock);
        mage.attack(rock);
        mage.attack(rock);
        mage.attack(rock);
        mage.attack(rock);
        mage.attack(rock);
        mage.attack(tree);
        double result3=mage.hp;
        assertEquals(healExpected3,result3,0);
    }

    @Test
    public void testAttackAttackers(){
        double healExpected1=95;
        mage.attack(golem);
        double result1=golem.hp;
        assertEquals(healExpected1,result1,0);

        double healExpected2=77.5;
        mage.attack(undead);
        double result2=undead.hp;
        assertEquals(healExpected2,result2,0);

        double healExpected3=90;
        mage.attack(knight);
        double result3=knight.hp;
        assertEquals(healExpected3,result3,0);
    }

    @Test
    public void testAttackedBy(){
        double healExpected1=70;
        mage.attackedBy(priest);
        double result1=mage.hp;
        assertEquals(healExpected1,result1,0);

        double healExpected2=60;
        mage.attackedBy(mage);
        double result2=mage.hp;
        assertEquals(healExpected2,result2,0);

        double healExpected3=52.5;
        mage.attackedBy(goblin);
        double result3=mage.hp;
        assertEquals(healExpected3,result3,0);
    }

    @Test
    public void testCanFight(){
        assertEquals(true,mage.canFight());
        mage.attackedBy(mage);
        mage.attackedBy(mage);
        mage.attackedBy(mage);
        mage.attackedBy(mage);
        mage.attackedBy(mage);
        mage.attackedBy(mage);
        mage.attackedBy(mage);
        assertEquals(false,mage.canFight());
    }
}
