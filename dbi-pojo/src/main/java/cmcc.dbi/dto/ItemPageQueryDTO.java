package cmcc.dbi.dto;

import io.swagger.annotations.ApiModel;
import lombok.Data;

import java.io.Serializable;

@Data
@ApiModel(description = "巡检项分页查询传递的数据模型")
public class ItemPageQueryDTO implements Serializable {

    // 巡检项名称
    private String itemName;

    // 数据库技术栈
    private String dbType;

    // 巡检类别
    private Integer itemType;

    // 页码
    private Integer pageNum;
}
