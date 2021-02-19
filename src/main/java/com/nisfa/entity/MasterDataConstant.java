package com.nisfa.entity;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author Administrator
 */
@Entity
public class MasterDataConstant implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(nullable = false, unique = true)
    private String fieldCode;
    @Column(nullable = false)
    private String fieldValue;

    public MasterDataConstant() {
    }

    public MasterDataConstant(String fieldCode, String fieldValue) {
        this.fieldCode = fieldCode;
        this.fieldValue = fieldValue;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + Objects.hashCode(this.id);
        hash = 59 * hash + Objects.hashCode(this.fieldCode);
        hash = 59 * hash + Objects.hashCode(this.fieldValue);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final MasterDataConstant other = (MasterDataConstant) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        if (!Objects.equals(this.fieldCode, other.fieldCode)) {
            return false;
        }
        if (!Objects.equals(this.fieldValue, other.fieldValue)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "MasterDataConstant{" + "id=" + id + ", fieldCode=" + fieldCode + ", fieldValue=" + fieldValue + '}';
    }

}
