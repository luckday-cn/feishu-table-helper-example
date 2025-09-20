package cn.isliu.simple;

import cn.isliu.core.BaseEntity;
import cn.isliu.core.annotation.TableConf;
import cn.isliu.core.annotation.TableProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableConf(headLine = 3, titleRow = 3)
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
