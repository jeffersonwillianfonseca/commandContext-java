package br.com.jeffersonwillianfonseca.command.context.context;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class CommandContext {
    private final Map<String, Object> data = new HashMap<>();

    public void put(String key, Object value) {
        data.put(key, value);
    }

    public <T> Optional<T> get(String key, Class<T> type) {
        return Optional.ofNullable(type.cast(data.get(key)));
    }
}

