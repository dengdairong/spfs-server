package com.bc.ipfs.ipfsserver.config;

import io.ipfs.api.IPFS;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties
public class IpfsConfig {
    @Autowired
    private IpfsProps ipfsProps;

    @Bean(destroyMethod="")
    public IPFS createIpfs() {
        return new IPFS("/ip4/" + ipfsProps.getHost() + "/tcp/" + ipfsProps.getPort());
    }
}
