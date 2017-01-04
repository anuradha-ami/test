/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author jadanu1000
 */
@Entity
@Table(name = "employee")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Employee.findAll", query = "SELECT e FROM Employee e"),
    @NamedQuery(name = "Employee.findByOid", query = "SELECT e FROM Employee e WHERE e.oid = :oid"),
    @NamedQuery(name = "Employee.findByFirmId", query = "SELECT e FROM Employee e WHERE e.firmId = :firmId"),
    @NamedQuery(name = "Employee.findByFirstName", query = "SELECT e FROM Employee e WHERE e.firstName = :firstName"),
    @NamedQuery(name = "Employee.findByLastName", query = "SELECT e FROM Employee e WHERE e.lastName = :lastName"),
    @NamedQuery(name = "Employee.findByResourceId", query = "SELECT e FROM Employee e WHERE e.resourceId = :resourceId"),
    @NamedQuery(name = "Employee.findByResourceType", query = "SELECT e FROM Employee e WHERE e.resourceType = :resourceType"),
    @NamedQuery(name = "Employee.findByPhoneNo", query = "SELECT e FROM Employee e WHERE e.phoneNo = :phoneNo"),
    @NamedQuery(name = "Employee.findByEmailId", query = "SELECT e FROM Employee e WHERE e.emailId = :emailId"),
    @NamedQuery(name = "Employee.findByStatus", query = "SELECT e FROM Employee e WHERE e.status = :status"),
    @NamedQuery(name = "Employee.findByStartDate", query = "SELECT e FROM Employee e WHERE e.startDate = :startDate"),
    @NamedQuery(name = "Employee.findByEndDate", query = "SELECT e FROM Employee e WHERE e.endDate = :endDate"),
    @NamedQuery(name = "Employee.findByImei", query = "SELECT e FROM Employee e WHERE e.imei = :imei"),
    @NamedQuery(name = "Employee.findByIndent", query = "SELECT e FROM Employee e WHERE e.indent = :indent"),
    @NamedQuery(name = "Employee.findByRef1", query = "SELECT e FROM Employee e WHERE e.ref1 = :ref1"),
    @NamedQuery(name = "Employee.findByRef2", query = "SELECT e FROM Employee e WHERE e.ref2 = :ref2"),
    @NamedQuery(name = "Employee.findByRef3", query = "SELECT e FROM Employee e WHERE e.ref3 = :ref3"),
    @NamedQuery(name = "Employee.findByRef4", query = "SELECT e FROM Employee e WHERE e.ref4 = :ref4"),
    @NamedQuery(name = "Employee.findByRef5", query = "SELECT e FROM Employee e WHERE e.ref5 = :ref5"),
    @NamedQuery(name = "Employee.findByCreatedBy", query = "SELECT e FROM Employee e WHERE e.createdBy = :createdBy"),
    @NamedQuery(name = "Employee.findByCreatedDtt", query = "SELECT e FROM Employee e WHERE e.createdDtt = :createdDtt"),
    @NamedQuery(name = "Employee.findByModifiedBy", query = "SELECT e FROM Employee e WHERE e.modifiedBy = :modifiedBy"),
    @NamedQuery(name = "Employee.findByModifiedDtt", query = "SELECT e FROM Employee e WHERE e.modifiedDtt = :modifiedDtt"),
    @NamedQuery(name = "Employee.findByActiveFlag", query = "SELECT e FROM Employee e WHERE e.activeFlag = :activeFlag"),
    @NamedQuery(name = "Employee.findByDeleteFlag", query = "SELECT e FROM Employee e WHERE e.deleteFlag = :deleteFlag"),
    @NamedQuery(name = "Employee.findByCancelFlag", query = "SELECT e FROM Employee e WHERE e.cancelFlag = :cancelFlag")})
public class Employee implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @NotNull
    @Column(name = "oid")
    private Integer oid;
    @Size(max = 50)
    @Column(name = "firm_id")
    private String firmId;
    @Size(max = 100)
    @Column(name = "first_name")
    private String firstName;
    @Size(max = 100)
    @Column(name = "last_name")
    private String lastName;
    @Size(max = 100)
    @Column(name = "resource_id")
    private String resourceId;
    @Size(max = 100)
    @Column(name = "resource_type")
    private String resourceType;
    @Size(max = 100)
    @Column(name = "phone_no")
    private String phoneNo;
    @Size(max = 100)
    @Column(name = "email_id")
    private String emailId;
    @Size(max = 100)
    @Column(name = "status")
    private String status;
    @Column(name = "start_date")
    @Temporal(TemporalType.DATE)
    private Date startDate;
    @Column(name = "end_date")
    @Temporal(TemporalType.DATE)
    private Date endDate;
    @Size(max = 100)
    @Column(name = "imei")
    private String imei;
    @Column(name = "indent")
    private Integer indent;
    @Size(max = 255)
    @Column(name = "ref1")
    private String ref1;
    @Size(max = 255)
    @Column(name = "ref2")
    private String ref2;
    @Size(max = 255)
    @Column(name = "ref3")
    private String ref3;
    @Size(max = 255)
    @Column(name = "ref4")
    private String ref4;
    @Size(max = 255)
    @Column(name = "ref5")
    private String ref5;
    @Size(max = 50)
    @Column(name = "created_by")
    private String createdBy;
    @Column(name = "created_dtt")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdDtt;
    @Size(max = 50)
    @Column(name = "modified_by")
    private String modifiedBy;
    @Column(name = "modified_dtt")
    @Temporal(TemporalType.TIMESTAMP)
    private Date modifiedDtt;
    @Basic(optional = false)
    @NotNull
    @Column(name = "active_flag")
    private boolean activeFlag;
    @Basic(optional = false)
    @NotNull
    @Column(name = "delete_flag")
    private boolean deleteFlag;
    @Basic(optional = false)
    @NotNull
    @Column(name = "cancel_flag")
    private boolean cancelFlag;

    public Employee() {
    }

    public Employee(Integer oid) {
        this.oid = oid;
    }

    public Employee(Integer oid, boolean activeFlag, boolean deleteFlag, boolean cancelFlag) {
        this.oid = oid;
        this.activeFlag = activeFlag;
        this.deleteFlag = deleteFlag;
        this.cancelFlag = cancelFlag;
    }

    public Integer getOid() {
        return oid;
    }

    public void setOid(Integer oid) {
        this.oid = oid;
    }

    public String getFirmId() {
        return firmId;
    }

    public void setFirmId(String firmId) {
        this.firmId = firmId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getResourceId() {
        return resourceId;
    }

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    public String getResourceType() {
        return resourceType;
    }

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public String getImei() {
        return imei;
    }

    public void setImei(String imei) {
        this.imei = imei;
    }

    public Integer getIndent() {
        return indent;
    }

    public void setIndent(Integer indent) {
        this.indent = indent;
    }

    public String getRef1() {
        return ref1;
    }

    public void setRef1(String ref1) {
        this.ref1 = ref1;
    }

    public String getRef2() {
        return ref2;
    }

    public void setRef2(String ref2) {
        this.ref2 = ref2;
    }

    public String getRef3() {
        return ref3;
    }

    public void setRef3(String ref3) {
        this.ref3 = ref3;
    }

    public String getRef4() {
        return ref4;
    }

    public void setRef4(String ref4) {
        this.ref4 = ref4;
    }

    public String getRef5() {
        return ref5;
    }

    public void setRef5(String ref5) {
        this.ref5 = ref5;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public Date getCreatedDtt() {
        return createdDtt;
    }

    public void setCreatedDtt(Date createdDtt) {
        this.createdDtt = createdDtt;
    }

    public String getModifiedBy() {
        return modifiedBy;
    }

    public void setModifiedBy(String modifiedBy) {
        this.modifiedBy = modifiedBy;
    }

    public Date getModifiedDtt() {
        return modifiedDtt;
    }

    public void setModifiedDtt(Date modifiedDtt) {
        this.modifiedDtt = modifiedDtt;
    }

    public boolean getActiveFlag() {
        return activeFlag;
    }

    public void setActiveFlag(boolean activeFlag) {
        this.activeFlag = activeFlag;
    }

    public boolean getDeleteFlag() {
        return deleteFlag;
    }

    public void setDeleteFlag(boolean deleteFlag) {
        this.deleteFlag = deleteFlag;
    }

    public boolean getCancelFlag() {
        return cancelFlag;
    }

    public void setCancelFlag(boolean cancelFlag) {
        this.cancelFlag = cancelFlag;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (oid != null ? oid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Employee)) {
            return false;
        }
        Employee other = (Employee) object;
        if ((this.oid == null && other.oid != null) || (this.oid != null && !this.oid.equals(other.oid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Employee[ oid=" + oid + " ]";
    }
    
}
