/*
 * Copyright (c) 2022 Cisco Systems, Inc. and others.  All rights reserved.
 * Copyright (c) 2022 Tim Evens (tim@evensweb.com).  All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 *
 */
package org.openbmp.api.parsed.processor;


import org.openbmp.api.helpers.split;
import org.openbmp.api.parsed.message.L3VpnPrefixPojo;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

/**
 * TSV Processor class
 *      Produces a list of L3VpnPrefixPojo for each record in the message.
 */
public class L3VpnPrefix {
    public List<L3VpnPrefixPojo> records;            // Parsed records

    /**
     * Constructor
     *
     * @param data          Ascii/String TSV records delimited by newline
     */
    public L3VpnPrefix(String data) {
        records = parseData(data);
    }

    List<L3VpnPrefixPojo> parseData(String data) {
        List<String> records = split.getStrings(data, '\n', 5000);
        List<L3VpnPrefixPojo> results = new ArrayList<>();

        for (String record: records) {
            if (record.length() > 3) {
                L3VpnPrefixPojo entry = parseRecord(record);
                results.add(entry);
            }
        }

        return results;
    }

    L3VpnPrefixPojo parseRecord(String data) {

        List<String> fields = split.getStrings(data, '\t', 500);

        L3VpnPrefixPojo l3vpn = new L3VpnPrefixPojo();

        /*
         * Populate pojo
         */
        try {
            l3vpn.setWithdrawn(fields.get(0).equals("add") ? false : true);
            l3vpn.setSequence(BigInteger.valueOf(Long.valueOf(fields.get(1))));
            l3vpn.setHash(fields.get(2));
            l3vpn.setRouter_hash(fields.get(3));
            l3vpn.setRouter_ip(fields.get(4));
            l3vpn.setBase_attr_hash(fields.get(5));
            l3vpn.setPeer_hash(fields.get(6));
            l3vpn.setPeer_ip(fields.get(7));
            l3vpn.setPeer_asn(Long.valueOf(fields.get(8)));
            l3vpn.setTimestamp(fields.get(9));
            l3vpn.setPrefix(fields.get(10));
            l3vpn.setPrefix_len(Integer.valueOf(fields.get(11)));
            l3vpn.setIPv4(fields.get(12).equals("1") ? true : false);
            l3vpn.setOrigin(fields.get(13));
            l3vpn.setAs_path(fields.get(14));
            l3vpn.setAs_path_len(fields.get(15).length() != 0 ? Integer.valueOf(fields.get(15)) : 0);
            l3vpn.setOrigin_asn(fields.get(16).length() != 0 ? Long.valueOf(fields.get(16)) : 0L);
            l3vpn.setNext_hop(fields.get(17));
            l3vpn.setMed(fields.get(18).length() != 0 ? Long.valueOf(fields.get(18)) : 0L);
            l3vpn.setLocal_pref(fields.get(19).length() != 0 ? Long.valueOf(fields.get(19)) : 0L);
            l3vpn.setAggregator(fields.get(20));
            l3vpn.setCommunity_list(fields.get(21));
            l3vpn.setExt_community_list(fields.get(22));
            l3vpn.setCluster_list(fields.get(23));
            l3vpn.setAtomicAggregate(fields.get(24).length() != 0 || fields.get(24).equals(0) ? false : true);
            l3vpn.setNextHopIpv4(fields.get(25).length() == 0 || fields.get(25).equals(0) ? false : true);
            l3vpn.setOriginator_id(fields.get(26));
            l3vpn.setPath_id(Long.valueOf(fields.get(27)));
            l3vpn.setLabels(fields.get(28));
            l3vpn.setPrePolicy(fields.get(29).equals(1) ? true : false);
            l3vpn.setAdjRibIn(fields.get(30).equals(1) ? true : false);
            l3vpn.setRd(fields.get(31));
            l3vpn.setRd_type(Integer.valueOf(fields.get(32).length() != 0 ? Integer.valueOf(fields.get(32)) : 0));
            l3vpn.setLarge_community_list(fields.get(33));

        } catch (Exception ex) {
            ex.printStackTrace();
            // ignore - support backwards compatibility
        }

        return l3vpn;
    }
}
