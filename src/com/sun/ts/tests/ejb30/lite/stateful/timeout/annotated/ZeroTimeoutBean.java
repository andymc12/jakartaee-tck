/*
 * Copyright (c) 2007, 2020 Oracle and/or its affiliates. All rights reserved.
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

/*
 * $Id$
 */

package com.sun.ts.tests.ejb30.lite.stateful.timeout.annotated;

import java.util.concurrent.TimeUnit;

import jakarta.ejb.AccessTimeout;
import jakarta.ejb.Local;
import jakarta.ejb.Stateful;
import jakarta.ejb.StatefulTimeout;

import com.sun.ts.tests.ejb30.lite.stateful.timeout.common.StatefulTimeoutBeanBase;
import com.sun.ts.tests.ejb30.lite.stateful.timeout.common.StatefulTimeoutIF;

@Stateful
@StatefulTimeout(value = 0, unit = TimeUnit.DAYS)
@AccessTimeout(value = StatefulTimeoutIF.TIMEOUT_DAYS, unit = TimeUnit.DAYS)
@Local(StatefulTimeoutIF.class)
public class ZeroTimeoutBean extends StatefulTimeoutBeanBase {

}
