package org.example.mapper;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import org.example.beans.Employee;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author zhengbingyuan
 * @since 2021-04-17
 */
public interface EmployeeMapper extends BaseMapper<Employee> {
    int deleteAll();
}
