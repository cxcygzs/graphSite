package cn.graph.site.entity.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serial;
import java.io.Serializable;
import java.util.Date;

/**
 * 地址实体信息
 * {@code @TableName} ods_entity_adrr
 */
@TableName(value ="ods_entity_adrr")
@Data
public class OdsEntityAdrr implements Serializable {
    /**
     * 主键唯一id
     */
    @TableId(type = IdType.ASSIGN_UUID)
    private String id;

    /**
     * 名称
     */
    private String name;

    /**
     * 实体类别（地址）
     */
    private String entityType;

    /**
     * 属于
     */
    private String belongTo;

    /**
     * 风险等级
     */
    private String level;

    /**
     * 其他信息
     */
    private String other;

    /**
     * 经度
     */
    private String longitude;

    /**
     * 维度
     */
    private String latitude;

    /**
     * 备用字段
     */
    private String alterField1;

    /**
     * 备用字段
     */
    private String alterField2;

    /**
     * 备用字段
     */
    private String alterField3;

    /**
     * 备用字段
     */
    private String alterField4;

    /**
     * 备用字段
     */
    private String alterField5;

    /**
     * 备用字段
     */
    private String alterField6;

    /**
     * 备用字段
     */
    private String alterField7;

    /**
     * 备用字段
     */
    private String alterField8;

    /**
     * 数据来源
     */
    private String source;

    /**
     * 状态（系统字段）
     */
    private Integer status;

    /**
     * 自增索引（系统字段）
     */
    private Integer incr;

    /**
     * 创建人（系统字段）
     */
    private String createUser;

    /**
     * 更新人（系统字段）
     */
    private String updateUser;

    /**
     * 创建时间（系统字段）
     */
    private Date createTime;

    /**
     * 更新时间（系统字段）
     */
    private Date updateTime;
}