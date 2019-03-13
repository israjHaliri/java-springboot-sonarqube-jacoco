package com.haliri.israj.helper;

import com.google.common.hash.Hashing;

import java.nio.charset.StandardCharsets;
import java.util.List;

public class SignatureHelper {

    public static String generateSignatureSHA256(List<String> parameterList) {
        StringBuilder parameter = new StringBuilder();

        parameterList.forEach(parameter::append);

        return Hashing.sha256().hashString(parameter.toString(), StandardCharsets.UTF_8).toString();
    }

    public static String generateSHA1(List<String> parameterList) {
        StringBuilder parameter = new StringBuilder();

        parameterList.forEach(parameter::append);

        String result = parameter.toString();

        return Hashing.sha1().hashString(result, StandardCharsets.UTF_8).toString();
    }
}
