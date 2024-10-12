package cmcc.dbi.entity;

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
public class InspectionScript implements Serializable {
    // 主键：脚本id
    private Long scriptId;

    // 脚本名称
    private String scriptName;

    // 脚本类型
    private Integer scriptType;

    // 技术栈类型
    private Integer techStack;

    // 巡检类别
    private Integer inspectionType;

    // 类别名称
    private String inspectionName;

    // 数据库版本号
    private String dbVersion;

    // 操作系统类型
    private String osType;

    // 描述
    private String description;

    // 巡检脚本
    private String script;

    // 输入参数
    private String input;

    // 输出参数
    private String output;
}
