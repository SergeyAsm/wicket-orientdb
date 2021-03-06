package ru.ydn.wicket.wicketorientdb.utils;

import java.io.Serializable;

import com.google.common.base.Function;
import com.orientechnologies.orient.core.record.impl.ODocument;

/**
 * {@link Function} to get field value from ODocument
 *
 * @param <V>
 */
public class GetODocumentFieldValueFunction<V> implements Function<ODocument, V>, Serializable {

	private final String fieldName;
	
	public GetODocumentFieldValueFunction(String fieldName) {
		this.fieldName = fieldName;
	}
	
	@Override
	public V apply(ODocument input) {
		return input.field(fieldName);
	}

}
