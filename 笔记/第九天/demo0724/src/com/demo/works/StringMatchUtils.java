package com.demo.works;

/**
 * 字符串处理的工具类
 * @author Teacher
 * @createTime 2017年7月24日 上午9:23:42
 * @version 1.0.0
 */
public class StringMatchUtils {

	/**
	 * 判断是否由字母或数字组成
	 * @param data
	 * @return
	 */
    public static boolean isLetterNumber(String data) {
    	/*data = data.replaceAll("\\w", "");
    	return data.length()>0 ? false : true;*/
    	//return data.matches("\\w{6,20}");
    	//return data.matches("[a-zA-Z]+_+[0-9]+");
    	return data.matches("\\w{6,20}")
    			   &&!data.matches(
    					   "[a-zA-Z]{6,20}|[a-zA-Z0-9]{6,20}"
    					   + "|[0-9]{6,20}|_{6,20}|[a-zA-Z_]{6,20}"
    					   + "|[0-9_]{6,20}");
    }
	
	public static void main(String[] args) {
		//String str = "abc123_ABCabc123_ABC";
		String str = "_Abcabc123";
		if(isLetterNumber(str)) {
			System.out.println("由字母、_和数字组成!");
		} else {
			//System.out.println("包含非法字符!");
			System.out.println("字符串格式不匹配，6~20个字母数字下划线组成!");
		}
	}

}
