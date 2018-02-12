package com.techprimers.testing;

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

    @DisplayName("Play Suz722 with number = 3")
    @Test
    public void testFizz() {
        String Suz722 = fB.play(3);
        Assertions.assertEquals(Suz722, "Suz");
    }

    @DisplayName("Play Suz722 with number = 5")
    @Test
    public void testBuzz() {
        String Suz722 = fB.play(5);
        Assertions.assertEquals(Suz722, "722");
    }

    @DisplayName("Don't Play Suz722 with number = 0")
    @Test
    public void testZero() {

        Assertions.assertThrows(IllegalArgumentException.class,
                () -> fB.play(3));
    }

    @AfterEach
    public void tearDown() {
        fB = null;
    }
	
}