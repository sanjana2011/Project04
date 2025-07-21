package in.co.rays.Proj4.util;

import java.util.HashMap;
import java.util.List;
import java.util.Set;

import in.co.rays.Proj4.bean.DropdownListBean;
import in.co.rays.Proj4.bean.RoleBean;
import in.co.rays.Proj4.model.RoleModel;

public class HTMLUtility {

	public static String getList(String name, String selectedVal, HashMap<String, String> map) {

		StringBuffer sb = new StringBuffer(
				"<select style=\"width: 170px;text-align-last: center;\"; class='form-control' name='" + name + "'>");

		sb.append("\n<option selected value=''>-------------Select-------------</option>");

		Set<String> keys = map.keySet();
		String val = null;

		for (String key : keys) {
			val = map.get(key);
			if (key.trim().equals(selectedVal)) {
				sb.append("\n<option selected value='" + key + "'>" + val + "</option>");
			} else {
				sb.append("\n<option value='" + key + "'>" + val + "</option>");
			}
		}
		sb.append("\n</select>");
		return sb.toString();
	}

	public static String getList(String name, String selectedVal, List list) {

	
		// Collections.sort(list);

		List<DropdownListBean> dd = (List<DropdownListBean>) list;

		StringBuffer sb = new StringBuffer("<select style=\"width: 170px;text-align-last: center;\"; "
				+ "class='form-control' name='" + name + "'>");

		sb.append("\n<option selected value=''>-------------Select-------------</option>");

		String key = null;
		String val = null;

		for (DropdownListBean obj : dd) {
			key = obj.getKey();
			val = obj.getValue();

			if (key.trim().equals(selectedVal)) {
				sb.append("\n<option selected value='" + key + "'>" + val + "</option>");
			} else {
				sb.append("\n<option value='" + key + "'>" + val + "</option>");
			}
		}
		sb.append("\n</select>");
		return sb.toString();
	}

	public static void testGetListByMap() {

		HashMap<String, String> map = new HashMap<String, String>();
		map.put("male", "male");
		map.put("female", "female");

		String selectedValue = "null";
		String htmlSelectFromMap = HTMLUtility.getList("gender", selectedValue, map);

		System.out.println(htmlSelectFromMap);
	}

	public static void testGetListByList() throws Exception {

		RoleModel model = new RoleModel();

		List<RoleBean> list = model.list();

		String selectedValue = null;

		String htmlSelectFromList = HTMLUtility.getList("fname", selectedValue, list);

		System.out.println(htmlSelectFromList);
	}

	public static void main(String[] args) throws Exception {

		// testGetListByMap();

		testGetListByList();

	}
}