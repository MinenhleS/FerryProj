import org.junit.jupiter.api.Test;
import AnyPack.Ferry;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FerryTest {

//    private Ferry objets;

    @Test

    public void ShoulReturnNUmOfPeople(){
        Ferry obje =  new Ferry(30, 70);
        System.out.printf("ferry value is: %s", obje.getNumOfPeople());
        assertEquals(70,obje.getNumOfPeople());
    }

    @Test
    public void ShoulReturnNUmOfCars(){
        Ferry obje =  new Ferry(30, 70);
        System.out.printf("ferry value is: %s", obje.getNumOfCars());
        assertEquals(30,obje.getNumOfCars());
    }

    @Test
    public void ShoulReturnAccepctedBoard(){
        Ferry obje =  new Ferry(30, 70);
        System.out.printf("ferry value is: %s", obje.board());
        assertEquals("Accepted!",obje.board());
    }
//    @Test
//    public void ShoulReturnRejectedBoard(){
//        Ferry obje =  new Ferry(130, 270);
//        System.out.printf("ferry value is: %s", obje.board());
//        assertEquals("Rejected!",obje.board());
//    }
}
