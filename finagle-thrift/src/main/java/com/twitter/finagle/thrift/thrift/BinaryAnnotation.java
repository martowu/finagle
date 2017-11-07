/**
 * Autogenerated by Thrift
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 */
package com.twitter.finagle.thrift.thrift;

import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;

import org.apache.thrift.*;
import org.apache.thrift.async.*;
import org.apache.thrift.meta_data.*;
import org.apache.thrift.transport.*;
import org.apache.thrift.protocol.*;

// No additional import required for struct/union.

public class BinaryAnnotation implements TBase<BinaryAnnotation, BinaryAnnotation._Fields>, java.io.Serializable, Cloneable {
  private static final TStruct STRUCT_DESC = new TStruct("BinaryAnnotation");

  private static final TField KEY_FIELD_DESC = new TField("key", TType.STRING, (short)1);
  private static final TField VALUE_FIELD_DESC = new TField("value", TType.STRING, (short)2);
  private static final TField ANNOTATION_TYPE_FIELD_DESC = new TField("annotation_type", TType.I32, (short)3);
  private static final TField HOST_FIELD_DESC = new TField("host", TType.STRUCT, (short)4);

  public String key;
  public ByteBuffer value;
  /**
   *
   * @see AnnotationType
   */
  public AnnotationType annotation_type;
  public Endpoint host;

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements TFieldIdEnum {
    KEY((short)1, "key"),
    VALUE((short)2, "value"),
    /**
     *
     * @see AnnotationType
     */
    ANNOTATION_TYPE((short)3, "annotation_type"),
    HOST((short)4, "host");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // KEY
          return KEY;
        case 2: // VALUE
          return VALUE;
        case 3: // ANNOTATION_TYPE
          return ANNOTATION_TYPE;
        case 4: // HOST
          return HOST;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments

  public static final Map<_Fields, FieldMetaData> metaDataMap;
  static {
    Map<_Fields, FieldMetaData> tmpMap = new EnumMap<_Fields, FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.KEY, new FieldMetaData("key", TFieldRequirementType.DEFAULT,
        new FieldValueMetaData(TType.STRING)));
    tmpMap.put(_Fields.VALUE, new FieldMetaData("value", TFieldRequirementType.DEFAULT,
        new FieldValueMetaData(TType.STRING)));
    tmpMap.put(_Fields.ANNOTATION_TYPE, new FieldMetaData("annotation_type", TFieldRequirementType.DEFAULT,
        new EnumMetaData(TType.ENUM, AnnotationType.class)));
    tmpMap.put(_Fields.HOST, new FieldMetaData("host", TFieldRequirementType.OPTIONAL,
        new StructMetaData(TType.STRUCT, Endpoint.class)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    FieldMetaData.addStructMetaDataMap(BinaryAnnotation.class, metaDataMap);
  }

  public BinaryAnnotation() {
  }

  public BinaryAnnotation(
    String key,
    ByteBuffer value,
    AnnotationType annotation_type)
  {
    this();
    this.key = key;
    this.value = value;
    this.annotation_type = annotation_type;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public BinaryAnnotation(BinaryAnnotation other) {
    if (other.isSetKey()) {
      this.key = other.key;
    }
    if (other.isSetValue()) {
      this.value = TBaseHelper.copyBinary(other.value);
;
    }
    if (other.isSetAnnotation_type()) {
      this.annotation_type = other.annotation_type;
    }
    if (other.isSetHost()) {
      this.host = new Endpoint(other.host);
    }
  }

  public BinaryAnnotation deepCopy() {
    return new BinaryAnnotation(this);
  }

  @Override
  public void clear() {
    this.key = null;
    this.value = null;
    this.annotation_type = null;
    this.host = null;
  }

  public String getKey() {
    return this.key;
  }

  public BinaryAnnotation setKey(String key) {
    this.key = key;
    return this;
  }

  public void unsetKey() {
    this.key = null;
  }

  /** Returns true if field key is set (has been asigned a value) and false otherwise */
  public boolean isSetKey() {
    return this.key != null;
  }

  public void setKeyIsSet(boolean value) {
    if (!value) {
      this.key = null;
    }
  }

  public byte[] getValue() {
    setValue(TBaseHelper.rightSize(value));
    return value.array();
  }

  public ByteBuffer BufferForValue() {
    return value;
  }

  public BinaryAnnotation setValue(byte[] value) {
    setValue(ByteBuffer.wrap(value));
    return this;
  }

  public BinaryAnnotation setValue(ByteBuffer value) {
    this.value = value;
    return this;
  }

  public void unsetValue() {
    this.value = null;
  }

  /** Returns true if field value is set (has been asigned a value) and false otherwise */
  public boolean isSetValue() {
    return this.value != null;
  }

  public void setValueIsSet(boolean value) {
    if (!value) {
      this.value = null;
    }
  }

  /**
   *
   * @see AnnotationType
   */
  public AnnotationType getAnnotation_type() {
    return this.annotation_type;
  }

  /**
   *
   * @see AnnotationType
   */
  public BinaryAnnotation setAnnotation_type(AnnotationType annotation_type) {
    this.annotation_type = annotation_type;
    return this;
  }

  public void unsetAnnotation_type() {
    this.annotation_type = null;
  }

  /** Returns true if field annotation_type is set (has been asigned a value) and false otherwise */
  public boolean isSetAnnotation_type() {
    return this.annotation_type != null;
  }

  public void setAnnotation_typeIsSet(boolean value) {
    if (!value) {
      this.annotation_type = null;
    }
  }

  public Endpoint getHost() {
    return this.host;
  }

  public BinaryAnnotation setHost(Endpoint host) {
    this.host = host;
    return this;
  }

  public void unsetHost() {
    this.host = null;
  }

  /** Returns true if field host is set (has been asigned a value) and false otherwise */
  public boolean isSetHost() {
    return this.host != null;
  }

  public void setHostIsSet(boolean value) {
    if (!value) {
      this.host = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case KEY:
      if (value == null) {
        unsetKey();
      } else {
        setKey((String)value);
      }
      break;

    case VALUE:
      if (value == null) {
        unsetValue();
      } else {
        setValue((ByteBuffer)value);
      }
      break;

    case ANNOTATION_TYPE:
      if (value == null) {
        unsetAnnotation_type();
      } else {
        setAnnotation_type((AnnotationType)value);
      }
      break;

    case HOST:
      if (value == null) {
        unsetHost();
      } else {
        setHost((Endpoint)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case KEY:
      return getKey();

    case VALUE:
      return getValue();

    case ANNOTATION_TYPE:
      return getAnnotation_type();

    case HOST:
      return getHost();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been asigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case KEY:
      return isSetKey();
    case VALUE:
      return isSetValue();
    case ANNOTATION_TYPE:
      return isSetAnnotation_type();
    case HOST:
      return isSetHost();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof BinaryAnnotation)
      return this.equals((BinaryAnnotation)that);
    return false;
  }

  public boolean equals(BinaryAnnotation that) {
    if (that == null)
      return false;

    boolean this_present_key = true && this.isSetKey();
    boolean that_present_key = true && that.isSetKey();
    if (this_present_key || that_present_key) {
      if (!(this_present_key && that_present_key))
        return false;
      if (!this.key.equals(that.key))
        return false;
    }

    boolean this_present_value = true && this.isSetValue();
    boolean that_present_value = true && that.isSetValue();
    if (this_present_value || that_present_value) {
      if (!(this_present_value && that_present_value))
        return false;
      if (!this.value.equals(that.value))
        return false;
    }

    boolean this_present_annotation_type = true && this.isSetAnnotation_type();
    boolean that_present_annotation_type = true && that.isSetAnnotation_type();
    if (this_present_annotation_type || that_present_annotation_type) {
      if (!(this_present_annotation_type && that_present_annotation_type))
        return false;
      if (!this.annotation_type.equals(that.annotation_type))
        return false;
    }

    boolean this_present_host = true && this.isSetHost();
    boolean that_present_host = true && that.isSetHost();
    if (this_present_host || that_present_host) {
      if (!(this_present_host && that_present_host))
        return false;
      if (!this.host.equals(that.host))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  public int compareTo(BinaryAnnotation other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    BinaryAnnotation typedOther = (BinaryAnnotation)other;

    lastComparison = Boolean.valueOf(isSetKey()).compareTo(typedOther.isSetKey());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetKey()) {
      lastComparison = TBaseHelper.compareTo(this.key, typedOther.key);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetValue()).compareTo(typedOther.isSetValue());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetValue()) {
      lastComparison = TBaseHelper.compareTo(this.value, typedOther.value);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetAnnotation_type()).compareTo(typedOther.isSetAnnotation_type());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetAnnotation_type()) {
      lastComparison = TBaseHelper.compareTo(this.annotation_type, typedOther.annotation_type);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetHost()).compareTo(typedOther.isSetHost());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetHost()) {
      lastComparison = TBaseHelper.compareTo(this.host, typedOther.host);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(TProtocol iprot) throws TException {
    TField field;
    iprot.readStructBegin();
    while (true)
    {
      field = iprot.readFieldBegin();
      if (field.type == TType.STOP) {
        break;
      }
      switch (field.id) {
        case 1: // KEY
          if (field.type == TType.STRING) {
            this.key = iprot.readString();
          } else {
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 2: // VALUE
          if (field.type == TType.STRING) {
            this.value = iprot.readBinary();
          } else {
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 3: // ANNOTATION_TYPE
          if (field.type == TType.I32) {
            this.annotation_type = AnnotationType.findByValue(iprot.readI32());
          } else {
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 4: // HOST
          if (field.type == TType.STRUCT) {
            this.host = new Endpoint();
            this.host.read(iprot);
          } else {
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        default:
          TProtocolUtil.skip(iprot, field.type);
      }
      iprot.readFieldEnd();
    }
    iprot.readStructEnd();

    // check for required fields of primitive type, which can't be checked in the validate method
    validate();
  }

  public void write(TProtocol oprot) throws TException {
    validate();

    oprot.writeStructBegin(STRUCT_DESC);
    if (this.key != null) {
      oprot.writeFieldBegin(KEY_FIELD_DESC);
      oprot.writeString(this.key);
      oprot.writeFieldEnd();
    }
    if (this.value != null) {
      oprot.writeFieldBegin(VALUE_FIELD_DESC);
      oprot.writeBinary(this.value);
      oprot.writeFieldEnd();
    }
    if (this.annotation_type != null) {
      oprot.writeFieldBegin(ANNOTATION_TYPE_FIELD_DESC);
      oprot.writeI32(this.annotation_type.getValue());
      oprot.writeFieldEnd();
    }
    if (this.host != null) {
      if (isSetHost()) {
        oprot.writeFieldBegin(HOST_FIELD_DESC);
        this.host.write(oprot);
        oprot.writeFieldEnd();
      }
    }
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("BinaryAnnotation(");
    boolean first = true;

    sb.append("key:");
    if (this.key == null) {
      sb.append("null");
    } else {
      sb.append(this.key);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("value:");
    if (this.value == null) {
      sb.append("null");
    } else {
      TBaseHelper.toString(this.value, sb);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("annotation_type:");
    if (this.annotation_type == null) {
      sb.append("null");
    } else {
      sb.append(this.annotation_type);
    }
    first = false;
    if (isSetHost()) {
      if (!first) sb.append(", ");
      sb.append("host:");
      if (this.host == null) {
        sb.append("null");
      } else {
        sb.append(this.host);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws TException {
    // check for required fields
  }

}

