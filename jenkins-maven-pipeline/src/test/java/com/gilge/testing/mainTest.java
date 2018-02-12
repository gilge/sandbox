package com.gilge.testing;

import org.junit.jupiter.api.*;

class mainTest {

    public Suz722 fB;

    @BeforeEach
    public void setUp() {
        fB = new Suz722();
    }

    @DisplayName("Play Suz722 with number = 1")
    @Test
    public void testNumber() {
        String Suz722 = fB.play(1);
        Assertions.assertEquals(Suz722, "1");
    }
	
    @AfterEach
    public void tearDown() {
        fB = null;
    }
	
}