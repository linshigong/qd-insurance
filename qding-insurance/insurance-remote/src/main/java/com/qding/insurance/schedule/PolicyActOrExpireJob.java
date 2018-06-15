package com.qding.insurance.schedule;

import org.apache.log4j.Logger;

import com.qding.framework.common.constants.HttpStatus;
import com.qding.framework.common.util.SpringContextUtils;
import com.qding.insurance.service.IInsurancePolicyService;
import com.qding.schedule.client.BaseScheduleJob;
import com.qding.schedule.common.struct.QdScheduleException;

public class PolicyActOrExpireJob extends BaseScheduleJob {
	
	private Logger logger = Logger.getLogger(PolicyActOrExpireJob.class);
	    
	IInsurancePolicyService policyService = (IInsurancePolicyService) SpringContextUtils.getBean("insurancePolicyService");

	public PolicyActOrExpireJob() {
	}

	@Override
	public void run() throws QdScheduleException {
		 try {
			 policyService.policyAct();
	     }catch (Exception e) {
	         logger.error("保险单证到期生效失败",e);
	         throw new QdScheduleException(HttpStatus.INTERNAL_SERVER_ERROR.getStatusCode()+"", "保险单证到期生效失败: "+e.getMessage());
	     }
	        
	     try {
	         policyService.policyExpire();
	     }catch (Exception e) {
	         logger.error("保险单证到期失效失败",e);
	         throw new QdScheduleException(HttpStatus.INTERNAL_SERVER_ERROR.getStatusCode()+"", "保险单证到期失效失败: "+e.getMessage());
	     }
	}
	
	
	 

}
