package cmcc.dbi.entity;

import io.swagger.models.auth.In;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * 巡检计划表实体类
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class InspectionPlan implements Serializable {
    // 主键：巡检计划id
    private Long planId;

    // 巡检任务名称
    private String planName;

    // 创建人
    private String createPeople;

    // 执行类别: 0-定时执行，1-周期执行
    private Integer execType;

    // 创建时间
    private LocalDateTime createTime;

    // 开始时间
    private LocalDateTime startTime;

    // 结束时间
    private LocalDateTime endTime;

    // 更新时间
    private LocalDateTime updateTime;

    // 待执行时间
    private LocalDateTime execTime;

    // 执行频率：0-每天，1-每周，2-每月（周期任务）
    private Integer execFreq;

    // 已执行次数（周期任务）
    private Integer execNum;

    // 总执行次数（周期任务）
    private Integer totalNum;

    // 巡检项总数量
    private Integer itemSumNum;

    // 异常项数量
    private Integer ItemErrorNum;

    // 选择的巡检数据库
    private Integer dbId;

}
