package com.softgroup.common.datamapper;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.InputStream;
import java.util.Map;

/**
 * @author Aviles
 */
public interface DataMapper {

	Map convertToMap(Object value);

	<T> T convert(Map<String, Object> map, Class<T> dataType);

	Object convert(Map<String, Object> map, Object dataType);


	<T> T mapData(String data, Class<T> dataType);

	<T> T mapData(String data, TypeReference<T> dataType);

	<T> T mapData(byte[] message, Class<T> dataType);


	<T> T readValue(InputStream src, Class<T> valueType);

	String dataToString(Object data);

	String objectToString(ObjectMapper data);

}
