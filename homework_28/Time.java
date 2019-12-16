package homework_28;

public class Time {

    int min;
    int hour;

    Time(int hour, int min) throws Exception {
        if (min >= 0 && min < 60 && hour >= 0 && hour < 24) {
            this.min = min;
            this.hour = hour;
        } else {
            throw new Exception("Некоректно введена дата або час");
        }
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    @Override
    public String toString() {
        return "Time { " + "min = " + min + ", hour = " + hour + " }";
    }

}
