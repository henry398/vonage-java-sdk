/*
 *   Copyright 2020 Vonage
 *
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 */
package com.vonage.client.sms;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;

@JsonIgnoreProperties(ignoreUnknown = true)
public class SmsDetails {
    private String messageId;
    private String accountId;
    private String network;
    private String from;
    private String to;
    private String body;
    private String price;
    private Date dateReceived;
    private String finalStatus;
    private Date dateClosed;
    private Integer latency;
    private String type;

    @JsonProperty("message-id")
    public String getMessageId() {
        return messageId;
    }

    @JsonProperty("account-id")
    public String getAccountId() {
        return accountId;
    }

    public String getNetwork() {
        return network;
    }

    public String getFrom() {
        return from;
    }

    public String getTo() {
        return to;
    }

    public String getBody() {
        return body;
    }

    public String getPrice() {
        return price;
    }

    @JsonProperty("date-received")
    public Date getDateReceived() {
        return dateReceived;
    }

    @JsonProperty("final-status")
    public String getFinalStatus() {
        return finalStatus;
    }

    @JsonProperty("date-closed")
    public Date getDateClosed() {
        return dateClosed;
    }

    public Integer getLatency() {
        return latency;
    }

    public String getType() {
        return type;
    }
}
