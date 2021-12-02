package com.stitchline.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @author Ushan Shanilka <ushanshanilka80@gmail.com>
 * @since 12/3/2021
 **/
@Document
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Program {
    @Id
    private String name;
    private String description;
    private String start_date;
    private String end_date;
}
