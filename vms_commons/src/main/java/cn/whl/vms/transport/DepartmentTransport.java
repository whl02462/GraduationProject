package cn.whl.vms.transport;

import cn.whl.vms.base.pojo.vo.PageVO;
import cn.whl.vms.base.pojo.vo.QueryVO;
import cn.whl.vms.pojo.entity.Department;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@FeignClient(name = "vms_user_provider")
@RequestMapping("/user/transport")
public interface DepartmentTransport {

	//根据查询对象分页查询
	@PostMapping("/page")
	PageVO<Department> getPageVOByQuery(@RequestBody QueryVO<Department> queryVO) throws Exception;

	//根据查询对象查询列表
	@PostMapping("/list")
	List<Department> getListByQuery(@RequestBody Department query) throws Exception;

	//根据主键查询对象
	@RequestMapping("/id")
	Department getById(@RequestParam String id) throws Exception;

	//保存
	@RequestMapping("/save")
	boolean save(@RequestBody Department entity) throws Exception;

	//修改
	@RequestMapping("/update")
	boolean update(@RequestBody Department entity) throws Exception;

}
