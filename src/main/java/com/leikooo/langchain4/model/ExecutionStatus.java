package com.leikooo.langchain4.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serial;
import java.io.Serializable;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ExecutionStatus implements Serializable {

    @Serial
    private static final long serialVersionUID = 3049484502843675864L;

    private boolean isSuccess;

    private String message;

}