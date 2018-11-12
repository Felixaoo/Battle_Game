package Test;

import com.ocr.felix.entity.Hunt;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class HuntTest {

    Hunt hunt1 = new Hunt(10,50,0,10,0,"joueur1");
    Hunt hunt2 = new Hunt(9,45,0,9,0,"joueur2");


@Test
public void Given_Scream_When_created_ThenDisplayHya(){
        System.out.println(hunt1.cri());
        assertEquals("Hya", hunt1.cri());
}
@Test
public void Given_NormalAttack_When_Hunt2Turn_Then_damageDoneAreOk(){
    hunt2.normalAttack(hunt1);
    assertEquals(45, hunt2.getHealth());
    assertEquals(41, hunt1.getHealth());
}
@Test
    public void Given_SpecialAttack_When_Hunt1Turn_Then_newAgilityIsOk(){
    hunt1.specialAttack(hunt1);
    assertEquals(15, hunt1.getAgility());
}
}