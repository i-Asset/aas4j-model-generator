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
 * Data Specification Template
 */
@KnownSubtypes({
    @KnownSubtypes.Type(value = DefaultDataSpecification.class)
})
public interface DataSpecification {

    /**
     * Administrative information of an identifiable element.
     *
     * More information under https://admin-shell.io/aas/3/0/RC02/DataSpecification/administration
     *
     * @return Returns the AdministrativeInformation for the property administration.
     */
    @IRI("https://admin-shell.io/aas/3/0/RC02/DataSpecification/administration")
    AdministrativeInformation getAdministration();

    /**
     * Administrative information of an identifiable element.
     *
     * More information under https://admin-shell.io/aas/3/0/RC02/DataSpecification/administration
     *
     * @param administration desired value for the property administration.
     */
    void setAdministration(AdministrativeInformation administration);

    /**
     * The content of the template without meta data
     *
     * More information under
     * https://admin-shell.io/aas/3/0/RC02/DataSpecification/dataSpecificationContent
     *
     * @return Returns the DataSpecificationContent for the property dataSpecificationContent.
     */
    @IRI("https://admin-shell.io/aas/3/0/RC02/DataSpecification/dataSpecificationContent")
    DataSpecificationContent getDataSpecificationContent();

    /**
     * The content of the template without meta data
     *
     * More information under
     * https://admin-shell.io/aas/3/0/RC02/DataSpecification/dataSpecificationContent
     *
     * @param dataSpecificationContent desired value for the property dataSpecificationContent.
     */
    void setDataSpecificationContent(DataSpecificationContent dataSpecificationContent);

    /**
     * Description how and in which context the data specification template is applicable. The
     * description can be provided in several languages.
     *
     * More information under https://admin-shell.io/aas/3/0/RC02/DataSpecification/description
     *
     * @return Returns the List of LangStrings for the property descriptions.
     */
    @IRI("https://admin-shell.io/aas/3/0/RC02/DataSpecification/description")
    List<LangString> getDescriptions();

    /**
     * Description how and in which context the data specification template is applicable. The
     * description can be provided in several languages.
     *
     * More information under https://admin-shell.io/aas/3/0/RC02/DataSpecification/description
     *
     * @param descriptions desired value for the property descriptions.
     */
    void setDescriptions(List<LangString> descriptions);

    /**
     * The globally unique identification of the element.
     *
     * More information under https://admin-shell.io/aas/3/0/RC02/DataSpecification/id
     *
     * @return Returns the String for the property id.
     */
    @IRI("https://admin-shell.io/aas/3/0/RC02/DataSpecification/id")
    String getId();

    /**
     * The globally unique identification of the element.
     *
     * More information under https://admin-shell.io/aas/3/0/RC02/DataSpecification/id
     *
     * @param id desired value for the property id.
     */
    void setId(String id);

}
