package cmcc.dbi.constant;

import org.omg.CORBA.PUBLIC_MEMBER;

/**
 * 状态常量
 */
public class StatusConstant {
    /**
     * 巡检类型：默认巡检/专项巡检/深度巡检
     */
    public static final Integer DEFAULT_INSPECTION = 0;
    public static final Integer SPECIAL_INSPECTION = 1;
    public static final Integer DEPETH_INSPECTION = 2;

    /**
     * 执行频率：每天/每月/每年
     */
    public static final Integer EVERY_DAY = 0;
    public static final Integer EVERY_MONTH = 1;
    public static final Integer EVERY_YEAR = 2;

    /**
     * 巡检状态：待执行/正在执行/执行成功/执行失败
     */
    public static final Integer TO_EXECUTED = 0;
    public static final Integer EXECUTING = 1;
    public static final Integer EXECUTED_SUCCESS = 2;
    public static final Integer EXECUTED_FAILURE = 3;

    /**
     * 结果状态
     */
    // TODO：结果状态待定，仍不清楚怎么分类

    /**
     * 告警级别：低/中/高
     */
    public static final Integer LOW_ALARM = 0;
    public static final Integer MID_ALARM = 1;
    public static final Integer HIGH_ALARM = 2;

    /**
     * 巡检项类别：资源/安全/性能
     */
    public static final Integer RESOURCE_CLASS = 0;
    public static final Integer SECURITY_CLASS = 1;
    public static final Integer PERFORMANCE_CLASS = 2;

    /**
     * 数据库级别：A/B/C
     */
    public static final Integer GRADE_A = 0;
    public static final Integer GRADE_B = 1;
    public static final Integer GRADE_C = 2;

    /**
     * 巡检项级别：低/中/高/重大
     */
    public static final Integer ITEM_LOW = 0;
    public static final Integer ITEM_MID = 1;
    public static final Integer ITEM_HIGH = 2;
    public static final Integer ITEM_BIG_BIG = 3;
}
