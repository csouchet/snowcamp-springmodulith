package org.snowcamp.university.springmodulith;

import static java.util.function.Predicate.not;

import java.util.stream.Stream;

import org.springframework.modulith.core.ApplicationModuleDetectionStrategy;
import org.springframework.modulith.core.JavaPackage;

public class ChartreuseShopApplicationModuleDetectionStrategy implements ApplicationModuleDetectionStrategy {
    @Override
    public Stream<JavaPackage> getModuleBasePackages(JavaPackage basePackage) {
        return basePackage.getDirectSubPackages().stream()
                .filter(not(javaPackage -> javaPackage.getName().equals("org.snowcamp.university.springmodulith.common")));
    }
}
