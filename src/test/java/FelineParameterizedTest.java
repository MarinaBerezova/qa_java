import com.example.Feline;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class FelineParameterizedTest {

    private final int kittensCount;

    public FelineParameterizedTest (int kittensCount){
        this.kittensCount = kittensCount;
    }

    @Parameterized.Parameters
    public static Object[][] getKittensCount() {
        return new Object[][]{
                {-1},
                {0},
                {1},
                {5},
                {12},
        };
    }

    @Test
    public void getKittensFelineReturnsKittensCount (){
        Feline feline = new Feline();
        Assert.assertEquals(kittensCount, feline.getKittens(kittensCount));
    }

}
