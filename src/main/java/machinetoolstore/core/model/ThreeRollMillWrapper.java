/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package machinetoolstore.core.model;

/**
 *
 * @author main
 */
public class ThreeRollMillWrapper {
    
    private final int id;
    private final int commonId;
    private final String brand;
    private final String type;
    private final String model;
    private final int yearOfIssue;
    private final String location;
    private final String machineDimensions;
    private final String mainPhoto;
    private final int machinePrice;

    public ThreeRollMillWrapper(int id, int commonId, String brand, String type, String model, int yearOfIssue, String location, String machineDimensions, String mainPhoto, int machinePrice) {
        this.id = id;
        this.commonId = commonId;
        this.brand = brand;
        this.type = type;
        this.model = model;
        this.yearOfIssue = yearOfIssue;
        this.location = location;
        this.machineDimensions = machineDimensions;
        this.mainPhoto = mainPhoto;
        this.machinePrice = machinePrice;
    }

    public int getId() {
        return id;
    }

    public int getCommonId() {
        return commonId;
    }

    public String getBrand() {
        return brand;
    }

    public String getType() {
        return type;
    }

    public String getModel() {
        return model;
    }

    public int getYearOfIssue() {
        return yearOfIssue;
    }

    public String getLocation() {
        return location;
    }

    public String getMachineDimensions() {
        return machineDimensions;
    }

    public String getMainPhoto() {
        return mainPhoto;
    }

    public int getMachinePrice() {
        return machinePrice;
    }

    @Override
    public String toString() {
        return "ThreeRollMillWrapper{" + "id=" + id + ", commonId=" + commonId + ", brand=" + brand + ", type=" + type + ", model=" + model + ", yearOfIssue=" + yearOfIssue + ", location=" + location + ", machineDimensions=" + machineDimensions + ", mainPhoto=" + mainPhoto + ", machinePrice=" + machinePrice + "}\n";
    }
}
