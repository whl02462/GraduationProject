package cn.whl.vms.pojo.entity;

import cn.whl.vms.base.pojo.entity.BaseEntity;

//部门实体信息
public class Department extends BaseEntity {
	private static final long serialVersionUID = 8980587972229315081L;
	private String id;
	private String name;
	private String code;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}
}
