package homework_28;

import java.util.Set;
import java.util.TreeSet;

public class Schedule {

    Set<Seance> seances = new TreeSet<>();

    Schedule(Set<Seance> seances) {
        this.seances = seances;
    }

    Schedule() {
    }

    public Set<Seance> getSeances() {
        return seances;
    }

    public void setSeances(Set<Seance> seances) {
        this.seances = seances;
    }

    public void addSeance(Seance seance) {
        seances.add(seance);
        System.out.println(seance + " додано.");
    }

    public void removeSeance(Seance seance) {
        seances.remove(seance);
        System.out.println(seance + " видалено.");
    }

    @Override
    public String toString() {
        return "Schedule { " + "seances = " + seances + " }";
    }

}
