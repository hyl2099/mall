package com.mall.ware.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 首页轮播广告
 * 
 * @author yolanda
 * @email yolanda@gmail.com
 * @date 2021-05-09 20:00:57
 */
@Data
@TableName("sms_home_adv")
public class SmsHomeAdvEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * id
	 */
	@TableId
	private Long id;
	/**
	 * 名字
	 */
	private String name;
	/**
	 * 图片地址
	 */
	private String pic;
	/**
	 * 开始时间
	 */
	private Date startTime;
	/**
	 * 结束时间
	 */
	private Date endTime;
	/**
	 * 状态
	 */
	private Integer status;
	/**
	 * 点击数
	 */
	private Integer clickCount;
	/**
	 * 广告详情连接地址
	 */
	private String url;
	/**
	 * 备注
	 */
	private String note;
	/**
	 * 排序
	 */
	private Integer sort;
	/**
	 * 发布者
	 */
	private Long publisherId;
	/**
	 * 审核者
	 */
	private Long authId;

}