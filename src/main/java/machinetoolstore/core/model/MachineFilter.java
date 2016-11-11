/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package machinetoolstore.core.model;

import java.util.ArrayList;

/**
 *
 * @author main
 */
public class MachineFilter {
    
    private ArrayList<String> selectedType;
    
    private Integer minSelectedThickness;
    private Integer maxSelectedThickness;
    
    private Integer minSelectedWidth;
    private Integer maxSelectedWidth;
    
    private Integer minSelectedYear;
    private Integer maxSelectedYear;
    private Integer minSelectedPrice;
    private Integer maxSelectedPrice;
    
    private Double minSelectedBS;
    private Double maxSelectedBS;

    public Integer getMinSelectedPrice() {
        return minSelectedPrice;
    }

    public void setMinSelectedPrice(Integer minSelectedPrice) {
        if(minSelectedPrice == null || minSelectedPrice < 0) {
            this.minSelectedPrice = 0;
        } else {
            this.minSelectedPrice = minSelectedPrice;
        }
    }

    public Integer getMaxSelectedPrice() {
        return maxSelectedPrice;
    }

    public void setMaxSelectedPrice(Integer maxSelectedPrice) {
        if(maxSelectedPrice == null || maxSelectedPrice < 0) {
            this.maxSelectedPrice = Integer.MAX_VALUE;
        } else {
            this.maxSelectedPrice = maxSelectedPrice;
        }
    }

    public Double getMinSelectedBS() {
        return minSelectedBS;
    }

    public void setMinSelectedBS(Double minSelectedBS) {
        if(minSelectedBS == null || minSelectedBS == 0) {
            this.minSelectedBS = 0.0;
        } else {
            this.minSelectedBS = minSelectedBS;
        }
    }

    public Double getMaxSelectedBS() {
        return maxSelectedBS;
    }

    public void setMaxSelectedBS(Double maxSelectedBS) {
        if(maxSelectedBS == null || maxSelectedBS < 0) {
            this.maxSelectedBS = 999999.0;
        } else {
            this.maxSelectedBS = maxSelectedBS;
        }
    }
    
    public Integer getMinSelectedYear() {
        return minSelectedYear;
    }

    public void setMinSelectedYear(Integer minSelectedYear) {
        if(minSelectedYear == null || minSelectedYear < 1990) {
            this.minSelectedYear = 1990;
        } else {
            this.minSelectedYear = minSelectedYear;
        }
    }

    public Integer getMaxSelectedYear() {
        return maxSelectedYear;
    }

    public void setMaxSelectedYear(Integer maxSelectedYear) {
        if(maxSelectedYear == null || maxSelectedYear > 2016) {
            this.maxSelectedYear = 2016;
        } else {
            this.maxSelectedYear = maxSelectedYear;
        }
    }

    public Integer getMinSelectedWidth() {
        return minSelectedWidth;
    }

    public void setMinSelectedWidth(Integer minSelectedWidth) {
        if(minSelectedWidth == null) {
            this.minSelectedWidth = 0;
        } else {
            this.minSelectedWidth = minSelectedWidth;
        }
    }

    public Integer getMaxSelectedWidth() {
        return maxSelectedWidth;
    }

    public void setMaxSelectedWidth(Integer maxSelectedWidth) {
        if(maxSelectedWidth == null) {
            this.maxSelectedWidth = Integer.MAX_VALUE;
        } else {
            this.maxSelectedWidth = maxSelectedWidth;
        }
    }
    
    public Integer getMinSelectedThickness() {
        return minSelectedThickness;
    }

    public void setMinSelectedThickness(Integer minSelectedThickness) {
        if(minSelectedThickness == null) {
            this.minSelectedThickness = 0;
        } else {
            this.minSelectedThickness = minSelectedThickness;
        }
    }

    public Integer getMaxSelectedThickness() {
        return maxSelectedThickness;
    }

    public void setMaxSelectedThickness(Integer maxSelectedThickness) {
        if(maxSelectedThickness == null) {
            this.maxSelectedThickness = Integer.MAX_VALUE;
        } else {
            this.maxSelectedThickness = maxSelectedThickness;
        }
    }

    public ArrayList<String> getSelectedType() {
        return selectedType;
    }

    public void setSelectedType(ArrayList<String> selectedType) {
        this.selectedType = selectedType;
    }

    @Override
    public String toString() {
        return "MachineFilter{" + "selectedType=" + selectedType + ", minSelectedThickness=" 
                + minSelectedThickness + ", maxSelectedThickness=" + maxSelectedThickness 
                + ", minSelectedWidth=" + minSelectedWidth + ", maxSelectedWidth=" 
                + maxSelectedWidth + ", minSelectedYear=" + minSelectedYear + ", maxSelectedYear=" 
                + maxSelectedYear + ", minSelectedBS=" + minSelectedBS + ", maxSelectedBS=" 
                + maxSelectedBS + ", minSelectedPrice=" + minSelectedPrice + ", maxSelectedPrice=" + maxSelectedPrice + "}\n";
    }
}
