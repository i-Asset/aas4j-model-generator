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
 * Service Endpoint of an I4.0 component.
 */
@KnownSubtypes({
    @KnownSubtypes.Type(value = DefaultEndpoint.class)
})
public interface Endpoint {

    /**
     * Endpoint type.
     *
     * More information under https://admin-shell.io/aas/3/0/RC02/Endpoint/type
     *
     * @return Returns the String for the property type.
     */
    @IRI("https://admin-shell.io/aas/3/0/RC02/Endpoint/type")
    String getType();

    /**
     * Endpoint type.
     *
     * More information under https://admin-shell.io/aas/3/0/RC02/Endpoint/type
     *
     * @param type desired value for the property type.
     */
    void setType(String type);

    /**
     * Endpoint adress.
     *
     * More information under https://admin-shell.io/aas/3/0/RC02/Endpoint/address
     *
     * @return Returns the String for the property address.
     */
    @IRI("https://admin-shell.io/aas/3/0/RC02/Endpoint/address")
    String getAddress();

    /**
     * Endpoint adress.
     *
     * More information under https://admin-shell.io/aas/3/0/RC02/Endpoint/address
     *
     * @param address desired value for the property address.
     */
    void setAddress(String address);

}
