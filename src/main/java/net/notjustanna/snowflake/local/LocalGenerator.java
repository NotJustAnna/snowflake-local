package net.notjustanna.snowflake.local;

import net.notjustanna.snowflake.SnowflakeConfig;
import net.notjustanna.snowflake.entities.SnowflakeDatacenter;
import net.notjustanna.snowflake.entities.SnowflakeGenerator;

import java.util.HashMap;
import java.util.Map;

public class LocalGenerator implements SnowflakeGenerator {

    final SnowflakeConfig config;
    private final Map<Long, LocalDatacenter> datacenters = new HashMap<>();

    public LocalGenerator(SnowflakeConfig config) {
        this.config = config;
    }

    @Override
    public SnowflakeConfig getConfig() {
        return config;
    }

    @Override
    public SnowflakeDatacenter getDatacenter(long datacenter) {
        return datacenters.computeIfAbsent(
            datacenter,
            k -> new LocalDatacenter(this, datacenter)
        );
    }

    @Override
    public String toString() {
        return "LocalGenerator[config=" + config + "]";
    }

}
