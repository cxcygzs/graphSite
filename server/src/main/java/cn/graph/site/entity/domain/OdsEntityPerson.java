package cn.graph.site.entity.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 人物实体信息
 * {@code @TableName} ods_entity_person
 */
@TableName(value ="ods_entity_person")
@NoArgsConstructor
@Data
public class OdsEntityPerson implements Serializable {
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
     * 实体类别（人物）
     */
    private String entityType;

    /**
     * 性别
     */
    private String sex;

    /**
     * 年龄
     */
    private Integer age;

    /**
     * 身份证号码
     */
    private String cardId;

    /**
     * 家庭住址
     */
    private String home;

    /**
     * 家庭住址
     */
    private String nowAddress;

    /**
     * 手机号码
     */
    private String tel;

    /**
     * 其他信息
     */
    private String other;

    /**
     * 检测时间
     */
    private String inspectTime;

    /**
     * 状态
     */
    private String caseStatus;

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