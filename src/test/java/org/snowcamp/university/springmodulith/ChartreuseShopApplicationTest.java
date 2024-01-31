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
    void verifyModules() {
        modules.verify();
    }

    @Test
    void logModules(){
        LOGGER.info(modules.toString());
    }

    @Test
    void generateDocumentationAsPlantUml() {
        new Documenter(modules)
                .writeModulesAsPlantUml()
                .writeIndividualModulesAsPlantUml();
    }

    @Test
    void generateDocumentationAsC4() {
        ApplicationModules modules = ApplicationModules.of(ChartreuseShopApplication.class);
        Documenter.CanvasOptions canvasOptions = Documenter.CanvasOptions.defaults()
                .revealInternals();
        Documenter.DiagramOptions diagramOptions = Documenter.DiagramOptions.defaults()
                .withStyle(Documenter.DiagramOptions.DiagramStyle.C4);
        new Documenter(modules)
                .writeDocumentation(diagramOptions, canvasOptions);
    }
}
