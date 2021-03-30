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
public class LsLinkPojo {

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

    private Long mt_id;
    private Long local_link_id;
    private Long remote_link_id;
    private String interface_ip;
    private String neighbor_ip;
    private Long igp_metric;
    private Long admin_group;
    private Long max_link_bw;
    private Long max_resv_bw;
    private String unreserved_bw;
    private Long te_default_metric;
    private String link_protection;
    private String mpls_proto_mask;
    private String srlg;
    private String link_name;
    private String remote_node_hash;
    private String local_node_hash;
    private String remote_igp_router_id;
    private String remote_router_id;
    private Long local_node_asn;
    private Long remote_node_asn;
    private String epe_peer_node_sid;

    private Boolean isPrePolicy;
    private Boolean isAdjRibIn;

    private String adjacency_segment_id;

    public LsLinkPojo() {
        isWithdrawn = false;
        sequence = BigInteger.ZERO;
        peer_asn = 0L;
        routing_id = BigInteger.ZERO;
        ls_id = 0L;
        local_pref = 0L;
        med = 0L;

        mt_id = 0L;
        local_link_id = 0L;
        remote_link_id = 0L;
        igp_metric = 0L;
        admin_group = 0L;
        max_link_bw = 0L;
        max_resv_bw = 0L;
        te_default_metric = 0L;
        local_node_asn = 0L;
        remote_node_asn = 0L;

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

    public Long getMt_id() {
        return mt_id;
    }

    public void setMt_id(Long mt_id) {
        this.mt_id = mt_id;
    }

    public Long getLocal_link_id() {
        return local_link_id;
    }

    public void setLocal_link_id(Long local_link_id) {
        this.local_link_id = local_link_id;
    }

    public Long getRemote_link_id() {
        return remote_link_id;
    }

    public void setRemote_link_id(Long remote_link_id) {
        this.remote_link_id = remote_link_id;
    }

    public String getInterface_ip() {
        return interface_ip;
    }

    public void setInterface_ip(String interface_ip) {
        this.interface_ip = interface_ip;
    }

    public String getNeighbor_ip() {
        return neighbor_ip;
    }

    public void setNeighbor_ip(String neighbor_ip) {
        this.neighbor_ip = neighbor_ip;
    }

    public Long getIgp_metric() {
        return igp_metric;
    }

    public void setIgp_metric(Long igp_metric) {
        this.igp_metric = igp_metric;
    }

    public Long getMax_link_bw() {
        return max_link_bw;
    }

    public void setMax_link_bw(Long max_link_bw) {
        this.max_link_bw = max_link_bw;
    }

    public Long getMax_resv_bw() {
        return max_resv_bw;
    }

    public void setMax_resv_bw(Long max_resv_bw) {
        this.max_resv_bw = max_resv_bw;
    }

    public String getUnreserved_bw() {
        return unreserved_bw;
    }

    public void setUnreserved_bw(String unreserved_bw) {
        this.unreserved_bw = unreserved_bw;
    }

    public Long getTe_default_metric() {
        return te_default_metric;
    }

    public void setTe_default_metric(Long te_default_metric) {
        this.te_default_metric = te_default_metric;
    }

    public String getMpls_proto_mask() {
        return mpls_proto_mask;
    }

    public void setMpls_proto_mask(String mpls_proto_mask) {
        this.mpls_proto_mask = mpls_proto_mask;
    }

    public String getSrlg() {
        return srlg;
    }

    public void setSrlg(String srlg) {
        this.srlg = srlg;
    }

    public String getLink_name() {
        return link_name;
    }

    public void setLink_name(String link_name) {
        this.link_name = link_name;
    }

    public String getRemote_node_hash() {
        return remote_node_hash;
    }

    public void setRemote_node_hash(String remote_node_hash) {
        this.remote_node_hash = remote_node_hash;
    }

    public String getLocal_node_hash() {
        return local_node_hash;
    }

    public void setLocal_node_hash(String local_node_hash) {
        this.local_node_hash = local_node_hash;
    }

    public String getRemote_igp_router_id() {
        return remote_igp_router_id;
    }

    public void setRemote_igp_router_id(String remote_igp_router_id) {
        this.remote_igp_router_id = remote_igp_router_id;
    }

    public String getRemote_router_id() {
        return remote_router_id;
    }

    public void setRemote_router_id(String remote_router_id) {
        this.remote_router_id = remote_router_id;
    }

    public Long getLocal_node_asn() {
        return local_node_asn;
    }

    public void setLocal_node_asn(Long local_node_asn) {
        this.local_node_asn = local_node_asn;
    }

    public Long getRemote_node_asn() {
        return remote_node_asn;
    }

    public void setRemote_node_asn(Long remote_node_asn) {
        this.remote_node_asn = remote_node_asn;
    }

    public String getEpe_peer_node_sid() {
        return epe_peer_node_sid;
    }

    public void setEpe_peer_node_sid(String epe_peer_node_sid) {
        this.epe_peer_node_sid = epe_peer_node_sid;
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

    public String getAdjacency_segment_id() {
        return adjacency_segment_id;
    }

    public void setAdjacency_segment_id(String adjacency_segment_id) {
        this.adjacency_segment_id = adjacency_segment_id;
    }

    public Long getAdmin_group() {
        return admin_group;
    }

    public void setAdmin_group(Long admin_group) {
        this.admin_group = admin_group;
    }

    public String getLink_protection() {
        return link_protection;
    }

    public void setLink_protection(String link_protection) {
        this.link_protection = link_protection;
    }
}
