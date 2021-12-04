package com.stitchline.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Ushan Shanilka <ushanshanilka80@gmail.com>
 * @since 12/4/2021
 **/
@AllArgsConstructor
@NoArgsConstructor
@Data
public class JwtRequestDTO {
    private String username;
    private String password;
}
