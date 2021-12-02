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
public class User {
    @Id
    private String username;
    private String password;
    private String name;
    private String mobile_Number;
    private String date_Of_Birth;
    private String gender;
    private String language;
}
