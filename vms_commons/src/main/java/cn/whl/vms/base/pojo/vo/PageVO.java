package cn.whl.vms.base.pojo.vo;

import cn.whl.vms.util.ConstantUtil;

import java.io.Serializable;
import java.util.List;

public class PageVO<E> implements Serializable {
	private static final long serialVersionUID = 9201697608079773124L;
	private Integer pageNum;
	private Integer pageSize;
	private Integer draw;
	private List<E> list;
	private Long totalCount;
	private Integer totalPage;
	public PageVO() {}

	public PageVO(Integer pageNum, Integer pageSize) {
		if (pageNum != null && pageNum > 0){
			this.pageNum = pageNum;
		}else {
			this.pageNum = ConstantUtil.PAGE_NUM;
		}
		if (pageSize != null && pageSize > 0){
			this.pageSize = pageSize;
		}else {
			this.pageSize = ConstantUtil.PAGE_SIZE;
		}

	}

	public PageVO(Integer pageNum, Integer pageSize,Integer draw) {
		if (pageNum != null && pageNum > 0){
			this.pageNum = pageNum;
		}else {
			this.pageNum = ConstantUtil.PAGE_NUM;
		}
		if (pageSize != null && pageSize > 0){
			this.pageSize = pageSize;
		}else {
			this.pageSize = ConstantUtil.PAGE_SIZE;
		}
		this.draw = draw;
	}

	public Integer getPageNum() {
		return pageNum;
	}

	public void setPageNum(Integer pageNum) {
		this.pageNum = pageNum;
	}

	public Integer getPageSize() {
		return pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public Integer getDraw() {
		return draw;
	}

	public void setDraw(Integer draw) {
		this.draw = draw;
	}

	public List<E> getList() {
		return list;
	}

	public void setList(List<E> list) {
		this.list = list;
	}

	public Long getTotalCount() {
		return totalCount;
	}

	public void setTotalCount(Long totalCount) {
		this.totalCount = totalCount;
	}

	public Integer getTotalPage() {
		return totalPage;
	}

	public void setTotalPage(Integer totalPage) {
		this.totalPage = totalPage;
	}
}
