package org.snowcamp.university.springmodulith;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.modulith.core.ApplicationModules;
import org.springframework.modulith.docs.Documenter;

public class ChartreuseShopApplicationTest {

    private static final Logger LOGGER = LoggerFactory.getLogger(ChartreuseShopApplicationTest.class);

    private final ApplicationModules modules = ApplicationModules.of(ChartreuseShopApplication.class);

    @Test
    void log_modules(){
        LOGGER.info(modules.toString());
    }

    @Test
    void writeDocumentationSnippets() {
        new Documenter(modules)
                .writeModulesAsPlantUml()
                .writeIndividualModulesAsPlantUml();
    }
}
