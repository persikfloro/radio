package ru.netology.radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    @Test
    public void setRadioStationUnderLimit() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(-1);
        int expected = 0;
        int actual = radio.getRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setRadioStationWithin() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(7);

        int expected = 7;
        int actual = radio.getRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setRadioStationOverLimit() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(10);

        int expected = 0;
        int actual = radio.getRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void ShouldSetToMinStation() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(0);

        int expected = 0;
        int actual = radio.getRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void ShouldNotSetStationAboveMax() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(10);

        int expected = 0;
        int actual = radio.getRadioStation();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void ShouldNotSetRadioStationNegative() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(-1);

        int expected = 0;
        int actual = radio.getRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(7);

        int expected = 7;
        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void ShouldSetMaxVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(100);

        int expected = 100;
        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void ShouldSetMinVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(0);

        int expected = 0;
        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void ShouldNotSetVolumeOverLimit() {
        Radio radio = new Radio();

        int expected = 100;
        int actual = radio.setCurrentVolume(200);

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void ShouldNotSetVolumeUnderLimit() {
        Radio radio = new Radio();

        radio.setCurrentVolume(-1);

        int expected = 0;
        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(8);

        radio.increaseVolume();

        int expected = 9;
        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void ShouldNotIncreaseVolumeOverLimit() {
        Radio radio = new Radio();

        radio.setCurrentVolume(100);

        radio.increaseVolume();

        int expected = 100;
        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void ShouldDecreaseVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(99);

        radio.decreaseVolume();

        int expected = 98;
        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void ShouldNotDecreaseVolumeBelowLimit() {
        Radio radio = new Radio();

        radio.setCurrentVolume(0);

        radio.decreaseVolume();

        int expected = 0;
        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void SwitchNextStation() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(7);

        radio.radioStationNext();

        int expected = 8;
        int actual = radio.getRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void NotSwitchOverLimit() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(9);

        radio.radioStationNext();

        int expected = 0;
        int actual = radio.getRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void SwitchToPrevStation() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(8);

        radio.radioStationPrev();

        int expected = 7;
        int actual = radio.getRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void SwitchUnderLimitStation() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(0);

        radio.radioStationPrev();

        int expected = 9;
        int actual = radio.getRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void SetNewAllRadioStations() {
        Radio radio = new Radio(30);

        radio.setCurrentRadioStation(25);

        int expected = 25;
        int actual = radio.getRadioStation();

        Assertions.assertEquals(expected, actual);

    }

}
