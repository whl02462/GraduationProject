package cn.whl.vms.service.impl;

import cn.whl.vms.base.pojo.vo.PageVO;
import cn.whl.vms.dao.DepartmentDao;
import cn.whl.vms.pojo.entity.Department;
import cn.whl.vms.service.DepartmentService;
import cn.whl.vms.util.IdGenerator;
import cn.whl.vms.util.PageUtil;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service("departmentService")
@Transactional
public class DepartmentServiceImpl implements DepartmentService {
	@Autowired
	private DepartmentDao dao;
	@Autowired
	private IdGenerator idGenerator;

	//根据查询对象分页查询
	@Override
	public PageVO<Department> getPageVOByQuery(Department query, PageVO<Department> pageVO) throws Exception {
		//打开分页过滤器
		PageHelper.startPage(pageVO.getPageNum(),pageVO.getPageSize());
		//进行列表查询
		List<Department> list = dao.finListByQuery(query);
		//创建分页对象
		new PageUtil<Department>().parseFromInfoVO(list,pageVO);
		return pageVO;
	}

	//根据查询对象查询列表
	@Override
	public List<Department> getListByQuery(Department query) throws Exception {
		return dao.finListByQuery(query);
	}

	//根据主键查询对象
	@Override
	public Department getById(String id) throws Exception {
		//创建查询对象
		Department query = new Department();
		query.setId(id);
		//列表查询
		List<Department> list = dao.finListByQuery(query);
		if (list != null && !list.isEmpty()){
			return list.get(0);
		}
		return null;
	}

	//保存
	@Override
	public boolean save(Department entity) throws Exception {
		//设定数据主键
		entity.setId(idGenerator.createId());
		//保存数据
		if (dao.save(entity) > 0) {
			return true;
		}
		return false;
	}

	//修改
	@Override
	public boolean update(Department entity) throws Exception {
		if (dao.update(entity) > 0){
			return true;
		}
		return false;
	}
}
