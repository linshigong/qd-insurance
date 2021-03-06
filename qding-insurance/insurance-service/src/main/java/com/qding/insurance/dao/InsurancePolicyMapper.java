package com.qding.insurance.dao;

import java.util.List;

import com.qding.insurance.domain.InsurancePolicy;
import com.qding.insurance.param.InsurancePolicyParam;
import com.qding.insurance.vo.InsurancePolicyDetailVo;
import com.qding.insurance.vo.InsurancePolicyInfo;
import com.qding.insurance.vo.RoomInsureStatusInfo;

public interface InsurancePolicyMapper {
	int deleteByPrimaryKey(String id);

	int insert(InsurancePolicy record);

	int insertSelective(InsurancePolicy record);

	InsurancePolicy selectByPrimaryKey(String id);

	int updateByPrimaryKeySelective(InsurancePolicy record);

	int updateByPrimaryKey(InsurancePolicy record);

	Integer countByParam(InsurancePolicyParam param);

	List<InsurancePolicyDetailVo> selectByParam(InsurancePolicyParam param);



	/**
	 * 根据平台订单号获取结果
	 */
	InsurancePolicy getResultByOrderID(String orderID);

	/**
	 * 根据房屋ID获取房屋投保状态
	 */
	List<RoomInsureStatusInfo> getRoomInsureStatusByRoomID(String roomID);

	/**
	 * 查询用户保单列表
	 */
	List<InsurancePolicyInfo> getUserInsurancePolicyList(String memberId);

	/**
	 *根据ID查询保单详细信息
	 */
	InsurancePolicyDetailVo getPolicyDetail(String policyId);

	/**
	 * 根据RoomID查单证
	 */
	InsurancePolicy getResultByRoomID(String roomID);
	/**
	 * 根据房屋ID查看是否房屋投保记录
	 * @param params
	 * @return
	 */
	List<InsurancePolicy> selectByRoomId(String roomId);
	
	/**
	 * 根据单证状态查询单证列表
	 * @param policyStatusUnenforced
	 * @return
	 */
	List<InsurancePolicy> selectByStatus(Integer policyStatus);
	


}