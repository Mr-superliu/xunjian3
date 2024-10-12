package cmcc.dbi.dto;

import io.swagger.annotations.ApiModel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * 巡检脚本实体类
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(value = "巡检脚本分页查询传递的数据")
public class ScriptPageQueryDTO implements Serializable {

    // 脚本名称
    private String scriptName;

    // 脚本类型
    private String scriptType;

    // 技术栈类型
    private String techStack;

    // 类别名称
    private String categoryName;

    // 巡检类别
    private String inspectionCategory;

    // 数据库版本号
    private String dbVersion;

    // 操作系统类型
    private String osType;

    //页码
    private int page;

    //每页显示记录数
    private int pageSize;


}
