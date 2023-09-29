# A Custom Grant Handler for WSO2 IS as an OSGI Component

By default, WSO2 IS lets you impliment Custom Grenat Types as non-OSGI components. [1]
But in some cases, greant handlers needs to access OSGI services and therefore, needs to be written as an OSGI Component itself.

This is a sample Grant Handler for WSO2 IS 5.11.0 written as an OSGI component.

Note:
> This has extended the default `PasswordGrantHandler` instead of the `AuthorizationGrantHandler`
> You can make channges to this as requred.

## How to Deploy
1. Build the package with `mvn clean package`
2. Copy the jar file to `<IS-HOME>/repository/components/dropins`
3. Add the following config to `<IS-HOME>/repository/conf/deployment.toml` file

```
[[oauth.custom_grant_type]]
name="Custom Grant"
grant_handler="custom.password.grant.CustomPasswordGrant"
grant_validator="org.wso2.carbon.identity.oauth2.validators.grant.PasswordGrantValidator"

[oauth.custom_grant_type.properties]
IdTokenAllowed=true
```

---
## References
[1] https://is.docs.wso2.com/en/latest/references/extend/oauth2/write-a-custom-oauth-2.0-grant-type/
