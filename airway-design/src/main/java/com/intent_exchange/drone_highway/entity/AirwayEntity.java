/*
 * Copyright 2025 Intent Exchange, Inc.
 * 
 * Permission is hereby granted, free of charge, to any person obtaining a copy of this software and
 * associated documentation files (the "Software"), to deal in the Software without restriction,
 * including without limitation the rights to use, copy, modify, merge, publish, distribute,
 * sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 * 
 * The above copyright notice and this permission notice shall be included in all copies or
 * substantial portions of the Software.
 * 
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT
 * NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND
 * NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM,
 * DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */

package com.intent_exchange.drone_highway.entity;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.intent_exchange.drone_highway.entity.AirwayEntityAirway;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * 航路
 */

@Schema(name = "airwayEntity", description = "航路")
@JsonTypeName("airwayEntity")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-12-05T15:25:28.056268900+09:00[Asia/Tokyo]", comments = "Generator version: 7.8.0")
public class AirwayEntity {

  private AirwayEntityAirway airway;

  public AirwayEntity airway(AirwayEntityAirway airway) {
    this.airway = airway;
    return this;
  }

  /**
   * Get airway
   * @return airway
   */
  @Valid 
  @Schema(name = "airway", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("airway")
  public AirwayEntityAirway getAirway() {
    return airway;
  }

  public void setAirway(AirwayEntityAirway airway) {
    this.airway = airway;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AirwayEntity airwayEntity = (AirwayEntity) o;
    return Objects.equals(this.airway, airwayEntity.airway);
  }

  @Override
  public int hashCode() {
    return Objects.hash(airway);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AirwayEntity {\n");
    sb.append("    airway: ").append(toIndentedString(airway)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}


