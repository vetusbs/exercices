
import org.junit.Test;

import com.vetus.tdd.rotatearray.RotateArray;

import static org.junit.Assert.assertEquals;

public class RotateArrayTest {

    @Test public void shouldReturnSameArrayWhenNIsZero() {
        RotateArray rotateArray = new RotateArray(0, 7);

        int[] rotatedArray = rotateArray.rotate();

        assertEquals(rotatedArray.length, 0);
    }

    @Test public void shouldReturnArrayWithSingleItemWhenNIsOne() {
        RotateArray rotateArray = new RotateArray(1,5);

        int[] rotatedArray = rotateArray.rotate();

        assertEquals(rotatedArray[0], 1);
    }

}
