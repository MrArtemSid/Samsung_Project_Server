package com.example.leaderboard.models;

import org.antlr.v4.runtime.misc.NotNull;

public record Request(@NotNull
                      String name,
                      @NotNull
                      Long point) {
}
