package cmcc.dbi.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 巡检计划项表
 * - 用于存储巡检计划的具体的巡检项的信息
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class InspectionPlanItem {
    // 主键：巡检计划项ID
    private Long planItemId;

    // 关联的巡检计划ID
    private Long planId;

    // 已配置的巡检项id
    private Long itemId;

    // 巡检项名称
    private String itemName;

    // 巡检项对应的数据库类型
    private String dbType;

    // 巡检项描述
    private String itemDesc;

    // 巡检项级别：0/1/2/3 = 低/中/高/重大
    private Integer itemLevel;

    // 巡检项类别：0/1/2 = 资源/安全/性能
    private Integer itemType;

    // 默认健康条件：json
    private Integer defaultCondition;

    // 实际查询条件：json
    private Integer actualCondition;

    // 巡检脚本id
    private Integer scriptId;
}
