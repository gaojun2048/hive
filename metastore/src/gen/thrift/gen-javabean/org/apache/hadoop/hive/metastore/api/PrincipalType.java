/**
 * Autogenerated by Thrift Compiler (0.9.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.hadoop.hive.metastore.api;


import java.util.Map;
import java.util.HashMap;
import org.apache.thrift.TEnum;

public enum PrincipalType implements org.apache.thrift.TEnum {
  USER(1),
  ROLE(2),
  GROUP(3);

  private final int value;

  private PrincipalType(int value) {
    this.value = value;
  }

  /**
   * Get the integer value of this enum value, as defined in the Thrift IDL.
   */
  public int getValue() {
    return value;
  }

  /**
   * Find a the enum type by its integer value, as defined in the Thrift IDL.
   * @return null if the value is not found.
   */
  public static PrincipalType findByValue(int value) { 
    switch (value) {
      case 1:
        return USER;
      case 2:
        return ROLE;
      case 3:
        return GROUP;
      default:
        return null;
    }
  }
}
