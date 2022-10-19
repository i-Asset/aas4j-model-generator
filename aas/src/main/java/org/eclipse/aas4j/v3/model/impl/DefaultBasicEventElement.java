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
 * Default implementation of package org.eclipse.aas4j.v3.model.BasicEventElement
 * 
 * A basic event element.
 */

@IRI("aas:BasicEventElement")
public class DefaultBasicEventElement implements BasicEventElement {

    @IRI("https://admin-shell.io/aas/3/0/RC02/BasicEventElement/direction")
    protected Direction direction;

    @IRI("https://admin-shell.io/aas/3/0/RC02/BasicEventElement/lastUpdate")
    protected String lastUpdate;

    @IRI("https://admin-shell.io/aas/3/0/RC02/BasicEventElement/maxInterval")
    protected String maxInterval;

    @IRI("https://admin-shell.io/aas/3/0/RC02/BasicEventElement/messageBroker")
    protected Reference messageBroker;

    @IRI("https://admin-shell.io/aas/3/0/RC02/BasicEventElement/messageTopic")
    protected String messageTopic;

    @IRI("https://admin-shell.io/aas/3/0/RC02/BasicEventElement/minInterval")
    protected String minInterval;

    @IRI("https://admin-shell.io/aas/3/0/RC02/BasicEventElement/observed")
    protected Reference observed;

    @IRI("https://admin-shell.io/aas/3/0/RC02/BasicEventElement/state")
    protected StateOfEvent state;

    @IRI("https://admin-shell.io/aas/3/0/RC02/HasDataSpecification/dataSpecification")
    protected List<Reference> dataSpecifications = new ArrayList<>();

    @IRI("https://admin-shell.io/aas/3/0/RC02/HasDataSpecification/embeddedDataSpecification")
    protected List<DataSpecification> embeddedDataSpecifications = new ArrayList<>();

    @IRI("https://admin-shell.io/aas/3/0/RC02/HasExtensions/extension")
    protected List<Extension> extensions = new ArrayList<>();

    @IRI("https://admin-shell.io/aas/3/0/RC02/HasKind/kind")
    protected ModelingKind kind;

    @IRI("https://admin-shell.io/aas/3/0/RC02/HasSemantics/semanticId")
    protected Reference semanticId;

    @IRI("https://admin-shell.io/aas/3/0/RC02/HasSemantics/supplementalSemanticId")
    protected List<Reference> supplementalSemanticIds = new ArrayList<>();

    @IRI("https://admin-shell.io/aas/3/0/RC02/Qualifiable/qualifier")
    protected List<Qualifier> qualifiers = new ArrayList<>();

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

    public DefaultBasicEventElement() {}

    @Override
    public int hashCode() {
        return Objects.hash(this.direction,
            this.lastUpdate,
            this.maxInterval,
            this.messageBroker,
            this.messageTopic,
            this.minInterval,
            this.observed,
            this.state,
            this.dataSpecifications,
            this.embeddedDataSpecifications,
            this.semanticId,
            this.supplementalSemanticIds,
            this.kind,
            this.category,
            this.checksum,
            this.descriptions,
            this.displayNames,
            this.idShort,
            this.extensions,
            this.qualifiers);
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
            DefaultBasicEventElement other = (DefaultBasicEventElement) obj;
            return Objects.equals(this.direction, other.direction) &&
                Objects.equals(this.lastUpdate, other.lastUpdate) &&
                Objects.equals(this.maxInterval, other.maxInterval) &&
                Objects.equals(this.messageBroker, other.messageBroker) &&
                Objects.equals(this.messageTopic, other.messageTopic) &&
                Objects.equals(this.minInterval, other.minInterval) &&
                Objects.equals(this.observed, other.observed) &&
                Objects.equals(this.state, other.state) &&
                Objects.equals(this.dataSpecifications, other.dataSpecifications) &&
                Objects.equals(this.embeddedDataSpecifications, other.embeddedDataSpecifications) &&
                Objects.equals(this.semanticId, other.semanticId) &&
                Objects.equals(this.supplementalSemanticIds, other.supplementalSemanticIds) &&
                Objects.equals(this.kind, other.kind) &&
                Objects.equals(this.category, other.category) &&
                Objects.equals(this.checksum, other.checksum) &&
                Objects.equals(this.descriptions, other.descriptions) &&
                Objects.equals(this.displayNames, other.displayNames) &&
                Objects.equals(this.idShort, other.idShort) &&
                Objects.equals(this.extensions, other.extensions) &&
                Objects.equals(this.qualifiers, other.qualifiers);
        }
    }

    @Override
    public Direction getDirection() {
        return direction;
    }

    @Override
    public void setDirection(Direction direction) {
        this.direction = direction;
    }

    @Override
    public String getLastUpdate() {
        return lastUpdate;
    }

    @Override
    public void setLastUpdate(String lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    @Override
    public String getMaxInterval() {
        return maxInterval;
    }

    @Override
    public void setMaxInterval(String maxInterval) {
        this.maxInterval = maxInterval;
    }

    @Override
    public Reference getMessageBroker() {
        return messageBroker;
    }

    @Override
    public void setMessageBroker(Reference messageBroker) {
        this.messageBroker = messageBroker;
    }

    @Override
    public String getMessageTopic() {
        return messageTopic;
    }

    @Override
    public void setMessageTopic(String messageTopic) {
        this.messageTopic = messageTopic;
    }

    @Override
    public String getMinInterval() {
        return minInterval;
    }

    @Override
    public void setMinInterval(String minInterval) {
        this.minInterval = minInterval;
    }

    @Override
    public Reference getObserved() {
        return observed;
    }

    @Override
    public void setObserved(Reference observed) {
        this.observed = observed;
    }

    @Override
    public StateOfEvent getState() {
        return state;
    }

    @Override
    public void setState(StateOfEvent state) {
        this.state = state;
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
    public Reference getSemanticId() {
        return semanticId;
    }

    @Override
    public void setSemanticId(Reference semanticId) {
        this.semanticId = semanticId;
    }

    @Override
    public List<Reference> getSupplementalSemanticIds() {
        return supplementalSemanticIds;
    }

    @Override
    public void setSupplementalSemanticIds(List<Reference> supplementalSemanticIds) {
        this.supplementalSemanticIds = supplementalSemanticIds;
    }

    @Override
    public ModelingKind getKind() {
        return kind;
    }

    @Override
    public void setKind(ModelingKind kind) {
        this.kind = kind;
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

    @Override
    public List<Qualifier> getQualifiers() {
        return qualifiers;
    }

    @Override
    public void setQualifiers(List<Qualifier> qualifiers) {
        this.qualifiers = qualifiers;
    }

    /**
     * This builder class can be used to construct a DefaultBasicEventElement bean.
     */
    public static class Builder extends BasicEventElementBuilder<DefaultBasicEventElement, Builder> {

        @Override
        protected Builder getSelf() {
            return this;
        }

        @Override
        protected DefaultBasicEventElement newBuildingInstance() {
            return new DefaultBasicEventElement();
        }
    }
}
