package com.dong.gulimail.member.dao;

import com.dong.gulimail.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author litter_pi
 * @email 11@qq.com
 * @date 2021-08-01 13:08:52
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
