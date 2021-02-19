package com.nisfa.service;

import com.nisfa.entity.Employee;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

/**
 *
 * @author Administrator
 */
@Transactional
public class QueryService {

    @PersistenceContext
    EntityManager entityManager;

    public List<Employee> getEmployees() {

        List<Employee> resultList = entityManager
                .createQuery("select e from employee as e").getResultList();

        return resultList;
    }

    public Employee findEmployeeById(Long id) {
        return entityManager.find(Employee.class, id);
    }

}
