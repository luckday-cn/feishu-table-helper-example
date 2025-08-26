package cn.isliu.simple;

import cn.isliu.core.BaseEntity;
import cn.isliu.core.annotation.TableProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class Employee extends BaseEntity {

    @TableProperty(value = {"ID", "员工信息", "员工编号"}, order = 0)
    private String employeeId;

    @TableProperty(value = {"ID", "员工信息", "姓名"}, order = 1)
    private String name;

    @TableProperty(value = "部门", order = 3)
    private String department;

    @TableProperty(value = {"员工信息", "邮箱"}, order = 2)
    private String email;
}
