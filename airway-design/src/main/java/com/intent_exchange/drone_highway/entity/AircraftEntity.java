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
import com.intent_exchange.drone_highway.entity.AircraftEntityAircraftInner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * 機体候補リストのresponse用Entity
 */

@Schema(name = "AircraftEntity", description = "機体候補リストのresponse用Entity")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-12-13T08:18:23.937720100Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class AircraftEntity {

  @Valid
  private List<@Valid AircraftEntityAircraftInner> aircraft = new ArrayList<>();

  public AircraftEntity aircraft(List<@Valid AircraftEntityAircraftInner> aircraft) {
    this.aircraft = aircraft;
    return this;
  }

  public AircraftEntity addAircraftItem(AircraftEntityAircraftInner aircraftItem) {
    if (this.aircraft == null) {
      this.aircraft = new ArrayList<>();
    }
    this.aircraft.add(aircraftItem);
    return this;
  }

  /**
   * Get aircraft
   * @return aircraft
   */
  @Valid 
  @Schema(name = "aircraft", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("aircraft")
  public List<@Valid AircraftEntityAircraftInner> getAircraft() {
    return aircraft;
  }

  public void setAircraft(List<@Valid AircraftEntityAircraftInner> aircraft) {
    this.aircraft = aircraft;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AircraftEntity aircraftEntity = (AircraftEntity) o;
    return Objects.equals(this.aircraft, aircraftEntity.aircraft);
  }

  @Override
  public int hashCode() {
    return Objects.hash(aircraft);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AircraftEntity {\n");
    sb.append("    aircraft: ").append(toIndentedString(aircraft)).append("\n");
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


