package custom.password.grant.internal;

import custom.password.grant.CustomPasswordGrant;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.osgi.service.component.ComponentContext;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.component.annotations.ReferenceCardinality;
import org.osgi.service.component.annotations.ReferencePolicy;
import org.wso2.carbon.identity.governance.IdentityGovernanceService;
import org.wso2.carbon.identity.oauth2.token.handlers.grant.AuthorizationGrantHandler;

/**
 * Custom Password Grant Service Component
 */
@Component(
        name = "custom.password.grant",
        immediate = true
)
public class CustomGrantServiceComponent {
    private static Log log = LogFactory.getLog(CustomGrantServiceComponent.class);

    protected void activate(ComponentContext componentContext) {
        CustomPasswordGrant customGrant = new CustomPasswordGrant();
        componentContext.getBundleContext().registerService(AuthorizationGrantHandler.class.getName(), customGrant, null);
        log.info("Custom grant activated successfully.");
    }

    protected void deactivate(ComponentContext ctxt) {

        if (log.isDebugEnabled()) {
            log.debug("Custom grant is deactivated.");
        }
    }

//    @Reference(
//            name = "IdentityGovernanceService",
//            service = org.wso2.carbon.identity.governance.IdentityGovernanceService.class,
//            cardinality = ReferenceCardinality.MANDATORY,
//            policy = ReferencePolicy.DYNAMIC,
//            unbind = "unsetIdentityGovernanceService")
//    protected void setIdentityGovernanceService(IdentityGovernanceService identityGovernanceService) {
//
//        CustomGrantServiceDataHolder.getInstance().setIdentityGovernanceService(identityGovernanceService);
//    }
//
//    protected void unsetIdentityGovernanceService(IdentityGovernanceService identityGovernanceService) {
//
//        CustomGrantServiceDataHolder.getInstance().setIdentityGovernanceService(null);
//    }
}
