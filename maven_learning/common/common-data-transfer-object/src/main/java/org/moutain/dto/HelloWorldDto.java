package org.moutain.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;
@Data
@AllArgsConstructor
public class HelloWorldDto implements Serializable {
    @JsonProperty private String message;

}
