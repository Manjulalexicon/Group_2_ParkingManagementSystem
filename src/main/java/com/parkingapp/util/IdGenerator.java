package com.parkingapp.util;

import java.util.UUID;

public class IdGenerator {
    public static String generateId() {
        return "RES-" + UUID.randomUUID().toString().substring(0, 8);
    }
}