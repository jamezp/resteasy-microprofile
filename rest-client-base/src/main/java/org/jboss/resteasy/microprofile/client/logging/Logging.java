/*
 * JBoss, Home of Professional Open Source.
 *
 * Copyright 2025 Red Hat, Inc., and individual contributors
 * as indicated by the @author tags.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.jboss.resteasy.microprofile.client.logging;

import java.lang.invoke.MethodHandles;

import org.jboss.logging.Logger;

/**
 * @author <a href="mailto:jperkins@redhat.com">James R. Perkins</a>
 */
class Logging {

    @SuppressWarnings("removal")
    static LogMessages findLogger() {
        try {
            return Logger.getMessageLogger(MethodHandles.lookup(), LogMessages.class, "org.jboss.resteasy.microprofile.client");
        } catch (Throwable ignore) {
        }
        return Logger.getMessageLogger(LogMessages.class, "org.jboss.resteasy.microprofile.client");
    }
}
