/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package com.aliyuncs.fc.request;

import com.aliyuncs.fc.constants.Const;
import com.aliyuncs.fc.exceptions.ClientException;
import com.aliyuncs.fc.http.FormatType;
import com.aliyuncs.fc.http.HttpRequest;
import com.aliyuncs.fc.model.*;
import com.aliyuncs.fc.response.CreateFunctionResponse;
import com.aliyuncs.fc.utils.ParameterHelper;

import com.google.common.base.Strings;
import com.google.gson.annotations.SerializedName;
import java.util.Map;

/**
 * TODO: add javadoc
 */
public class CreateFunctionRequest extends HttpRequest {

    private transient final String serviceName;

    @SerializedName("functionName")
    private String functionName;

    @SerializedName("description")
    private String description;

    @SerializedName("runtime")
    private String runtime;

    @SerializedName("handler")
    private String handler;

    @SerializedName("initializer")
    private String initializer;

    @SerializedName("timeout")
    private Integer timeout;

    @SerializedName("initializationTimeout")
    private Integer initializationTimeout;

    @SerializedName("memorySize")
    private Integer memorySize;

    @SerializedName("gpuMemorySize")
    private Integer gpuMemorySize;

    @SerializedName("code")
    private Code code;

    @SerializedName("environmentVariables")
    private Map<String, String> environmentVariables;

    @SerializedName("instanceConcurrency")
    private Integer instanceConcurrency;

    @SerializedName("instanceType")
    private String instanceType;

    @SerializedName("customContainerConfig")
    private CustomContainerConfig customContainerConfig;

    @SerializedName("instanceLifecycleConfig")
    private InstanceLifecycleConfig instanceLifecycleConfig;

    @SerializedName("caPort")
    private Integer caPort;

    @SerializedName("layers")
    private String[] layers;

    @SerializedName("customDNS")
    private CustomDNS customDNS;

    @SerializedName("customRuntimeConfig")
    private CustomRuntimeConfig customRuntimeConfig;

    public CreateFunctionRequest(String serviceName) {
        this.serviceName = serviceName;
    }

    public String getServiceName() {
        return serviceName;
    }

    public CreateFunctionRequest setCode(Code code) {
        this.code = code;
        return this;
    }

    public Code getCode() {
        return code;
    }

    public CreateFunctionRequest setFunctionName(String functionName) {
        this.functionName = functionName;
        return this;
    }

    public String getFunctionName() {
        return functionName;
    }

    public CreateFunctionRequest setDescription(String description) {
        this.description = description;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public CreateFunctionRequest setRuntime(String runtime) {
        this.runtime = runtime;
        return this;
    }

    public String getRuntime() {
        return runtime;
    }

    public CreateFunctionRequest setHandler(String handler) {
        this.handler = handler;
        return this;
    }

    public String getHandler() {
        return handler;
    }

    public CreateFunctionRequest setInitializer(String initializer) {
        this.initializer = initializer;
        return this;
    }

    public String getInitializer() {
        return initializer;
    }

    public CreateFunctionRequest setTimeout(Integer timeout) {
        this.timeout = timeout;
        return this;
    }

    public Integer getTimeout() {
        return timeout;
    }

    public CreateFunctionRequest setInitializationTimeout(Integer initializationTimeout) {
        this.initializationTimeout = initializationTimeout;
        return this;
    }

    public Integer getInitializationTimeout() {
        return initializationTimeout;
    }

    public CreateFunctionRequest setMemorySize(Integer memorySize) {
        this.memorySize = memorySize;
        return this;
    }

    public Integer getMemorySize() {
        return memorySize;
    }

    public CreateFunctionRequest setGpuMemorySize(Integer gpuMemorySize) {
        this.gpuMemorySize = gpuMemorySize;
        return this;
    }

    public Integer getGpuMemorySize() {
        return gpuMemorySize;
    }

    public CreateFunctionRequest setInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }

    public String getInstanceType() {
        return instanceType;
    }

    public CreateFunctionRequest setCustomContainerConfig(CustomContainerConfig customContainerConfig) {
        this.customContainerConfig = customContainerConfig;
        return this;
    }

    public CustomContainerConfig getCustomContainerConfig(){
        return customContainerConfig;
    }

    public CreateFunctionRequest setCAPort(Integer caPort){
        this.caPort = caPort;
        return this;
    }

    public Integer getCAPort() {
        return caPort;
    }

    public Map<String, String> getEnvironmentVariables() {
        return environmentVariables;
    }

    public void setEnvironmentVariables(Map<String, String> environmentVariables) {
        this.environmentVariables = environmentVariables;
    }

    public String getPath() {
        return String.format(Const.FUNCTION_PATH, Const.API_VERSION, this.serviceName);
    }

    public Map<String, String> getQueryParams() {
        return null;
    }

    public byte[] getPayload() {
        return ParameterHelper.ObjectToJson(this).getBytes();
    }

    public FormatType getFormat() {
        return FormatType.JSON;
    }

    public void validate() throws ClientException {
        if (Strings.isNullOrEmpty(serviceName)) {
            throw new ClientException("Service name cannot be blank");
        }
    }

    public Class<CreateFunctionResponse> getResponseClass() {
        return CreateFunctionResponse.class;
    }

    public Integer getInstanceConcurrency() {
        return instanceConcurrency;
    }

    public void setInstanceConcurrency(Integer instanceConcurrency) {
        this.instanceConcurrency = instanceConcurrency;
    }

    public CreateFunctionRequest setInstanceLifecycleConfig(InstanceLifecycleConfig instanceLifecycleConfig) {
        this.instanceLifecycleConfig = instanceLifecycleConfig;
        return this;
    }

    public InstanceLifecycleConfig getInstanceLifecycleConfig(){
        return instanceLifecycleConfig;
    }

    public String[] getLayers() {
        return layers;
    }

    public void setLayers(String[] layers) {
        this.layers = layers;
    }

    public CustomDNS getCustomDNS() {
        return customDNS;
    }

    public void setCustomDNS(CustomDNS customDNS) {
        this.customDNS = customDNS;
    }

    public CustomRuntimeConfig getCustomRuntimeConfig() {
        return customRuntimeConfig;
    }

    public void setCustomRuntimeConfig(CustomRuntimeConfig customRuntimeConfig) {
        this.customRuntimeConfig = customRuntimeConfig;
    }

}
