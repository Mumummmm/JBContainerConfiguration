package com.pansy;

import javax.sql.DataSource;

public class JdbcAccountRepository extends AccountRepository {
    private DataSource dataSource;

    public JdbcAccountRepository(DataSource dataSource) {
        this.dataSource = dataSource;
    }
}
