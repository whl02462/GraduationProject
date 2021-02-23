package cn.whl.vms.base.pojo.enums;


import java.util.Properties;

//枚举常量工具类
class EnumConstant {
	private static Properties props = new Properties();

	static {
		try{
			props.load(EnumConstant.class.getClassLoader().getResourceAsStream("props/enums.properties"));
		}catch (Exception e){
			e.printStackTrace();
		}
	}

	static final Integer STATUS_ENABLE = Integer.parseInt(props.getProperty("status.enable"));

	static final Integer STATUS_DISABLE = Integer.parseInt(props.getProperty("status.disable"));

	static final Integer RESPONSE_SUCCESS = Integer.parseInt(props.getProperty("response.success"));

	static final Integer RESPONSE_ERROR = Integer.parseInt(props.getProperty("response.error"));

	static final Integer RESPONSE_EXCEPTION = Integer.parseInt(props.getProperty("response.exception"));

}
