package in.co.rays.Proj4.test;

import java.sql.Timestamp;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import in.co.rays.Proj4.bean.CourseBean;
import in.co.rays.Proj4.model.CourseModel;



public class TestCourse {

	public static void main(String[] args) throws Exception {
		//testAdd();
		//testUpdate();
		// testDelete();
		 //testFindByPk();
		//testFindByName();
		testSearch();
	}

	public static void testAdd() throws Exception {

		CourseBean bean = new CourseBean();
		bean.setName("vedik");
		bean.setDuration("1 year");
		bean.setDescription("test");
		bean.setCreatedBy("vedik@gmail.com");
		bean.setModifiedBy("vedik@gmail.com");
		bean.setCreatedDatetime(new Timestamp(new Date().getTime()));
		bean.setModifiedDatetime(new Timestamp(new Date().getTime()));

		CourseModel model = new CourseModel();

		model.add(bean);

	}

	public static void testUpdate() throws Exception {

		CourseModel model = new CourseModel();

		CourseBean bean = model.findByPk(1);
		bean.setName("B.ed");
		bean.setDuration("2year");
		bean.setDescription("B.ed");

		model.update(bean);
	}

	public static void testDelete() throws Exception {
		CourseModel model = new CourseModel();
		model.delete(1);
	}

	public static void testFindByPk() throws Exception {

		CourseModel model = new CourseModel();

		CourseBean bean = model.findByPk(2);

		if (bean != null) {
			System.out.print(bean.getId());
			System.out.print("\t" + bean.getName());
			System.out.print("\t" + bean.getDuration());
			System.out.print("\t" + bean.getDescription());
			System.out.print("\t" + bean.getCreatedBy());
			System.out.print("\t" + bean.getModifiedBy());
			System.out.print("\t" + bean.getCreatedDatetime());
			System.out.println("\t" + bean.getModifiedDatetime());
		} else {
			System.out.println("id not found");
		}
	}

	public static void testFindByName() throws Exception {

		CourseModel model = new CourseModel();

		CourseBean bean = model.findByName("sana");

		if (bean != null) {
			System.out.print(bean.getId());
			System.out.print("\t" + bean.getName());
			System.out.print("\t" + bean.getDuration());
			System.out.print("\t" + bean.getDescription());
			System.out.print("\t" + bean.getCreatedBy());
			System.out.print("\t" + bean.getModifiedBy());
			System.out.print("\t" + bean.getCreatedDatetime());
			System.out.println("\t" + bean.getModifiedDatetime());
		} else {
			System.out.println("name not found");
		}
	}

	public static void testSearch() throws Exception {

		CourseBean bean = new CourseBean();
		bean.setName("sana");

		CourseModel model = new CourseModel();

		List list = model.search(bean, 1, 4);

		Iterator it = list.iterator();

		while (it.hasNext()) {
			bean = (CourseBean) it.next();
			System.out.print(bean.getId());
			System.out.print("\t" + bean.getName());
			System.out.print("\t" + bean.getDuration());
			System.out.print("\t" + bean.getDescription());
			System.out.print("\t" + bean.getCreatedBy());
			System.out.print("\t" + bean.getModifiedBy());
			System.out.print("\t" + bean.getCreatedDatetime());
			System.out.println("\t" + bean.getModifiedDatetime());
		}
	}
}