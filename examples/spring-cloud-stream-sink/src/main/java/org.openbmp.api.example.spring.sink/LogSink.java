/*
 * Copyright (c) 2015-2016 Cisco Systems, Inc. and others.  All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 *
 */
package org.openbmp.api.example.spring.sink;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.integration.annotation.ServiceActivator;
import org.openbmp.api.parsed.message.*;
import org.springframework.messaging.handler.annotation.Header;


@EnableBinding(SinkInput.class)
public class LogSink {

	private static Logger logger = LoggerFactory.getLogger(LogSink.class);

    @ServiceActivator(inputChannel=SinkInput.COLLECTOR)
    public void log_Collector(Object payload) {

        Message msg = new Message(payload.toString());
        Collector collector = new Collector(msg.getContent());

        logger.info("COLLECTOR("+ msg.getVersion() + "): " + collector.toJsonPretty());
    }

    @ServiceActivator(inputChannel=SinkInput.ROUTER)
    public void log_Router(Object payload) {

        Message msg = new Message(payload.toString());
        Router router = new Router(msg.getVersion(), msg.getContent());

        logger.info("ROUTER("+ msg.getVersion() + "): " + router.toJsonPretty());
    }

    @ServiceActivator(inputChannel=SinkInput.PEER)
    public void log_Peer(Object payload) {

        Message msg = new Message(payload.toString());
        Peer peer = new Peer(msg.getContent());

        logger.info("PEER("+ msg.getVersion() + "): " + peer.toJsonPretty());
    }

    @ServiceActivator(inputChannel=SinkInput.UNICAST_PREFIX)
    public void log_UnicastPrefix(Object payload) {

        Message msg = new Message(payload.toString());
        UnicastPrefix unicastPrefix = new UnicastPrefix(msg.getVersion(), msg.getContent());

        logger.info("UNICAST_PREFIX("+ msg.getVersion() + "): " + unicastPrefix.toJsonPretty());
    }

    @ServiceActivator(inputChannel=SinkInput.L3VPN)
    public void log_L3Vpn(Object payload) {

        Message msg = new Message(payload.toString());
        L3VpnPrefix l3VpnPrefix = new L3VpnPrefix(msg.getVersion(), msg.getContent());

        logger.info("L3VPN_PREFIX(" + msg.getVersion() + "): " + l3VpnPrefix.toJsonPretty());
    }

    @ServiceActivator(inputChannel=SinkInput.LS_NODE)
    public void log_LsNode(Object payload) {

        Message msg = new Message(payload.toString());
        LsNode ls_node = new LsNode(msg.getVersion(), msg.getContent());

        logger.info("LS NODE("+ msg.getVersion() + "): " + ls_node.toJsonPretty());
    }

    @ServiceActivator(inputChannel=SinkInput.LS_LINK)
	public void log_LsLink(Object payload) {

        Message msg = new Message(payload.toString());
		LsLink ls_link = new LsLink(msg.getVersion(), msg.getContent());

		logger.info("LS LINK("+ msg.getVersion() + "): " + ls_link.toJsonPretty());
	}

    @ServiceActivator(inputChannel=SinkInput.LS_PREFIX)
    public void log_LsPrefix(Object payload) {

        Message msg = new Message(payload.toString());
        LsPrefix ls_prefix = new LsPrefix(msg.getVersion(), msg.getContent());

        logger.info("LS PREFIX("+ msg.getVersion() + "): " + ls_prefix.toJsonPretty());
    }
}
