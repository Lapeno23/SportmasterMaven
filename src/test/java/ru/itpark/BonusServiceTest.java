package ru.itpark;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BonusServiceTest {

    @Test
    void calculateBonus() {
        BonusService bonusService = new BonusService();
        assertEquals("Silver card", "Silver card");
        assertEquals(1050, bonusService.calculateBonus(15_000,45_000));
        assertEquals("Blue card", "Blue card");
        assertEquals(500, bonusService.calculateBonus(10_000, 4_000));
        assertEquals("Gold card", "Gold card");
        assertEquals(15_000, bonusService.calculateBonus(150_000, 40_000));
        assertEquals(0,bonusService.calculateBonus(0,0));
    }
}