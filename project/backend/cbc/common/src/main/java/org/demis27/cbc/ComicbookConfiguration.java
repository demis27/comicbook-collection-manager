package org.demis27.cbc;

import io.micronaut.context.annotation.ConfigurationProperties;

@ConfigurationProperties("kickoff")
public class ComicbookConfiguration {

    private String databaseName = "kickoff-2019";

    public String getDatabaseName() {
        return databaseName;
    }

    public void setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
    }
}