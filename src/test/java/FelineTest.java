import com.example.Feline;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class FelineTest {

    @Test
    public void eatMeatFelineZeroArgument () throws Exception {
        Feline feline = new Feline();
        Assert.assertEquals(feline.getFood("Хищник"), feline.eatMeat());
    }

    @Test
    public void getFoodFelineWithPredatorArgument () throws Exception {
        Feline feline = new Feline();
        Assert.assertEquals(List.of("Животные", "Птицы", "Рыба"), feline.getFood("Хищник"));
    }

    @Test
    public void getFamilyFelineReturnsFelineValue (){
        Feline feline = new Feline ();
        Assert.assertEquals("Кошачьи", feline.getFamily());
    }

    @Test
    public void getKittensFelineZeroArgument (){
        Feline feline = new Feline ();
        Assert.assertEquals(1, feline.getKittens());
    }
}
