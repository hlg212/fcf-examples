package io.github.hlg212.fcf_examples.curdie.model.po;

import io.github.hlg212.fcf.annotation.Field;
import io.github.hlg212.fcf.annotation.PkId;
import io.github.hlg212.fcf.model.Model;
import io.github.hlg212.fcf.annotation.Table;
import lombok.Data;
import java.util.Date;

/** 
 *  
 * 
 * @author huanglg
 * @date 2022-03-24
 */
@Table("T_CURDIE_USER")
@Data 
public class CurdieUser extends Model {

	private static final long serialVersionUID = 1L;

	@PkId
	private String id;

	@Field(description="名称")
	private String name;

	@Field(description="性别")
	private String sex;

	@Field(description="创建时间")
	private Date createTime;

	@Field(description="创建人")
	private String createUser;

	@Field(description="更新时间")
	private Date updateTime;

	@Field(description="更新人")
	private String updateUser;

	private Date lastLoginTime;

	private String isOnline;


}
