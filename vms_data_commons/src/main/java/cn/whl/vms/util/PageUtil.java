package cn.whl.vms.util;

import cn.whl.vms.base.pojo.vo.PageVO;
import com.github.pagehelper.PageInfo;

import java.util.List;

//分页工具类
public class PageUtil<E> {
	public void parseFromInfoVO(List<E> list, PageVO<E> pageVO){
		//创建PageInfo对象
		PageInfo<E> pageInfo = new PageInfo<E>(list);
		pageVO.setList(pageInfo.getList());
		pageVO.setTotalCount(pageInfo.getTotal());
		pageVO.setTotalPage(pageInfo.getPages());
	}
}
