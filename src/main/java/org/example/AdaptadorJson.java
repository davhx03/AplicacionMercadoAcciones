package org.example;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import java.io.File;
import java.io.IOException;

public class AdaptadorJson {
    private XmlMapper xmlMapper;
    private ObjectMapper jsonMapper;

    public AdaptadorJson() {
        xmlMapper = new XmlMapper();
        jsonMapper = new ObjectMapper();
    }

    public <T> T fromXml(String filePath, Class<T> valueType) throws IOException {
        return xmlMapper.readValue(new File(filePath), valueType);
    }

    public String toJson(Object value) throws IOException {
        return jsonMapper.writeValueAsString(value);
}
}
