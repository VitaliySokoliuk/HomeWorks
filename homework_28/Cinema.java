package homework_28;

import java.util.*;

public class Cinema {

    TreeMap<Days, Schedule> schedules;
    ArrayList<Movie> moviesLibrary = new ArrayList<>();
    Time open;
    Time close;

    public Cinema(TreeMap<Days, Schedule> schedules, Time open, Time close) {
        this.schedules = schedules;
        this.open = open;
        this.close = close;
    }

    public Time getOpen() {
        return open;
    }

    public void setOpen(Time open) {
        this.open = open;
    }

    public Time getClose() {
        return close;
    }

    public void setClose(Time close) {
        this.close = close;
    }

    @Override
    public String toString() {
        return "Cinema { " + "schedules = " + schedules + ", moviesLibrary = " + moviesLibrary + ", open = " + open + ", close = " + close + " }";
    }

    public void addMovie(Movie movie) {
        moviesLibrary.add(movie);
        System.out.println(movie + " додано.");
    }

    public void addSeance(Seance seance, String day) {
        for (Days dayOfWeek : Days.values()) {
            if (dayOfWeek.name().equalsIgnoreCase(day)) {
                if (schedules.containsKey(dayOfWeek)) {
                    Schedule sched = schedules.get(dayOfWeek);
                    sched.addSeance(seance);
                    System.out.println(seance.toString() + " додано.");
                } else {
                    schedules.put(dayOfWeek, new Schedule(new TreeSet<>()));
                    Schedule schedule = schedules.get(dayOfWeek);
                    schedule.addSeance(seance);
                }
            }
        }
    }

    public void removeMovie(Movie movie) {
        Iterator<Movie> it = moviesLibrary.iterator();
        while (it.hasNext()) {
            Movie next = it.next();
            if (next.getTitle().equalsIgnoreCase(movie.getTitle())) {
                it.remove();
            }
        }
        for (Days dayOfWeek : Days.values()) {
            if (schedules.containsKey(dayOfWeek)) {
                Schedule sched = schedules.get(dayOfWeek);
                Iterator<Seance> it2 = sched.getSeances().iterator();
                while (it2.hasNext()) {
                    Seance next = it2.next();
                    Movie movie1 = next.getMovie();
                    if (movie1.getTitle().equalsIgnoreCase(movie.getTitle())) {
                        it2.remove();
                        System.out.println("Видалено фільм і сеанси.");
                    }
                }
            }
        }
    }

    public void removeSeance(Seance seance, String day) {
        for (Days dayOfWeek : Days.values()) {
            if (dayOfWeek.name().equalsIgnoreCase(day)) {
                Schedule sched = schedules.get(dayOfWeek);
                sched.removeSeance(seance);
                System.out.println(seance.toString() + " видалено.");
            }
        }
    }

    public void showAllMoviesLibrary() {
        System.out.println("Всі фільми, які доступні в кінотеатрі: ");
        moviesLibrary.forEach((movie) -> {
            System.out.println(movie);
        });
    }

    public void showScheduleOfTheDay(String day) {
        Arrays.asList(Days.values()).stream().filter((dayOfWeek)
                -> (dayOfWeek.name().equalsIgnoreCase(day))).map((dayOfWeek)
                -> schedules.get(dayOfWeek)).map((sched)
                -> sched.getSeances()).map((seances)
                -> seances.iterator()).forEachOrdered((it3) -> {
            while (it3.hasNext()) {
                Seance next = it3.next();
                System.out.println(next.toString());
            }
        });
    }

    public void showAllSchedule() {
        Iterator<Map.Entry<Days, Schedule>> it = schedules.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<Days, Schedule> next = it.next();
            System.out.println(next.toString());
        }
    }

}
