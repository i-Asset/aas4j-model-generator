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

package org.eclipse.aas4j.v3.model.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


import org.eclipse.aas4j.v3.model.*;
import org.eclipse.aas4j.v3.model.annotations.IRI;
import org.eclipse.aas4j.v3.model.builder.*;


/**
 * Default implementation of package org.eclipse.aas4j.v3.model.AssetAdministrationShell
 * 
 * An asset administration shell.
 */

@IRI("aas:AssetAdministrationShell")
public class DefaultAssetAdministrationShell implements AssetAdministrationShell {

    @IRI("https://admin-shell.io/aas/3/0/RC02/AssetAdministrationShell/assetInformation")
    protected AssetInformation assetInformation;

    @IRI("https://admin-shell.io/aas/3/0/RC02/AssetAdministrationShell/derivedFrom")
    protected Reference derivedFrom;

    @IRI("https://admin-shell.io/aas/3/0/RC02/AssetAdministrationShell/security")
    protected List<Security> securitys = new ArrayList<>();

    @IRI("https://admin-shell.io/aas/3/0/RC02/AssetAdministrationShell/submodel")
    protected List<Reference> submodels = new ArrayList<>();

    @IRI("https://admin-shell.io/aas/3/0/RC02/HasDataSpecification/dataSpecification")
    protected List<Reference> dataSpecifications = new ArrayList<>();

    @IRI("https://admin-shell.io/aas/3/0/RC02/HasDataSpecification/embeddedDataSpecification")
    protected List<DataSpecification> embeddedDataSpecifications = new ArrayList<>();

    @IRI("https://admin-shell.io/aas/3/0/RC02/HasExtensions/extension")
    protected List<Extension> extensions = new ArrayList<>();

    @IRI("https://admin-shell.io/aas/3/0/RC02/Identifiable/administration")
    protected AdministrativeInformation administration;

    @IRI("https://admin-shell.io/aas/3/0/RC02/Identifiable/id")
    protected String id;

    @IRI("https://admin-shell.io/aas/3/0/RC02/Referable/category")
    protected String category;

    @IRI("https://admin-shell.io/aas/3/0/RC02/Referable/checksum")
    protected String checksum;

    @IRI("https://admin-shell.io/aas/3/0/RC02/Referable/description")
    protected List<LangString> descriptions = new ArrayList<>();

    @IRI("https://admin-shell.io/aas/3/0/RC02/Referable/displayName")
    protected List<LangString> displayNames = new ArrayList<>();

    @IRI("https://admin-shell.io/aas/3/0/RC02/Referable/idShort")
    protected String idShort;

    public DefaultAssetAdministrationShell() {}

    @Override
    public int hashCode() {
        return Objects.hash(this.assetInformation,
            this.derivedFrom,
            this.submodels,
            this.securitys,
            this.dataSpecifications,
            this.embeddedDataSpecifications,
            this.administration,
            this.id,
            this.category,
            this.checksum,
            this.descriptions,
            this.displayNames,
            this.idShort,
            this.extensions);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        } else if (obj == null) {
            return false;
        } else if (this.getClass() != obj.getClass()) {
            return false;
        } else {
            DefaultAssetAdministrationShell other = (DefaultAssetAdministrationShell) obj;
            return Objects.equals(this.assetInformation, other.assetInformation) &&
                Objects.equals(this.derivedFrom, other.derivedFrom) &&
                Objects.equals(this.submodels, other.submodels) &&
                Objects.equals(this.securitys, other.securitys) &&
                Objects.equals(this.dataSpecifications, other.dataSpecifications) &&
                Objects.equals(this.embeddedDataSpecifications, other.embeddedDataSpecifications) &&
                Objects.equals(this.administration, other.administration) &&
                Objects.equals(this.id, other.id) &&
                Objects.equals(this.category, other.category) &&
                Objects.equals(this.checksum, other.checksum) &&
                Objects.equals(this.descriptions, other.descriptions) &&
                Objects.equals(this.displayNames, other.displayNames) &&
                Objects.equals(this.idShort, other.idShort) &&
                Objects.equals(this.extensions, other.extensions);
        }
    }

    @Override
    public AssetInformation getAssetInformation() {
        return assetInformation;
    }

    @Override
    public void setAssetInformation(AssetInformation assetInformation) {
        this.assetInformation = assetInformation;
    }

    @Override
    public Reference getDerivedFrom() {
        return derivedFrom;
    }

    @Override
    public void setDerivedFrom(Reference derivedFrom) {
        this.derivedFrom = derivedFrom;
    }

    @Override
    public List<Reference> getSubmodels() {
        return submodels;
    }

    @Override
    public void setSubmodels(List<Reference> submodels) {
        this.submodels = submodels;
    }

    @Override
    public List<Security> getSecuritys() {
        return securitys;
    }

    @Override
    public void setSecuritys(List<Security> securitys) {
        this.securitys = securitys;
    }

    @Override
    public List<Reference> getDataSpecifications() {
        return dataSpecifications;
    }

    @Override
    public void setDataSpecifications(List<Reference> dataSpecifications) {
        this.dataSpecifications = dataSpecifications;
    }

    @Override
    public List<DataSpecification> getEmbeddedDataSpecifications() {
        return embeddedDataSpecifications;
    }

    @Override
    public void setEmbeddedDataSpecifications(List<DataSpecification> embeddedDataSpecifications) {
        this.embeddedDataSpecifications = embeddedDataSpecifications;
    }

    @Override
    public AdministrativeInformation getAdministration() {
        return administration;
    }

    @Override
    public void setAdministration(AdministrativeInformation administration) {
        this.administration = administration;
    }

    @Override
    public String getId() {
        return id;
    }

    @Override
    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String getCategory() {
        return category;
    }

    @Override
    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public String getChecksum() {
        return checksum;
    }

    @Override
    public void setChecksum(String checksum) {
        this.checksum = checksum;
    }

    @Override
    public List<LangString> getDescriptions() {
        return descriptions;
    }

    @Override
    public void setDescriptions(List<LangString> descriptions) {
        this.descriptions = descriptions;
    }

    @Override
    public List<LangString> getDisplayNames() {
        return displayNames;
    }

    @Override
    public void setDisplayNames(List<LangString> displayNames) {
        this.displayNames = displayNames;
    }

    @Override
    public String getIdShort() {
        return idShort;
    }

    @Override
    public void setIdShort(String idShort) {
        this.idShort = idShort;
    }

    @Override
    public List<Extension> getExtensions() {
        return extensions;
    }

    @Override
    public void setExtensions(List<Extension> extensions) {
        this.extensions = extensions;
    }

    /**
     * This builder class can be used to construct a DefaultAssetAdministrationShell bean.
     */
    public static class Builder extends AssetAdministrationShellBuilder<DefaultAssetAdministrationShell, Builder> {

        @Override
        protected Builder getSelf() {
            return this;
        }

        @Override
        protected DefaultAssetAdministrationShell newBuildingInstance() {
            return new DefaultAssetAdministrationShell();
        }
    }
}
