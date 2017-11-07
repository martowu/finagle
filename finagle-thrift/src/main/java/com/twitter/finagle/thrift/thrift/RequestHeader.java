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

/**
 * RequestHeader defines headers for the request. These carry the span data, and
 * a flag indicating whether the request is to be debugged.
 */
public class RequestHeader implements TBase<RequestHeader, RequestHeader._Fields>, java.io.Serializable, Cloneable {
  private static final TStruct STRUCT_DESC = new TStruct("RequestHeader");

  private static final TField TRACE_ID_FIELD_DESC = new TField("trace_id", TType.I64, (short)1);
  private static final TField SPAN_ID_FIELD_DESC = new TField("span_id", TType.I64, (short)2);
  private static final TField PARENT_SPAN_ID_FIELD_DESC = new TField("parent_span_id", TType.I64, (short)3);
  private static final TField SAMPLED_FIELD_DESC = new TField("sampled", TType.BOOL, (short)5);
  private static final TField CLIENT_ID_FIELD_DESC = new TField("client_id", TType.STRUCT, (short)6);
  private static final TField FLAGS_FIELD_DESC = new TField("flags", TType.I64, (short)7);
  private static final TField CONTEXTS_FIELD_DESC = new TField("contexts", TType.LIST, (short)8);
  private static final TField DEST_FIELD_DESC = new TField("dest", TType.STRING, (short)9);
  private static final TField DELEGATIONS_FIELD_DESC = new TField("delegations", TType.LIST, (short)10);

  public long trace_id;
  public long span_id;
  public long parent_span_id;
  public boolean sampled;
  public ClientId client_id;
  public long flags;
  public List<RequestContext> contexts;
  public String dest;
  public List<Delegation> delegations;

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements TFieldIdEnum {
    TRACE_ID((short)1, "trace_id"),
    SPAN_ID((short)2, "span_id"),
    PARENT_SPAN_ID((short)3, "parent_span_id"),
    SAMPLED((short)5, "sampled"),
    CLIENT_ID((short)6, "client_id"),
    FLAGS((short)7, "flags"),
    CONTEXTS((short)8, "contexts"),
    DEST((short)9, "dest"),
    DELEGATIONS((short)10, "delegations");

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
        case 1: // TRACE_ID
          return TRACE_ID;
        case 2: // SPAN_ID
          return SPAN_ID;
        case 3: // PARENT_SPAN_ID
          return PARENT_SPAN_ID;
        case 5: // SAMPLED
          return SAMPLED;
        case 6: // CLIENT_ID
          return CLIENT_ID;
        case 7: // FLAGS
          return FLAGS;
        case 8: // CONTEXTS
          return CONTEXTS;
        case 9: // DEST
          return DEST;
        case 10: // DELEGATIONS
          return DELEGATIONS;
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
  private static final int __TRACE_ID_ISSET_ID = 0;
  private static final int __SPAN_ID_ISSET_ID = 1;
  private static final int __PARENT_SPAN_ID_ISSET_ID = 2;
  private static final int __SAMPLED_ISSET_ID = 3;
  private static final int __FLAGS_ISSET_ID = 4;
  private BitSet __isset_bit_vector = new BitSet(5);

  public static final Map<_Fields, FieldMetaData> metaDataMap;
  static {
    Map<_Fields, FieldMetaData> tmpMap = new EnumMap<_Fields, FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.TRACE_ID, new FieldMetaData("trace_id", TFieldRequirementType.DEFAULT,
        new FieldValueMetaData(TType.I64)));
    tmpMap.put(_Fields.SPAN_ID, new FieldMetaData("span_id", TFieldRequirementType.DEFAULT,
        new FieldValueMetaData(TType.I64)));
    tmpMap.put(_Fields.PARENT_SPAN_ID, new FieldMetaData("parent_span_id", TFieldRequirementType.OPTIONAL,
        new FieldValueMetaData(TType.I64)));
    tmpMap.put(_Fields.SAMPLED, new FieldMetaData("sampled", TFieldRequirementType.OPTIONAL,
        new FieldValueMetaData(TType.BOOL)));
    tmpMap.put(_Fields.CLIENT_ID, new FieldMetaData("client_id", TFieldRequirementType.OPTIONAL,
        new StructMetaData(TType.STRUCT, ClientId.class)));
    tmpMap.put(_Fields.FLAGS, new FieldMetaData("flags", TFieldRequirementType.OPTIONAL,
        new FieldValueMetaData(TType.I64)));
    tmpMap.put(_Fields.CONTEXTS, new FieldMetaData("contexts", TFieldRequirementType.DEFAULT,
        new ListMetaData(TType.LIST,
            new StructMetaData(TType.STRUCT, RequestContext.class))));
    tmpMap.put(_Fields.DEST, new FieldMetaData("dest", TFieldRequirementType.OPTIONAL,
        new FieldValueMetaData(TType.STRING)));
    tmpMap.put(_Fields.DELEGATIONS, new FieldMetaData("delegations", TFieldRequirementType.OPTIONAL,
        new ListMetaData(TType.LIST,
            new StructMetaData(TType.STRUCT, Delegation.class))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    FieldMetaData.addStructMetaDataMap(RequestHeader.class, metaDataMap);
  }

  public RequestHeader() {
  }

  public RequestHeader(
    long trace_id,
    long span_id,
    List<RequestContext> contexts)
  {
    this();
    this.trace_id = trace_id;
    setTrace_idIsSet(true);
    this.span_id = span_id;
    setSpan_idIsSet(true);
    this.contexts = contexts;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public RequestHeader(RequestHeader other) {
    __isset_bit_vector.clear();
    __isset_bit_vector.or(other.__isset_bit_vector);
    this.trace_id = other.trace_id;
    this.span_id = other.span_id;
    this.parent_span_id = other.parent_span_id;
    this.sampled = other.sampled;
    if (other.isSetClient_id()) {
      this.client_id = new ClientId(other.client_id);
    }
    this.flags = other.flags;
    if (other.isSetContexts()) {
      List<RequestContext> __this__contexts = new ArrayList<RequestContext>();
      for (RequestContext other_element : other.contexts) {
        __this__contexts.add(new RequestContext(other_element));
      }
      this.contexts = __this__contexts;
    }
    if (other.isSetDest()) {
      this.dest = other.dest;
    }
    if (other.isSetDelegations()) {
      List<Delegation> __this__delegations = new ArrayList<Delegation>();
      for (Delegation other_element : other.delegations) {
        __this__delegations.add(new Delegation(other_element));
      }
      this.delegations = __this__delegations;
    }
  }

  public RequestHeader deepCopy() {
    return new RequestHeader(this);
  }

  @Override
  public void clear() {
    setTrace_idIsSet(false);
    this.trace_id = 0;
    setSpan_idIsSet(false);
    this.span_id = 0;
    setParent_span_idIsSet(false);
    this.parent_span_id = 0;
    setSampledIsSet(false);
    this.sampled = false;
    this.client_id = null;
    setFlagsIsSet(false);
    this.flags = 0;
    this.contexts = null;
    this.dest = null;
    this.delegations = null;
  }

  public long getTrace_id() {
    return this.trace_id;
  }

  public RequestHeader setTrace_id(long trace_id) {
    this.trace_id = trace_id;
    setTrace_idIsSet(true);
    return this;
  }

  public void unsetTrace_id() {
    __isset_bit_vector.clear(__TRACE_ID_ISSET_ID);
  }

  /** Returns true if field trace_id is set (has been asigned a value) and false otherwise */
  public boolean isSetTrace_id() {
    return __isset_bit_vector.get(__TRACE_ID_ISSET_ID);
  }

  public void setTrace_idIsSet(boolean value) {
    __isset_bit_vector.set(__TRACE_ID_ISSET_ID, value);
  }

  public long getSpan_id() {
    return this.span_id;
  }

  public RequestHeader setSpan_id(long span_id) {
    this.span_id = span_id;
    setSpan_idIsSet(true);
    return this;
  }

  public void unsetSpan_id() {
    __isset_bit_vector.clear(__SPAN_ID_ISSET_ID);
  }

  /** Returns true if field span_id is set (has been asigned a value) and false otherwise */
  public boolean isSetSpan_id() {
    return __isset_bit_vector.get(__SPAN_ID_ISSET_ID);
  }

  public void setSpan_idIsSet(boolean value) {
    __isset_bit_vector.set(__SPAN_ID_ISSET_ID, value);
  }

  public long getParent_span_id() {
    return this.parent_span_id;
  }

  public RequestHeader setParent_span_id(long parent_span_id) {
    this.parent_span_id = parent_span_id;
    setParent_span_idIsSet(true);
    return this;
  }

  public void unsetParent_span_id() {
    __isset_bit_vector.clear(__PARENT_SPAN_ID_ISSET_ID);
  }

  /** Returns true if field parent_span_id is set (has been asigned a value) and false otherwise */
  public boolean isSetParent_span_id() {
    return __isset_bit_vector.get(__PARENT_SPAN_ID_ISSET_ID);
  }

  public void setParent_span_idIsSet(boolean value) {
    __isset_bit_vector.set(__PARENT_SPAN_ID_ISSET_ID, value);
  }

  public boolean isSampled() {
    return this.sampled;
  }

  public RequestHeader setSampled(boolean sampled) {
    this.sampled = sampled;
    setSampledIsSet(true);
    return this;
  }

  public void unsetSampled() {
    __isset_bit_vector.clear(__SAMPLED_ISSET_ID);
  }

  /** Returns true if field sampled is set (has been asigned a value) and false otherwise */
  public boolean isSetSampled() {
    return __isset_bit_vector.get(__SAMPLED_ISSET_ID);
  }

  public void setSampledIsSet(boolean value) {
    __isset_bit_vector.set(__SAMPLED_ISSET_ID, value);
  }

  public ClientId getClient_id() {
    return this.client_id;
  }

  public RequestHeader setClient_id(ClientId client_id) {
    this.client_id = client_id;
    return this;
  }

  public void unsetClient_id() {
    this.client_id = null;
  }

  /** Returns true if field client_id is set (has been asigned a value) and false otherwise */
  public boolean isSetClient_id() {
    return this.client_id != null;
  }

  public void setClient_idIsSet(boolean value) {
    if (!value) {
      this.client_id = null;
    }
  }

  public long getFlags() {
    return this.flags;
  }

  public RequestHeader setFlags(long flags) {
    this.flags = flags;
    setFlagsIsSet(true);
    return this;
  }

  public void unsetFlags() {
    __isset_bit_vector.clear(__FLAGS_ISSET_ID);
  }

  /** Returns true if field flags is set (has been asigned a value) and false otherwise */
  public boolean isSetFlags() {
    return __isset_bit_vector.get(__FLAGS_ISSET_ID);
  }

  public void setFlagsIsSet(boolean value) {
    __isset_bit_vector.set(__FLAGS_ISSET_ID, value);
  }

  public int getContextsSize() {
    return (this.contexts == null) ? 0 : this.contexts.size();
  }

  public java.util.Iterator<RequestContext> getContextsIterator() {
    return (this.contexts == null) ? null : this.contexts.iterator();
  }

  public void addToContexts(RequestContext elem) {
    if (this.contexts == null) {
      this.contexts = new ArrayList<RequestContext>();
    }
    this.contexts.add(elem);
  }

  public List<RequestContext> getContexts() {
    return this.contexts;
  }

  public RequestHeader setContexts(List<RequestContext> contexts) {
    this.contexts = contexts;
    return this;
  }

  public void unsetContexts() {
    this.contexts = null;
  }

  /** Returns true if field contexts is set (has been asigned a value) and false otherwise */
  public boolean isSetContexts() {
    return this.contexts != null;
  }

  public void setContextsIsSet(boolean value) {
    if (!value) {
      this.contexts = null;
    }
  }

  public String getDest() {
    return this.dest;
  }

  public RequestHeader setDest(String dest) {
    this.dest = dest;
    return this;
  }

  public void unsetDest() {
    this.dest = null;
  }

  /** Returns true if field dest is set (has been asigned a value) and false otherwise */
  public boolean isSetDest() {
    return this.dest != null;
  }

  public void setDestIsSet(boolean value) {
    if (!value) {
      this.dest = null;
    }
  }

  public int getDelegationsSize() {
    return (this.delegations == null) ? 0 : this.delegations.size();
  }

  public java.util.Iterator<Delegation> getDelegationsIterator() {
    return (this.delegations == null) ? null : this.delegations.iterator();
  }

  public void addToDelegations(Delegation elem) {
    if (this.delegations == null) {
      this.delegations = new ArrayList<Delegation>();
    }
    this.delegations.add(elem);
  }

  public List<Delegation> getDelegations() {
    return this.delegations;
  }

  public RequestHeader setDelegations(List<Delegation> delegations) {
    this.delegations = delegations;
    return this;
  }

  public void unsetDelegations() {
    this.delegations = null;
  }

  /** Returns true if field delegations is set (has been asigned a value) and false otherwise */
  public boolean isSetDelegations() {
    return this.delegations != null;
  }

  public void setDelegationsIsSet(boolean value) {
    if (!value) {
      this.delegations = null;
    }
  }

  @SuppressWarnings("unchecked")
  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case TRACE_ID:
      if (value == null) {
        unsetTrace_id();
      } else {
        setTrace_id((Long)value);
      }
      break;

    case SPAN_ID:
      if (value == null) {
        unsetSpan_id();
      } else {
        setSpan_id((Long)value);
      }
      break;

    case PARENT_SPAN_ID:
      if (value == null) {
        unsetParent_span_id();
      } else {
        setParent_span_id((Long)value);
      }
      break;

    case SAMPLED:
      if (value == null) {
        unsetSampled();
      } else {
        setSampled((Boolean)value);
      }
      break;

    case CLIENT_ID:
      if (value == null) {
        unsetClient_id();
      } else {
        setClient_id((ClientId)value);
      }
      break;

    case FLAGS:
      if (value == null) {
        unsetFlags();
      } else {
        setFlags((Long)value);
      }
      break;

    case CONTEXTS:
      if (value == null) {
        unsetContexts();
      } else {
        setContexts((List<RequestContext>)value);
      }
      break;

    case DEST:
      if (value == null) {
        unsetDest();
      } else {
        setDest((String)value);
      }
      break;

    case DELEGATIONS:
      if (value == null) {
        unsetDelegations();
      } else {
        setDelegations((List<Delegation>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case TRACE_ID:
      return new Long(getTrace_id());

    case SPAN_ID:
      return new Long(getSpan_id());

    case PARENT_SPAN_ID:
      return new Long(getParent_span_id());

    case SAMPLED:
      return new Boolean(isSampled());

    case CLIENT_ID:
      return getClient_id();

    case FLAGS:
      return new Long(getFlags());

    case CONTEXTS:
      return getContexts();

    case DEST:
      return getDest();

    case DELEGATIONS:
      return getDelegations();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been asigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case TRACE_ID:
      return isSetTrace_id();
    case SPAN_ID:
      return isSetSpan_id();
    case PARENT_SPAN_ID:
      return isSetParent_span_id();
    case SAMPLED:
      return isSetSampled();
    case CLIENT_ID:
      return isSetClient_id();
    case FLAGS:
      return isSetFlags();
    case CONTEXTS:
      return isSetContexts();
    case DEST:
      return isSetDest();
    case DELEGATIONS:
      return isSetDelegations();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof RequestHeader)
      return this.equals((RequestHeader)that);
    return false;
  }

  public boolean equals(RequestHeader that) {
    if (that == null)
      return false;

    boolean this_present_trace_id = true;
    boolean that_present_trace_id = true;
    if (this_present_trace_id || that_present_trace_id) {
      if (!(this_present_trace_id && that_present_trace_id))
        return false;
      if (this.trace_id != that.trace_id)
        return false;
    }

    boolean this_present_span_id = true;
    boolean that_present_span_id = true;
    if (this_present_span_id || that_present_span_id) {
      if (!(this_present_span_id && that_present_span_id))
        return false;
      if (this.span_id != that.span_id)
        return false;
    }

    boolean this_present_parent_span_id = true && this.isSetParent_span_id();
    boolean that_present_parent_span_id = true && that.isSetParent_span_id();
    if (this_present_parent_span_id || that_present_parent_span_id) {
      if (!(this_present_parent_span_id && that_present_parent_span_id))
        return false;
      if (this.parent_span_id != that.parent_span_id)
        return false;
    }

    boolean this_present_sampled = true && this.isSetSampled();
    boolean that_present_sampled = true && that.isSetSampled();
    if (this_present_sampled || that_present_sampled) {
      if (!(this_present_sampled && that_present_sampled))
        return false;
      if (this.sampled != that.sampled)
        return false;
    }

    boolean this_present_client_id = true && this.isSetClient_id();
    boolean that_present_client_id = true && that.isSetClient_id();
    if (this_present_client_id || that_present_client_id) {
      if (!(this_present_client_id && that_present_client_id))
        return false;
      if (!this.client_id.equals(that.client_id))
        return false;
    }

    boolean this_present_flags = true && this.isSetFlags();
    boolean that_present_flags = true && that.isSetFlags();
    if (this_present_flags || that_present_flags) {
      if (!(this_present_flags && that_present_flags))
        return false;
      if (this.flags != that.flags)
        return false;
    }

    boolean this_present_contexts = true && this.isSetContexts();
    boolean that_present_contexts = true && that.isSetContexts();
    if (this_present_contexts || that_present_contexts) {
      if (!(this_present_contexts && that_present_contexts))
        return false;
      if (!this.contexts.equals(that.contexts))
        return false;
    }

    boolean this_present_dest = true && this.isSetDest();
    boolean that_present_dest = true && that.isSetDest();
    if (this_present_dest || that_present_dest) {
      if (!(this_present_dest && that_present_dest))
        return false;
      if (!this.dest.equals(that.dest))
        return false;
    }

    boolean this_present_delegations = true && this.isSetDelegations();
    boolean that_present_delegations = true && that.isSetDelegations();
    if (this_present_delegations || that_present_delegations) {
      if (!(this_present_delegations && that_present_delegations))
        return false;
      if (!this.delegations.equals(that.delegations))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  public int compareTo(RequestHeader other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    RequestHeader typedOther = (RequestHeader)other;

    lastComparison = Boolean.valueOf(isSetTrace_id()).compareTo(typedOther.isSetTrace_id());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTrace_id()) {
      lastComparison = TBaseHelper.compareTo(this.trace_id, typedOther.trace_id);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetSpan_id()).compareTo(typedOther.isSetSpan_id());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSpan_id()) {
      lastComparison = TBaseHelper.compareTo(this.span_id, typedOther.span_id);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetParent_span_id()).compareTo(typedOther.isSetParent_span_id());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetParent_span_id()) {
      lastComparison = TBaseHelper.compareTo(this.parent_span_id, typedOther.parent_span_id);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetSampled()).compareTo(typedOther.isSetSampled());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSampled()) {
      lastComparison = TBaseHelper.compareTo(this.sampled, typedOther.sampled);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetClient_id()).compareTo(typedOther.isSetClient_id());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetClient_id()) {
      lastComparison = TBaseHelper.compareTo(this.client_id, typedOther.client_id);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetFlags()).compareTo(typedOther.isSetFlags());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetFlags()) {
      lastComparison = TBaseHelper.compareTo(this.flags, typedOther.flags);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetContexts()).compareTo(typedOther.isSetContexts());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetContexts()) {
      lastComparison = TBaseHelper.compareTo(this.contexts, typedOther.contexts);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetDest()).compareTo(typedOther.isSetDest());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetDest()) {
      lastComparison = TBaseHelper.compareTo(this.dest, typedOther.dest);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetDelegations()).compareTo(typedOther.isSetDelegations());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetDelegations()) {
      lastComparison = TBaseHelper.compareTo(this.delegations, typedOther.delegations);
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
        case 1: // TRACE_ID
          if (field.type == TType.I64) {
            this.trace_id = iprot.readI64();
            setTrace_idIsSet(true);
          } else {
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 2: // SPAN_ID
          if (field.type == TType.I64) {
            this.span_id = iprot.readI64();
            setSpan_idIsSet(true);
          } else {
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 3: // PARENT_SPAN_ID
          if (field.type == TType.I64) {
            this.parent_span_id = iprot.readI64();
            setParent_span_idIsSet(true);
          } else {
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 5: // SAMPLED
          if (field.type == TType.BOOL) {
            this.sampled = iprot.readBool();
            setSampledIsSet(true);
          } else {
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 6: // CLIENT_ID
          if (field.type == TType.STRUCT) {
            this.client_id = new ClientId();
            this.client_id.read(iprot);
          } else {
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 7: // FLAGS
          if (field.type == TType.I64) {
            this.flags = iprot.readI64();
            setFlagsIsSet(true);
          } else {
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 8: // CONTEXTS
          if (field.type == TType.LIST) {
            {
              TList _list8 = iprot.readListBegin();
              this.contexts = new ArrayList<RequestContext>(_list8.size);
              for (int _i9 = 0; _i9 < _list8.size; ++_i9)
              {
                RequestContext _elem10;
                _elem10 = new RequestContext();
                _elem10.read(iprot);
                this.contexts.add(_elem10);
              }
              iprot.readListEnd();
            }
          } else {
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 9: // DEST
          if (field.type == TType.STRING) {
            this.dest = iprot.readString();
          } else {
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 10: // DELEGATIONS
          if (field.type == TType.LIST) {
            {
              TList _list11 = iprot.readListBegin();
              this.delegations = new ArrayList<Delegation>(_list11.size);
              for (int _i12 = 0; _i12 < _list11.size; ++_i12)
              {
                Delegation _elem13;
                _elem13 = new Delegation();
                _elem13.read(iprot);
                this.delegations.add(_elem13);
              }
              iprot.readListEnd();
            }
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
    oprot.writeFieldBegin(TRACE_ID_FIELD_DESC);
    oprot.writeI64(this.trace_id);
    oprot.writeFieldEnd();
    oprot.writeFieldBegin(SPAN_ID_FIELD_DESC);
    oprot.writeI64(this.span_id);
    oprot.writeFieldEnd();
    if (isSetParent_span_id()) {
      oprot.writeFieldBegin(PARENT_SPAN_ID_FIELD_DESC);
      oprot.writeI64(this.parent_span_id);
      oprot.writeFieldEnd();
    }
    if (isSetSampled()) {
      oprot.writeFieldBegin(SAMPLED_FIELD_DESC);
      oprot.writeBool(this.sampled);
      oprot.writeFieldEnd();
    }
    if (this.client_id != null) {
      if (isSetClient_id()) {
        oprot.writeFieldBegin(CLIENT_ID_FIELD_DESC);
        this.client_id.write(oprot);
        oprot.writeFieldEnd();
      }
    }
    if (isSetFlags()) {
      oprot.writeFieldBegin(FLAGS_FIELD_DESC);
      oprot.writeI64(this.flags);
      oprot.writeFieldEnd();
    }
    if (this.contexts != null) {
      oprot.writeFieldBegin(CONTEXTS_FIELD_DESC);
      {
        oprot.writeListBegin(new TList(TType.STRUCT, this.contexts.size()));
        for (RequestContext _iter14 : this.contexts)
        {
          _iter14.write(oprot);
        }
        oprot.writeListEnd();
      }
      oprot.writeFieldEnd();
    }
    if (this.dest != null) {
      if (isSetDest()) {
        oprot.writeFieldBegin(DEST_FIELD_DESC);
        oprot.writeString(this.dest);
        oprot.writeFieldEnd();
      }
    }
    if (this.delegations != null) {
      if (isSetDelegations()) {
        oprot.writeFieldBegin(DELEGATIONS_FIELD_DESC);
        {
          oprot.writeListBegin(new TList(TType.STRUCT, this.delegations.size()));
          for (Delegation _iter15 : this.delegations)
          {
            _iter15.write(oprot);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
    }
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("RequestHeader(");
    boolean first = true;

    sb.append("trace_id:");
    sb.append(this.trace_id);
    first = false;
    if (!first) sb.append(", ");
    sb.append("span_id:");
    sb.append(this.span_id);
    first = false;
    if (isSetParent_span_id()) {
      if (!first) sb.append(", ");
      sb.append("parent_span_id:");
      sb.append(this.parent_span_id);
      first = false;
    }
    if (isSetSampled()) {
      if (!first) sb.append(", ");
      sb.append("sampled:");
      sb.append(this.sampled);
      first = false;
    }
    if (isSetClient_id()) {
      if (!first) sb.append(", ");
      sb.append("client_id:");
      if (this.client_id == null) {
        sb.append("null");
      } else {
        sb.append(this.client_id);
      }
      first = false;
    }
    if (isSetFlags()) {
      if (!first) sb.append(", ");
      sb.append("flags:");
      sb.append(this.flags);
      first = false;
    }
    if (!first) sb.append(", ");
    sb.append("contexts:");
    if (this.contexts == null) {
      sb.append("null");
    } else {
      sb.append(this.contexts);
    }
    first = false;
    if (isSetDest()) {
      if (!first) sb.append(", ");
      sb.append("dest:");
      if (this.dest == null) {
        sb.append("null");
      } else {
        sb.append(this.dest);
      }
      first = false;
    }
    if (isSetDelegations()) {
      if (!first) sb.append(", ");
      sb.append("delegations:");
      if (this.delegations == null) {
        sb.append("null");
      } else {
        sb.append(this.delegations);
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

