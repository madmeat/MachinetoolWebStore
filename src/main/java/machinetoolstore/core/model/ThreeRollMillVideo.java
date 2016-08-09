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
@Table(name = "THREE_ROLL_MILL_VIDEO")
public class ThreeRollMillVideo implements Serializable {
    
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "three_roll_mill_id")
    private ThreeRollMill videoThreeRollMill;
    
    @Column(name = "VIDEO_URL")
    private String videoUrl;
    
    @Column(name = "FLAG")
    private byte flag; 

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ThreeRollMill getThreeRollMill() {
        return videoThreeRollMill;
    }

    public void setThreeRollMill(ThreeRollMill videoThreeRollMill) {
        this.videoThreeRollMill = videoThreeRollMill;
    }

    public String getVideoUrl() {
        return videoUrl;
    }

    public void setVideoUrl(String videoUrl) {
        this.videoUrl = videoUrl;
    }

    public byte getFlag() {
        return flag;
    }

    public void setFlag(byte flag) {
        this.flag = flag;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 47 * hash + this.id;
        hash = 47 * hash + Objects.hashCode(this.videoUrl);
        hash = 47 * hash + this.flag;
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
        final ThreeRollMillVideo other = (ThreeRollMillVideo) obj;
        if (this.id != other.id) {
            return false;
        }
        if (this.flag != other.flag) {
            return false;
        }
        if (!Objects.equals(this.videoUrl, other.videoUrl)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ThreeRollMillVideo{" + "id=" + id 
                + ", videoUrl=" + videoUrl 
                + ", flag=" + flag + '}';
    }
    
    
}
