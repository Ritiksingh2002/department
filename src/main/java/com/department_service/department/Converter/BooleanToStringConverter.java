package com.department_service.department.Converter;

import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;

@Converter(autoApply = true)
public class BooleanToStringConverter implements AttributeConverter<Boolean,String> {

    //chnaging boolean to string
    @Override
    public String convertToDatabaseColumn(Boolean attribute) {
        return (attribute!=null&&attribute)?"Yes":"No";
    }

    //setting in db
    @Override
    public Boolean convertToEntityAttribute(String setinDb) {
        return "Yes".equalsIgnoreCase(setinDb);
    }
}
