package com.hawolt.xmpp.event.events;

import com.hawolt.xmpp.event.AbstractEvent;
import com.hawolt.xmpp.event.GenericEvent;
import com.hawolt.xmpp.event.objects.other.PlainData;

/**
 * Created: 14/04/2022 03:17
 * Author: Twitter @hawolt
 **/

public class ReadyEvent extends GenericEvent<PlainData> {
    private final PlainData object;

    public ReadyEvent(AbstractEvent event) {
        super(event);
        this.object = new PlainData(event.getPlain());
    }

    @Override
    public PlainData get() {
        return object;
    }
}
