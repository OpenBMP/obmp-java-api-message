package org.openbmp.api.parsed.message;
/*
 * Copyright (c) 2020 Cisco Systems, Inc. and others.  All rights reserved.
 * Copyright (c) 2020 Tim Evens (tim@evensweb.com).  All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 *
 */

import java.math.BigInteger;

/**
 * POJO for openbmp.parsed.lsnode record
 */
public class LsNodePojo {

    private Boolean isWithdrawn;             // action
    private BigInteger sequence;
    private String hash;
    private String base_attr_hash;
    private String router_hash;
    private String router_ip;
    private String peer_hash;
    private String peer_ip;
    private Long peer_asn;
    private String timestamp;

    private String igp_router_id;
    private String router_id;
    private BigInteger routing_id;
    private Long ls_id;
    private String mt_ids;
    private String ospf_area_id;
    private String isis_area_id;
    private String protocol;
    private String flags;
    private String as_path;
    private Long local_pref;
    private Long med;
    private String next_hop;
    private String name;
    private Boolean isPrePolicy;
    private Boolean isAdjRibIn;
    private String sr_capabilities;

    public LsNodePojo() {
        isWithdrawn = false;
        sequence = BigInteger.ZERO;
        peer_asn = 0L;
        routing_id = BigInteger.ZERO;
        ls_id = 0L;
        local_pref = 0L;
        med = 0L;
        isPrePolicy = true;
        isAdjRibIn = true;
    }

    public Boolean getWithdrawn() {
        return isWithdrawn;
    }

    public void setWithdrawn(Boolean withdrawn) {
        isWithdrawn = withdrawn;
    }

    public BigInteger getSequence() {
        return sequence;
    }

    public void setSequence(BigInteger sequence) {
        this.sequence = sequence;
    }

    public String getHash() {
        return hash;
    }

    public void setHash(String hash) {
        this.hash = hash;
    }

    public String getBase_attr_hash() {
        return base_attr_hash;
    }

    public void setBase_attr_hash(String base_attr_hash) {
        this.base_attr_hash = base_attr_hash;
    }

    public String getRouter_hash() {
        return router_hash;
    }

    public void setRouter_hash(String router_hash) {
        this.router_hash = router_hash;
    }

    public String getRouter_ip() {
        return router_ip;
    }

    public void setRouter_ip(String router_ip) {
        this.router_ip = router_ip;
    }

    public String getPeer_hash() {
        return peer_hash;
    }

    public void setPeer_hash(String peer_hash) {
        this.peer_hash = peer_hash;
    }

    public String getPeer_ip() {
        return peer_ip;
    }

    public void setPeer_ip(String peer_ip) {
        this.peer_ip = peer_ip;
    }

    public Long getPeer_asn() {
        return peer_asn;
    }

    public void setPeer_asn(Long peer_asn) {
        this.peer_asn = peer_asn;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public String getIgp_router_id() {
        return igp_router_id;
    }

    public void setIgp_router_id(String igp_router_id) {
        this.igp_router_id = igp_router_id;
    }

    public String getRouter_id() {
        return router_id;
    }

    public void setRouter_id(String router_id) {
        this.router_id = router_id;
    }

    public BigInteger getRouting_id() {
        return routing_id;
    }

    public void setRouting_id(BigInteger routing_id) {
        this.routing_id = routing_id;
    }

    public Long getLs_id() {
        return ls_id;
    }

    public void setLs_id(Long ls_id) {
        this.ls_id = ls_id;
    }

    public String getMt_ids() {
        return mt_ids;
    }

    public void setMt_ids(String mt_ids) {
        this.mt_ids = mt_ids;
    }

    public String getOspf_area_id() {
        return ospf_area_id;
    }

    public void setOspf_area_id(String ospf_area_id) {
        this.ospf_area_id = ospf_area_id;
    }

    public String getIsis_area_id() {
        return isis_area_id;
    }

    public void setIsis_area_id(String isis_area_id) {
        this.isis_area_id = isis_area_id;
    }

    public String getProtocol() {
        return protocol;
    }

    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    public String getFlags() {
        return flags;
    }

    public void setFlags(String flags) {
        this.flags = flags;
    }

    public String getAs_path() {
        return as_path;
    }

    public void setAs_path(String as_path) {
        this.as_path = as_path;
    }

    public Long getLocal_pref() {
        return local_pref;
    }

    public void setLocal_pref(Long local_pref) {
        this.local_pref = local_pref;
    }

    public Long getMed() {
        return med;
    }

    public void setMed(Long med) {
        this.med = med;
    }

    public String getNext_hop() {
        return next_hop;
    }

    public void setNext_hop(String next_hop) {
        this.next_hop = next_hop;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getPrePolicy() {
        return isPrePolicy;
    }

    public void setPrePolicy(Boolean prePolicy) {
        isPrePolicy = prePolicy;
    }

    public Boolean getAdjRibIn() {
        return isAdjRibIn;
    }

    public void setAdjRibIn(Boolean adjRibIn) {
        isAdjRibIn = adjRibIn;
    }

    public String getSr_capabilities() {
        return sr_capabilities;
    }

    public void setSr_capabilities(String sr_capabilities) {
        this.sr_capabilities = sr_capabilities;
    }
}
