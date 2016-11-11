/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package machinetoolstore.core.model;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
/**
 *
 * @author main
 */
@Entity
@Table(name = "THREE_ROLL_MILL_PHOTO")
public class ThreeRollMillPhoto implements Serializable {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "three_roll_mill_id")
    private ThreeRollMill photoThreeRollMill;
    
    @Column(name = "IMAGE_NAME")
    private String imageName;
    
    @Column(name = "FLAG")
    private byte flag; 

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ThreeRollMill getThreeRollMill() {
        return photoThreeRollMill;
    }

    public void setThreeRollMill(ThreeRollMill threeRollMill) {
        this.photoThreeRollMill = threeRollMill;
    }

    public String getImageName() {
        return imageName;
    }

    public void setImageName(String imageName) {
        this.imageName = imageName;
    }

    public byte getFlag() {
        return flag;
    }

    public void setFlag(byte flag) {
        this.flag = flag;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 53 * hash + this.id;
        hash = 53 * hash + Objects.hashCode(this.imageName);
        hash = 53 * hash + this.flag;
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
        final ThreeRollMillPhoto other = (ThreeRollMillPhoto) obj;
        if (this.id != other.id) {
            return false;
        }
        if (this.flag != other.flag) {
            return false;
        }
        if (!Objects.equals(this.imageName, other.imageName)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ThreeRollMillPhoto{" + "id=" + id  
                + ", imageName=" + imageName 
                + ", flag=" + flag + '}';
    }
    
    
}
