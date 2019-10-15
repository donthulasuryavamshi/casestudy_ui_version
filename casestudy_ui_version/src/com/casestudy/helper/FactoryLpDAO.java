package com.casestudy.helper;
import org.apache.log4j.Logger;
import com.casestudy.dao.LpDAO;
import com.casestudy.dao.LpDAOImpl;
public class FactoryLpDAO {
	public static Logger log = Logger.getLogger(FactoryLpDAO.class.getName());

	public static LpDAO createLpDAO() {
		log.info("entered into factory class");
		LpDAO lpDAO = new LpDAOImpl();
		return lpDAO;

	}
}