package com.suke.czx.modules.file.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import java.io.Serializable;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonProperty;



/**
 * 
 *
 * @author cao
 * @email object_czx@163.com
 * @date 2023-03-21 16:51:18
 */
@Data
@TableName("t_files")
public class TFiles implements Serializable {
public static final long serialVersionUID = 1L;

			@ApiModelProperty(value = "")
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
		@JsonProperty(value = "createdAt")
public Date createdAt;

				@ApiModelProperty(value = "")
	@JsonProperty(value = "fileSize")
public Integer fileSize;

				@ApiModelProperty(value = "")
	@JsonProperty(value = "fileType")
public String fileType;

				@ApiModelProperty(value = "")
	@JsonProperty(value = "filename")
public String filename;

				@ApiModelProperty(value = "")
	@JsonProperty(value = "filepath")
public String filepath;

		@TableId(type = IdType.ASSIGN_UUID)
				@ApiModelProperty(value = "")
	@JsonProperty(value = "id")
public Integer id;

			@ApiModelProperty(value = "")
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
		@JsonProperty(value = "updatedAt")
public Date updatedAt;


}
