/* Added Seven File */
package com.first;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class Seven {

	public static void main(String[] args) {
		
		Map<String,Serializable> mapList = new HashMap<>();
		mapList.put("companyExits", true);
		
		System.out.println(mapList);

	}

}

