package com.eurekaAccounts.stocks.service;

import com.eurekaAccounts.stocks.dao.LookupDAO;
import com.eurekaAccounts.stocks.dao.LookupupSubSectorDOA;
import com.eurekaAccounts.stocks.vo.SectorVO;
import com.eurekaAccounts.stocks.vo.SubSector;

import java.sql.SQLException;
import java.util.List;

public class MarketAnalyticsService {
        LookupDAO lookupDAO=new LookupDAO();
        LookupupSubSectorDOA lookupupSubSectorDOA=new LookupupSubSectorDOA();
        public List<SectorVO> getAllSectors() throws SQLException {
            List<SectorVO> resultsector =lookupDAO.getAllSectors(34);
            return resultsector;
        }
        public List<SubSector> getAllSubSectors() throws SQLException {
            List<SubSector> resultsector1=lookupupSubSectorDOA.getAllSubSectors();
            return resultsector1;
        }

}
