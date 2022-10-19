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



import org.eclipse.aas4j.v3.model.annotations.IRI;
import org.eclipse.aas4j.v3.model.annotations.KnownSubtypes;
import org.eclipse.aas4j.v3.model.builder.*;
import org.eclipse.aas4j.v3.model.impl.*;


/**
 * Description of a single permisson.
 */
@KnownSubtypes({
    @KnownSubtypes.Type(value = DefaultPermission.class)
})
public interface Permission {

    /**
     * Reference to a property defining the semantics of the permission
     *
     * More information under https://admin-shell.io/aas/3/0/RC02/Permission/permission
     *
     * @return Returns the Reference for the property permission.
     */
    @IRI("https://admin-shell.io/aas/3/0/RC02/Permission/permission")
    Reference getPermission();

    /**
     * Reference to a property defining the semantics of the permission
     *
     * More information under https://admin-shell.io/aas/3/0/RC02/Permission/permission
     *
     * @param permission desired value for the property permission.
     */
    void setPermission(Reference permission);

    /**
     * Description of the kind of permission
     *
     * More information under https://admin-shell.io/aas/3/0/RC02/Permission/kindOfPermission
     *
     * @return Returns the PermissionKind for the property kindOfPermission.
     */
    @IRI("https://admin-shell.io/aas/3/0/RC02/Permission/kindOfPermission")
    PermissionKind getKindOfPermission();

    /**
     * Description of the kind of permission
     *
     * More information under https://admin-shell.io/aas/3/0/RC02/Permission/kindOfPermission
     *
     * @param kindOfPermission desired value for the property kindOfPermission.
     */
    void setKindOfPermission(PermissionKind kindOfPermission);

}
