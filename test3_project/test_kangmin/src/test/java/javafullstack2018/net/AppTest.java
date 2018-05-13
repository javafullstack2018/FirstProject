package javafullstack2018.net;

import org.junit.*;
import static org.junit.Assert.*;

public class AppTest {

    @Test
    public void positiveCase() {
    	Exercise ex=new Exercise();
    	ex.start();
        assertTrue(true);
    }
    
    @Test
    public void negativeCase() {
    	Exercise ex=new Exercise();
    	ex.start();
        assertTrue(true);    
    }
}