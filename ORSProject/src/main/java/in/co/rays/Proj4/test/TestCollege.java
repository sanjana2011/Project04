package in.co.rays.Proj4.test;

import java.sql.Timestamp;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import in.co.rays.Proj4.bean.CollegeBean;
import in.co.rays.Proj4.model.CollegeModel;


public class TestCollege {

	public static void main(String[] args) throws Exception {
		// testAdd();
		// testUpdate();
		// testDelete();
		// testFindByPk();
		// testFindByName();
		testSearch();
	}

	public static void testAdd() throws Exception {

		CollegeBean bean = new CollegeBean();
		bean.setName("vedika");
		bean.setAddress("rewa");
		bean.setState("MP");
		bean.setCity("satna");
		bean.setPhoneNo("7234567892");
		bean.setCreatedBy("ananya@gmail.com");
		bean.setModifiedBy("ananya@gmail.com");
		bean.setCreatedDatetime(new Timestamp(new Date().getTime()));
		bean.setModifiedDatetime(new Timestamp(new Date().getTime()));

		CollegeModel model = new CollegeModel();
		model.add(bean);
	}

	public static void testUpdate() throws Exception {

		CollegeModel model = new CollegeModel();

		CollegeBean bean = model.findByPk(4);
		bean.setName("soumya");
		bean.setAddress("indore");
		bean.setState("MP");

		model.update(bean);
	}

	public static void testDelete() throws Exception {
		CollegeModel model = new CollegeModel();
		CollegeBean bean = new CollegeBean ();
		bean.setId(2);
		model.delete(bean);
	}

	public static void testFindByPk() throws Exception {

		CollegeModel model = new CollegeModel();

		CollegeBean bean = model.findByPk(1);

		if (bean != null) {
			System.out.print(bean.getId());
			System.out.print("\t" + bean.getName());
			System.out.print("\t" + bean.getAddress());
			System.out.print("\t" + bean.getState());
			System.out.print("\t" + bean.getCity());
			System.out.print("\t" + bean.getPhoneNo());
			System.out.print("\t" + bean.getCreatedBy());
			System.out.print("\t" + bean.getModifiedBy());
			System.out.print("\t" + bean.getCreatedDatetime());
			System.out.println("\t" + bean.getModifiedDatetime());
		} else {
			System.out.println("id not found");
		}
	}

	public static void testFindByName() throws Exception {

		CollegeModel model = new CollegeModel();

		CollegeBean bean = model.findByName("sanjana");

		if (bean != null) {
			System.out.print(bean.getId());
			System.out.print("\t" + bean.getName());
			System.out.print("\t" + bean.getAddress());
			System.out.print("\t" + bean.getState());
			System.out.print("\t" + bean.getCity());
			System.out.print("\t" + bean.getPhoneNo());
			System.out.print("\t" + bean.getCreatedBy());
			System.out.print("\t" + bean.getModifiedBy());
			System.out.print("\t" + bean.getCreatedDatetime());
			System.out.println("\t" + bean.getModifiedDatetime());
		} else {
			System.out.println("college name not found");
		}
	}

	public static void testSearch() throws Exception {

		CollegeBean bean = new CollegeBean();
		// bean.setName("m");

		CollegeModel model = new CollegeModel();

		List list = model.search(bean, 1, 2);

		Iterator it = list.iterator();

		while (it.hasNext()) {
			bean = (CollegeBean) it.next();
			System.out.print(bean.getId());
			System.out.print("\t" + bean.getName());
			System.out.print("\t" + bean.getAddress());
			System.out.print("\t" + bean.getState());
			System.out.print("\t" + bean.getCity());
			System.out.print("\t" + bean.getPhoneNo());
			System.out.print("\t" + bean.getCreatedBy());
			System.out.print("\t" + bean.getModifiedBy());
			System.out.print("\t" + bean.getCreatedDatetime());
			System.out.println("\t" + bean.getModifiedDatetime());
		}
	}
}