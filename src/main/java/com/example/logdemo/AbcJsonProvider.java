package com.example.logdemo;

import ch.qos.logback.classic.spi.ILoggingEvent;
import com.fasterxml.jackson.core.JsonGenerator;
import net.logstash.logback.composite.AbstractFieldJsonProvider;
import net.logstash.logback.composite.FieldNamesAware;
import net.logstash.logback.composite.JsonWritingUtils;

import java.io.IOException;

public class AbcJsonProvider extends AbstractFieldJsonProvider<ILoggingEvent> implements FieldNamesAware<CustomLogstashFieldNames> {
    @Override
    public void writeTo(JsonGenerator generator, ILoggingEvent iLoggingEvent) throws IOException {
        JsonWritingUtils.writeStringField(generator, "asdsd", "def");
    }

    @Override
    public void setFieldNames(CustomLogstashFieldNames fieldNames) {
        setFieldName(fieldNames.getAbc());
    }
}
