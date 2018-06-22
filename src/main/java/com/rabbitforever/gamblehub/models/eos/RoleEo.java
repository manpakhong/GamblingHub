package com.rabbitforever.gamblehub.models.eos;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "gbl_role")
public class RoleEo {
	protected Integer id;
	protected String roleId;
	protected String roleName;
	protected String roleDesc;
	protected Date updateDate;
	protected Date createDate;
	protected String updatedBy;
	protected String createdBy;
	protected String remarks;

	public RoleEo(Integer id, String roleId, String roleName, String roleDesc, Date updateDate, Date createDate,
			String updatedBy, String createdBy, String remarks) {
		super();
		this.id = id;
		this.roleId = roleId;
		this.roleName = roleName;
		this.roleDesc = roleDesc;
		this.updateDate = updateDate;
		this.createDate = createDate;
		this.updatedBy = updatedBy;
		this.createdBy = createdBy;
		this.remarks = remarks;
	}
	@Id
	@Column(name = "id")
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	@Column(name = "role_id", length = 255, nullable = false)
	public String getRoleId() {
		return roleId;
	}

	public void setRoleId(String roleId) {
		this.roleId = roleId;
	}
	@Column(name = "role_name", length = 255, nullable = false)
	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}
	@Column(name = "role_desc", length = 255, nullable = false)
	public String getRoleDesc() {
		return roleDesc;
	}

	public void setRoleDesc(String roleDesc) {
		this.roleDesc = roleDesc;
	}
	@Column(name = "update_date", nullable = false)
	public Date getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}
	@Column(name = "create_date", nullable = false)
	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	@Column(name = "updated_by", length = 255, nullable = false)
	public String getUpdatedBy() {
		return updatedBy;
	}

	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}
	@Column(name = "created_by", length = 255, nullable = false)
	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}
	@Column(name = "remarks", length = 255, nullable = false)
	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

}
