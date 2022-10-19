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
 * Enumeration of all possible elements of a 'SubmodelElementList'.
 */
@IRI("aas:AasSubmodelElements")
public enum AasSubmodelElements {

    /** 
    */
    @IRI("https://admin-shell.io/aas/3/0/RC02/AasSubmodelElements/AnnotatedRelationshipElement")
    ANNOTATED_RELATIONSHIP_ELEMENT("AnnotatedRelationshipElement"),

    /** 
    */
    @IRI("https://admin-shell.io/aas/3/0/RC02/AasSubmodelElements/BasicEventElement")
    BASIC_EVENT_ELEMENT("BasicEventElement"),

    /** 
    */
    @IRI("https://admin-shell.io/aas/3/0/RC02/AasSubmodelElements/Blob")
    BLOB("Blob"),

    /** 
    */
    @IRI("https://admin-shell.io/aas/3/0/RC02/AasSubmodelElements/Capability")
    CAPABILITY("Capability"),

    /** 
    */
    @IRI("https://admin-shell.io/aas/3/0/RC02/AasSubmodelElements/DataElement")
    DATA_ELEMENT("DataElement"),

    /** 
    */
    @IRI("https://admin-shell.io/aas/3/0/RC02/AasSubmodelElements/Entity")
    ENTITY("Entity"),

    /** 
    */
    @IRI("https://admin-shell.io/aas/3/0/RC02/AasSubmodelElements/EventElement")
    EVENT_ELEMENT("EventElement"),

    /** 
    */
    @IRI("https://admin-shell.io/aas/3/0/RC02/AasSubmodelElements/File")
    FILE("File"),

    /** 
    */
    @IRI("https://admin-shell.io/aas/3/0/RC02/AasSubmodelElements/MultiLanguageProperty")
    MULTI_LANGUAGE_PROPERTY("MultiLanguageProperty"),

    /** 
    */
    @IRI("https://admin-shell.io/aas/3/0/RC02/AasSubmodelElements/Operation")
    OPERATION("Operation"),

    /** 
    */
    @IRI("https://admin-shell.io/aas/3/0/RC02/AasSubmodelElements/Property")
    PROPERTY("Property"),

    /** 
    */
    @IRI("https://admin-shell.io/aas/3/0/RC02/AasSubmodelElements/Range")
    RANGE("Range"),

    /** 
    */
    @IRI("https://admin-shell.io/aas/3/0/RC02/AasSubmodelElements/ReferenceElement")
    REFERENCE_ELEMENT("ReferenceElement"),

    /** 
    */
    @IRI("https://admin-shell.io/aas/3/0/RC02/AasSubmodelElements/RelationshipElement")
    RELATIONSHIP_ELEMENT("RelationshipElement"),

    /** 
    */
    @IRI("https://admin-shell.io/aas/3/0/RC02/AasSubmodelElements/SubmodelElement")
    SUBMODEL_ELEMENT("SubmodelElement"),

    /** 
    */
    @IRI("https://admin-shell.io/aas/3/0/RC02/AasSubmodelElements/SubmodelElementCollection")
    SUBMODEL_ELEMENT_COLLECTION("SubmodelElementCollection"),

    /** 
    */
    @IRI("https://admin-shell.io/aas/3/0/RC02/AasSubmodelElements/SubmodelElementList")
    SUBMODEL_ELEMENT_LIST("SubmodelElementList");

    private String value;

    AasSubmodelElements(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value.toString();
    }

    public static AasSubmodelElements fromValue(String text) {
        for (AasSubmodelElements b : AasSubmodelElements.values()) {
            if (String.valueOf(b.value).equals(text)) {
                return b;
            }
        }
        return null;
    }

}
