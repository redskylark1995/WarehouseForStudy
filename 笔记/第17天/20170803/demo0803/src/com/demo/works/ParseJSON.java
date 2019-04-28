package com.demo.works;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 读取JSON数组格式的数据转换成Java集合
 * @author Teacher
 * @createTime 2017年8月3日 上午11:01:47
 * @version 1.0.0
 */
public class ParseJSON {

   public static List<Map<String, Object>> parseJSONArray(String path) throws IOException {
	   Reader reader = new InputStreamReader(
			   new FileInputStream(path), "GBK");
	   char[] cbuf = new char[1024];
	   int len = reader.read(cbuf);
	   String jsonStr = new String(cbuf, 0, len);
	   
	   //System.out.println(jsonStr);
	   String[] jsonArray = jsonStr.substring(
			   2, jsonStr.length()-2).split("\\}\\,\\{");
	   List<Map<String, Object>> list = new ArrayList<>();
	   for(String jsonObjectStr: jsonArray) {
		   Map<String, Object> jsonObject = new HashMap<>();
		   String[] fieldArray = jsonObjectStr.split(",");
		   for(String field: fieldArray) {
			   String[] kv = field.split("=");
			   jsonObject.put(kv[0], kv[1].replaceAll("\"", ""));
		   }
		   list.add(jsonObject);
	   }
	   return list;
   }
	
	public static void main(String[] args) {
		try {
			List<Map<String, Object>> list =ParseJSON.parseJSONArray("d:\\myfile\\data.json");
			System.out.println(list);
			System.out.println(list.get(0).get("name"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
