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
 * Element that can be extended by using data specification templates.
 */
@KnownSubtypes({
    @KnownSubtypes.Type(value = AdministrativeInformation.class),
    @KnownSubtypes.Type(value = AssetAdministrationShell.class),
    @KnownSubtypes.Type(value = SubmodelElement.class),
    @KnownSubtypes.Type(value = ConceptDescription.class),
    @KnownSubtypes.Type(value = Submodel.class)
})
public interface HasDataSpecification {

    /**
     * Global reference to the data specification template used by the element.
     *
     * More information under https://admin-shell.io/aas/3/0/RC02/HasDataSpecification/dataSpecification
     *
     * @return Returns the List of References for the property dataSpecifications.
     */
    @IRI("https://admin-shell.io/aas/3/0/RC02/HasDataSpecification/dataSpecification")
    List<Reference> getDataSpecifications();

    /**
     * Global reference to the data specification template used by the element.
     *
     * More information under https://admin-shell.io/aas/3/0/RC02/HasDataSpecification/dataSpecification
     *
     * @param dataSpecifications desired value for the property dataSpecifications.
     */
    void setDataSpecifications(List<Reference> dataSpecifications);

    /**
     * Global reference to the data specification template used by the element.
     *
     * More information under
     * https://admin-shell.io/aas/3/0/RC02/HasDataSpecification/embeddedDataSpecification
     *
     * @return Returns the List of DataSpecifications for the property embeddedDataSpecifications.
     */
    @IRI("https://admin-shell.io/aas/3/0/RC02/HasDataSpecification/embeddedDataSpecification")
    List<DataSpecification> getEmbeddedDataSpecifications();

    /**
     * Global reference to the data specification template used by the element.
     *
     * More information under
     * https://admin-shell.io/aas/3/0/RC02/HasDataSpecification/embeddedDataSpecification
     *
     * @param embeddedDataSpecifications desired value for the property embeddedDataSpecifications.
     */
    void setEmbeddedDataSpecifications(List<DataSpecification> embeddedDataSpecifications);

}
