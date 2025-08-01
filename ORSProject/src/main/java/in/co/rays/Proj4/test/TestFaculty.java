package in.co.rays.Proj4.test;

import java.sql.Timestamp;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import in.co.rays.Proj4.bean.FacultyBean;
import in.co.rays.Proj4.model.FacultyModel;

public class TestFaculty {

	public static void main(String[] args) throws Exception {
		 testAdd();
		// testUpdate();
		// testDelete();
		// testFindByPk();
		//testSearch();
	}

	public static void testAdd() throws Exception {

		FacultyBean bean = new FacultyBean();

		bean.setFirstName("akansha");
		bean.setLastName("mehta");
		bean.setDob(new Date());
		bean.setGender("female");
		bean.setMobileNo("7489651401");
		bean.setEmail("akansha@gmail.com");
		bean.setCollegeId(3);
		bean.setCourseId(3);
		bean.setSubjectId(3);
		bean.setCreatedBy("student@gmail.com");
		bean.setModifiedBy("studenr@gmail.com");
		bean.setCreatedDatetime(new Timestamp(new Date().getTime()));
		bean.setModifiedDatetime(new Timestamp(new Date().getTime()));

		FacultyModel model = new FacultyModel();
		model.add(bean);
	}

	public static void testUpdate() throws Exception {

		FacultyModel model = new FacultyModel();

		FacultyBean bean = model.findByPk(1);

		bean.setFirstName("satyam");
		bean.setLastName("jat");
		bean.setEmail("samay@gmail.com");

		model.update(bean);
	}

	public static void testDelete() throws Exception {

		FacultyModel model = new FacultyModel();

		model.delete(2);
	}

	public static void testFindByPk() throws Exception {

		FacultyModel model = new FacultyModel();

		FacultyBean bean = model.findByPk(2);

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
			System.out.print("\t" + bean.getCourseId());
			System.out.print("\t" + bean.getCourseName());
			System.out.print("\t" + bean.getSubjectId());
			System.out.print("\t" + bean.getSubjectName());
			System.out.print("\t" + bean.getCreatedBy());
			System.out.print("\t" + bean.getModifiedBy());
			System.out.print("\t" + bean.getCreatedDatetime());
			System.out.println("\t" + bean.getModifiedDatetime());
		} else {
			System.out.println("id not found");
		}
	}

	public static void testSearch() throws Exception {
		
		FacultyBean bean = new FacultyBean();
		
		FacultyModel model = new FacultyModel();

		List list = model.search(bean, 1, 10);

		Iterator it = list.iterator();

		while (it.hasNext()) {
			bean = (FacultyBean) it.next();
			System.out.print(bean.getId());
			System.out.print("\t" + bean.getFirstName());
			System.out.print("\t" + bean.getLastName());
			System.out.print("\t" + bean.getDob());
			System.out.print("\t" + bean.getGender());
			System.out.print("\t" + bean.getMobileNo());
			System.out.print("\t" + bean.getEmail());
			System.out.print("\t" + bean.getCollegeId());
			System.out.print("\t" + bean.getCollegeName());
			System.out.print("\t" + bean.getCourseId());
			System.out.print("\t" + bean.getCourseName());
			System.out.print("\t" + bean.getSubjectId());
			System.out.print("\t" + bean.getSubjectName());
			System.out.print("\t" + bean.getCreatedBy());
			System.out.print("\t" + bean.getModifiedBy());
			System.out.print("\t" + bean.getCreatedDatetime());
			System.out.println("\t" + bean.getModifiedDatetime());
		}
	}
}