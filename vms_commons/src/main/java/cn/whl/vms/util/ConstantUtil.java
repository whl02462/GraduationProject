package cn.whl.vms.util;

import java.util.Properties;

public class ConstantUtil {
	private static Properties props = new Properties();

	static {
		try{
			props.load(ConstantUtil.class.getClassLoader().getResourceAsStream("props/system.properties"));
		}catch (Exception e){
			e.printStackTrace();
		}
	}

	public static final Integer PAGE_NUM = Integer.parseInt(props.getProperty("page.num"));

	public static final Integer PAGE_SIZE = Integer.parseInt(props.getProperty("page.size"));

}
