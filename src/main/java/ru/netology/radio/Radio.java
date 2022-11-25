package ru.netology.radio;

public class Radio {
    private int radioStation; //радиостанция
    private int currentVolume; // громкость

    public int getRadioStation() {
        return radioStation;
    }

    public int getVolume() {
        return currentVolume;
    }

    public int setCurrentRadioStation(int newRadioStation) {
        if (newRadioStation <= 0) {
            newRadioStation = 0;
        }
        if (newRadioStation > 9) {
            return 9;
        }
        radioStation = newRadioStation;
        return newRadioStation;
    }

    public void radioStationNext() {
        if (radioStation < 9) {
            radioStation++;
        } else {
            radioStation = 0;
        }
    }

    public void radioStationPrev() {
        if (radioStation > 0) {
            radioStation--;
        } else {
            radioStation = 9;
        }
    }

    public int setCurrentVolume(int newVolume) {
        if (newVolume < 0) {
            return 0;
        }
        if (newVolume > 10) {
            return 10;
        }
        currentVolume = newVolume;
        return newVolume;
    }

    public void increaseVolume() {
        if (currentVolume < 10) {
            currentVolume++;
        } else {
        currentVolume = 10;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume--;
        } else {
            currentVolume = 0;
        }
    }

}
