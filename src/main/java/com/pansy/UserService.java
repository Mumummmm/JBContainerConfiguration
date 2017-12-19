package com.pansy;

public class UserService extends Service{
    private UserPreferences userPreferences;

    public void setUserPreferences(UserPreferences userPreferences) {
        this.userPreferences = userPreferences;
    }
}
