package cn.whl.vms.base.pojo.enums;

//系统状态枚举信息
public enum StatusEnum {
	STATUS_ENABLE(EnumConstant.STATUS_ENABLE,"启用"),
	STATUS_DISABLE(EnumConstant.STATUS_DISABLE,"禁用");
	private Integer code;
	private String remark;

	private StatusEnum(Integer code, String remark) {
		this.code = code;
		this.remark = remark;
	}

	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}
}
