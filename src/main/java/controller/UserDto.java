package controller;

import com.opencsv.bean.CsvBindByName;

public record UserDto(@CsvBindByName(column = "userId") Long userId,
                   @CsvBindByName(column = "userName") String userName) {

    public UserDto {
        if (userId == null) {
            throw new IllegalArgumentException("userId cannot be null");
        }
        if (userName == null) {
            throw new IllegalArgumentException("userName cannot be null");
        }
    }

    public Long getUserId() {
        return userId;
    }

    public String getUserName() {
        return userName;
    }

    @Override
    public String toString() {
        return "UserDto{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                '}';
    }
}
