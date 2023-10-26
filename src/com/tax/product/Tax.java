package com.tax.product;

public interface Tax {
    double getCovidLevy();
    double getGetFundLevy();
    double getNHILevy();
    double getVAT();


    void setCovidLevy(double rate);
    void setGetFundLevy(double rate);
    void setNHILevy(double rate);
    void setVAT(double rate);
    void getGroupLevies();


}
