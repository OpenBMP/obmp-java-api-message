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
import org.openbmp.api.parsed.message.LsPrefixPojo;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

/**
 * TSV Processor class
 *      Produces a list of LsPrefixPojo for each record in the message.
 */
public class LsPrefix {
    public List<LsPrefixPojo> records;            // Parsed records

    /**
     * Constructor
     *
     * @param data          Ascii/String TSV records delimited by newline
     */
    public LsPrefix(String data) {
        records = parseData(data);
    }

    List<LsPrefixPojo> parseData(String data) {
        List<String> records = split.getStrings(data, '\n', 5000);
        List<LsPrefixPojo> results = new ArrayList<>();

        for (String record: records) {
            if (record.length() > 3) {
                LsPrefixPojo entry = parseRecord(record);
                results.add(entry);
            }
        }

        return results;
    }

    LsPrefixPojo parseRecord(String data) {

        List<String> fields = split.getStrings(data, '\t', 500);

        LsPrefixPojo pojo = new LsPrefixPojo();

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
            pojo.setRouter_id(fields.get(11));
            pojo.setRouting_id(BigInteger.valueOf(Long.valueOf(fields.get(12))));
            pojo.setLs_id(Long.decode("0x" + fields.get(13)));
            pojo.setOspf_area_id(fields.get(14));
            pojo.setIsis_area_id(fields.get(15));
            pojo.setProtocol(fields.get(16));

            pojo.setAs_path(fields.get(17));
            pojo.setLocal_pref(fields.get(18).length() != 0 ? Long.valueOf(fields.get(18)) : 0L);
            pojo.setMed(fields.get(19).length() != 0 ? Long.valueOf(fields.get(19)) : 0L);
            pojo.setNext_hop(fields.get(20));

            pojo.setLocal_node_hash(fields.get(21));
            pojo.setMt_id(fields.get(22).length() != 0 ? Long.valueOf(fields.get(22)) : 0L);
            pojo.setOspf_route_type(fields.get(23));
            pojo.setIgp_flags(fields.get(24));
            pojo.setRoute_tag(fields.get(25).length() != 0 ? Long.valueOf(fields.get(25)) : 0L);
            pojo.setExt_route_tag(fields.get(26).length() != 0 ? Long.valueOf(fields.get(26)) : 0L);
            pojo.setOspf_fwd_address(fields.get(27));
            pojo.setIgp_metric(fields.get(28).length() != 0 ? Long.valueOf(fields.get(28)) : 0L);
            pojo.setPrefix(fields.get(29));
            pojo.setPrefix_len(Integer.valueOf(fields.get(30)));

            pojo.setPrePolicy(fields.get(31).equals("1") ? true : false);
            pojo.setAdjRibIn(fields.get(32).equals("1") ? true : false);

            pojo.setPrefix_sid_tlv(fields.get(33));

        } catch (Exception ex) {
            ex.printStackTrace();
            // ignore - support backwards compatibility
        }

        return pojo;
    }
}
