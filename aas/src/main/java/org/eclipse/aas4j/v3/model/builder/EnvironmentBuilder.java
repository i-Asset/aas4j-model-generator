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

package org.eclipse.aas4j.v3.model.builder;

import java.util.List;


import org.eclipse.aas4j.v3.model.*;
import org.eclipse.aas4j.v3.model.impl.*;


public abstract class EnvironmentBuilder<T extends Environment, B extends EnvironmentBuilder<T, B>> extends ExtendableBuilder<T, B> {

    /**
     * This function allows setting a value for assetAdministrationShells
     * 
     * @param assetAdministrationShells desired value to be set
     * @return Builder object with new value for assetAdministrationShells
     */
    public B assetAdministrationShells(List<AssetAdministrationShell> assetAdministrationShells) {
        getBuildingInstance().setAssetAdministrationShells(assetAdministrationShells);
        return getSelf();
    }

    /**
     * This function allows adding a value to the List assetAdministrationShells
     * 
     * @param assetAdministrationShell desired value to be added
     * @return Builder object with new value for assetAdministrationShells
     */
    public B assetAdministrationShell(AssetAdministrationShell assetAdministrationShell) {
        getBuildingInstance().getAssetAdministrationShells().add(assetAdministrationShell);
        return getSelf();
    }

    /**
     * This function allows setting a value for conceptDescriptions
     * 
     * @param conceptDescriptions desired value to be set
     * @return Builder object with new value for conceptDescriptions
     */
    public B conceptDescriptions(List<ConceptDescription> conceptDescriptions) {
        getBuildingInstance().setConceptDescriptions(conceptDescriptions);
        return getSelf();
    }

    /**
     * This function allows adding a value to the List conceptDescriptions
     * 
     * @param conceptDescription desired value to be added
     * @return Builder object with new value for conceptDescriptions
     */
    public B conceptDescription(ConceptDescription conceptDescription) {
        getBuildingInstance().getConceptDescriptions().add(conceptDescription);
        return getSelf();
    }

    /**
     * This function allows setting a value for dataSpecifications
     * 
     * @param dataSpecifications desired value to be set
     * @return Builder object with new value for dataSpecifications
     */
    public B dataSpecifications(List<DataSpecification> dataSpecifications) {
        getBuildingInstance().setDataSpecifications(dataSpecifications);
        return getSelf();
    }

    /**
     * This function allows adding a value to the List dataSpecifications
     * 
     * @param dataSpecification desired value to be added
     * @return Builder object with new value for dataSpecifications
     */
    public B dataSpecification(DataSpecification dataSpecification) {
        getBuildingInstance().getDataSpecifications().add(dataSpecification);
        return getSelf();
    }

    /**
     * This function allows setting a value for submodels
     * 
     * @param submodels desired value to be set
     * @return Builder object with new value for submodels
     */
    public B submodels(List<Submodel> submodels) {
        getBuildingInstance().setSubmodels(submodels);
        return getSelf();
    }

    /**
     * This function allows adding a value to the List submodels
     * 
     * @param submodel desired value to be added
     * @return Builder object with new value for submodels
     */
    public B submodel(Submodel submodel) {
        getBuildingInstance().getSubmodels().add(submodel);
        return getSelf();
    }
}
