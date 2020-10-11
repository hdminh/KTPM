package com.ktpm.cantin.food;

import com.ktpm.cantin.exception.ZeroEntityException;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
public abstract class AbstractFood implements Food {
    protected Double price;
    private String extras;

    @Override
    public double tinhTien(int soluong) {
        if (soluong > 0) {
            return soluong * price;
        }
        throw new ZeroEntityException();
    }
}
