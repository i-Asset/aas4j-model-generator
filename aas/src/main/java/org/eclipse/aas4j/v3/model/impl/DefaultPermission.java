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
 * Default implementation of package org.eclipse.aas4j.v3.model.Permission
 * 
 * Description of a single permisson.
 */

@IRI("aas:Permission")
public class DefaultPermission implements Permission {

    @IRI("https://admin-shell.io/aas/3/0/RC02/Permission/kindOfPermission")
    protected PermissionKind kindOfPermission;

    @IRI("https://admin-shell.io/aas/3/0/RC02/Permission/permission")
    protected Reference permission;

    public DefaultPermission() {}

    @Override
    public int hashCode() {
        return Objects.hash(this.permission,
            this.kindOfPermission);
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
            DefaultPermission other = (DefaultPermission) obj;
            return Objects.equals(this.permission, other.permission) &&
                Objects.equals(this.kindOfPermission, other.kindOfPermission);
        }
    }

    @Override
    public Reference getPermission() {
        return permission;
    }

    @Override
    public void setPermission(Reference permission) {
        this.permission = permission;
    }

    @Override
    public PermissionKind getKindOfPermission() {
        return kindOfPermission;
    }

    @Override
    public void setKindOfPermission(PermissionKind kindOfPermission) {
        this.kindOfPermission = kindOfPermission;
    }

    /**
     * This builder class can be used to construct a DefaultPermission bean.
     */
    public static class Builder extends PermissionBuilder<DefaultPermission, Builder> {

        @Override
        protected Builder getSelf() {
            return this;
        }

        @Override
        protected DefaultPermission newBuildingInstance() {
            return new DefaultPermission();
        }
    }
}
