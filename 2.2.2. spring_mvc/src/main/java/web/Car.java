package web;

public class Car {
    private String manufacturer;
    private String modelName;
    private String color;

    public Car(String manufacturer, String modelName, String color) {
        this.manufacturer = manufacturer;
        this.modelName = modelName;
        this.color = color;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
