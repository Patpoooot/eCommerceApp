import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import features.productManagement.Computer;

class SmokeTest {

    @Test
    void computerKeepsItsLabel() {
        Computer computer = new Computer("asus-124", "dummu description", 25, 10, 1500, "i5", "gtx1050", "16gb");

        assertEquals("asus-124", computer.getProductLabel());
    }
}
