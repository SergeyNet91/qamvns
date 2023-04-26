package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
    public void shoudSetRadioStation() {
        Radio radio = new Radio();

        radio.setCurrentStation(4);

        int expected = 4;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shoudSetRadioStation1() {
        Radio radio = new Radio();

        radio.setCurrentStation(16);

        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shoudSetRadioStation2() {
        Radio radio = new Radio();

        radio.setCurrentStation(-25);

        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shoudSetRadioStation3() {
        Radio radio = new Radio();

        radio.setCurrentStation(-1);

        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shoudSetRadioStation4() {
        Radio radio = new Radio();

        radio.setCurrentStation(0);

        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shoudSetRadioStation5() {
        Radio radio = new Radio();

        radio.setCurrentStation(1);

        int expected = 1;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void mooveBackLessThanMinRadioStation() {
        Radio stat = new Radio();
        stat.setCurrentStation(-1);
        int expected = 0;
        int actual = stat.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shoudSetRadioStation6() {
        Radio radio = new Radio();

        radio.setCurrentStation(8);

        int expected = 8;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shoudSetRadioStation7() {
        Radio radio = new Radio();

        radio.setCurrentStation(9);

        int expected = 9;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shoudSetMaxRadioStation() {
        Radio radio = new Radio();

        radio.setCurrentStation(10);

        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void mooveNextRadioStation() {
        Radio stat = new Radio();
        stat.setCurrentStation(9);
        stat.next();
        int expected = 0;
        int actual = stat.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void mooveBackStation() {
        Radio stat = new Radio();
        stat.setCurrentStation(0);
        stat.stepBackRadioStation();
        int expected = 9;
        int actual = stat.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void mooveBackLessStation() {
        Radio stat = new Radio();
        stat.setCurrentStation(8);
        stat.stepBackRadioStation();
        int expected = 7;
        int actual = stat.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void mooveNextRadioStationPluse() {
        Radio stat = new Radio();
        stat.setCurrentStation(7);
        stat.next();
        int expected = 8;
        int actual = stat.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolume() {
        Radio stat = new Radio();
        stat.setCurrentVolume(5);
        int expected = 5;
        int actual = stat.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetBelowMinVolume() {
        Radio stat = new Radio();
        stat.setCurrentVolume(-1);
        int expected = 0;
        int actual = stat.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetHigherMaxVolume() {
        Radio stat = new Radio();
        stat.setCurrentVolume(101);
        int expected = 0;
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
        stat.setCurrentVolume(100);
        stat.increaseVolume();
        int expected = 100;
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
        stat.setCurrentVolume(0);
        stat.reduceVolume();
        int expected = 0;
        int actual = stat.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

}