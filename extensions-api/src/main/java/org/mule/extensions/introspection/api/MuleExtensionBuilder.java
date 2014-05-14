/*
 * Copyright (c) MuleSoft, Inc.  All rights reserved.  http://www.mulesoft.com
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */
package org.mule.extensions.introspection.api;

public interface MuleExtensionBuilder extends Builder<MuleExtension>
{

    MuleExtensionBuilder setName(String name);

    MuleExtensionBuilder setDescription(String description);

    MuleExtensionBuilder setVersion(String version);

    MuleExtensionBuilder addConfiguration(MuleExtensionConfigurationBuilder configuration);

    MuleExtensionBuilder addOperation(MuleExtensionOperationBuilder operation);

    MuleExtensionConfigurationBuilder newConfiguration();

    MuleExtensionOperationBuilder newOperation();

    MuleExtensionParameterBuilder newParameter();

}