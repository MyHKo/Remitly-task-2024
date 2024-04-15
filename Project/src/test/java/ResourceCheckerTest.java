import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ResourceCheckerTest {

    @Test
    public void ValidInput() throws Exception{
        Assertions.assertEquals(Main.checkResources("./test-inputs/Valid_Input.json"),true);
    }

    @Test
    public void InvalidInputMoreStars() throws Exception{
        Assertions.assertEquals(Main.checkResources("./test-inputs/Invalid_Input_More_Stars.json"),false);
    }

    @Test
    public void InvalidInputNoStars() throws Exception{
        Assertions.assertEquals(Main.checkResources("./test-inputs/Invalid_Input_No_Stars.json"),false);
    }
}
