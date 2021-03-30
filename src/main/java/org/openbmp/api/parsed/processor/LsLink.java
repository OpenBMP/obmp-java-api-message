/*
 * Copyright (c) 2020 Cisco Systems, Inc. and others.  All rights reserved.
 * Copyright (c) 2020 Tim Evens (tim@evensweb.com).  All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 *
 */
package org.openbmp.api.parsed.processor;


import org.openbmp.api.helpers.split;
import org.openbmp.api.parsed.message.LsLinkPojo;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

/**
 * TSV Processor class
 *      Produces a list of LsLinkPojo for each record in the message.
 */
public class LsLink {
    public List<LsLinkPojo> records;            // Parsed records

    /**
     * Constructor
     *
     * @param data          Ascii/String TSV records delimited by newline
     */
    public LsLink(String data) {
        records = parseData(data);
    }

    List<LsLinkPojo> parseData(String data) {
        List<String> records = split.getStrings(data, '\n', 5000);
        List<LsLinkPojo> results = new ArrayList<>();

        for (String record: records) {
            if (record.length() > 3) {
                LsLinkPojo entry = parseRecord(record);
                results.add(entry);
            }
        }

        return results;
    }

    LsLinkPojo parseRecord(String data) {

        List<String> fields = split.getStrings(data, '\t', 500);

        LsLinkPojo pojo = new LsLinkPojo();

        /*
         * Populate pojo
         */
        try {
            pojo.setWithdrawn(fields.get(0).equals("add") ? false : true);
            pojo.setSequence(BigInteger.valueOf(Long.valueOf(fields.get(1))));
            pojo.setHash(fields.get(2));
            pojo.setBase_attr_hash(fields.get(3));
            pojo.setRouter_hash(fields.get(4));
            pojo.setRouter_ip(fields.get(5));
            pojo.setPeer_hash(fields.get(6));
            pojo.setPeer_ip(fields.get(7));
            pojo.setPeer_asn(Long.valueOf(fields.get(8)));
            pojo.setTimestamp(fields.get(9));

            pojo.setIgp_router_id(fields.get(10));
            pojo.setRouter_id(fields.get(11).equals("::") ? "" : fields.get(11));
            pojo.setRouting_id(BigInteger.valueOf(Long.valueOf(fields.get(12))));
            pojo.setLs_id(Long.decode("0x" + fields.get(13)));
            pojo.setOspf_area_id(fields.get(14));
            pojo.setIsis_area_id(fields.get(15));
            pojo.setProtocol(fields.get(16));

            pojo.setAs_path(fields.get(17));
            pojo.setLocal_pref(fields.get(18).length() != 0 ? Long.valueOf(fields.get(18)) : 0L);
            pojo.setMed(fields.get(19).length() != 0 ? Long.valueOf(fields.get(19)) : 0L);
            pojo.setNext_hop(fields.get(20));
            pojo.setMt_id(fields.get(21).length() != 0 ? Long.valueOf(fields.get(21)) : 0L);
            pojo.setLocal_link_id(fields.get(22).length() != 0 ? Long.valueOf(fields.get(22)) : 0L);
            pojo.setRemote_link_id(fields.get(23).length() != 0 ? Long.valueOf(fields.get(23)) : 0L);
            pojo.setInterface_ip(fields.get(24).equals("::") ? null : fields.get(24));
            pojo.setNeighbor_ip(fields.get(25).equals("::") ? null : fields.get(25));
            pojo.setIgp_metric(fields.get(26).length() != 0 ? Long.valueOf(fields.get(26)) : 0L);
            pojo.setAdmin_group(fields.get(27).length() != 0 ? Long.valueOf(fields.get(27)) : 0L);
            pojo.setMax_link_bw(fields.get(28).length() != 0 ? Long.valueOf(fields.get(28)) : 0L);
            pojo.setMax_resv_bw(fields.get(29).length() != 0 ? Long.valueOf(fields.get(29)) : 0L);
            pojo.setUnreserved_bw(fields.get(30));
            pojo.setTe_default_metric(fields.get(31).length() != 0 ? Long.valueOf(fields.get(31)) : 0L);
            pojo.setLink_protection(fields.get(32));
            pojo.setMpls_proto_mask(fields.get(33));
            pojo.setSrlg(fields.get(34));
            pojo.setLink_name(fields.get(35));
            pojo.setRemote_node_hash(fields.get(36));
            pojo.setLocal_node_hash(fields.get(37));
            pojo.setRemote_igp_router_id(fields.get(38));
            pojo.setRemote_router_id(fields.get(39).equals("::") ? "" : fields.get(39));
            pojo.setLocal_node_asn(Long.valueOf(fields.get(40)));
            pojo.setRemote_node_asn(Long.valueOf(fields.get(41)));
            pojo.setEpe_peer_node_sid(fields.get(42));

            pojo.setPrePolicy(fields.get(43).equals(1) ? true : false);
            pojo.setAdjRibIn(fields.get(44).equals(1) ? true : false);

            pojo.setAdjacency_segment_id(fields.get(45));

        } catch (Exception ex) {
            ex.printStackTrace();
            // ignore - support backwards compatibility
        }

        return pojo;
    }
}
