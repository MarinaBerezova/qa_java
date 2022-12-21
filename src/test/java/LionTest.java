import com.example.Feline;
import com.example.Lion;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class LionTest {

    @Mock
    Feline feline;

    @Test
    public void getKittensLionZeroArgument () throws Exception {
        Lion lion = new Lion ("Самка", feline);
        Mockito.when(feline.getKittens()).thenReturn(2);
        Assert.assertEquals(feline.getKittens(), lion.getKittens());
    }

    @Test
    public void getFoodLionZeroArgument () throws Exception {
        Lion lion = new Lion ("Самец", feline);
        Mockito.when(feline.getFood("Хищник")).thenReturn(List.of("Животные1", "Птицы1", "Рыба1"));
        assertEquals(feline.getFood("Хищник"), lion.getFood());
    }
}
