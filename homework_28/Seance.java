package homework_28;

import java.util.Objects;

public class Seance implements Comparable<Seance> {

    Movie movie;
    Time startTime;
    Time endTime;

    public Seance(Movie movie, Time startTime) throws Exception {
        this.movie = movie;
        this.startTime = startTime;
        this.endTime = endTime(startTime, movie.getDuration());
    }

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    public Time getStartTime() {
        return startTime;
    }

    public void setStartTime(Time startTime) {
        this.startTime = startTime;
    }

    public Time getEndTime() {
        return endTime;
    }

    public void setEndTime(Time endTime) {
        this.endTime = endTime;
    }

    Time endTime(Time time, Time time1) throws Exception {
        int resMin = time.getMin() + time1.getMin();
        int resHour = time.getHour() + time1.getHour();

        if (resMin >= 60) {
            resHour += 1;
            resMin -= 60;
        }
        if (resHour >= 24) {
            resHour -= 24;
        }

        return new Time(resHour, resMin);
    }
    
    @Override
    public int compareTo(Seance t) {
        return this.startTime.getHour() - t.startTime.getHour();
    }

    @Override
    public String toString() {
        return "Seance { " + "movie = " + movie + ", startTime = " + startTime + ", endTime = " + endTime + " }";
    }

}
