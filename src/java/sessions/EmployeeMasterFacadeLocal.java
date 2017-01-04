/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sessions;

import entities.EmployeeMaster;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author jadanu1000
 */
@Local
public interface EmployeeMasterFacadeLocal {

    void create(EmployeeMaster employeeMaster);

    void edit(EmployeeMaster employeeMaster);

    void remove(EmployeeMaster employeeMaster);

    EmployeeMaster find(Object id);

    List<EmployeeMaster> findAll();

    List<EmployeeMaster> findRange(int[] range);

    int count();

    public entities.EmployeeMaster getByUsername(java.lang.String p_username);
    
}
