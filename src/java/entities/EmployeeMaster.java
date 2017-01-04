/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author jadanu1000
 */
@Entity
@Table(name = "employee_master")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "EmployeeMaster.findAll", query = "SELECT e FROM EmployeeMaster e"),
    @NamedQuery(name = "EmployeeMaster.findByUserName", query = "SELECT e FROM EmployeeMaster e WHERE e.userName = :userName"),
    @NamedQuery(name = "EmployeeMaster.findByPassword", query = "SELECT e FROM EmployeeMaster e WHERE e.password = :password")})
public class EmployeeMaster implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "USER_NAME")
    private String userName;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "PASSWORD")
    private String password;

    public EmployeeMaster() {
    }

    public EmployeeMaster(String userName) {
        this.userName = userName;
    }

    public EmployeeMaster(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (userName != null ? userName.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EmployeeMaster)) {
            return false;
        }
        EmployeeMaster other = (EmployeeMaster) object;
        if ((this.userName == null && other.userName != null) || (this.userName != null && !this.userName.equals(other.userName))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.EmployeeMaster[ userName=" + userName + " ]";
    }
    
}
