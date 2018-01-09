package codeclan.com.dyel;

/**
 * Created by user on 09/01/2018.
 */

public class Set {
    private String name;
    private Reps reps;
    private Double intensity;

    public Set(String name, Reps reps, Double intensity) {
        this.name = name;
        this.reps = reps;
        this.intensity = intensity;
    }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public Reps getReps() {return reps; }
    public void addReps(Reps reps) { this.reps = reps; }

    public Double getIntensity() { return intensity;}
    public void setIntensity(Double intensity) { this.intensity = intensity; }


}
