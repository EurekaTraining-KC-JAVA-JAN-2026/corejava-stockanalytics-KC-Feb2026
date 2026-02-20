package com.eurekaAccounts.stocks.service;

import com.eurekaAccounts.stocks.dao.LookUpDAO;
import com.eurekaAccounts.stocks.dao.LookupAllSubSectorsDAO;
import com.eurekaAccounts.stocks.vo.SectorVO;
import com.eurekaAccounts.stocks.vo.SubSectorVO;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class MarketAnalyticsService {
    public MarketAnalyticsService() {
    }

    LookUpDAO lookUpDAO=new LookUpDAO();
    LookupAllSubSectorsDAO lookupAllSubSectorsDAO=new LookupAllSubSectorsDAO();
    public List<SectorVO> getAllSectorService() throws SQLException {
        List<SectorVO> allsectors=lookUpDAO.getAllSectorsDAO();
        return allsectors;
    }
    public List<SubSectorVO> getAllSubSectorService() throws SQLException {
        List<SubSectorVO> allsubsectors=lookupAllSubSectorsDAO.getAllSubSectorsDAO();
        return allsubsectors;
    }

}
