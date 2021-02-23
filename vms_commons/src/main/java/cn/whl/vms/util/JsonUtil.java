package cn.whl.vms.util;

import com.fasterxml.jackson.databind.json.JsonMapper;

public class JsonUtil {
	//将对象转换为JSON数据

	public static String parseToJSON(Object obj) {
		JsonMapper jsonMapper = new JsonMapper();
		try {
			return jsonMapper.writeValueAsString(obj);
		}catch (Exception e){
			e.printStackTrace();
		}
		return "{}";
	}

	public static Object parseToObject(String json,Class argClass){
		JsonMapper jsonMapper = new JsonMapper();
		try {
			return jsonMapper.readValue(json,argClass);
		}catch (Exception e){
			e.printStackTrace();
		}
		return null;
	}
}
