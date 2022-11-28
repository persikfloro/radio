package ru.netology.radio;

public class Radio {
    private int radioStation; // текущая радиостанция
    private int currentVolume; // текущая громкость
    private int lastRadioStation;

    public Radio() {
        lastRadioStation = 9;
    }

    public Radio(int allRadioStation) {
        lastRadioStation = allRadioStation - 1;
    }

    public int getRadioStation() {
        return radioStation;
    } // геттер текущей радиостанции

    public int getVolume() { // геттер текущей громкости
        return currentVolume;
    }


    public int setCurrentRadioStation(int newRadioStation) { // метод для установки текущей радиостанции
        if (newRadioStation <= 0) {
            return lastRadioStation;
        }
        if (newRadioStation > lastRadioStation) {
            return 0;
        }
        radioStation = newRadioStation;
        return newRadioStation;
    }

    public void radioStationNext() { // метод переключения на следующую радиостанцию
        if (radioStation < lastRadioStation) {
            radioStation++;
        } else {
            radioStation = 0;
        }
    }

    public void radioStationPrev() { // метод переключения на предыдущую радиостанцию
        if (radioStation > 0) {
            radioStation--;
        } else {
            radioStation = lastRadioStation;
        }
    }

    public int setCurrentVolume(int newVolume) {  // метод установки текущей громкости
        if (newVolume < 0) {
            return 0;
        }
        if (newVolume > 100) {
            return 100;
        }
        currentVolume = newVolume;
        return newVolume;
    }

    public int increaseVolume() { // метод увеличения громкости
        if (currentVolume < 100) {
            currentVolume++;
        } else {
            currentVolume = 100;
        }
        return currentVolume;
    }

    public int decreaseVolume() { // метод уменьшения громкости
        if (currentVolume > 0) {
            currentVolume--;
        } else {
            currentVolume = 0;
        }
        return currentVolume;
    }
}
