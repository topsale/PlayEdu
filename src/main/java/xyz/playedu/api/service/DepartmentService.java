package xyz.playedu.api.service;

import xyz.playedu.api.domain.Department;
import com.baomidou.mybatisplus.extension.service.IService;
import xyz.playedu.api.exception.NotFoundException;

import java.util.List;

/**
 * @author tengteng
 * @description 针对表【departments】的数据库操作Service
 * @createDate 2023-02-19 10:39:57
 */
public interface DepartmentService extends IService<Department> {

    List<Department> listByParentId(Integer id);

    Department findOrFail(Integer id) throws NotFoundException;

    void deleteById(Integer id) throws NotFoundException;

    void update(Department department, String name, Integer parentId, Integer sort) throws NotFoundException;

}
