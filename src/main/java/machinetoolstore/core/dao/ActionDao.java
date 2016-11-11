/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package machinetoolstore.core.dao;

import java.util.List;
import machinetoolstore.core.model.CompareWrapper;
import machinetoolstore.core.model.MachineFilter;
import machinetoolstore.core.model.ThreeRollMill;
import machinetoolstore.core.model.ThreeRollMillWrapper;

/**
 *
 * @author main
 */
public interface ActionDao {
    public void save(ThreeRollMill entity);
    public ThreeRollMill getById(Integer id);
    public List<ThreeRollMillWrapper> findAll();
    public List<ThreeRollMillWrapper> searchByFilter(MachineFilter machineFilter);
    public List<CompareWrapper> searchByMatcher(Integer[] matcher);
}
