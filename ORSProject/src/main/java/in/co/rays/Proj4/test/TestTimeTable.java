package in.co.rays.Proj4.test;

import java.sql.Timestamp;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import in.co.rays.Proj4.bean.TimeTableBean;
import in.co.rays.Proj4.model.TimeTableModel;


public class TestTimeTable {

	public static void main(String[] args) throws Exception {
		 testAdd();
		// testUpdate();
		// testDelete();
		// testFindByPk();
		//testSearch();
	}

	public static void testAdd() throws Exception {

		TimeTableBean bean = new TimeTableBean();
		bean.setSemester("fourth");
		bean.setDescription("2nd");
		bean.setExamDate(new Date());
		bean.setExamTime("12:00AM - 01:00PM");
		bean.setCourseId(2);
		bean.setSubjectId(3);
		bean.setCreatedBy("student@gmail.com");
		bean.setModifiedBy("student@gmail.com");
		bean.setCreatedDatetime(new Timestamp(new Date().getTime()));
		bean.setModifiedDatetime(new Timestamp(new Date().getTime()));

		TimeTableModel model = new TimeTableModel();
		model.add(bean);
	}

	public static void testUpdate() throws Exception {

		TimeTableModel model = new TimeTableModel();

		TimeTableBean bean = model.findByPk(3);
		bean.setSemester("2nd");
		bean.setDescription("2nd");
		bean.setExamDate(new Date());
		bean.setExamTime("11:00AM - 12:00PM");
		bean.setCourseId(1);
		bean.setSubjectId(1);

		model.update(bean);
	}

	public static void testDelete() throws Exception {
		TimeTableModel model = new TimeTableModel();
		model.delete(4);
	}

	public static void testFindByPk() throws Exception {

		TimeTableModel model = new TimeTableModel();

		TimeTableBean bean = model.findByPk(1);

		if (bean != null) {
			System.out.print(bean.getId());
			System.out.print("\t" + bean.getSemester());
			System.out.print("\t" + bean.getDescription());
			System.out.print("\t" + bean.getExamDate());
			System.out.print("\t" + bean.getExamTime());
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

		TimeTableBean bean = new TimeTableBean();
		// bean.setSemester("1");

		TimeTableModel model = new TimeTableModel();

		List list = model.search(bean, 1, 10);

		Iterator it = list.iterator();

		while (it.hasNext()) {
			bean = (TimeTableBean) it.next();
			System.out.print(bean.getId());
			System.out.print("\t" + bean.getSemester());
			System.out.print("\t" + bean.getDescription());
			System.out.print("\t" + bean.getExamDate());
			System.out.print("\t" + bean.getExamTime());
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