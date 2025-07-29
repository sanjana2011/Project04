package in.co.rays.Proj4.test;

import java.sql.Timestamp;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import in.co.rays.Proj4.bean.StudentBean;
import in.co.rays.Proj4.model.StudentModel;


public class TestStudent {

	public static void main(String[] args) throws Exception {

		//testAdd();
		 testUpdate();
		// testDelete();
		// testFindByPk();
		// testFindByEmail();
		//testSearch();
	}

	public static void testAdd() throws Exception {

		StudentBean bean = new StudentBean();

		bean.setFirstName("tanyaa");
		bean.setLastName("gangrade");
		bean.setDob(new Date());
		bean.setGender("female");
		bean.setMobileNo("7648880088");
		bean.setEmail("tanyaa@gmail.com");
		bean.setCollegeId(4);
		bean.setCreatedBy("tanyaa@gmail.com");
		bean.setModifiedBy("tanyaa@gmail.com");
		bean.setCreatedDatetime(new Timestamp(new Date().getTime()));
		bean.setModifiedDatetime(new Timestamp(new Date().getTime()));

		StudentModel model = new StudentModel();

		model.add(bean);
	}

	public static void testUpdate() throws Exception {

		StudentModel model = new StudentModel();

		StudentBean bean = model.findByPk(1);

		bean.setFirstName("maya");
		bean.setEmail("maya@gmail.com");

		model.update(bean);
	}

	public static void testDelete() throws Exception {

		StudentModel model = new StudentModel();
        StudentBean bean  = new StudentBean();
		model.delete(bean);

	}

	public static void testFindByPk() throws Exception {

		StudentModel model = new StudentModel();

		StudentBean bean = model.findByPk(1);

		if (bean != null) {
			System.out.print(bean.getId());
			System.out.print("\t" + bean.getFirstName());
			System.out.print("\t" + bean.getLastName());
			System.out.print("\t" + bean.getDob());
			System.out.print("\t" + bean.getGender());
			System.out.print("\t" + bean.getMobileNo());
			System.out.print("\t" + bean.getEmail());
			System.out.print("\t" + bean.getCollegeId());
			System.out.print("\t" + bean.getCollegeName());
			System.out.print("\t" + bean.getCreatedBy());
			System.out.print("\t" + bean.getModifiedBy());
			System.out.print("\t" + bean.getCreatedDatetime());
			System.out.println("\t" + bean.getModifiedDatetime());
		} else {
			System.out.println("id not found");
		}
	}

	public static void testFindByEmail() throws Exception {

		StudentModel model = new StudentModel();

		StudentBean bean = model.findByEmailId("sana@gmail.com");

		if (bean != null) {
			System.out.print(bean.getId());
			System.out.print("\t" + bean.getFirstName());
			System.out.print("\t" + bean.getLastName());
			System.out.print("\t" + bean.getDob());
			System.out.print("\t" + bean.getGender());
			System.out.print("\t" + bean.getMobileNo());
			System.out.print("\t" + bean.getEmail());
			System.out.print("\t" + bean.getCollegeId());
			System.out.print("\t" + bean.getCollegeName());
			System.out.print("\t" + bean.getCreatedBy());
			System.out.print("\t" + bean.getModifiedBy());
			System.out.print("\t" + bean.getCreatedDatetime());
			System.out.println("\t" + bean.getModifiedDatetime());
		} else {
			System.out.println("email not found");
		}
	}

	public static void testSearch() throws Exception {

		StudentBean bean = new StudentBean();
		bean.setFirstName("u");

		StudentModel model = new StudentModel();

		List list = model.search(bean, 1, 10);

		Iterator it = list.iterator();

		while (it.hasNext()) {
			bean = (StudentBean) it.next();
			System.out.print(bean.getId());
			System.out.print("\t" + bean.getFirstName());
			System.out.print("\t" + bean.getLastName());
			System.out.print("\t" + bean.getDob());
			System.out.print("\t" + bean.getGender());
			System.out.print("\t" + bean.getMobileNo());
			System.out.print("\t" + bean.getEmail());
			System.out.print("\t" + bean.getCollegeId());
			System.out.print("\t" + bean.getCollegeName());
			System.out.print("\t" + bean.getCreatedBy());
			System.out.print("\t" + bean.getModifiedBy());
			System.out.print("\t" + bean.getCreatedDatetime());
			System.out.println("\t" + bean.getModifiedDatetime());
		}
	}
}