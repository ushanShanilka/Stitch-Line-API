package com.stitchline.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Ushan Shanilka <ushanshanilka80@gmail.com>
 * @since 12/5/2021
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SearchProgramDTO {
    private String startDate;
    private String endDate;
}
