package com.ani.user.Entity;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Rating
{

private  String ratingId;
private  String userId;
private  String hotelId;
private int rating;
private String feedback;

}
