/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sessions;

import entities.EmployeeMaster;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author jadanu1000
 */
@Stateless
public class EmployeeMasterFacade extends AbstractFacade<EmployeeMaster> implements EmployeeMasterFacadeLocal {

    @PersistenceContext(unitName = "EmployeeApplicationPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public EmployeeMasterFacade() {
        super(EmployeeMaster.class);
    }

    @Override
    public EmployeeMaster getByUsername(String p_username) {
        return (EmployeeMaster) em.createNativeQuery("Select * from employee_master"
                + " where user_name = " + p_username).getSingleResult();
    }
}
