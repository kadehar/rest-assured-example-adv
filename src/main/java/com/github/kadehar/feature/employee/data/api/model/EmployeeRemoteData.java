package com.github.kadehar.feature.employee.data.api.model;

import com.google.gson.annotations.SerializedName;

public class EmployeeRemoteData {
    @SerializedName("data")
    private final EmployeeRemote remote;

    public EmployeeRemoteData(EmployeeRemote remote) {
        this.remote = remote;
    }

    public EmployeeRemote remote() {
        return remote;
    }
}
