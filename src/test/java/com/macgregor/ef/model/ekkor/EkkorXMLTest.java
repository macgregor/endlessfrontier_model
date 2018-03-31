package com.macgregor.ef.model.ekkor;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.macgregor.ef.model.canonical.ArtifactSet;
import com.macgregor.ef.test_util.EkkorTestModels;
import org.apache.commons.io.FileUtils;
import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.util.logging.Logger;

import static org.junit.Assert.assertEquals;

public class EkkorXMLTest {
    private static final Logger logger = Logger.getLogger(ArtifactSet.class.getName());
    private static final ObjectMapper XML_MAPPER = new XmlMapper();

    private String fixture(String path) throws IOException {
        File file = new File(String.format("src/test/resources/%s", path));
        return FileUtils.readFileToString(file, "UTF-8");
    }
    
    @Test
    public void testArtifactSetDeserializesFromXml() throws Exception {
        ArtifactSetXML fromXml = XML_MAPPER.readValue(fixture("xml/artifact_set.xml"), ArtifactSetXML.class);
        assertEquals(EkkorTestModels.getArtifactSet(), fromXml);
    }

    @Test
    public void testJacksonDeserializesEmptyFieldsToEmptyString() throws Exception {
        String artifactSet = fixture("xml/artifact_set.xml");
        artifactSet = artifactSet.replace("<numSetList>2</numSetList>", "<numSetList></numSetList>");
        ArtifactSetXML expected = EkkorTestModels.getArtifactSet();
        expected.setNumSetList("");

        ArtifactSetXML fromXml = XML_MAPPER.readValue(artifactSet, ArtifactSetXML.class);
        assertEquals(expected, fromXml);
    }

    @Test
    public void testJacksonDeserializesShortFormEmptyFieldsToNull() throws Exception {
        String artifactSet = fixture("xml/artifact_set.xml");
        artifactSet = artifactSet.replace("<numSetList>2</numSetList>", "<numSetList/>");
        ArtifactSetXML expected = EkkorTestModels.getArtifactSet();
        expected.setNumSetList(null);

        ArtifactSetXML fromXml = XML_MAPPER.readValue(artifactSet, ArtifactSetXML.class);
        assertEquals(expected, fromXml);
    }

    @Test
    public void testArtifactDeserializesFromXml() throws Exception {
        ArtifactXML fromXml = XML_MAPPER.readValue(fixture("xml/artifact.xml"), ArtifactXML.class);
        assertEquals(EkkorTestModels.getArtifact(), fromXml);
    }

    @Test
    public void testPetSkillDeserializesFromXml() throws Exception {
        PetSkillXML fromXml = XML_MAPPER.readValue(fixture("xml/pet_skill.xml"), PetSkillXML.class);
        assertEquals(EkkorTestModels.getPetSkill(), fromXml);
    }

    @Test
    public void testPetDeserializesFromXml() throws Exception {
        PetXML fromXml = XML_MAPPER.readValue(fixture("xml/pet.xml"), PetXML.class);
        assertEquals(EkkorTestModels.getPet(), fromXml);
    }

    @Test
    public void testTranslationDeserializesFromXml() throws Exception {
        TranslationXML fromXml = XML_MAPPER.readValue(fixture("xml/translation.xml"), TranslationXML.class);
        assertEquals(EkkorTestModels.getTranslation(), fromXml);
    }

    @Test
    public void testUnitSkillDeserializesFromXml() throws Exception {
        UnitSkillXML fromXml = XML_MAPPER.readValue(fixture("xml/unit_skill.xml"), UnitSkillXML.class);
        assertEquals(EkkorTestModels.getUnitSkill(), fromXml);
    }

    @Test
    public void testUnitDeserializesFromXml() throws Exception {
        UnitXML fromXml = XML_MAPPER.readValue(fixture("xml/unit.xml"), UnitXML.class);
        assertEquals(EkkorTestModels.getUnit(), fromXml);
    }
}
