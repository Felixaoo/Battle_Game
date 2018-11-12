package Test;

import com.ocr.felix.entity.Hunt;
import com.ocr.felix.entity.Warrior;
import com.ocr.felix.entity.Wizard;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class WizardTest {

    Wizard wizard1 = new Wizard(10,50,0,0,10,"joueur1");
    Wizard wizard2 = new Wizard(9,45,0,0,9,"joueur2");


    @Test
    public void Given_scream_When_created_Then_displayAbracadabra(){
        System.out.println(wizard1.cri());
        assertEquals("Abracadabra", wizard1.cri());
    }
    @Test
    public void Given_normalAttack_When_wizard2Turn_Then_damageDoneAreOk(){
        wizard2.normalAttack(wizard1);
        assertEquals(45, wizard2.getHealth());
        assertEquals(41, wizard1.getHealth());
    }
    @Test
    public void Given_SpecialAttack_When_Wizard1Turn_Then_HealingDoneAreNull(){
        wizard1.specialAttack(wizard1);
        assertEquals(50, wizard1.getHealth());

    }
    @Test
    public void Given_SpecialAttack_When_PlayerIsNotFullLife_Then_HealingDoneIsOk(){
        wizard2.normalAttack(wizard1);
        wizard1.specialAttack(wizard1);
        assertEquals(50,wizard1.getHealth());
    }

}