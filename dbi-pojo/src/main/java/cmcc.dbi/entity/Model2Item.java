package cmcc.dbi.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 巡检模板与巡检项映射表实体
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Model2Item {
    // 主键
    private Long id;

    // 巡检模板id
    private Long modelId;

    // 巡检项id
    private Long itemId;
}
