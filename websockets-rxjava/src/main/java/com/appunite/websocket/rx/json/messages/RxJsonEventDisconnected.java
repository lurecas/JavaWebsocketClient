/*
 * Copyright (C) 2015 Jacek Marchwicki <jacek.marchwicki@gmail.com>
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License
 */

package com.appunite.websocket.rx.json.messages;

import com.appunite.websocket.rx.json.JsonWebSocketSender;
import com.appunite.websocket.rx.messages.RxEventDisconnected;

import javax.annotation.Nonnull;

/**
 * Event indicate that client was disconnected to the server
 *
 * since then all execution on previosly returned {@link JsonWebSocketSender} will cause throwing
 * {@link com.appunite.websocket.NotConnectedException}
 *
 * See: {@link RxEventDisconnected}
 */
public class RxJsonEventDisconnected extends RxJsonEvent {
    @Nonnull
    private final Exception exception;

    public RxJsonEventDisconnected(@Nonnull Exception exception) {
        super();
        this.exception = exception;
    }

    /**
     * See: {@link RxEventDisconnected#exception()}
     */
    @Nonnull
    public Exception exception() {
        return exception;
    }

    @Override
    public String toString() {
        return "RxJsonEventDisconnected{" + "exception=" + exception + '}';
    }
}