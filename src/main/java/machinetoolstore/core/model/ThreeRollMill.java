/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package machinetoolstore.core.model;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author main
 */
@Entity
@Table(name = "THREE_ROLL_MILL")
public class ThreeRollMill implements Serializable {
    
    @Id @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer id;
    
    @Column(name = "COMMON_ID", nullable = false)
    private Integer commonId;
    
    @Column(name = "TYPE", nullable = false)
    private String type;
    
    @Column(name = "MODEL", nullable = false)
    private String model;
    
    @Column(name = "BRAND", nullable = false)
    private String brand;
    
    @Column(name = "MANUFACTURER", nullable = false)
    private String manufacturer;
    
    @Column(name = "MACHINE_STATE", nullable = false)
    private String machineState;
    
    @Column(name = "YEAR_OF_ISSUE", nullable = false)
    private Integer yearOfIssue;
    
    @Column(name = "LOCATION", nullable = false)
    private String location;
    
    @Column(name = "SALES", nullable = false)
    private String sales;
    
    @Column(name = "MATERIAL_THICKNESS", nullable = false)
    private Integer materialThickness;
    
    @Column(name = "MATERIAL_WIDTH", nullable = false)
    private Integer materialWidth;
    
    @Column(name = "BENDING_SPEED", nullable = false)
    private Double bendingSpeed;
    
    @Column(name = "MIN_DIAMETER_MAX_BEND")
    private Integer minDiameterMaxBend;
    
    @Column(name = "TOP_ROLL_DIAMETER")
    private Integer topRollDiameter;
    
    @Column(name = "MIDDLE_ROLL_DIAMETER")
    private Integer middleRollDiameter;
    
    @Column(name = "DISTANCE_OF_BOTTOM_TWO_ROLLS")
    private Integer distanceOfBottomTwoRolls;
    
    @Column(name = "MATERIAL_PROOF_STRESS")
    private Integer materialProofStress;
    
    @Column(name = "MAIN_ENGINE_POWER", nullable = false)
    private Double mainEnginePower;
    
    @Column(name = "MACHINE_DIMENSIONS", nullable = false)
    private String machineDimensions;
    
    @Column(name = "MACHINE_WEIGHT", nullable = false)
    private Integer machineWeight;
    
    @Column(name = "MACHINE_PRICE", nullable = false)
    private Integer machinePrice;

    @Column(name = "DESCRIPTION")
    private String description;
    
    @Column(name = "MAIN_PHOTO", nullable = false)
    private String mainPhoto;
    
    @OneToMany(mappedBy = "photoThreeRollMill", cascade = CascadeType.ALL)
    private List<ThreeRollMillPhoto> photoList;
    
    @OneToMany(mappedBy = "videoThreeRollMill", cascade = CascadeType.ALL)
    private List<ThreeRollMillVideo> videoList;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCommonId() {
        return commonId;
    }

    public void setCommonId(Integer commonId) {
        this.commonId = commonId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getMachineState() {
        return machineState;
    }

    public void setMachineState(String machineState) {
        this.machineState = machineState;
    }

    public Integer getYearOfIssue() {
        return yearOfIssue;
    }

    public void setYearOfIssue(Integer yearOfIssue) {
        this.yearOfIssue = yearOfIssue;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getSales() {
        return sales;
    }

    public void setSales(String sales) {
        this.sales = sales;
    }

    public Integer getMaterialThickness() {
        return materialThickness;
    }

    public void setMaterialThickness(Integer materialThickness) {
        this.materialThickness = materialThickness;
    }

    public Integer getMaterialWidth() {
        return materialWidth;
    }

    public void setMaterialWidth(Integer materialWidth) {
        this.materialWidth = materialWidth;
    }

    public Double getBendingSpeed() {
        return bendingSpeed;
    }

    public void setBendingSpeed(Double bendingSpeed) {
        this.bendingSpeed = bendingSpeed;
    }

    public Integer getMinDiameterMaxBend() {
        return minDiameterMaxBend;
    }

    public void setMinDiameterMaxBend(Integer minDiameterMaxBend) {
        this.minDiameterMaxBend = minDiameterMaxBend;
    }

    public Integer getTopRollDiameter() {
        return topRollDiameter;
    }

    public void setTopRollDiameter(Integer topRollDiameter) {
        this.topRollDiameter = topRollDiameter;
    }

    public Integer getMiddleRollDiameter() {
        return middleRollDiameter;
    }

    public void setMiddleRollDiameter(Integer middleRollDiameter) {
        this.middleRollDiameter = middleRollDiameter;
    }

    public Integer getDistanceOfBottomTwoRolls() {
        return distanceOfBottomTwoRolls;
    }

    public void setDistanceOfBottomTwoRolls(Integer distanceOfBottomTwoRolls) {
        this.distanceOfBottomTwoRolls = distanceOfBottomTwoRolls;
    }

    public Integer getMaterialProofStress() {
        return materialProofStress;
    }

    public void setMaterialProofStress(Integer materialProofStress) {
        this.materialProofStress = materialProofStress;
    }

    public Double getMainEnginePower() {
        return mainEnginePower;
    }

    public void setMainEnginePower(Double mainEnginePower) {
        this.mainEnginePower = mainEnginePower;
    }

    public String getMachineDimensions() {
        return machineDimensions;
    }

    public void setMachineDimensions(String machineDimensions) {
        this.machineDimensions = machineDimensions;
    }

    public Integer getMachineWeight() {
        return machineWeight;
    }

    public void setMachineWeight(Integer machineWeight) {
        this.machineWeight = machineWeight;
    }

    public Integer getMachinePrice() {
        return machinePrice;
    }

    public void setMachinePrice(Integer machinePrice) {
        this.machinePrice = machinePrice;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getMainPhoto() {
        return mainPhoto;
    }

    public void setMainPhoto(String mainPhoto) {
        this.mainPhoto = mainPhoto;
    }

    public List<ThreeRollMillPhoto> getPhotoList() {
        return photoList;
    }

    public void setPhotoList(List<ThreeRollMillPhoto> photoList) {
        this.photoList = photoList;
    }

    public List<ThreeRollMillVideo> getVideoList() {
        return videoList;
    }

    public void setVideoList(List<ThreeRollMillVideo> videoList) {
        this.videoList = videoList;
    }

    
    
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 11 * hash + this.id;
        hash = 11 * hash + this.commonId;
        hash = 11 * hash + Objects.hashCode(this.type);
        hash = 11 * hash + Objects.hashCode(this.model);
        hash = 11 * hash + Objects.hashCode(this.brand);
        hash = 11 * hash + Objects.hashCode(this.manufacturer);
        hash = 11 * hash + Objects.hashCode(this.machineState);
        hash = 11 * hash + this.yearOfIssue;
        hash = 11 * hash + Objects.hashCode(this.location);
        hash = 11 * hash + Objects.hashCode(this.sales);
        hash = 11 * hash + this.materialThickness;
        hash = 11 * hash + this.materialWidth;
        hash = 11 * hash + (int) (Double.doubleToLongBits(this.bendingSpeed) ^ (Double.doubleToLongBits(this.bendingSpeed) >>> 32));
        hash = 11 * hash + this.minDiameterMaxBend;
        hash = 11 * hash + this.topRollDiameter;
        hash = 11 * hash + this.middleRollDiameter;
        hash = 11 * hash + this.distanceOfBottomTwoRolls;
        hash = 11 * hash + this.materialProofStress;
        hash = 11 * hash + (int) (Double.doubleToLongBits(this.mainEnginePower) ^ (Double.doubleToLongBits(this.mainEnginePower) >>> 32));
        hash = 11 * hash + Objects.hashCode(this.machineDimensions);
        hash = 11 * hash + this.machineWeight;
        hash = 11 * hash + this.machinePrice;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final ThreeRollMill other = (ThreeRollMill) obj;
        if (this.id != other.id) {
            return false;
        }
        if (this.commonId != other.commonId) {
            return false;
        }
        if (this.yearOfIssue != other.yearOfIssue) {
            return false;
        }
        if (this.materialThickness != other.materialThickness) {
            return false;
        }
        if (this.materialWidth != other.materialWidth) {
            return false;
        }
        if (Double.doubleToLongBits(this.bendingSpeed) != Double.doubleToLongBits(other.bendingSpeed)) {
            return false;
        }
        if (this.minDiameterMaxBend != other.minDiameterMaxBend) {
            return false;
        }
        if (this.topRollDiameter != other.topRollDiameter) {
            return false;
        }
        if (this.middleRollDiameter != other.middleRollDiameter) {
            return false;
        }
        if (this.distanceOfBottomTwoRolls != other.distanceOfBottomTwoRolls) {
            return false;
        }
        if (this.materialProofStress != other.materialProofStress) {
            return false;
        }
        if (Double.doubleToLongBits(this.mainEnginePower) != Double.doubleToLongBits(other.mainEnginePower)) {
            return false;
        }
        if (this.machineWeight != other.machineWeight) {
            return false;
        }
        if (this.machinePrice != other.machinePrice) {
            return false;
        }
        if (!Objects.equals(this.type, other.type)) {
            return false;
        }
        if (!Objects.equals(this.model, other.model)) {
            return false;
        }
        if (!Objects.equals(this.brand, other.brand)) {
            return false;
        }
        if (!Objects.equals(this.manufacturer, other.manufacturer)) {
            return false;
        }
        if (!Objects.equals(this.machineState, other.machineState)) {
            return false;
        }
        if (!Objects.equals(this.location, other.location)) {
            return false;
        }
        if (!Objects.equals(this.sales, other.sales)) {
            return false;
        }
        if (!Objects.equals(this.machineDimensions, other.machineDimensions)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ThreeRollMill{" + "\nid=" + id + ", \ncommonId=" + commonId 
                + ", \ntype=" + type + ", \nmodel=" + model + ", \nbrand=" + brand 
                + ", \nmanufacturer=" + manufacturer + ", \ncondition=" + machineState 
                + ", \nyearOfIssue=" + yearOfIssue + ", \nlocation=" + location 
                + ", \nsales=" + sales + ", \nmaterialThickness=" + materialThickness 
                + ", \nmaterialWidth=" + materialWidth + ", \nbendingSpeed=" 
                + bendingSpeed + ", \nminDiameterMaxBend=" + minDiameterMaxBend 
                + ", \ntopRollDiameter=" + topRollDiameter + ", \nmiddleRollDiameter=" 
                + middleRollDiameter + ", \ndistanceOfBottomTwoRolls=" + distanceOfBottomTwoRolls 
                + ", \nmaterialProofStress=" + materialProofStress + ", \nmainEnginePower=" 
                + mainEnginePower + ", \nmachineDimensions=" + machineDimensions 
                + ", \nmachineWeight=" + machineWeight + ", \nmachinePrice=" + machinePrice 
                + ", \nmainPhoto=" + mainPhoto + ", \ndescription=" + description 
                + ", \nphotoList=" + photoList + ", \nvideoList=" + videoList + '}';
    }

    
}
