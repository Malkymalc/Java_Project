package codeclan.com.dyel;

/**
 * Created by user on 09/01/2018.
 */

public class Reps {
    private String name;
    private int repNumber;
    private Boolean amrap;
    private Boolean plus;

    public Reps(String name, int repNumber, Boolean amrap, Boolean plus) {
        this.name = name;
        this.repNumber = repNumber;
        this.amrap = amrap;
        this.plus = plus;
    }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public int getRepNumber() { return repNumber; }
    public void setRepNumber(int repNumber) { this.repNumber = repNumber; }

    public Boolean getAmrap() { return amrap; }
    public void setAmrap(Boolean amrap) { this.amrap = amrap; }

    public Boolean getPlus() { return plus; }
    public void setPlus(Boolean plus) { this.plus = plus; }

}
