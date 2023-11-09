package ru.netology.Radio;

public class Radio {
    //работа с радиостанциями
    public int radioStationNumber;

    public void setRadioStationNumber(int newRadioStationNumber) {
        if (newRadioStationNumber > 9) {
            return;
        }

        radioStationNumber = newRadioStationNumber;
    }

    public void next(int newRadioStationNumber) {
        if (newRadioStationNumber >= 9) {
            newRadioStationNumber = 0;
        } else {
            newRadioStationNumber++;
        }

        radioStationNumber = newRadioStationNumber;
    }

    public void prev(int newRadioStationNumber) {
        if (newRadioStationNumber <= 0) {
            newRadioStationNumber = 9;
        } else {
            newRadioStationNumber--;
        }

        radioStationNumber = newRadioStationNumber;
    }


    //работа с уровнем громкости звука

    public int soundVolume;

    public void setSoundVolume(int newSoundVolume) {
        if (newSoundVolume >= 100) {
            newSoundVolume = 100;
        }
        if (newSoundVolume < 1) {
            newSoundVolume = 0;
        }
        soundVolume = newSoundVolume;
    }

    public void increaseVolume(int newSoundVolume) {
        if (newSoundVolume < 100) {
            newSoundVolume++;
        } else {
            newSoundVolume = 100;
        }
        soundVolume = newSoundVolume;
    }

    public void lowerVolume(int newSoundVolume) {
        if (newSoundVolume < 1) {
            newSoundVolume = 0;
        } else {
            newSoundVolume--;
        }
        soundVolume = newSoundVolume;
    }
}

