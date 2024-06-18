package jakarta.faces.webapp;

import java.util.List;
import java.util.Set;

/*
 * Copyright 2024 OmniFish and/or its affiliates. All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v. 2.0, which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * This Source Code may also be made available under the following Secondary
 * Licenses when the conditions for such availability set forth in the
 * Eclipse Public License v. 2.0 are satisfied: GNU General Public License,
 * version 2 with the GNU Classpath Exception, which is available at
 * https://www.gnu.org/software/classpath/license.html.
 *
 * SPDX-License-Identifier: EPL-2.0 OR GPL-2.0 WITH Classpath-exception-2.0
 */
public class BridgeEE8ToEE9 {
    public static class TypedCollections {
        public static <E> List<E> dynamicallyCastList(List<?> list, Class<E> type) {
            return jakarta.faces.webapp.TypedCollections.dynamicallyCastList(list, type);
        }

        public static <E> Set<E> dynamicallyCastSet(Set<?> set, Class<E> type) {
            return jakarta.faces.webapp.TypedCollections.dynamicallyCastSet(set, type);
        }
    }
}
