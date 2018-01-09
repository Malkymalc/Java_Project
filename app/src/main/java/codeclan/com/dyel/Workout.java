package codeclan.com.dyel;

import java.time.LocalDateTime;
import java.util.ArrayList;

/**
 * Created by user on 07/01/2018.
 */

public class Workout {
    String name;
    LocalDateTime start;
    LocalDateTime end;
    String notes;
    ArrayList<Lift> lifts;

    public Workout(String name) {
        this.name = name;
        this.notes = "";
        this.lifts = new ArrayList<>();
    }


    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

//    Time and Date Methods
    public LocalDateTime getStart() {
        return start;
    }
    public void setStart() {
        this.start = LocalDateTime.now();
    }
    public LocalDateTime getEnd() {
        return end;
    }
    public void setEnd() {
        this.end = LocalDateTime.now();
    }

//    Notes
    public String getNotes() {
        return notes;
    }
    public void addNote(String newNote) {
        notes += newNote;
    }

//    Lifts
    public ArrayList<Lift> getLifts() {
        return lifts;
    }
    public void addLift(ArrayList<Lift> lifts) {
        this.lifts = lifts;
    }
}
