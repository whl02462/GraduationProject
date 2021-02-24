package cn.whl.vms.dao;

import cn.whl.vms.pojo.entity.Department;
import org.springframework.stereotype.Repository;

import java.util.List;

//部门功能数据持久层接口
@Repository
public interface DepartmentDao {

	//按照查询对象查询列表
	List<Department> finListByQuery(Department query) throws Exception;

	//保存对象信息
	int save(Department entity) throws Exception;

	//修改对象信息
	int update(Department entity) throws Exception;

}
