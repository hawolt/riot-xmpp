package com.hawolt.xmpp.event.objects.other;

import com.hawolt.xmpp.event.BaseObject;

/**
 * Created: 18/07/2022 12:33
 * Author: Twitter @hawolt
 **/

public class PlainData extends BaseObject {
    private final String plain;

    public PlainData(String plain) {
        this.plain = plain;
    }

    public String getPlain() {
        return plain;
    }
}
