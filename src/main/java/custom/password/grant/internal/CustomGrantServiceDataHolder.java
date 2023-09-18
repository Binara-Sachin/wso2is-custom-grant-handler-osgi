package custom.password.grant.internal;

import org.wso2.carbon.identity.governance.IdentityGovernanceService;

public class CustomGrantServiceDataHolder {
    private static CustomGrantServiceDataHolder instance = new CustomGrantServiceDataHolder();
//    private IdentityGovernanceService identityGovernanceService;

    private CustomGrantServiceDataHolder() {

    }

    public static CustomGrantServiceDataHolder getInstance() {

        return instance;
    }
//    public IdentityGovernanceService getIdentityGovernanceService() {
//
//        return identityGovernanceService;
//    }
//
//    public void setIdentityGovernanceService(IdentityGovernanceService identityGovernanceService) {
//
//        this.identityGovernanceService = identityGovernanceService;
//    }
}
