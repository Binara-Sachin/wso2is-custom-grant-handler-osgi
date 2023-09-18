package custom.password.grant;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.wso2.carbon.identity.oauth2.IdentityOAuth2Exception;
import org.wso2.carbon.identity.oauth2.token.OAuthTokenReqMessageContext;
import org.wso2.carbon.identity.oauth2.token.handlers.grant.PasswordGrantHandler;

public class CustomPasswordGrant extends PasswordGrantHandler {
    private static final Log log = LogFactory.getLog(CustomPasswordGrant.class);

    @Override
    public boolean validateGrant(OAuthTokenReqMessageContext tokReqMsgCtx) throws IdentityOAuth2Exception {
        try {
            return super.validateGrant(tokReqMsgCtx);
        } catch (IdentityOAuth2Exception e) {
            log.error("Error while validating grant", e);
            throw e;
        }
    }
}
