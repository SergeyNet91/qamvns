package org.example;

public class Radio {
    public int maxStation = 9;
    public int minStation = 0;
    public int maxVolume = 100;
    public int minVolume = 0;
    public int currentStation = minStation; // min
    public int currentVolume = minVolume; // min

    public Radio() {
    }

    public Radio(int amountStations) {
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation < minStation) {
            return;
        }
        if (currentStation > maxStation) {
            return;
        }

        this.currentStation = currentStation;
    }

    public void nextRadioStation() {

        if (currentStation != maxStation) {
            currentStation++;
        } else {
            currentStation = minStation;
        }


    }

    public void stepBackRadioStation() {

        if (currentStation != minStation) {
            currentStation--;
        } else {
            currentStation = maxStation;
        }
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < minVolume) {
            return;
        }
        if (newCurrentVolume > maxVolume) {
            return;
        }
        currentVolume = newCurrentVolume;

    }

    public void increaseVolume() {
        if (currentVolume < maxVolume) {
            currentVolume++;
        }
    }

    public void reduceVolume() {
        if (currentVolume > minVolume) {
            currentVolume--;
        }
    }

}
