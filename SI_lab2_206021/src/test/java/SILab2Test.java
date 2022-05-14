import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List

import static org.junit.jupiter.api.Assertions.*;

class SILab2Test {

    public List<String> generateString(String ... elems){
        return new ArrayList<>(Arrays.asList(elems));
    }
    @Test
    public void everyStatement(){
        IllegalArgumentException ex;
        ex = assertThrows(IllegalArgumentException.class, ()->SILab2.function(generateString()));
        assertTrue(ex.getMessage().contains("List length should be greater than 0"));

        ex = assertThrows(IllegalArgumentException.class, ()->SILab2.function(generateString("0", "0")));
        assertTrue(ex.getMessage().contains("List length should be a perfect square"));

        assertEquals(generateString("2", "#", "#","#", "4", "#","#", "#", "#" ), SILab2.function(generateString("0", "#", "#","#", "0", "#","#", "#", "#" )));
    }

    @Test
    public void everyBranch(){
        IllegalArgumentException ex;
        ex = assertThrows(IllegalArgumentException.class, ()->SILab2.function(generateString()));
        assertTrue(ex.getMessage().contains("List length should be greater than 0"));

        ex = assertThrows(IllegalArgumentException.class, ()->SILab2.function(generateString("0", "0")));
        assertTrue(ex.getMessage().contains("List length should be a perfect square"));

        assertEquals(generateString("#", "#", "#","2", "#", "#","4", "#", "#", "#", "#","#","#", "#","2","1"),
                SILab2.function(generateString("#", "#", "#","0", "#", "#","0", "#", "#", "#", "#","#","#", "#","0","0")));
    }
}