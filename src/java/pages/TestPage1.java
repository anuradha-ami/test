/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pages;

import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author jadanu1000
 */
@ManagedBean
@ViewScoped
public class TestPage1 implements Serializable{

    //<editor-fold defaultstate="collapsed" desc="fields">
    String emp_list;
    String add_new_emp;

    public String getAdd_new_emp() {
        return add_new_emp;
    }

    public void setAdd_new_emp(String add_new_emp) {
        this.add_new_emp = add_new_emp;
    }

    public String getEmp_list() {
        return emp_list;
    }

    public void setEmp_list(String emp_list) {
        this.emp_list = emp_list;
    }
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="default methods">
    /**
     * Creates a new instance of TestPage1
     */
    public TestPage1() {
    }

    @PostConstruct
    public void init() {
        emp_list="pages/EmployeeList.xhtml";
        add_new_emp="pages/AddNewEmployee.xhtml";
    }
    //</editor-fold>
}
