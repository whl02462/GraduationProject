package cn.whl.vms.base.pojo.enums;

//系统响应码枚举信息
public enum ResponseEnum {
	RESPONSE_SUCCESS(EnumConstant.RESPONSE_SUCCESS,"系统响应处理成功"),
	RESPONSE_ERROR(EnumConstant.RESPONSE_ERROR,"系统响应处理失败"),
	RESPONSE_EXCEPTION(EnumConstant.RESPONSE_EXCEPTION,"系统响应处理异常");

	private Integer code;
	private String remark;

	private ResponseEnum(Integer code, String remark) {
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
