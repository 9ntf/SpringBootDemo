package com.conditional.springbootdemo.profile;

import lombok.Data;

@Data
public class ProductionProfile implements SystemProfile {
    @Override
    public String getProfile() {
        return "Current profile is production";
    }
}
