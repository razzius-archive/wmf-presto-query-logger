package org.wikimedia.presto;

import java.util.Map;

import com.facebook.presto.spi.eventlistener.EventListener;
import com.facebook.presto.spi.eventlistener.QueryCompletedEvent;

import lombok.extern.slf4j.Slf4j;

/**
 * Send Presto queries to EventGate.
 *
 */
@Slf4j
public class QueryLogger implements EventListener {
    public QueryLogger(Map<String, String> config) {}

    @Override
    public void queryCompleted(QueryCompletedEvent queryCompletedEvent) {
        EventListener.super.queryCompleted(queryCompletedEvent);
        log.info("Query completed");
        // @TODO extract information out of queryCompletedEvent
    }
}
