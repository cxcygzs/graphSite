package cn.graph.site.entity.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 关系信息
 * {@code @TableName} ods_links_all
 */
@TableName(value ="ods_links_all")
@Data
public class OdsLinksAll implements Serializable {
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
     * 关系类别（人-人/人-地址）
     */
    private String relType;

    /**
     * 开始节点id
     */
    private String startEntityId;

    /**
     * 开始节点名称
     */
    private String startEntityName;

    /**
     * 结束节点id
     */
    private String endEntityId;

    /**
     * 结束节点名称
     */
    private String endEntityName;

    /**
     * 发生时间
     */
    private String occTime;

    /**
     * 其他信息
     */
    private String other;

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