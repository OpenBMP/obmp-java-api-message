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
public class LsPrefixPojo {

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
    private String ospf_area_id;
    private String isis_area_id;
    private String protocol;
    private String as_path;
    private Long local_pref;
    private Long med;
    private String next_hop;

    private String local_node_hash;
    private Long mt_id;
    private String ospf_route_type;
    private String igp_flags;
    private Long route_tag;
    private Long ext_route_tag;
    private String ospf_fwd_address;
    private Long igp_metric;
    private String prefix;
    private Integer prefix_len;

    private Boolean isPrePolicy;
    private Boolean isAdjRibIn;
    private String prefix_sid_tlv;

    public LsPrefixPojo() {
        isWithdrawn = false;
        sequence = BigInteger.ZERO;
        peer_asn = 0L;
        routing_id = BigInteger.ZERO;
        ls_id = 0L;
        local_pref = 0L;
        med = 0L;

        mt_id = 0L;
        route_tag = 0L;
        ext_route_tag = 0L;
        igp_metric = 0L;
        prefix_len = 0;

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

    public String getLocal_node_hash() {
        return local_node_hash;
    }

    public void setLocal_node_hash(String local_node_hash) {
        this.local_node_hash = local_node_hash;
    }

    public Long getMt_id() {
        return mt_id;
    }

    public void setMt_id(Long mt_id) {
        this.mt_id = mt_id;
    }

    public String getOspf_route_type() {
        return ospf_route_type;
    }

    public void setOspf_route_type(String ospf_route_type) {
        this.ospf_route_type = ospf_route_type;
    }

    public String getIgp_flags() {
        return igp_flags;
    }

    public void setIgp_flags(String igp_flags) {
        this.igp_flags = igp_flags;
    }

    public Long getRoute_tag() {
        return route_tag;
    }

    public void setRoute_tag(Long route_tag) {
        this.route_tag = route_tag;
    }

    public Long getExt_route_tag() {
        return ext_route_tag;
    }

    public void setExt_route_tag(Long ext_route_tag) {
        this.ext_route_tag = ext_route_tag;
    }

    public String getOspf_fwd_address() {
        return ospf_fwd_address;
    }

    public void setOspf_fwd_address(String ospf_fwd_address) {
        this.ospf_fwd_address = ospf_fwd_address;
    }

    public Long getIgp_metric() {
        return igp_metric;
    }

    public void setIgp_metric(Long igp_metric) {
        this.igp_metric = igp_metric;
    }

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    public Integer getPrefix_len() {
        return prefix_len;
    }

    public void setPrefix_len(Integer prefix_len) {
        this.prefix_len = prefix_len;
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

    public String getPrefix_sid_tlv() {
        return prefix_sid_tlv;
    }

    public void setPrefix_sid_tlv(String prefix_sid_tlv) {
        this.prefix_sid_tlv = prefix_sid_tlv;
    }
}
