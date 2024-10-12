package cmcc.dbi.vo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDateTime;


/**
 * 查询数据库视图对象
 */
// TODO: 没定，没法写
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class DbVO implements Serializable {
    private Long dbId;

    //所属部门
    private String department;

    // 标准业务系统
    private String standardSystem;

    // 系统别名或子模块
    private String systemAlias;

    // 网络域
    private String domain;

    // 资源池
    private String resourcePool;

    // POD
    private String pod;

    // 是否paas数据库
    private Integer isPaasDb;

    // OS平台
    private String osPlatform;

    // OS版本
    private String osVersion;

    // 数据库类型
    private String dbType;

    // 数据库版本
    private String dbVersion;

    // 数据库架构
    private String dbSchema;

    // 组件类型（分布式数据库需填写）
    private String componentType;

    // 补丁
    private String patch;

    // 数据库名
    private String dbName;

    // 主机名
    private String hostName;

    // 数据库vip
    private Long dbVip;

    // 业务ip
    private Long businessIp;

    // 业务承载网ip
    private Long businessNetIp;

    // 接入监控ip
    private Long monitorIp;

    // 数据库实例名
    private String dbInstanceName;

    // 数据库端口
    private Long dbPort;

    // 登录方式
    private String loginType;

    // 数据库安装主机用户
    private String dbInstallUser;

    // 数据库超级账号
    private String dbRoot;

    // 巡检方法
    private String inspectionMethod;

    // 裸金属/虚拟化
    private String vmType;

    // 用途：生产/测试
    private String useType;

    // cpu个数
    private Long cpuNum;

    // cpu核数
    private Long cpuCoreNum;

    // 内存
    private Long memory;

    // 数据盘存储类型
    private String storageType;

    // 数据库是否交维
    private Integer isDbInspection;

    // 4A管理平台是否交维
    private Integer is4aInspection;

    // 上线时间
    private LocalDateTime onlineTime;

    // 备注
    private String remark;

}
