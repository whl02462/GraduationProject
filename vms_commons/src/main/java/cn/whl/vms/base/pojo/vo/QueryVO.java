package cn.whl.vms.base.pojo.vo;

import java.io.Serializable;

//查询视图信息
public class QueryVO<E> implements Serializable {
	private static final long serialVersionUID = -2249154249347620566L;
	private E query;
	private PageVO<E> pageVO;

	public QueryVO(E query, PageVO<E> pageVO) {
		this.query = query;
		this.pageVO = pageVO;
	}

	public E getQuery() {
		return query;
	}

	public void setQuery(E query) {
		this.query = query;
	}

	public PageVO<E> getPageVO() {
		return pageVO;
	}

	public void setPageVO(PageVO<E> pageVO) {
		this.pageVO = pageVO;
	}
}
