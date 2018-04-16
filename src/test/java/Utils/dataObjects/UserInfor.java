package Utils.dataObjects;

import java.util.Arrays;


/**
 * - !!Utils.dataObjects.UserInfor
 salesforceIOSAccountName: automation.tactsf.s@gmail.com
 salesforceIOSEmailAddress: automation.tact.s@gmail.com

 salesforceAndroidAccountName: automation.tactAndrSF.s@gmail.com
 salesforceAndroidEmailAddress: automation.tactAndr.s@gmail.com

 salesforcePwd: Tact0218
 salesforceRecoverPwdKeyword: tactile
 salesforcePhone: 650-560-5668


 exchangeIOSEmailAddress: automation.TactiOS@tact.ai
 exchangeIOSEmailPwd: e8WHr7EUvasgJm3G
 exchangeAndroidEmailAddress: automation.TactAndroid@tact.ai
 exchangeAndroidEmailPwd: JYGvi2JXAr6RH4kP
 exchangeServer: outlook.office365.com

 linkedInIOSEmailAddress: automation.tact.s@gmail.com
 linkedInAndroidEmailAddress: automation.tactAndr.s@gmail.com
 linkedInPwd: Tact0218

 gmailIOSEmailAddress: automation.tact.s@gmail.com
 gmailAndroidEmailAddress: automation.tactAndr.s@gmail.com
 gmailPwd: Tact2018
 **/

public class UserInfor {
    private String salesforceIOSAccountName = null;
    private String salesforceIOSEmailAddress = null;
    private String salesforceAndroidAccountName = null;
    private String salesforceAndroidEmailAddress = null;
    private String salesforcePwd = null;
    private String salesforceRecoverPwdKeyword = null;
    private String salesforcePhone = null;

    private String exchangeIOSEmailAddress = null;
    private String exchangeIOSEmailPwd = null;
    private String exchangeAndroidEmailAddress = null;
    private String exchangeAndroidEmailPwd = null;
    private String exchangeServer = null;

    private String linkedInIOSEmailAddress = null;
    private String linkedInAndroidEmailAddress = null;
    private String linkedInPwd = null;

    private String gmailIOSEmailAddress = null;
    private String gmailAndroidEmailAddress = null;
    private String gmailPwd = null;

    public UserInfor() {
    }

    public UserInfor(
            String salesforceIOSAccountName, String salesforceIOSEmailAddress,
            String salesforceAndroidAccountName, String salesforceAndroidEmailAddress,
            String salesforcePwd, String salesforceRecoverPwdKeyword, String salesforcePhone,

            String exchangeIOSEmailAddress, String exchangeIOSEmailPwd,
            String exchangeAndroidEmailAddress, String exchangeAndroidEmailPwd,
            String exchangeServer,

            String linkedInIOSEmailAddress, String linkedInAndroidEmailAddress, String linkedInPwd,

            String gmailIOSEmailAddress, String gmailAndroidEmailAddress, String gmailPwd) {
        super();
        //SF
        this.setSalesforceIOSAccountName(salesforceIOSAccountName);
        this.setSalesforceIOSEmailAddress(salesforceIOSEmailAddress);
        this.setSalesforceAndroidAccountName(salesforceAndroidAccountName);
        this.setSalesforceAndroidEmailAddress(salesforceAndroidEmailAddress);
        this.setSalesforcePwd(salesforcePwd);
        this.setSalesforceRecoverPwdKeyword(salesforceRecoverPwdKeyword);
        this.setSalesforcePhone(salesforcePhone);
        //Exchange
        this.setExchangeIOSEmailAddress(exchangeIOSEmailAddress);
        this.setExchangeIOSEmailPwd(exchangeIOSEmailPwd);
        this.setExchangeAndroidEmailAddress(exchangeAndroidEmailAddress);
        this.setExchangeAndroidEmailPwd(exchangeAndroidEmailPwd);
        this.setExchangeServer(exchangeServer);
        //LinkedIn
        this.setLinkedInIOSEmailAddress(linkedInIOSEmailAddress);
        this.setLinkedInAndroidEmailAddress(linkedInAndroidEmailAddress);
        this.setLinkedInPwd(linkedInPwd);
        //Gmail
        this.setGmailIOSEmailAddress(gmailIOSEmailAddress);
        this.setGmailAndroidEmailAddress(gmailAndroidEmailAddress);
        this.setGmailPwd(gmailPwd);
    }

    //set - SF
    public void setSalesforceIOSAccountName(String salesforceIOSAccountName) { this.salesforceIOSAccountName = salesforceIOSAccountName; }
    public void setSalesforceIOSEmailAddress(String salesforceIOSEmailAddress) { this.salesforceIOSEmailAddress = salesforceIOSEmailAddress; }

    public void setSalesforceAndroidAccountName(String salesforceAndroidAccountName) { this.salesforceAndroidAccountName = salesforceAndroidAccountName; }
    public void setSalesforceAndroidEmailAddress(String salesforceAndroidEmailAddress) { this.salesforceAndroidEmailAddress = salesforceAndroidEmailAddress; }

    public void setSalesforcePwd(String salesforcePwd) { this.salesforcePwd = salesforcePwd; }
    public void setSalesforceRecoverPwdKeyword(String salesforceRecoverPwdKeyword) { this.salesforceRecoverPwdKeyword = salesforceRecoverPwdKeyword; }
    public void setSalesforcePhone(String salesforcePhone) { this.salesforcePhone = salesforcePhone; }


    //set - Exchange
    public void setExchangeIOSEmailAddress(String exchangeIOSEmailAddress) { this.exchangeIOSEmailAddress = exchangeIOSEmailAddress; }
    public void setExchangeIOSEmailPwd(String exchangeIOSEmailPwd) { this.exchangeIOSEmailPwd = exchangeIOSEmailPwd; }

    public void setExchangeAndroidEmailAddress(String exchangeAndroidEmailAddress) { this.exchangeAndroidEmailAddress = exchangeAndroidEmailAddress; }
    public void setExchangeAndroidEmailPwd(String exchangeAndroidEmailPwd) { this.exchangeAndroidEmailPwd = exchangeAndroidEmailPwd; }

    public void setExchangeServer(String exchangeServer) { this.exchangeServer = exchangeServer; }


    //set - LinkedIn
    public void setLinkedInIOSEmailAddress(String linkedInIOSEmailAddress) { this.linkedInIOSEmailAddress = linkedInIOSEmailAddress; }
    public void setLinkedInAndroidEmailAddress(String linkedInAndroidEmailAddress) { this.linkedInAndroidEmailAddress = linkedInAndroidEmailAddress; }
    public void setLinkedInPwd(String linkedInPwd) { this.linkedInPwd = linkedInPwd; }


    //set - Gmail
    public void setGmailIOSEmailAddress(String gmailIOSEmailAddress) { this.gmailIOSEmailAddress = gmailIOSEmailAddress; }
    public void setGmailAndroidEmailAddress(String gmailAndroidEmailAddress) { this.gmailAndroidEmailAddress = gmailAndroidEmailAddress; }
    public void setGmailPwd(String gmailPwd) { this.gmailPwd = gmailPwd; }


    //get - SF
    public String getSalesforceIOSAccountName() { return salesforceIOSAccountName; }
    public String getSalesforceIOSEmailAddress() { return salesforceIOSEmailAddress; }

    public String getSalesforceAndroidAccountName() { return salesforceAndroidAccountName; }
    public String getSalesforceAndroidEmailAddress() { return salesforceAndroidEmailAddress; }

    public String getSalesforcePwd() { return salesforcePwd; }
    public String getSalesforceRecoverPwdKeyword() { return salesforceRecoverPwdKeyword; }
    public String getSalesforcePhone() { return salesforcePhone; }


    //get - Exchange
    public String getExchangeIOSEmailAddress() { return exchangeIOSEmailAddress; }
    public String getExchangeIOSEmailPwd() { return exchangeIOSEmailPwd; }

    public String getExchangeAndroidEmailAddress() { return exchangeAndroidEmailAddress; }
    public String getExchangeAndroidEmailPwd() { return exchangeAndroidEmailPwd; }

    public String getExchangeServer() { return exchangeServer; }


    //get - LinkedIn
    public String getLinkedInIOSEmailAddress() { return linkedInIOSEmailAddress; }
    public String getLinkedInAndroidEmailAddress() { return linkedInAndroidEmailAddress; }
    public String getLinkedInPwd() { return linkedInPwd; }


    //get - Gmail
    public String getGmailIOSEmailAddress() { return gmailIOSEmailAddress; }
    public String getGmailAndroidEmailAddress() { return gmailAndroidEmailAddress; }
    public String getGmailPwd() { return gmailPwd; }

    @Override
    public String toString() {
        return "UserInfor{" +
                //SF
                "salesforceIOSAccountName='" + salesforceIOSAccountName + '\'' +
                ", salesforceIOSEmailAddress='" + salesforceIOSEmailAddress + '\'' +

                ", salesforceAndroidAccountName='" + salesforceAndroidAccountName + '\'' +
                ", salesforceAndroidEmailAddress='" + salesforceAndroidEmailAddress + '\'' +

                ", salesforcePwd='" + salesforcePwd + '\'' +
                ", salesforceRecoverPwdKeyword='" + salesforceRecoverPwdKeyword + '\'' +
                ", salesforcePhone='" + salesforcePhone + '\'' +

                //Exchange
                ", exchangeIOSEmailAddress='" + exchangeIOSEmailAddress + '\'' +
                ", exchangeIOSEmailPwd='" + exchangeIOSEmailPwd + '\'' +
                ", exchangeAndroidEmailAddress='" + exchangeAndroidEmailAddress + '\'' +
                ", exchangeAndroidEmailPwd='" + exchangeAndroidEmailPwd + '\'' +
                ", exchangeServer='" + exchangeServer + "\'" +

                //LinkedIn
                ", linkedInIOSEmailAddress='" + linkedInIOSEmailAddress + "\'" +
                ", linkedInAndroidEmailAddress='" + linkedInAndroidEmailAddress + "\'" +
                ", linkedInPwd='" + linkedInPwd + "\'" +

                //Gmail
                ", gmailIOSEmailAddress='" + gmailIOSEmailAddress + '\'' +
                ", gmailAndroidEmailAddress='" + gmailAndroidEmailAddress + '\'' +
                ", gmailPwd='" + gmailPwd + '\'' +
                '}';
    }
}
