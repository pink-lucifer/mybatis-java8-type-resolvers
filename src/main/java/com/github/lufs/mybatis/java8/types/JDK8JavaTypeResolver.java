package com.github.lufs.mybatis.java8.types;

import org.mybatis.generator.api.dom.java.FullyQualifiedJavaType;
import org.mybatis.generator.internal.types.JavaTypeResolverDefaultImpl;

import java.sql.Types;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class JDK8JavaTypeResolver extends JavaTypeResolverDefaultImpl {
    public JDK8JavaTypeResolver() {
        super();
        this.typeMap.replace(Types.DATE, new JdbcTypeInformation("DATE", //$NON-NLS-1$
                new FullyQualifiedJavaType(LocalDate.class.getName())));
        this.typeMap.replace(Types.TIME, new JdbcTypeInformation("DATE", //$NON-NLS-1$
                new FullyQualifiedJavaType(LocalTime.class.getName())));
        this.typeMap.replace(Types.TIMESTAMP, new JdbcTypeInformation("DATE", //$NON-NLS-1$
                new FullyQualifiedJavaType(LocalDateTime.class.getName())));
    }
}
