package com.eurekaAccounts.stocks.vo;

    public class SubsectorVO {
        public int subsectorId;
        public String subsectorName;
        public int sectorId;

        public SubsectorVO(int subsectorId, String subsectorName, int sectorId) {
            this.subsectorId = subsectorId;
            this.subsectorName = subsectorName;
            this.sectorId = sectorId;
        }

        public SubsectorVO() {
        }

        @Override
        public String toString() {
            return "SubsectorVO{" +
                    "subsectorId=" + subsectorId +
                    ", subsectorName='" + subsectorName + '\'' +
                    ", sectorId=" + sectorId +
                    '}'+'\n';
        }

        public int getSubsectorId() {
            return subsectorId;
        }

        public void setSubsectorId(int subsectorId) {
            this.subsectorId = subsectorId;
        }

        public String getSubsectorName() {
            return subsectorName;
        }

        public void setSubsectorName(String subsectorName) {
            this.subsectorName = subsectorName;
        }

        public int getSectorId() {
            return sectorId;
        }

        public void setSectorId(int sectorId) {
            this.sectorId = sectorId;
        }
    }
