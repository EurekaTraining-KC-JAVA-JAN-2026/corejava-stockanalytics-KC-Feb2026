package eurekaAccounts.stocks.Service;

import eurekaAccounts.stocks.dao.LookUpDAO;
import eurekaAccounts.stocks.dao.LookUpSubsectorDAO;
import eurekaAccounts.stocks.vo.SectorVO;
import eurekaAccounts.stocks.vo.SubSectorVO;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class MarketAnalyticsService {

    LookUpDAO lookUpDAO=new LookUpDAO();
    LookUpSubsectorDAO lookUpSubsectorDAO =new LookUpSubsectorDAO();

    public MarketAnalyticsService() throws SQLException {
    }

    public String getAllSectorsServices() throws SQLException {
        List<SectorVO> allSectors=lookUpDAO.getAllSectorsDAO(34);
            return  allSectors.toString();

    }

   public String getALlSubSectorServices() {
      List<SubSectorVO> allSubsectors= lookUpSubsectorDAO.getAllSubSectorsDAO(34);
        return allSubsectors.toString();
    }



}
