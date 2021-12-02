package com.stitchline.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Ushan Shanilka <ushanshanilka80@gmail.com>
 * @since 12/3/2021
 **/
@AllArgsConstructor
@NoArgsConstructor
@Data
public class ProgramDTO {
    private String name;
    private String description;
    private String start_date;
    private String end_date;
}
