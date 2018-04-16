package test;
import org.junit.*;
import clases.*;

import static junit.framework.TestCase.assertEquals;

public class UndeadTest {
    private Undead undead;
    private IceGolem golem;
    private FireMage mage;
    private Knight knight;
    private Priest priest;
    private Rock rock;
    private Goblin goblin;
    private FruitTree tree;


    @Before
    public void setUp(){
        undead=new Undead();
        golem=new IceGolem();
        mage=new FireMage("hector");
        knight=new Knight("paco");
        priest=new Priest("larry");
        rock=new Rock();
        goblin=new Goblin();
        tree=new FruitTree();
    }

    @Test
    public void testAttackRockAndTree(){

        double healExpected1=80;
        undead.attack(rock);
        double result1=undead.hp;
        assertEquals(healExpected1,result1,0);

        double healExpected2=72;
        knight.attack(undead);
        undead.attack(tree);
        double result2=undead.hp;
        assertEquals(healExpected2,result2,0);
    }

    @Test
    public void testAttackAttackers(){
        double healExpected1=80;
        undead.attack(undead);
        double result1=undead.hp;
        assertEquals(healExpected1,result1,0);

        double healExpected2=95;
        undead.attack(knight);
        double result2=knight.hp;
        assertEquals(healExpected2,result2,0);
    }

    @Test
    public void testAttackedBy(){
        double healExpected1=50;
        undead.attackedBy(priest);
        double result1=undead.hp;
        assertEquals(healExpected1,result1,0);

        double healExpected2=47.5;
        undead.attackedBy(mage);
        double result2=undead.hp;
        assertEquals(healExpected2,result2,0);

        double healExpected3=39.5;
        undead.attackedBy(knight);
        double result3=undead.hp;
        assertEquals(healExpected3,result3,0);
    }

    @Test
    public void testCanFight(){
        assertEquals(true,undead.canFight());
        undead.attackedBy(priest);
        undead.attackedBy(priest);
        undead.attackedBy(priest);
        assertEquals(false,undead.canFight());
    }
}
