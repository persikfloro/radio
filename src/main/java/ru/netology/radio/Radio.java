package ru.netology.radio;

public class Radio {
    private int radioStation; //радиостанции
    private int currentVolume; // громкость радио

    public int getRadioStation() {
        return radioStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    // Переключение радиостанций

    public void radioStationNext(int newRadioStation) {
        if (radioStation < 0) {
            radioStation = radioStation + 1;
        }
        if (radioStation >= 9) {
            return;
        }
        radioStation = newRadioStation;
    }

    public void radioStationPrev(int newRadioStation) {
        if (radioStation < 0) {
            radioStation = radioStation + 1;
        }
        if (currentVolume > 9) {
            radioStation = 9;
        }
        radioStation = newRadioStation;
    }

    public void setCurrentRadioStation(int newRadioStation) {
        if (newRadioStation < 0) {
            return;
        }
        if (newRadioStation > 9) {
            return;
        }
        radioStation = newRadioStation;
    }

    // Увеличение и уменьшение громкости

    public void increaseVolume(int newCurrentVolume) {
        if (currentVolume < 10) {
            currentVolume = currentVolume + 1;
        }
        if (currentVolume >= 10) {
            return;
        }
        currentVolume = newCurrentVolume;
    }

    public void decreaseVolume(int newCurrentVolume) {
        if (currentVolume < 0) {
            return;
        }
        currentVolume = newCurrentVolume;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < 0) {
            return;
        }
        if (newCurrentVolume > 10) {
            return;
        }
        currentVolume = newCurrentVolume;
    }
}