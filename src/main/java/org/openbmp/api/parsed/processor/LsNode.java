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
import org.openbmp.api.parsed.message.LsNodePojo;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

/**
 * TSV Processor class
 *      Produces a list of LsNodePojo for each record in the message.
 */
public class LsNode {
    public List<LsNodePojo> records;            // Parsed records

    /**
     * Constructor
     *
     * @param data          Ascii/String TSV records delimited by newline
     */
    public LsNode(String data) {
        records = parseData(data);
    }

    List<LsNodePojo> parseData(String data) {
        List<String> records = split.getStrings(data, '\n', 5000);
        List<LsNodePojo> results = new ArrayList<>();

        for (String record: records) {
            if (record.length() > 3) {
                LsNodePojo entry = parseRecord(record);
                results.add(entry);
            }
        }

        return results;
    }

    LsNodePojo parseRecord(String data) {

        List<String> fields = split.getStrings(data, '\t', 500);

        LsNodePojo pojo = new LsNodePojo();

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
            pojo.setMt_ids(fields.get(14));
            pojo.setOspf_area_id(fields.get(15));
            pojo.setIsis_area_id(fields.get(16));
            pojo.setProtocol(fields.get(17));
            pojo.setFlags(fields.get(18));

            pojo.setAs_path(fields.get(19));
            pojo.setLocal_pref(fields.get(20).length() != 0 ? Long.valueOf(fields.get(20)) : 0L);
            pojo.setMed(fields.get(21).length() != 0 ? Long.valueOf(fields.get(21)) : 0L);
            pojo.setNext_hop(fields.get(22));
            pojo.setName(fields.get(23));

            pojo.setPrePolicy(fields.get(24).equals("1") ? true : false);
            pojo.setAdjRibIn(fields.get(25).equals("1") ? true : false);

            pojo.setSr_capabilities(fields.get(26));

        } catch (Exception ex) {
            ex.printStackTrace();
            // ignore - support backwards compatibility
        }

        return pojo;
    }
}
