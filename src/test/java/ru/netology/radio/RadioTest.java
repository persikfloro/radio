package ru.netology.radio;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    @Test
    public void RadioStation() {
        Radio cond = new Radio();

        cond.setCurrentRadioStation(8);

        int expected = 8;
        int actual = cond.getRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseVolume() {
        Radio cond = new Radio();

        cond.setCurrentVolume(6);

        int expected = 6;
        int actual = cond.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
}
