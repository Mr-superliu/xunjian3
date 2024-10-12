package cmcc.dbi.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 消息通知表
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class inspectionMsg {
    // 主键：消息通知id
    private Long msgId;

    // 电话
    private String phone;

    // 邮箱
    private String email;

    // 自定义通知时间
    private String time;

    // 完成是否通知
    private Integer isMsg;
}
