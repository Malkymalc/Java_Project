package codeclan.com.dyel;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by user on 07/01/2018.
 */

public class Workout {
    String name;
    LocalDateTime start;
    LocalDateTime end;
    String notes;
    ArrayList<Lift> lifts;
    Integer number;

    public Workout(String name, Lift...args) {
        this.name = name;
        this.notes = "";
        this.lifts = new ArrayList<>();
        Collections.addAll(lifts, args);
    }


    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public Integer getNumber() {return number;}
    public void setNumber(Integer number) {this.number = number;}


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
        //new up new workout based on work done
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
