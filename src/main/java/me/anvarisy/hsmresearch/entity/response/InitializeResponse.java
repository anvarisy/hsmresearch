package me.anvarisy.hsmresearch.entity.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class InitializeResponse {
    private String message;
    private boolean status;
}
