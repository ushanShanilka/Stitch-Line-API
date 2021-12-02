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
public class UserDTO {
    private String username;
    private String password;
    private String name;
    private String mobile_Number;
    private String date_Of_Birth;
    private String gender;
    private String language;
}
