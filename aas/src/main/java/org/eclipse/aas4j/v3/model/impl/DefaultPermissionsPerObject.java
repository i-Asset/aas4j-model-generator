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

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


import org.eclipse.aas4j.v3.model.*;
import org.eclipse.aas4j.v3.model.annotations.IRI;
import org.eclipse.aas4j.v3.model.builder.*;


/**
 * Default implementation of package org.eclipse.aas4j.v3.model.PermissionsPerObject
 * 
 * Table that defines access permissions for a specified object. The object is any referable element
 * in the AAS. Additionally, object attributes can be defined that further specify the kind of
 * object the permissions apply to.
 */

@IRI("aas:PermissionsPerObject")
public class DefaultPermissionsPerObject implements PermissionsPerObject {

    @IRI("https://admin-shell.io/aas/3/0/RC02/PermissionsPerObject/object")
    protected Reference object;

    @IRI("https://admin-shell.io/aas/3/0/RC02/PermissionsPerObject/permission")
    protected List<Permission> permissions = new ArrayList<>();

    @IRI("https://admin-shell.io/aas/3/0/RC02/PermissionsPerObject/targetObjectAttributes")
    protected ObjectAttributes targetObjectAttributes;

    public DefaultPermissionsPerObject() {}

    @Override
    public int hashCode() {
        return Objects.hash(this.object,
            this.targetObjectAttributes,
            this.permissions);
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
            DefaultPermissionsPerObject other = (DefaultPermissionsPerObject) obj;
            return Objects.equals(this.object, other.object) &&
                Objects.equals(this.targetObjectAttributes, other.targetObjectAttributes) &&
                Objects.equals(this.permissions, other.permissions);
        }
    }

    @Override
    public Reference getObject() {
        return object;
    }

    @Override
    public void setObject(Reference object) {
        this.object = object;
    }

    @Override
    public ObjectAttributes getTargetObjectAttributes() {
        return targetObjectAttributes;
    }

    @Override
    public void setTargetObjectAttributes(ObjectAttributes targetObjectAttributes) {
        this.targetObjectAttributes = targetObjectAttributes;
    }

    @Override
    public List<Permission> getPermissions() {
        return permissions;
    }

    @Override
    public void setPermissions(List<Permission> permissions) {
        this.permissions = permissions;
    }

    /**
     * This builder class can be used to construct a DefaultPermissionsPerObject bean.
     */
    public static class Builder extends PermissionsPerObjectBuilder<DefaultPermissionsPerObject, Builder> {

        @Override
        protected Builder getSelf() {
            return this;
        }

        @Override
        protected DefaultPermissionsPerObject newBuildingInstance() {
            return new DefaultPermissionsPerObject();
        }
    }
}
