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
 * Descriptor for AssetAdministrationShell .
 */
@KnownSubtypes({
    @KnownSubtypes.Type(value = DefaultAssetAdministrationShellDescriptor.class)
})
public interface AssetAdministrationShellDescriptor extends Descriptor {

    /**
     * Global identifier of the asset the AAS is representing.
     *
     * More information under
     * https://admin-shell.io/aas/3/0/RC02/AssetAdministrationShellDescriptor/globalAssetId
     *
     * @return Returns the Reference for the property globalAssetId.
     */
    @IRI("https://admin-shell.io/aas/3/0/RC02/AssetAdministrationShellDescriptor/globalAssetId")
    Reference getGlobalAssetId();

    /**
     * Global identifier of the asset the AAS is representing.
     *
     * More information under
     * https://admin-shell.io/aas/3/0/RC02/AssetAdministrationShellDescriptor/globalAssetId
     *
     * @param globalAssetId desired value for the property globalAssetId.
     */
    void setGlobalAssetId(Reference globalAssetId);

    /**
     * Reference to a specific asset ID representing a supplementary identifier of the asset represented
     * by the Asset Administration Shell.
     *
     * More information under
     * https://admin-shell.io/aas/3/0/RC02/AssetAdministrationShellDescriptor/specificAssetId
     *
     * @return Returns the SpecificAssetId for the property specificAssetId.
     */
    @IRI("https://admin-shell.io/aas/3/0/RC02/AssetAdministrationShellDescriptor/specificAssetId")
    SpecificAssetId getSpecificAssetId();

    /**
     * Reference to a specific asset ID representing a supplementary identifier of the asset represented
     * by the Asset Administration Shell.
     *
     * More information under
     * https://admin-shell.io/aas/3/0/RC02/AssetAdministrationShellDescriptor/specificAssetId
     *
     * @param specificAssetId desired value for the property specificAssetId.
     */
    void setSpecificAssetId(SpecificAssetId specificAssetId);

    /**
     * Descriptors for the submodels of the AAS.
     *
     * More information under
     * https://admin-shell.io/aas/3/0/RC02/AssetAdministrationShellDescriptor/submodelDescriptor
     *
     * @return Returns the List of SubmodelDescriptors for the property submodelDescriptors.
     */
    @IRI("https://admin-shell.io/aas/3/0/RC02/AssetAdministrationShellDescriptor/submodelDescriptor")
    List<SubmodelDescriptor> getSubmodelDescriptors();

    /**
     * Descriptors for the submodels of the AAS.
     *
     * More information under
     * https://admin-shell.io/aas/3/0/RC02/AssetAdministrationShellDescriptor/submodelDescriptor
     *
     * @param submodelDescriptors desired value for the property submodelDescriptors.
     */
    void setSubmodelDescriptors(List<SubmodelDescriptor> submodelDescriptors);

}
