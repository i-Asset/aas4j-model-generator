/*
 * Copyright (c) 2021 Fraunhofer-Gesellschaft zur Foerderung der angewandten Forschung e. V.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */

package org.eclipse.aas4j.v3.model.impl;

import java.util.Objects;


import org.eclipse.aas4j.v3.model.*;
import org.eclipse.aas4j.v3.model.annotations.IRI;
import org.eclipse.aas4j.v3.model.builder.*;


/**
 * Default implementation of package org.eclipse.aas4j.v3.model.Security
 * 
 * Container for security relevant information of AAS.
 */

@IRI("aas:Security")
public class DefaultSecurity implements Security {

    @IRI("https://admin-shell.io/aas/3/0/RC02/Security/accessControlPolicyPoints")
    protected AccessControlPolicyPoints accessControlPolicyPoints;

    public DefaultSecurity() {}

    @Override
    public int hashCode() {
        return Objects.hash(this.accessControlPolicyPoints);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        } else if (obj == null) {
            return false;
        } else if (this.getClass() != obj.getClass()) {
            return false;
        } else {
            DefaultSecurity other = (DefaultSecurity) obj;
            return Objects.equals(this.accessControlPolicyPoints, other.accessControlPolicyPoints);
        }
    }

    @Override
    public AccessControlPolicyPoints getAccessControlPolicyPoints() {
        return accessControlPolicyPoints;
    }

    @Override
    public void setAccessControlPolicyPoints(AccessControlPolicyPoints accessControlPolicyPoints) {
        this.accessControlPolicyPoints = accessControlPolicyPoints;
    }

    /**
     * This builder class can be used to construct a DefaultSecurity bean.
     */
    public static class Builder extends SecurityBuilder<DefaultSecurity, Builder> {

        @Override
        protected Builder getSelf() {
            return this;
        }

        @Override
        protected DefaultSecurity newBuildingInstance() {
            return new DefaultSecurity();
        }
    }
}
