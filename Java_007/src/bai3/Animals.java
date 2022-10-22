package bai3;

public abstract class Animals implements IRuning {
    private String name;
    private String foodType;

    public Animals(){

    }

    public Animals(String name, String foodType) {
        this.name = name;
        this.foodType = foodType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFoodType() {
        return foodType;
    }

    public void setFoodType(String foodType) {
        this.foodType = foodType;
    }

    public abstract void showSound();

    @Override
    public void iRuning() {
        System.out.println("Aninmals is running! ");
    }

}
