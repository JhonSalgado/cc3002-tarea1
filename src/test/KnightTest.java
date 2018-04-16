package test;

import org.junit.*;
import clases.*;

import static junit.framework.TestCase.assertEquals;

public class KnightTest {
    private Knight knight;
    private FireMage mage;
    private Priest priest;
    private Rock rock;
    private Undead undead;
    private Goblin goblin;
    private IceGolem golem;
    private FruitTree tree;


    @Before
    public void setUp(){
        knight=new Knight("paco");
        mage=new FireMage("hector");
        priest=new Priest("larry");
        rock=new Rock();
        undead=new Undead();
        goblin=new Goblin();
        golem=new IceGolem();
        tree=new FruitTree();
    }

    @Test
    public void testAttackRockAndTree(){

        double healExpected1=92;
        knight.attack(rock);
        double result1=knight.hp;
        assertEquals(healExpected1,result1,0);

        double healExpected2=100;
        knight.attack(tree);
        double result2=knight.hp;
        assertEquals(healExpected2,result2,0);

        double healExpected3=98;
        knight.attack(rock);
        knight.attack(rock);
        knight.attack(rock);
        knight.attack(rock);
        knight.attack(tree);
        double result3=knight.hp;
        assertEquals(healExpected3,result3,0);
    }

    @Test
    public void testAttackAttackers(){
        double healExpected1=72;
        knight.attack(undead);
        double result1=undead.hp;
        assertEquals(healExpected1,result1,0);

        double healExpected2=116;
        knight.attack(golem);
        double result2=golem.hp;
        assertEquals(healExpected2,result2,0);

        double healExpected3=58;
       knight.attack(mage);
        double result3=mage.hp;
        assertEquals(healExpected3,result3,0);

        double healExpected4=60;
        knight.attack(goblin);
        double result4=goblin.hp;
        assertEquals(healExpected4,result4,0);
    }

    @Test
    public void testAttackedBy(){
        double healExpected1=100;
        knight.attackedBy(priest);
        double result1=knight.hp;
        assertEquals(healExpected1,result1,0);

        double healExpected2=97.5;
        knight.attackedBy(goblin);
        double result2=knight.hp;
        assertEquals(healExpected2,result2,0);

        double healExpected3=88.5;
        knight.attackedBy(golem);
        double result3=knight.hp;
        assertEquals(healExpected3,result3,0);
    }

    @Test
    public void testCanFight(){
        assertEquals(true,knight.canFight());
        knight.attackedBy(mage);
        knight.attackedBy(mage);
        knight.attackedBy(mage);
        knight.attackedBy(mage);
        knight.attackedBy(mage);
        knight.attackedBy(mage);
        knight.attackedBy(mage);
        knight.attackedBy(mage);
        knight.attackedBy(mage);
        knight.attackedBy(mage);
        assertEquals(false,knight.canFight());
    }

}
