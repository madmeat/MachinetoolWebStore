/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package machinetoolstore.core.dao;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Path;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import machinetoolstore.core.model.CompareWrapper;
import machinetoolstore.core.model.MachineFilter;
import machinetoolstore.core.model.ThreeRollMill;
import machinetoolstore.core.model.ThreeRollMillWrapper;
import machinetoolstore.core.model.ThreeRollMill_;
import machinetoolstore.core.util.TypeConverter;
import org.springframework.stereotype.Repository;

/**
 *
 * @author main
 */
@Repository("actionDao")
public class ActionDaoImpl extends BasicDaoAction<Integer, ThreeRollMill> implements ActionDao {

    @Override
    public ThreeRollMill getById(Integer id) {
        return super.findByKey(id);
    }

    @Override
    public List<ThreeRollMillWrapper> findAll() {
        CriteriaBuilder builder = super.getCriteriaBuilder();
        CriteriaQuery<ThreeRollMillWrapper> criteria 
                = builder.createQuery(ThreeRollMillWrapper.class);
        Root<ThreeRollMill> root = criteria.from(ThreeRollMill.class);
        
        Path<Integer> idPath = root.get(ThreeRollMill_.id);
        Path<Integer> commonIdPath = root.get(ThreeRollMill_.commonId);
        Path<String> typePath = root.get(ThreeRollMill_.type);
        Path<String> modelPath = root.get(ThreeRollMill_.model);
        Path<String> brandPath = root.get(ThreeRollMill_.brand);
        Path<Integer> yearOfIssuePath = root.get(ThreeRollMill_.yearOfIssue);
        Path<String> locationPath = root.get(ThreeRollMill_.location);
        Path<String> machineDimensionsPath = root.get(ThreeRollMill_.machineDimensions);
        Path<String> mainPhotoPath = root.get(ThreeRollMill_.mainPhoto);
        Path<Integer> machinePricePath = root.get(ThreeRollMill_.machinePrice);
        
        criteria.select(builder.construct(ThreeRollMillWrapper.class, 
                idPath, commonIdPath, typePath, modelPath, brandPath, yearOfIssuePath,
                locationPath, machineDimensionsPath, mainPhotoPath, machinePricePath));
        
        List<ThreeRollMillWrapper> list = super.getEntityManager().createQuery(criteria).getResultList();
        return list;
    }

    @Override
    public void save(ThreeRollMill entity) {
        super.persist(entity);
    }

    @Override
    public List<ThreeRollMillWrapper> searchByFilter(MachineFilter machineFilter) {
        if(machineFilter.getSelectedType() != null) {
            TypeConverter.convert(machineFilter);
        }
        List<Predicate> global = new ArrayList<>();
        CriteriaBuilder builder = super.getCriteriaBuilder();
        CriteriaQuery<ThreeRollMillWrapper> criteria
                = builder.createQuery(ThreeRollMillWrapper.class);
        Root<ThreeRollMill> root = criteria.from(ThreeRollMill.class);
        
        Path<Integer> idPath = root.get(ThreeRollMill_.id);
        Path<Integer> commonIdPath = root.get(ThreeRollMill_.commonId);
        Path<String> typePath = root.get(ThreeRollMill_.type);
        Path<String> modelPath = root.get(ThreeRollMill_.model);
        Path<String> brandPath = root.get(ThreeRollMill_.brand);
        Path<Integer> yearOfIssuePath = root.get(ThreeRollMill_.yearOfIssue);
        Path<String> locationPath = root.get(ThreeRollMill_.location);
        Path<String> machineDimensionsPath = root.get(ThreeRollMill_.machineDimensions);
        Path<String> mainPhotoPath = root.get(ThreeRollMill_.mainPhoto);
        Path<Integer> machinePricePath = root.get(ThreeRollMill_.machinePrice);
        
        //Type Block
        if(machineFilter.getSelectedType() != null) {
            ArrayList<Predicate> selectedTypeList = new ArrayList<>();
            for(String selectedType : machineFilter.getSelectedType()) {
                selectedTypeList.add(builder.equal(root.get("type"), selectedType));
            }
            Predicate total = builder.or(selectedTypeList.toArray(new Predicate[]{}));
            global.add(total);
        }
        
        //Material Thickness Block
        if(machineFilter.getMinSelectedThickness() != null && machineFilter.getMinSelectedThickness() != null) {
            Predicate materialThicknessRange = 
                    builder.between(root.get(ThreeRollMill_.materialThickness),
                            machineFilter.getMinSelectedThickness(), machineFilter.getMaxSelectedThickness());
            global.add(materialThicknessRange);
        }
        
        //Material Width Block
        if(machineFilter.getMinSelectedWidth() != null && machineFilter.getMaxSelectedWidth() != null) {
            Predicate materialWidthRange = builder.between(root.get(ThreeRollMill_.materialWidth), 
                    machineFilter.getMinSelectedWidth(), machineFilter.getMaxSelectedWidth());
            global.add(materialWidthRange);
        }
    
        //Year Block
        if(machineFilter.getMinSelectedYear()!= null && machineFilter.getMaxSelectedYear()!= null) {
            Predicate yearOfIssueRange = builder.between(root.get(ThreeRollMill_.yearOfIssue), 
                    machineFilter.getMinSelectedYear(), machineFilter.getMaxSelectedYear());
            global.add(yearOfIssueRange);
        }
        
        //Bending Speed Block
        if(machineFilter.getMinSelectedBS()!= null && machineFilter.getMaxSelectedBS() != null) {
            Predicate bendingSpeedRange = builder.between(root.get(ThreeRollMill_.bendingSpeed), 
                    machineFilter.getMinSelectedBS(), machineFilter.getMaxSelectedBS());
            global.add(bendingSpeedRange);
        }
        
        //Price Range Block
        if(machineFilter.getMinSelectedPrice()!= null && machineFilter.getMaxSelectedPrice()!= null) {
            Predicate priceRange = builder.between(root.get(ThreeRollMill_.machinePrice), 
                    machineFilter.getMinSelectedPrice(), machineFilter.getMaxSelectedPrice());
            global.add(priceRange);
        }
        
        criteria.select(builder.construct(ThreeRollMillWrapper.class, 
                idPath, commonIdPath, typePath, modelPath, brandPath, yearOfIssuePath,
                locationPath, machineDimensionsPath, mainPhotoPath, machinePricePath))
                .where(global.toArray(new Predicate[] {}));
        
        List<ThreeRollMillWrapper> list = super.getEntityManager().createQuery(criteria).getResultList();
        return list;
    }

    @Override
    public List<CompareWrapper> searchByMatcher(Integer[] matcher) {
        List<Integer> matcherList = Arrays.asList(matcher);
        CriteriaBuilder builder = super.getCriteriaBuilder();
        CriteriaQuery<CompareWrapper> criteria 
                = builder.createQuery(CompareWrapper.class);
        Root<ThreeRollMill> root = criteria.from(ThreeRollMill.class);
        
        Path<Integer> idPath = root.get(ThreeRollMill_.id);
        Path<String> typePath = root.get(ThreeRollMill_.type);
        Path<String> modelPath = root.get(ThreeRollMill_.model);
        Path<String> brandPath = root.get(ThreeRollMill_.brand);
        Path<String> manufacturerPath = root.get(ThreeRollMill_.manufacturer);
        Path<String> machineStatePath = root.get(ThreeRollMill_.machineState);
        Path<Integer> yearOfIssuePath = root.get(ThreeRollMill_.yearOfIssue);
        Path<String> locationPath = root.get(ThreeRollMill_.location);
        Path<Integer> materialThicknessPath = root.get(ThreeRollMill_.materialThickness);
        Path<Integer> materialWidthPath = root.get(ThreeRollMill_.materialWidth);
        Path<Double> bendingSpeedPath = root.get(ThreeRollMill_.bendingSpeed);
        Path<Integer> minDiameterMaxBendPath = root.get(ThreeRollMill_.minDiameterMaxBend);
        Path<Integer> topRollDiameterPath = root.get(ThreeRollMill_.topRollDiameter);
        Path<Integer> middleRollDiameterPath = root.get(ThreeRollMill_.middleRollDiameter);
        Path<Integer> distanceOfBottomTwoRollsPath = root.get(ThreeRollMill_.distanceOfBottomTwoRolls);
        Path<Integer> materialProofStressPath = root.get(ThreeRollMill_.materialProofStress);
        Path<Double> mainEnginePowerPath = root.get(ThreeRollMill_.mainEnginePower);
        Path<String> machineDimensionsPath = root.get(ThreeRollMill_.machineDimensions);
        Path<Integer> machineWeightPath = root.get(ThreeRollMill_.machineWeight);
        Path<Integer> machinePricePath = root.get(ThreeRollMill_.machinePrice);
        Path<String> mainPhotoPath = root.get(ThreeRollMill_.mainPhoto);

        criteria.select(builder.construct(CompareWrapper.class, idPath, typePath, modelPath, brandPath, manufacturerPath,
                machineStatePath, yearOfIssuePath, locationPath, materialThicknessPath, materialWidthPath, bendingSpeedPath,
                minDiameterMaxBendPath, topRollDiameterPath, middleRollDiameterPath, distanceOfBottomTwoRollsPath,
                materialProofStressPath, mainEnginePowerPath, machineDimensionsPath, machineWeightPath, machinePricePath,
                mainPhotoPath)).where(root.get(ThreeRollMill_.id).in(matcherList));
        List<CompareWrapper> result = super.getEntityManager().createQuery(criteria).getResultList();
        return result;
    }

    
}
