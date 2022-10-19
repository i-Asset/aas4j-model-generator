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
 * Enumeration of different key value types within a key.
 */
@IRI("aas:KeyTypes")
public enum KeyTypes {

    /** 
    */
    @IRI("https://admin-shell.io/aas/3/0/RC02/KeyTypes/AnnotatedRelationshipElement")
    ANNOTATED_RELATIONSHIP_ELEMENT("AnnotatedRelationshipElement"),

    /** 
    */
    @IRI("https://admin-shell.io/aas/3/0/RC02/KeyTypes/AssetAdministrationShell")
    ASSET_ADMINISTRATION_SHELL("AssetAdministrationShell"),

    /** 
    */
    @IRI("https://admin-shell.io/aas/3/0/RC02/KeyTypes/BasicEventElement")
    BASIC_EVENT_ELEMENT("BasicEventElement"),

    /** 
    */
    @IRI("https://admin-shell.io/aas/3/0/RC02/KeyTypes/Blob")
    BLOB("Blob"),

    /** 
    */
    @IRI("https://admin-shell.io/aas/3/0/RC02/KeyTypes/Capability")
    CAPABILITY("Capability"),

    /** 
    */
    @IRI("https://admin-shell.io/aas/3/0/RC02/KeyTypes/ConceptDescription")
    CONCEPT_DESCRIPTION("ConceptDescription"),

    /**
     * Data element.
     */
    @IRI("https://admin-shell.io/aas/3/0/RC02/KeyTypes/DataElement")
    DATA_ELEMENT("DataElement"),

    /** 
    */
    @IRI("https://admin-shell.io/aas/3/0/RC02/KeyTypes/Entity")
    ENTITY("Entity"),

    /**
     * Event.
     */
    @IRI("https://admin-shell.io/aas/3/0/RC02/KeyTypes/EventElement")
    EVENT_ELEMENT("EventElement"),

    /** 
    */
    @IRI("https://admin-shell.io/aas/3/0/RC02/KeyTypes/File")
    FILE("File"),

    /**
     * Bookmark or a similar local identifier of a subordinate part of a primary resource
     */
    @IRI("https://admin-shell.io/aas/3/0/RC02/KeyTypes/FragmentReference")
    FRAGMENT_REFERENCE("FragmentReference"),

    /** 
    */
    @IRI("https://admin-shell.io/aas/3/0/RC02/KeyTypes/GlobalReference")
    GLOBAL_REFERENCE("GlobalReference"),

    /**
     * Identifiable.
     */
    @IRI("https://admin-shell.io/aas/3/0/RC02/KeyTypes/Identifiable")
    IDENTIFIABLE("Identifiable"),

    /**
     * Property with a value that can be provided in multiple languages
     */
    @IRI("https://admin-shell.io/aas/3/0/RC02/KeyTypes/MultiLanguageProperty")
    MULTI_LANGUAGE_PROPERTY("MultiLanguageProperty"),

    /** 
    */
    @IRI("https://admin-shell.io/aas/3/0/RC02/KeyTypes/Operation")
    OPERATION("Operation"),

    /** 
    */
    @IRI("https://admin-shell.io/aas/3/0/RC02/KeyTypes/Property")
    PROPERTY("Property"),

    /**
     * Range with min and max
     */
    @IRI("https://admin-shell.io/aas/3/0/RC02/KeyTypes/Range")
    RANGE("Range"),

    /** 
    */
    @IRI("https://admin-shell.io/aas/3/0/RC02/KeyTypes/Referable")
    REFERABLE("Referable"),

    /**
     * Reference
     */
    @IRI("https://admin-shell.io/aas/3/0/RC02/KeyTypes/ReferenceElement")
    REFERENCE_ELEMENT("ReferenceElement"),

    /**
     * Relationship
     */
    @IRI("https://admin-shell.io/aas/3/0/RC02/KeyTypes/RelationshipElement")
    RELATIONSHIP_ELEMENT("RelationshipElement"),

    /** 
    */
    @IRI("https://admin-shell.io/aas/3/0/RC02/KeyTypes/Submodel")
    SUBMODEL("Submodel"),

    /**
     * Submodel Element
     */
    @IRI("https://admin-shell.io/aas/3/0/RC02/KeyTypes/SubmodelElement")
    SUBMODEL_ELEMENT("SubmodelElement"),

    /**
     * Struct of Submodel Elements
     */
    @IRI("https://admin-shell.io/aas/3/0/RC02/KeyTypes/SubmodelElementCollection")
    SUBMODEL_ELEMENT_COLLECTION("SubmodelElementCollection"),

    /**
     * List of Submodel Elements
     */
    @IRI("https://admin-shell.io/aas/3/0/RC02/KeyTypes/SubmodelElementList")
    SUBMODEL_ELEMENT_LIST("SubmodelElementList");

    private String value;

    KeyTypes(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value.toString();
    }

    public static KeyTypes fromValue(String text) {
        for (KeyTypes b : KeyTypes.values()) {
            if (String.valueOf(b.value).equals(text)) {
                return b;
            }
        }
        return null;
    }

}
