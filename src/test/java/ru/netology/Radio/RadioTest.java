package ru.netology.Radio;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    //работа с радиостанциями
    @Test
    public void shouldSetStationNumber() {
        Radio number = new Radio();
        number.radioStationNumber = 1;

        int expected = 1;
        int actual = number.radioStationNumber;
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldSetToMoreStationNumber() {
        Radio number = new Radio();
        number.setRadioStationNumber(10);

        int expected = 0;
        int actual = number.radioStationNumber;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetToNormalStationNumber() {
        Radio number = new Radio();
        number.setRadioStationNumber(5);

        int expected = 5;
        int actual = number.radioStationNumber;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetToNextStationNumberNormal() {
        Radio number = new Radio();
        number.next(5);

        int expected = 6;
        int actual = number.radioStationNumber;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetToNext1StationNumber() {
        Radio number = new Radio();
        number.next(9);

        int expected = 0;
        int actual = number.radioStationNumber;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetToPrevStationNumber() {
        Radio number = new Radio();
        number.prev(0);

        int expected = 9;
        int actual = number.radioStationNumber;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetToPrev1StationNumber() {
        Radio number = new Radio();
        number.prev(3);

        int expected = 2;
        int actual = number.radioStationNumber;
        Assertions.assertEquals(expected, actual);
    }


    //работа с уровнем громкости звука

    @Test
    public void shouldSetSoundVolume() {
        Radio volume = new Radio();
        volume.soundVolume = 100;

        int expected = 100;
        int actual = volume.soundVolume;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetLessSoundVolume() {
        Radio volume = new Radio();
        volume.setSoundVolume(0);

        int expected = 0;
        int actual = volume.soundVolume;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNormalSoundVolume() {
        Radio volume = new Radio();
        volume.setSoundVolume(50);

        int expected = 50;
        int actual = volume.soundVolume;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNormalSoundVolume3() {
        Radio volume = new Radio();
        volume.setSoundVolume(101);

        int expected = 100;
        int actual = volume.soundVolume;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetIncreaseVolume() {
        Radio volume = new Radio();
        volume.increaseVolume(100);

        int expected = 100;
        int actual = volume.soundVolume;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetIncreaseVolume1() {
        Radio volume = new Radio();
        volume.increaseVolume(50);

        int expected = 51;
        int actual = volume.soundVolume;
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldSetLowerVolume() {
        Radio volume = new Radio();
        volume.lowerVolume(0);

        int expected = 0;
        int actual = volume.soundVolume;
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldSetLowerVolume1() {
        Radio volume = new Radio();
        volume.lowerVolume(100);

        int expected = 99;
        int actual = volume.soundVolume;
        Assertions.assertEquals(expected, actual);

    }


}
