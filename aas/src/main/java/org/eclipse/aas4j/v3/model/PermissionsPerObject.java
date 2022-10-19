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

package org.eclipse.aas4j.v3.model;

import java.util.List;


import org.eclipse.aas4j.v3.model.annotations.IRI;
import org.eclipse.aas4j.v3.model.annotations.KnownSubtypes;
import org.eclipse.aas4j.v3.model.builder.*;
import org.eclipse.aas4j.v3.model.impl.*;


/**
 * Table that defines access permissions for a specified object. The object is any referable element
 * in the AAS. Additionally, object attributes can be defined that further specify the kind of
 * object the permissions apply to.
 */
@KnownSubtypes({
    @KnownSubtypes.Type(value = DefaultPermissionsPerObject.class)
})
public interface PermissionsPerObject {

    /**
     * A data element that further classifies a specific subject.
     *
     * More information under https://admin-shell.io/aas/3/0/RC02/PermissionsPerObject/object
     *
     * @return Returns the Reference for the property object.
     */
    @IRI("https://admin-shell.io/aas/3/0/RC02/PermissionsPerObject/object")
    Reference getObject();

    /**
     * A data element that further classifies a specific subject.
     *
     * More information under https://admin-shell.io/aas/3/0/RC02/PermissionsPerObject/object
     *
     * @param object desired value for the property object.
     */
    void setObject(Reference object);

    /**
     * Target object attributes that need to be fulfilled so that the access permissions apply to the
     * accessing subject.
     *
     * More information under
     * https://admin-shell.io/aas/3/0/RC02/PermissionsPerObject/targetObjectAttributes
     *
     * @return Returns the ObjectAttributes for the property targetObjectAttributes.
     */
    @IRI("https://admin-shell.io/aas/3/0/RC02/PermissionsPerObject/targetObjectAttributes")
    ObjectAttributes getTargetObjectAttributes();

    /**
     * Target object attributes that need to be fulfilled so that the access permissions apply to the
     * accessing subject.
     *
     * More information under
     * https://admin-shell.io/aas/3/0/RC02/PermissionsPerObject/targetObjectAttributes
     *
     * @param targetObjectAttributes desired value for the property targetObjectAttributes.
     */
    void setTargetObjectAttributes(ObjectAttributes targetObjectAttributes);

    /**
     * Permissions assigned to the object. The permissions hold for all subjects as specified in the
     * access permission rule.
     *
     * More information under https://admin-shell.io/aas/3/0/RC02/PermissionsPerObject/permission
     *
     * @return Returns the List of Permissions for the property permissions.
     */
    @IRI("https://admin-shell.io/aas/3/0/RC02/PermissionsPerObject/permission")
    List<Permission> getPermissions();

    /**
     * Permissions assigned to the object. The permissions hold for all subjects as specified in the
     * access permission rule.
     *
     * More information under https://admin-shell.io/aas/3/0/RC02/PermissionsPerObject/permission
     *
     * @param permissions desired value for the property permissions.
     */
    void setPermissions(List<Permission> permissions);

}
