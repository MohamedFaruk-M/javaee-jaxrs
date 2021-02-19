package com.nisfa.service;

import com.nisfa.entity.Employee;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

/**
 *
 * @author Administrator
 */
@Transactional
public class PersistenceService {

//    @Inject
    @PersistenceContext
    EntityManager entityManager;

    public int createEmployee(Employee employee) {
        try {
            entityManager.persist(employee);
            return employee.getId().intValue();
        } catch (Exception ex) {
            ex.printStackTrace();
            return -1;
        }
    }

    public int updateEmployee(Employee employee) {
        try {
            entityManager.merge(employee);
            return employee.getId().intValue();
        } catch (Exception ex) {
            ex.printStackTrace();
            return -1;
        }
    }

}
