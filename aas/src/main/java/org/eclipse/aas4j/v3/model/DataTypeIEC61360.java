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
 * Enumeration of all IEC 61360 defined data types.
 */
@IRI("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/3/0/RC02/DataTypeIEC61360")
public enum DataTypeIEC61360 {

    /** 
    */
    @IRI("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/3/0/RC02/Boolean")
    BOOLEAN("Boolean"),

    /** 
    */
    @IRI("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/3/0/RC02/Date")
    DATE("Date"),

    /** 
    */
    @IRI("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/3/0/RC02/IntegerCount")
    INTEGER_COUNT("IntegerCount"),

    /** 
    */
    @IRI("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/3/0/RC02/IntegerCurrency")
    INTEGER_CURRENCY("IntegerCurrency"),

    /** 
    */
    @IRI("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/3/0/RC02/IntegerMeasure")
    INTEGER_MEASURE("IntegerMeasure"),

    /** 
    */
    @IRI("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/3/0/RC02/Rational")
    RATIONAL("Rational"),

    /** 
    */
    @IRI("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/3/0/RC02/RationalMeasure")
    RATIONAL_MEASURE("RationalMeasure"),

    /** 
    */
    @IRI("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/3/0/RC02/RealCount")
    REAL_COUNT("RealCount"),

    /** 
    */
    @IRI("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/3/0/RC02/RealCurrency")
    REAL_CURRENCY("RealCurrency"),

    /** 
    */
    @IRI("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/3/0/RC02/RealMeasure")
    REAL_MEASURE("RealMeasure"),

    /** 
    */
    @IRI("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/3/0/RC02/String")
    STRING("String"),

    /** 
    */
    @IRI("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/3/0/RC02/StringTranslatable")
    STRING_TRANSLATABLE("StringTranslatable"),

    /** 
    */
    @IRI("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/3/0/RC02/Time")
    TIME("Time"),

    /** 
    */
    @IRI("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/3/0/RC02/Timestamp")
    TIMESTAMP("Timestamp"),

    /** 
    */
    @IRI("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/3/0/RC02/URL")
    URL("URL");

    private String value;

    DataTypeIEC61360(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value.toString();
    }

    public static DataTypeIEC61360 fromValue(String text) {
        for (DataTypeIEC61360 b : DataTypeIEC61360.values()) {
            if (String.valueOf(b.value).equals(text)) {
                return b;
            }
        }
        return null;
    }

}
