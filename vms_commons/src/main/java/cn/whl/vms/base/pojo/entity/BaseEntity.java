package cn.whl.vms.base.pojo.entity;

import java.io.Serializable;
import java.util.Date;

//封装一个基础的实体类
public class BaseEntity implements Serializable {
	private static final long serialVersionUID = 1036157524205408043L;
	private Integer status;
	private long createUser;
	private Date createTime;
	private long updateUser;
	private Date updateTime;

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public long getCreateUser() {
		return createUser;
	}

	public void setCreateUser(long createUser) {
		this.createUser = createUser;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public long getUpdateUser() {
		return updateUser;
	}

	public void setUpdateUser(long updateUser) {
		this.updateUser = updateUser;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}
}
