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


public abstract class ConceptDescriptionBuilder<T extends ConceptDescription, B extends ConceptDescriptionBuilder<T, B>>
    extends ExtendableBuilder<T, B> {

    /**
     * This function allows setting a value for isCaseOfs
     * 
     * @param isCaseOfs desired value to be set
     * @return Builder object with new value for isCaseOfs
     */
    public B isCaseOfs(List<Reference> isCaseOfs) {
        getBuildingInstance().setIsCaseOfs(isCaseOfs);
        return getSelf();
    }

    /**
     * This function allows adding a value to the List isCaseOfs
     * 
     * @param isCaseOf desired value to be added
     * @return Builder object with new value for isCaseOfs
     */
    public B isCaseOf(Reference isCaseOf) {
        getBuildingInstance().getIsCaseOfs().add(isCaseOf);
        return getSelf();
    }

    /**
     * This function allows setting a value for dataSpecifications
     * 
     * @param dataSpecifications desired value to be set
     * @return Builder object with new value for dataSpecifications
     */
    public B dataSpecifications(List<Reference> dataSpecifications) {
        getBuildingInstance().setDataSpecifications(dataSpecifications);
        return getSelf();
    }

    /**
     * This function allows adding a value to the List dataSpecifications
     * 
     * @param dataSpecification desired value to be added
     * @return Builder object with new value for dataSpecifications
     */
    public B dataSpecification(Reference dataSpecification) {
        getBuildingInstance().getDataSpecifications().add(dataSpecification);
        return getSelf();
    }

    /**
     * This function allows setting a value for embeddedDataSpecifications
     * 
     * @param embeddedDataSpecifications desired value to be set
     * @return Builder object with new value for embeddedDataSpecifications
     */
    public B embeddedDataSpecifications(List<DataSpecification> embeddedDataSpecifications) {
        getBuildingInstance().setEmbeddedDataSpecifications(embeddedDataSpecifications);
        return getSelf();
    }

    /**
     * This function allows adding a value to the List embeddedDataSpecifications
     * 
     * @param embeddedDataSpecification desired value to be added
     * @return Builder object with new value for embeddedDataSpecifications
     */
    public B embeddedDataSpecification(DataSpecification embeddedDataSpecification) {
        getBuildingInstance().getEmbeddedDataSpecifications().add(embeddedDataSpecification);
        return getSelf();
    }

    /**
     * This function allows setting a value for administration
     * 
     * @param administration desired value to be set
     * @return Builder object with new value for administration
     */
    public B administration(AdministrativeInformation administration) {
        getBuildingInstance().setAdministration(administration);
        return getSelf();
    }

    /**
     * This function allows setting a value for id
     * 
     * @param id desired value to be set
     * @return Builder object with new value for id
     */
    public B id(String id) {
        getBuildingInstance().setId(id);
        return getSelf();
    }

    /**
     * This function allows setting a value for category
     * 
     * @param category desired value to be set
     * @return Builder object with new value for category
     */
    public B category(String category) {
        getBuildingInstance().setCategory(category);
        return getSelf();
    }

    /**
     * This function allows setting a value for checksum
     * 
     * @param checksum desired value to be set
     * @return Builder object with new value for checksum
     */
    public B checksum(String checksum) {
        getBuildingInstance().setChecksum(checksum);
        return getSelf();
    }

    /**
     * This function allows setting a value for descriptions
     * 
     * @param descriptions desired value to be set
     * @return Builder object with new value for descriptions
     */
    public B descriptions(List<LangString> descriptions) {
        getBuildingInstance().setDescriptions(descriptions);
        return getSelf();
    }

    /**
     * This function allows adding a value to the List descriptions
     * 
     * @param description desired value to be added
     * @return Builder object with new value for descriptions
     */
    public B description(LangString description) {
        getBuildingInstance().getDescriptions().add(description);
        return getSelf();
    }

    /**
     * This function allows setting a value for displayNames
     * 
     * @param displayNames desired value to be set
     * @return Builder object with new value for displayNames
     */
    public B displayNames(List<LangString> displayNames) {
        getBuildingInstance().setDisplayNames(displayNames);
        return getSelf();
    }

    /**
     * This function allows adding a value to the List displayNames
     * 
     * @param displayName desired value to be added
     * @return Builder object with new value for displayNames
     */
    public B displayName(LangString displayName) {
        getBuildingInstance().getDisplayNames().add(displayName);
        return getSelf();
    }

    /**
     * This function allows setting a value for idShort
     * 
     * @param idShort desired value to be set
     * @return Builder object with new value for idShort
     */
    public B idShort(String idShort) {
        getBuildingInstance().setIdShort(idShort);
        return getSelf();
    }

    /**
     * This function allows setting a value for extensions
     * 
     * @param extensions desired value to be set
     * @return Builder object with new value for extensions
     */
    public B extensions(List<Extension> extensions) {
        getBuildingInstance().setExtensions(extensions);
        return getSelf();
    }

    /**
     * This function allows adding a value to the List extensions
     * 
     * @param extension desired value to be added
     * @return Builder object with new value for extensions
     */
    public B extension(Extension extension) {
        getBuildingInstance().getExtensions().add(extension);
        return getSelf();
    }
}
