package cn.ww.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @author Su-wenwu
 * @createTime 2022-09-16-15:25
 */

@Data
@TableName("t_product")
public class Product extends BaseEntity{

    private String title; //商品名称

    private Integer price; //价格（分）
}
