package test;
import org.junit.*;
import clases.*;

import static junit.framework.TestCase.assertEquals;

public class IceGolemTest {
    private IceGolem golem;
    private FireMage mage;
    private Knight knight;
    private Priest priest;
    private Rock rock;
    private Undead undead;
    private Goblin goblin;
    private FruitTree tree;


    @Before
    public void setUp(){
        golem=new IceGolem();
        mage=new FireMage("hector");
        knight=new Knight("paco");
        priest=new Priest("larry");
        rock=new Rock();
        undead=new Undead();
        goblin=new Goblin();
        tree=new FruitTree();
    }

    @Test
    public void testAttackRockAndTree(){

        double healExpected1=120;
        golem.attack(rock);
        double result1=golem.hp;
        assertEquals(healExpected1,result1,0);

        double healExpected2=95;
        mage.attack(golem);
        golem.attack(tree);
        double result2=golem.hp;
        assertEquals(healExpected2,result2,0);
    }

    @Test
    public void testAttackAttackers(){
        double healExpected1=68;
        golem.attack(undead);
        double result1=undead.hp;
        assertEquals(healExpected1,result1,0);

        double healExpected2=91;
        golem.attack(knight);
        double result2=knight.hp;
        assertEquals(healExpected2,result2,0);

        double healExpected3=114;
        golem.attack(golem);
        double result3=golem.hp;
        assertEquals(healExpected3,result3,0);
    }

    @Test
    public void testAttackedBy(){
        double healExpected1=120;
        golem.attackedBy(priest);
        double result1=golem.hp;
        assertEquals(healExpected1,result1,0);

        double healExpected2=95;
        golem.attackedBy(mage);
        double result2=golem.hp;
        assertEquals(healExpected2,result2,0);

        double healExpected3=91;
        golem.attackedBy(knight);
        double result3=golem.hp;
        assertEquals(healExpected3,result3,0);
    }

    @Test
    public void testCanFight(){
        assertEquals(true,golem.canFight());
        golem.attackedBy(mage);
        golem.attackedBy(mage);
        golem.attackedBy(mage);
        golem.attackedBy(mage);
        golem.attackedBy(mage);
        assertEquals(false,golem.canFight());
    }
}
