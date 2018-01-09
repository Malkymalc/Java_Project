package codeclan.com.dyel;

/**
 * Created by user on 06/01/2018.
 */

public class Exercise {
    private String name;
    private Enum<MovementPattern> movementPatternEnum;
    private Enum<Equipment> equipmentEnum;

    public Exercise(String name, Enum<MovementPattern> movementPatternEnum, Enum<Equipment> equipmentEnum) {
        this.name = name;
        this.movementPatternEnum = movementPatternEnum;
        this.equipmentEnum = equipmentEnum;
    }



//    Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Enum<MovementPattern> getMovementPatternEnum() {
        return movementPatternEnum;
    }

    public void setMovementPatternEnum(Enum<MovementPattern> movementPatternEnum) {
        this.movementPatternEnum = movementPatternEnum;
    }

    public Enum<Equipment> getEquipmentEnum() {
        return equipmentEnum;
    }

    public void setEquipmentEnum(Enum<Equipment> equipmentEnum) {
        this.equipmentEnum = equipmentEnum;
    }

    public String getMovementPatternSub() {
        return MovementPattern.values().toString();
    }
}
