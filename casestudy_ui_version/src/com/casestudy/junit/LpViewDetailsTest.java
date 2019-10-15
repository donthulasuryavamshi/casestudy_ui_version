package com.casestudy.junit;
import static org.junit.Assert.*;
import java.sql.SQLException;
import org.junit.Test;
import com.casestudy.dao.LpDAO;
import com.casestudy.dao.LpDAOImpl;
import com.casestudy.entities.LP1;
	public class LpViewDetailsTest {
		@Test
		public void viewLp_possitive() {
			LP1 lp = new LP1();
			LpDAO lpDAO = new LpDAOImpl();

			try {
				String userId = lp.getLpId();
				LP1 lps = lpDAO.lpProfileView(userId);
				assertNotNull(lps);

			} catch (ClassNotFoundException | SQLException e) {
				assertTrue(false);
			}

		}
	}

