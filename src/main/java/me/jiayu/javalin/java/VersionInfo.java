package me.jiayu.javalin.java;

import com.fasterxml.jackson.annotation.JsonProperty;

public record VersionInfo(@JsonProperty String major) {
}
