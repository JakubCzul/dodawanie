package org.example.dodawanie;

import static org.junit.Assert.*;
public class DodawanieApplicationTests {

    @org.junit.Test
    public void added(){
        DodawanieApplication dodawanieApplication = new DodawanieApplication();
        assertEquals(10,dodawanieApplication.added(5,5));
    }

}
