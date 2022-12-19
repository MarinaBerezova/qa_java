import com.example.Feline;
import com.example.Lion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class LionTest {

    @Mock
    Feline feline;

    @Mock
    Lion lion;

    @Test
    public void getKittensLionZeroArgument (){
        lion.getKittens();
        Mockito.verify(lion, Mockito.times(1)).getKittens();
    }

    @Test
    public void getFoodLionWithPredatorArgument () throws Exception {
        Feline feline = new Feline();
        Lion lion = new Lion ("Самец", feline);
        assertEquals(feline.getFood("Хищник"), lion.getFood());
    }

    @Test
    public void doesHaveManeLionReturnsCorrectValue () throws Exception {
        Lion male = new Lion ("Самец", feline);
        assertTrue(male.doesHaveMane());
        Lion female = new Lion ("Самка", feline);
        assertFalse(female.doesHaveMane());
    }
}
