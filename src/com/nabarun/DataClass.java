package com.nabarun;
import java.util.Date;
import java.util.UUID;

public class DataClass {

  private String key;
  private Integer value;
  private Date day;

  public DataClass() {
    key = UUID.randomUUID().toString();
    day = new Date();
  }

  public DataClass(String key, Integer value, Date day) {
    this.value = value;
    this.key = key;
    this.day = day;
  }

  public String getKey() {
    return key;
  }

  public Integer getValue() {
    return value;
  }

  public void setValue(Integer value) {
    this.value = value;
  }

  public Date getDay() {
    return day;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;

    DataClass myBigPojo = (DataClass) o;

    return getKey().equals(myBigPojo.getKey());
  }

  @Override
  public int hashCode() {
    return getKey().hashCode();
  }

}
