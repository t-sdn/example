/*
 * Copyright 2015 Kjwon15 and others.  All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 */
package org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.example.impl.rev141210;

import net.kjwon15.example.impl.ExampleProvider;

public class ExampleModule extends org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.example.impl.rev141210.AbstractExampleModule {
    public ExampleModule(org.opendaylight.controller.config.api.ModuleIdentifier identifier, org.opendaylight.controller.config.api.DependencyResolver dependencyResolver) {
        super(identifier, dependencyResolver);
    }

    public ExampleModule(org.opendaylight.controller.config.api.ModuleIdentifier identifier, org.opendaylight.controller.config.api.DependencyResolver dependencyResolver, org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.example.impl.rev141210.ExampleModule oldModule, java.lang.AutoCloseable oldInstance) {
        super(identifier, dependencyResolver, oldModule, oldInstance);
    }

    @Override
    public void customValidation() {
        // add custom validation form module attributes here.
    }

    @Override
    public java.lang.AutoCloseable createInstance() {
        ExampleProvider provider = new ExampleProvider();
        getBrokerDependency().registerProvider(provider);
        return provider;
    }

}
