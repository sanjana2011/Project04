package in.co.rays.Proj4.test;
import java.sql.Timestamp;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import in.co.rays.Proj4.bean.MarksheetBean;
import in.co.rays.Proj4.model.MarksheetModel;


public class TestMarksheet{

	public static void main(String[] args) throws Exception {
		 testAdd();
		// testUpdate();
		// testDelete();
		// testFindByPk();
		// testFindByRollNo();
		//testSearch();
	}

	public static void testAdd() throws Exception {

		MarksheetBean bean = new MarksheetBean();
		bean.setRollNo("ca100");
		bean.setStudentId(5);
		bean.setPhysics(5);
		bean.setChemistry(10);
		bean.setMaths(198);
		bean.setCreatedBy("adminn@gmail.com");
		bean.setModifiedBy("adminn@gmail.com");
		bean.setCreatedDatetime(new Timestamp(new Date().getTime()));
		bean.setModifiedDatetime(new Timestamp(new Date().getTime()));

		MarksheetModel model = new MarksheetModel();

		model.add(bean);

	}

	public static void testUpdate() throws Exception {

		MarksheetModel model = new MarksheetModel();

		MarksheetBean bean = model.findByPk(1);
		bean.setRollNo("BE103");
		bean.setStudentId(4);

		model.update(bean);
	}

	public static void testDelete() throws Exception {
		MarksheetModel model = new MarksheetModel();
		MarksheetBean  bean = new MarksheetBean();
		model.delete(bean);
	}

	public static void testFindByPk() throws Exception {

		MarksheetModel model = new MarksheetModel();

		MarksheetBean bean = model.findByPk(1);

		if (bean != null) {
			System.out.print(bean.getId());
			System.out.print("\t" + bean.getRollNo());
			System.out.print("\t" + bean.getStudentId());
			System.out.print("\t" + bean.getName());
			System.out.print("\t" + bean.getPhysics());
			System.out.print("\t" + bean.getChemistry());
			System.out.print("\t" + bean.getMaths());
			System.out.print("\t" + bean.getCreatedBy());
			System.out.print("\t" + bean.getModifiedBy());
			System.out.print("\t" + bean.getCreatedDatetime());
			System.out.println("\t" + bean.getModifiedDatetime());
		} else {
			System.out.println("id not found");
		}
	}

	public static void testFindByRollNo() throws Exception {

		MarksheetModel model = new MarksheetModel();

		MarksheetBean bean = model.findByRollNo("BE101");

		if (bean != null) {
			System.out.print(bean.getId());
			System.out.print("\t" + bean.getRollNo());
			System.out.print("\t" + bean.getStudentId());
			System.out.print("\t" + bean.getName());
			System.out.print("\t" + bean.getPhysics());
			System.out.print("\t" + bean.getChemistry());
			System.out.print("\t" + bean.getMaths());
			System.out.print("\t" + bean.getCreatedBy());
			System.out.print("\t" + bean.getModifiedBy());
			System.out.print("\t" + bean.getCreatedDatetime());
			System.out.println("\t" + bean.getModifiedDatetime());
		} else {
			System.out.println("roll no. not found");
		}
	}

	public static void testSearch() throws Exception {

		MarksheetBean bean = new MarksheetBean();
		// bean.setName("b");

		MarksheetModel model = new MarksheetModel();

		List list = model.search(bean, 1, 10);

		Iterator it = list.iterator();

		while (it.hasNext()) {
			bean = (MarksheetBean) it.next();
			System.out.print(bean.getId());
			System.out.print("\t" + bean.getRollNo());
			System.out.print("\t" + bean.getStudentId());
			System.out.print("\t" + bean.getName());
			System.out.print("\t" + bean.getPhysics());
			System.out.print("\t" + bean.getChemistry());
			System.out.print("\t" + bean.getMaths());
			System.out.print("\t" + bean.getCreatedBy());
			System.out.print("\t" + bean.getModifiedBy());
			System.out.print("\t" + bean.getCreatedDatetime());
			System.out.println("\t" + bean.getModifiedDatetime());
		}
	}
}