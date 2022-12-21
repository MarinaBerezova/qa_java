import com.example.Cat;
import com.example.Feline;
import com.example.Predator;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class CatTest {

    @Mock
    Feline feline;

    @Mock
    Predator predator;

    @Test
    public void getSoundCatReturnsCorrectValue (){
        Cat cat = new Cat (feline);
        Assert.assertEquals("Мяу", cat.getSound());
    }

    @Test
    public void getFoodCatZeroArgument () throws Exception {
        Cat cat = new Cat (feline);
        predator = feline;
        Mockito.when(predator.eatMeat()).thenReturn(List.of("Животные1", "Птицы1", "Рыба1"));
        Assert.assertEquals(predator.eatMeat(), cat.getFood());
    }
}
