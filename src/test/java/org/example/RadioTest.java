package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
    public void picAmountStation() {
        Radio stat = new Radio(9);
        stat.setCurrentStation(7);
        int expected = 7;
        int actual = stat.getCurrentStation(); //amount

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldSetRadioStation() {
        Radio stat = new Radio();
        stat.setCurrentStation(4);
        int expected = 4;
        int actual = stat.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetStation() {
        Radio stat = new Radio();
        stat.setCurrentStation(10);
        int expected = stat.minStation;
        int actual = stat.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetOver0RadioStation() {
        Radio stat = new Radio();
        stat.setCurrentStation(5);
        stat.nextRadioStation();
        int expected = 6;
        int actual = stat.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetOverMaxRadioStation() {
        Radio stat = new Radio();
        stat.setCurrentStation(stat.maxStation);
        stat.nextRadioStation();
        int expected = stat.minStation;
        int actual = stat.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void mooveNextRadioStation() {
        Radio stat = new Radio();
        stat.setCurrentStation(stat.maxStation);
        stat.nextRadioStation();
        int expected = stat.minStation;
        int actual = stat.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void mooveBackRadioStation() {
        Radio stat = new Radio();
        stat.setCurrentStation(stat.minStation);
        stat.stepBackRadioStation();
        int expected = stat.maxStation;
        int actual = stat.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void mooveBackLessThanMinRadioStation() {
        Radio stat = new Radio();
        stat.setCurrentStation(-1);
        int expected = stat.currentStation;
        int actual = stat.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void mooveBackLess9RadioStation() {
        Radio stat = new Radio();
        stat.setCurrentStation(8);
        stat.stepBackRadioStation();
        int expected = 7;
        int actual = stat.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldSetVolume() {
        Radio stat = new Radio();
        stat.setCurrentVolume(6);
        int expected = 6;
        int actual = stat.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetUnderMinVolume() {
        Radio stat = new Radio();
        stat.setCurrentVolume(-1);
        int expected = stat.minVolume;
        int actual = stat.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetOverMaxVolume() {
        Radio stat = new Radio();
        stat.setCurrentVolume(101);
        int expected = stat.minVolume;
        int actual = stat.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolume() {
        Radio stat = new Radio();
        stat.setCurrentVolume(3);
        stat.increaseVolume();
        int expected = 4;
        int actual = stat.getCurrentVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldIncreaseOverVolume() {
        Radio stat = new Radio();
        stat.setCurrentVolume(stat.maxVolume);
        stat.increaseVolume();
        int expected = stat.currentVolume;
        int actual = stat.getCurrentVolume();

        Assertions.assertEquals(expected, actual);

    }


    @Test
    public void shouldReduceVolume() {
        Radio stat = new Radio();
        stat.setCurrentVolume(3);
        stat.reduceVolume();
        int expected = 2;
        int actual = stat.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldReduceMinVolume() {
        Radio stat = new Radio();
        stat.setCurrentVolume(stat.minVolume);
        stat.reduceVolume();
        int expected = stat.currentVolume;
        int actual = stat.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

}