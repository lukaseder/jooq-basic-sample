/*
 * This file is generated by jOOQ.
 */
package com.cockroachlabs.example.jooq.db.tables.records;


import com.cockroachlabs.example.jooq.db.tables.Accounts;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record2;
import org.jooq.Row2;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class AccountsRecord extends UpdatableRecordImpl<AccountsRecord> implements Record2<Long, Long> {

    private static final long serialVersionUID = 9072772;

    /**
     * Setter for <code>ACCOUNTS.ID</code>.
     */
    public void setId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>ACCOUNTS.ID</code>.
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>ACCOUNTS.BALANCE</code>.
     */
    public void setBalance(Long value) {
        set(1, value);
    }

    /**
     * Getter for <code>ACCOUNTS.BALANCE</code>.
     */
    public Long getBalance() {
        return (Long) get(1);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record2 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row2<Long, Long> fieldsRow() {
        return (Row2) super.fieldsRow();
    }

    @Override
    public Row2<Long, Long> valuesRow() {
        return (Row2) super.valuesRow();
    }

    @Override
    public Field<Long> field1() {
        return Accounts.ACCOUNTS.ID;
    }

    @Override
    public Field<Long> field2() {
        return Accounts.ACCOUNTS.BALANCE;
    }

    @Override
    public Long component1() {
        return getId();
    }

    @Override
    public Long component2() {
        return getBalance();
    }

    @Override
    public Long value1() {
        return getId();
    }

    @Override
    public Long value2() {
        return getBalance();
    }

    @Override
    public AccountsRecord value1(Long value) {
        setId(value);
        return this;
    }

    @Override
    public AccountsRecord value2(Long value) {
        setBalance(value);
        return this;
    }

    @Override
    public AccountsRecord values(Long value1, Long value2) {
        value1(value1);
        value2(value2);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached AccountsRecord
     */
    public AccountsRecord() {
        super(Accounts.ACCOUNTS);
    }

    /**
     * Create a detached, initialised AccountsRecord
     */
    public AccountsRecord(Long id, Long balance) {
        super(Accounts.ACCOUNTS);

        set(0, id);
        set(1, balance);
    }
}
