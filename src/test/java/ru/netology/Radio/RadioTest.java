package ru.netology.Radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    //работа с радиостанциями
    @Test
    public void shouldSetStationNumber() {
        Radio number = new Radio();
        number.setRadioStationNumber(10);

        int expected = 0;
        int actual = number.getRadioStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetStationNumber2() {
        Radio number = new Radio();
        number.setRadioStationNumber(9);

        int expected = 9;
        int actual = number.getRadioStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetStationNumber3() {
        Radio number = new Radio();
        number.setRadioStationNumber(8);

        int expected = 8;
        int actual = number.getRadioStationNumber();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldSetStationNumber4() {
        Radio number = new Radio();
        number.setRadioStationNumber(-1);

        int expected = 0;
        int actual = number.getRadioStationNumber();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldSetStationNumber5() {
        Radio number = new Radio();
        number.setRadioStationNumber(0);

        int expected = 0;
        int actual = number.getRadioStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetStationNumber6() {
        Radio number = new Radio();
        number.setRadioStationNumber(1);

        int expected = 1;
        int actual = number.getRadioStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetToNextStationNumber() {
        Radio number = new Radio();
        number.setRadioStationNumber(0);
        number.next();

        int expected = 1;
        int actual = number.getRadioStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetToNextStationNumber2() {
        Radio number = new Radio();
        number.setRadioStationNumber(1);
        number.next();

        int expected = 2;
        int actual = number.getRadioStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetToNextStationNumber3() {
        Radio number = new Radio();
        number.setRadioStationNumber(8);
        number.next();

        int expected = 9;
        int actual = number.getRadioStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetToNextStationNumber4() {
        Radio number = new Radio();
        number.setRadioStationNumber(9);
        number.next();

        int expected = 0;
        int actual = number.getRadioStationNumber();
        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldSetToPrevStationNumber() {
        Radio number = new Radio();
        number.setRadioStationNumber(9);
        number.prev();

        int expected = 8;
        int actual = number.getRadioStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetToPrevStationNumber2() {
        Radio number = new Radio();
        number.setRadioStationNumber(8);
        number.prev();

        int expected = 7;
        int actual = number.getRadioStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetToPrevStationNumber3() {
        Radio number = new Radio();
        number.setRadioStationNumber(0);
        number.prev();

        int expected = 9;
        int actual = number.getRadioStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetToPrevStationNumber4() {
        Radio number = new Radio();
        number.setRadioStationNumber(1);
        number.prev();

        int expected = 0;
        int actual = number.getRadioStationNumber();
        Assertions.assertEquals(expected, actual);
    }


    //работа с уровнем громкости звука

    @Test
    public void shouldSetSoundVolume() {
        Radio volume = new Radio();
        volume.setSoundVolume(101);

        int expected = 0;
        int actual = volume.getSoundVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetSoundVolume2() {
        Radio volume = new Radio();
        volume.setSoundVolume(100);

        int expected = 100;
        int actual = volume.getSoundVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetSoundVolume3() {
        Radio volume = new Radio();
        volume.setSoundVolume(99);

        int expected = 99;
        int actual = volume.getSoundVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetSoundVolume4() {
        Radio volume = new Radio();
        volume.setSoundVolume(51);

        int expected = 51;
        int actual = volume.getSoundVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetSoundVolume5() {
        Radio volume = new Radio();
        volume.setSoundVolume(1);

        int expected = 1;
        int actual = volume.getSoundVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetSoundVolume6() {
        Radio volume = new Radio();
        volume.setSoundVolume(0);

        int expected = 0;
        int actual = volume.getSoundVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetSoundVolume7() {
        Radio volume = new Radio();
        volume.setSoundVolume(-1);

        int expected = 0;
        int actual = volume.getSoundVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetIncreaseVolume() {
        Radio volume = new Radio();
        volume.setSoundVolume(100);
        volume.increaseVolume();

        int expected = 100;
        int actual = volume.getSoundVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetIncreaseVolume2() {
        Radio volume = new Radio();
        volume.setSoundVolume(99);
        volume.increaseVolume();

        int expected = 100;
        int actual = volume.getSoundVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetLessSoundVolume() {
        Radio volume = new Radio();
        volume.setSoundVolume(0);
        volume.lowerVolume();

        int expected = 0;
        int actual = volume.getSoundVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetLessSoundVolume2() {
        Radio volume = new Radio();
        volume.setSoundVolume(1);
        volume.lowerVolume();

        int expected = 0;
        int actual = volume.getSoundVolume();
        Assertions.assertEquals(expected, actual);
    }
}


