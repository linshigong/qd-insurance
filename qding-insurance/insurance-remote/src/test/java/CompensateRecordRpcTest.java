

import org.junit.Before;
import org.junit.Test;

import com.alibaba.dubbo.config.ApplicationConfig;
import com.alibaba.dubbo.config.RegistryConfig;
import com.alibaba.fastjson.JSONObject;
import com.qding.framework.common.dubbo.QDDubboProxyFactory;
import com.qding.insurance.rpc.ICompensateRecordRpc;
import com.qding.insurance.rpc.response.CompensateRecordListResponse;
import com.qding.insurance.rpc.response.CompensateRecordResponse;
import com.qding.insurance.schedule.PolicyActOrExpireJob;
import com.qding.schedule.common.struct.QdScheduleException;


public class CompensateRecordRpcTest {
	ICompensateRecordRpc recordRpc;
	@Before
	public void init() {
		// 当前应用配置
		ApplicationConfig application = new ApplicationConfig();
		application.setName("policyRpc-test");
		application.setOwner("");

		// 连接注册中心配置
		RegistryConfig registry = new RegistryConfig();
		registry.setTimeout(10000);
		registry.setProtocol("zookeeper");
		registry.setAddress(" 10.37.251.221:2181,10.37.251.221:2182,10.37.251.222:2181");// dev
		// registry.setAddress("10.37.253.31:2181,10.37.253.31:2182,10.37.253.31:2183");//qa

		// QDDubboProxyFactory不能重用
		recordRpc = (ICompensateRecordRpc) new QDDubboProxyFactory(application, registry)
				.create(ICompensateRecordRpc.class, null);
	}
	@Test
	public void testgetcpsRecordList(){
		CompensateRecordListResponse responce = 
				recordRpc.getCompensateRecord("10", "");
		System.out.println(JSONObject.toJSONString(responce));
	}
	
	@Test
	public void getComRecordById(){
		CompensateRecordResponse response = 
				recordRpc.getCompensateRecordById("297ee9d263f7f92a0163f80228190001");
		
		System.out.println(JSONObject.toJSONString(response));
	}
	
	
	
	

}
