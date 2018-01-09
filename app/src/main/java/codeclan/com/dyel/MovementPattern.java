package codeclan.com.dyel;

/**
 * Created by user on 06/01/2018.
 */

public enum MovementPattern {
    SQUAT("Lower Body"),
    HINGE("Lower Body"),
    HORIZONTAL_PUSH("Upper Body"),
    VERTICAL_PUSH("Upper Body"),
    HORIZONTAL_PULL("Upper Body"),
    VERTICAL_PULL("Upper Body"),
    LOADED_CARRY("Finisher"),
    ABZ("Brosesh"),
    GUNZ("Brosesh"),
    WARMUP("Foofoo");


    private final String subCategory;

    MovementPattern(String subCategory) {
        this.subCategory = subCategory;
    }

    public String getSubCategory() {
        return subCategory;
    }
}
