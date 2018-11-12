package Test;

import com.ocr.felix.entity.Hunt;
import com.ocr.felix.entity.Warrior;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class WarriorTest {

    Warrior warrior1 = new Warrior(10,50,10,0,0,"joueur1");
    Warrior warrior2 = new Warrior(9,45,10,0,0,"joueur2");


    @Test
    public void Given_Scream_When_created_Then_displayWoargh(){
        System.out.println(warrior1.cri());
        assertEquals("Woargh", warrior1.cri());
    }
    @Test
    public void Given_NormalAttack_When_Warrior2Turn_Then_damageDoneAreOk(){
        warrior2.normalAttack(warrior1);
        assertEquals(45, warrior2.getHealth());
        assertEquals(40, warrior1.getHealth());
    }
    @Test
    public void Given_SpecialAttack_When_Warrior1Turn_Then_damageAreDoneToThe2Players(){
        warrior1.specialAttack(warrior2);
        assertEquals(45, warrior1.getHealth());
        assertEquals(25, warrior2.getHealth());
    }
}