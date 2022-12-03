package cn.graph.site.entity.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 基本信息表
 * {@code @TableName} ods_information_base
 */
@TableName(value ="ods_information_base")
@Data
public class OdsInformationBase implements Serializable {
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
     * 类别（枚举值-实体/关系）
     */
    private String baseType;

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