/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package machinetoolstore.core.model;

import java.util.Objects;

/**
 *
 * @author main
 */
public class CompareWrapper {
    private final int id;
    private final String type;
    private final String model;
    private final String brand;
    private final String manufacturer;
    private final String machineState;
    private final int yearOfIssue;
    private final String location;
    private final int materialThickness;
    private final int materialWidth;
    private final double bendingSpeed;
    private final int minDiameterMaxBend;
    private final int topRollDiameter;
    private final int middleRollDiameter;
    private final int distanceOfBottomTwoRolls;
    private final int materialProofStress;
    private final double mainEnginePower;
    private final String machineDimensions;
    private final int machineWeight;
    private final int machinePrice;
    private final String mainPhoto;

    public CompareWrapper(int id, String type, String model, String brand, String manufacturer, String machineState, int yearOfIssue, String location, int materialThickness, int materialWidth, double bendingSpeed, int minDiameterMaxBend, int topRollDiameter, int middleRollDiameter, int distanceOfBottomTwoRolls, int materialProofStress, double mainEnginePower, String machineDimensions, int machineWeight, int machinePrice, String mainPhoto) {
        this.id = id;
        this.type = type;
        this.model = model;
        this.brand = brand;
        this.manufacturer = manufacturer;
        this.machineState = machineState;
        this.yearOfIssue = yearOfIssue;
        this.location = location;
        this.materialThickness = materialThickness;
        this.materialWidth = materialWidth;
        this.bendingSpeed = bendingSpeed;
        this.minDiameterMaxBend = minDiameterMaxBend;
        this.topRollDiameter = topRollDiameter;
        this.middleRollDiameter = middleRollDiameter;
        this.distanceOfBottomTwoRolls = distanceOfBottomTwoRolls;
        this.materialProofStress = materialProofStress;
        this.mainEnginePower = mainEnginePower;
        this.machineDimensions = machineDimensions;
        this.machineWeight = machineWeight;
        this.machinePrice = machinePrice;
        this.mainPhoto = mainPhoto;
    }

    public Integer getId() {
        return id;
    }
    
    public String getType() {
        return type;
    }

    public String getModel() {
        return model;
    }

    public String getBrand() {
        return brand;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getMachineState() {
        return machineState;
    }

    public Integer getYearOfIssue() {
        return yearOfIssue;
    }

    public String getLocation() {
        return location;
    }

    public Integer getMaterialThickness() {
        return materialThickness;
    }

    public Integer getMaterialWidth() {
        return materialWidth;
    }

    public Double getBendingSpeed() {
        return bendingSpeed;
    }

    public Integer getMinDiameterMaxBend() {
        return minDiameterMaxBend;
    }

    public Integer getTopRollDiameter() {
        return topRollDiameter;
    }

    public Integer getMiddleRollDiameter() {
        return middleRollDiameter;
    }

    public Integer getDistanceOfBottomTwoRolls() {
        return distanceOfBottomTwoRolls;
    }

    public Integer getMaterialProofStress() {
        return materialProofStress;
    }

    public Double getMainEnginePower() {
        return mainEnginePower;
    }

    public String getMachineDimensions() {
        return machineDimensions;
    }

    public Integer getMachineWeight() {
        return machineWeight;
    }

    public Integer getMachinePrice() {
        return machinePrice;
    }

    public String getMainPhoto() {
        return mainPhoto;
    }
    
    @Override
    public String toString() {
        return "CompareWrapper{" + "id=" + id +  ", type=" 
                + type + ", model=" + model + ", brand=" + brand + ", manufacturer=" 
                + manufacturer + ", machineState=" + machineState + ", yearOfIssue=" 
                + yearOfIssue + ", location=" + location + ", materialThickness=" + materialThickness 
                + ", materialWidth="+ materialWidth + ", bendingSpeed=" + bendingSpeed + ", minDiameterMaxBend=" 
                + minDiameterMaxBend + ", topRollDiameter=" + topRollDiameter 
                + ", middleRollDiameter=" + middleRollDiameter + ", distanceOfBottomTwoRolls=" 
                + distanceOfBottomTwoRolls + ", materialProofStress=" + materialProofStress 
                + ", mainEnginePower=" + mainEnginePower + ", machineDimensions=" 
                + machineDimensions + ", machineWeight=" + machineWeight + ", machinePrice=" 
                + machinePrice + ", mainPhoto=" + mainPhoto + '}';
    }
}
