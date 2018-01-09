package codeclan.com.dyel;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;

/**
 * Created by user on 09/01/2018.
 */

class SetRepScheme {
    private String name;
    private ArrayList<Set> sets;

    public SetRepScheme(String name, Set... args) {
        this.name = name;
        this.sets = new ArrayList<>();
        Collections.addAll(sets, args);
    }

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    public ArrayList<Set> getSets() { return sets; }

    public void addSet(int index, Set newSet) {
        sets.add(index, newSet);
    }
}
