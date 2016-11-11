/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package machinetoolstore.core.model;

import java.util.List;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

/**
 *
 * @author main
 */
@StaticMetamodel(value = ThreeRollMill.class)
public class ThreeRollMill_ {
    public static volatile SingularAttribute<ThreeRollMill, Integer> id;
    public static volatile SingularAttribute<ThreeRollMill, Integer> commonId;
    public static volatile SingularAttribute<ThreeRollMill, String> type;
    public static volatile SingularAttribute<ThreeRollMill, String> model;
    public static volatile SingularAttribute<ThreeRollMill, String> brand;
    public static volatile SingularAttribute<ThreeRollMill, String> manufacturer;
    public static volatile SingularAttribute<ThreeRollMill, String> machineState;
    public static volatile SingularAttribute<ThreeRollMill, String> condition;
    public static volatile SingularAttribute<ThreeRollMill, Integer> yearOfIssue;
    public static volatile SingularAttribute<ThreeRollMill, String> location;
    public static volatile SingularAttribute<ThreeRollMill, String> sales;
    public static volatile SingularAttribute<ThreeRollMill, Integer> materialThickness;
    public static volatile SingularAttribute<ThreeRollMill, Integer> materialWidth;
    public static volatile SingularAttribute<ThreeRollMill, Double> bendingSpeed;
    public static volatile SingularAttribute<ThreeRollMill, Integer> minDiameterMaxBend;
    public static volatile SingularAttribute<ThreeRollMill, Integer> topRollDiameter;
    public static volatile SingularAttribute<ThreeRollMill, Integer> middleRollDiameter;
    public static volatile SingularAttribute<ThreeRollMill, Integer> distanceOfBottomTwoRolls;
    public static volatile SingularAttribute<ThreeRollMill, Integer> materialProofStress;
    public static volatile SingularAttribute<ThreeRollMill, Double> mainEnginePower;
    public static volatile SingularAttribute<ThreeRollMill, String> machineDimensions;
    public static volatile SingularAttribute<ThreeRollMill, Integer> machineWeight;
    public static volatile SingularAttribute<ThreeRollMill, Integer> machinePrice;
    public static volatile SingularAttribute<ThreeRollMill, String> mainPhoto;
    public static volatile SingularAttribute<ThreeRollMill, String> description;
    public static volatile ListAttribute<ThreeRollMillPhoto, List> photoList;
    public static volatile ListAttribute<ThreeRollMillVideo, List> videoList;
}
