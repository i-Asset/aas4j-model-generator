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
import org.eclipse.aas4j.v3.model.builder.*;
import org.eclipse.aas4j.v3.model.impl.*;


/**
 * Description of the kind of permission. Possible kind of permission also include the denial of the
 * permission.
 */
@IRI("aas:PermissionKind")
public enum PermissionKind {

    /**
     * Permission granted.
     */
    @IRI("https://admin-shell.io/aas/3/0/RC02/PermissionKind/Allow")
    ALLOW("Allow"),

    /**
     * Permission denied.
     */
    @IRI("https://admin-shell.io/aas/3/0/RC02/PermissionKind/Deny")
    DENY("Deny"),

    /**
     * Permission not applicable.
     */
    @IRI("https://admin-shell.io/aas/3/0/RC02/PermissionKind/NotApplicable")
    NOT_APPLICABLE("NotApplicable"),

    /**
     * Permission undefined.
     */
    @IRI("https://admin-shell.io/aas/3/0/RC02/PermissionKind/Undefined")
    UNDEFINED("Undefined");

    private String value;

    PermissionKind(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value.toString();
    }

    public static PermissionKind fromValue(String text) {
        for (PermissionKind b : PermissionKind.values()) {
            if (String.valueOf(b.value).equals(text)) {
                return b;
            }
        }
        return null;
    }

}
