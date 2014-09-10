package org.greypowerservices.dao;

import java.util.ArrayList;
import java.util.List;
import org.greypowerservices.entities.UnitMeasure;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;

@Repository
public class CommonApplicationDAOImpl extends HibernateDaoSupport implements
		CommonApplicationDAO {

	@Autowired
	public void init(SessionFactory factory) {
		setSessionFactory(factory);
	}

	@SuppressWarnings("unchecked")
	public List<UnitMeasure> getUnitsMeasure() {
		Object objectUnitsMeasure = getHibernateTemplate().find(
				"FROM UnitMeasure");
		List<UnitMeasure> unitsMeasure = new ArrayList<UnitMeasure>();

		if (!objectUnitsMeasure.equals(null)
				&& objectUnitsMeasure instanceof List) {
			unitsMeasure = (List<UnitMeasure>) objectUnitsMeasure;
		}

		return unitsMeasure;
	}

}
