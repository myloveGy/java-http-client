package io.github.mylovegy;

import java.util.Map;

public class Helper {
    public static String getQueryString(String url, Map<String, Object> query) {
        StringBuilder builder = new StringBuilder(url);
        if (!query.isEmpty()) {
            // ?
            if (url.contains("?")) {
                // username=1&
                if (!url.endsWith("&")) {
                    builder.append("&");
                }
            } else {
                builder.append("?");
            }

            for (Map.Entry<String, Object> entry : query.entrySet()) {
                builder.append(entry.getKey()).append("=").append(entry.getValue().toString()).append("&");
            }

            builder.delete(builder.length() - 1, builder.length());
        }

        return builder.toString();
    }
}
