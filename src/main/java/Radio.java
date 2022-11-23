public class Radio {
    private int radioStation;
    private int currentVolume;

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < 0) {
            return;
        }
        if (newCurrentVolume > 30) {
            return;
        }
        currentVolume = newCurrentVolume;
    }

    public void increaseVolume() {
        int target = currentVolume * 3 / 2;
        setCurrentVolume(target);
    }

    public void setToMaxVolume() {
        currentVolume = 30;
    }

}
