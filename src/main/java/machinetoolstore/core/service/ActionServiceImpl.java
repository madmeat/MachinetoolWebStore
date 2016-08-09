/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package machinetoolstore.core.service;

import java.util.List;
import machinetoolstore.core.dao.ActionDao;
import machinetoolstore.core.model.CompareWrapper;
import machinetoolstore.core.model.MachineFilter;
import machinetoolstore.core.model.ThreeRollMill;
import machinetoolstore.core.model.ThreeRollMillWrapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author main
 */
@Transactional
@Service("actionService")
public class ActionServiceImpl implements ActionService{

    @Autowired
    ActionDao actionDao;
    
    @Override
    public ThreeRollMill getById(Integer id) {
        return actionDao.getById(id);
    }

    @Override
    public List<ThreeRollMillWrapper> findAll() {
        return actionDao.findAll();
    }

    @Override
    public void addThreeRollMill(ThreeRollMill entity) {
        actionDao.save(entity);
    }

    @Override
    public List<ThreeRollMillWrapper> searchByFilter(MachineFilter machineFilter) {
        return actionDao.searchByFilter(machineFilter);
    }

    @Override
    public List<CompareWrapper> searchByMatcher(Integer[] matcher) {
        return actionDao.searchByMatcher(matcher);
    }
    
}
