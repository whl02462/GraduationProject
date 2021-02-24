package cn.whl.vms.transport.impl;

import cn.whl.vms.base.pojo.vo.PageVO;
import cn.whl.vms.base.pojo.vo.QueryVO;
import cn.whl.vms.pojo.entity.Department;
import cn.whl.vms.service.DepartmentService;
import cn.whl.vms.transport.DepartmentTransport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController("departmentTransport")
@RequestMapping("/user/transport")
public class DepartmentTransportImpl implements DepartmentTransport {
	@Autowired
	private DepartmentService service;

	//根据查询对象分页查询
	@PostMapping("/page")
	@Override
	public PageVO<Department> getPageVOByQuery(@RequestBody QueryVO<Department> queryVO) throws Exception {
		Department query = queryVO.getQuery();
		PageVO<Department> pageVO = queryVO.getPageVO();
		return service.getPageVOByQuery(query,pageVO);

	}

	//根据查询对象查询列表
	@PostMapping("/list")
	@Override
	public List<Department> getListByQuery(@RequestBody Department query) throws Exception {
		return service.getListByQuery(query);
	}

	//根据主键查询对象
	@RequestMapping("/id")
	@Override
	public Department getById(@RequestParam String id) throws Exception {
		return service.getById(id);
	}

	//保存
	@RequestMapping("/save")
	@Override
	public boolean save(@RequestBody Department entity) throws Exception {
		return service.save(entity);
	}

	//修改
	@RequestMapping("/update")
	@Override
	public boolean update(@RequestBody Department entity) throws Exception {
		return service.update(entity);
	}
}
