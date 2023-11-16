package ru.netology.Radio;


public class Radio {
    private int radioStationNumber;
    private int soundVolume;
    private int maxRadioStationNumber;

    //работа с радиостанциями

    public Radio() {
        this.maxRadioStationNumber = 9;
    }

    public Radio(int radioStationNumber) {
        this.maxRadioStationNumber = radioStationNumber - 1;
    }

    public int getRadioStationNumber() {
        return radioStationNumber;
    }

    public void setRadioStationNumber(int radioStationNumber) {
        if (radioStationNumber < 0) {
            return;
        }
        if (radioStationNumber > maxRadioStationNumber) {
            return;
        }
        this.radioStationNumber = radioStationNumber;
    }

    public void next() {
        if (radioStationNumber != maxRadioStationNumber) {
            radioStationNumber++;
        } else {
            radioStationNumber = 0;
        }
    }

    public void prev() {
        if (radioStationNumber != 0) {
            radioStationNumber--;
        } else {
            radioStationNumber = maxRadioStationNumber;
        }
    }


    //работа с уровнем громкости звука

    public int getSoundVolume() {
        return soundVolume;
    }

    public void setSoundVolume(int soundVolume) {
        if (100 < soundVolume) {
            return;
        }
        if (soundVolume < 0) {
            return;
        }
        this.soundVolume = soundVolume;
    }

    public void increaseVolume() {
        if (soundVolume < 100) {
            soundVolume++;
        }
    }

    public void lowerVolume() {
        if (soundVolume > 0) {
            soundVolume = soundVolume - 1;
        }
    }
}