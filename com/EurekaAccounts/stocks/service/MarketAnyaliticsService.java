package com.EurekaAccounts.stocks.service;

import com.EurekaAccounts.stocks.dao.LookUpAllSubSectorsDAO;
import com.EurekaAccounts.stocks.dao.LookUpDAO;
import com.EurekaAccounts.stocks.vo.SectorVo;
import com.EurekaAccounts.stocks.vo.SubSectorVo;

import java.sql.SQLException;
import java.util.List;

public class MarketAnyaliticsService {
    LookUpDAO lookUpDAO=new LookUpDAO();
    LookUpAllSubSectorsDAO lookUpAllSubSectorsDAO=new LookUpAllSubSectorsDAO();

   

    public String getAllSectors() throws SQLException{
        List<SectorVo>allSectors = lookUpDAO.getAllSectors();
        return allSectors.toString();
    }


   public String getAllSubSectors() throws SQLException{
        List<SubSectorVo> allSubSectors =lookUpAllSubSectorsDAO.getAllSubSectorsDAO();
        return allSubSectors.toString();
}
    public MarketAnyaliticsService()throws SQLException{

    }
}
