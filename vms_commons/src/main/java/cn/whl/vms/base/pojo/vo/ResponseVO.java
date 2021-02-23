package cn.whl.vms.base.pojo.vo;

import cn.whl.vms.base.pojo.enums.ResponseEnum;

import java.io.Serializable;

//系统响应视图信息
public class ResponseVO<E> implements Serializable {
	private static final long serialVersionUID = 6081248454762536174L;
	private Integer code;
	private E data;

	private ResponseVO(Integer code) {
		this.code = code;
	}

	private ResponseVO(Integer code, E data) {
		this.code = code;
		this.data = data;
	}

	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public E getData() {
		return data;
	}

	public void setData(E data) {
		this.data = data;
	}

	public static ResponseVO successResponseVO(){
		return new ResponseVO(ResponseEnum.RESPONSE_SUCCESS.getCode());
	}

	public static ResponseVO successResponseVO(Object data){
		return new ResponseVO(ResponseEnum.RESPONSE_SUCCESS.getCode(),data);
	}

	public static ResponseVO errorResponseVO(Object data){
		return new ResponseVO(ResponseEnum.RESPONSE_ERROR.getCode(),data);
	}

	public static ResponseVO exceptionResponseVO(Object data){
		return new ResponseVO(ResponseEnum.RESPONSE_EXCEPTION.getCode(),data);
	}
}
