package br.com.tinnova.entity;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.Column;
import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;
import java.time.LocalDateTime;

@Getter
@Setter
@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
public abstract class BaseAuditEntity implements br.com.tinnova.entity.BaseEntity {

    @Column(updatable = false)
    @CreatedDate
    private LocalDateTime dtCreate;

    @Column(updatable = false)
    @CreatedBy
    private String userCreate;

    @Column(insertable = false)
    @LastModifiedDate
    private LocalDateTime dtModify;

    @Column(insertable = false)
    @LastModifiedBy
    private String userModify;
}
