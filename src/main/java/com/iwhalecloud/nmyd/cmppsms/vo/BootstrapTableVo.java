package com.iwhalecloud.nmyd.cmppsms.vo;

import java.util.List;

public class BootstrapTableVo<T> {

    long total;
    List<T> rows;

    public long getTotal() {
        return total;
    }

    public void setTotal(long total) {
        this.total = total;
    }

    public List<T> getRows() {
        return rows;
    }

    public void setRows(List<T> rows) {
        this.rows = rows;
    }
}
