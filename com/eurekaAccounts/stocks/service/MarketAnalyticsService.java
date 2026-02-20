package com.eurekaAccounts.stocks.service;

import com.eurekaAccounts.stocks.dao.LookUPSubDAO;
import com.eurekaAccounts.stocks.dao.LookUpDAO;
import com.eurekaAccounts.stocks.vo.SectorVO;

import java.sql.SQLException;
import java.util.List;

//import static com.eurekaAccounts.stocks.dao.BaseDAO.conn;

public class MarketAnalyticsService {

    private final LookUpDAO lookUpDAO = new LookUpDAO();
    private final LookUPSubDAO lookUpSubDAO = new LookUPSubDAO();

    public MarketAnalyticsService() throws SQLException {
    }

    public List<SectorVO> getAllSectorsService() throws SQLException {
        return lookUpDAO.getAllSectorsDAO();
    }

    public List<SectorVO> getAllSubSectorsService() throws SQLException {
        return lookUpSubDAO.getAllSubSectorVO();
    }
}
