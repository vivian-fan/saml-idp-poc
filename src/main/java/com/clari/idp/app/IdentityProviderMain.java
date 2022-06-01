package com.clari.idp.app;

import com.clari.idp.examples.AttributeExamples;
import com.clari.idp.service.IdentityProviderClient;
import com.clari.idp.attributes.NamedAttribute;
import com.clari.idp.model.AuthnRequest;

import java.util.List;

public final class IdentityProviderMain {
    public static void main(String[] args) throws Exception {
        String exampleName = args.length > 0 ? args[0] : AttributeExamples.WORKS_FOR_OKTA;
        System.out.println(exampleName);
        OpenSamlInitializer.initialize();
        String userName = "example@example.com";
        List<NamedAttribute> attributes = AttributeExamples.attributesByExampleName(exampleName, userName);
        AuthnRequest authRequest = AuthnRequestBuilder.buildAuthRequest(
                userName, attributes);
        IdentityProviderClient.authenticate(authRequest);
    }
}
