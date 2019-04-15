/*
 * This file is part of CycloneDX Core (Java).
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * Copyright (c) Steve Springett. All Rights Reserved.
 */
package org.cyclonedx.model;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import org.cyclonedx.CycloneDxSchema;

@SuppressWarnings("unused")
public class Commit {

    private String uid;
    private String url;
    private IdentifiableActionType author;
    private IdentifiableActionType committer;
    private String message;

    public String getUid() {
        return uid;
    }

    @JacksonXmlProperty(localName = "uid", namespace = CycloneDxSchema.NS_BOM_LATEST)
    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getUrl() {
        return url;
    }

    @JacksonXmlProperty(localName = "url", namespace = CycloneDxSchema.NS_BOM_LATEST)
    public void setUrl(String url) {
        this.url = url;
    }

    public IdentifiableActionType getAuthor() {
        return author;
    }

    @JacksonXmlProperty(localName = "author", namespace = CycloneDxSchema.NS_BOM_LATEST)
    public void setAuthor(IdentifiableActionType author) {
        this.author = author;
    }

    public IdentifiableActionType getCommitter() {
        return committer;
    }

    @JacksonXmlProperty(localName = "committer", namespace = CycloneDxSchema.NS_BOM_LATEST)
    public void setCommitter(IdentifiableActionType committer) {
        this.committer = committer;
    }

    public String getMessage() {
        return message;
    }

    @JacksonXmlProperty(localName = "message", namespace = CycloneDxSchema.NS_BOM_LATEST)
    public void setMessage(String message) {
        this.message = message;
    }
}