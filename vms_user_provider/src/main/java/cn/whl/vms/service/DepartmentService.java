package cn.whl.vms.service;

import cn.whl.vms.base.pojo.vo.PageVO;
import cn.whl.vms.pojo.entity.Department;

import java.util.List;

public interface DepartmentService {

	//根据查询对象分页查询
	PageVO<Department> getPageVOByQuery(Department query,PageVO<Department> pageVO) throws Exception;

	//根据查询对象查询列表
	List<Department> getListByQuery(Department query) throws Exception;

	//根据主键查询对象
	Department getById(String id) throws Exception;

	//保存
	boolean save(Department entity) throws Exception;

	//修改
	boolean update(Department entity) throws Exception;


}
