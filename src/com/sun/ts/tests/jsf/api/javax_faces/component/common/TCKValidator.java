/*
 * Copyright (c) 2009, 2018 Oracle and/or its affiliates. All rights reserved.
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

package com.sun.ts.tests.jsf.api.javax_faces.component.common;

import jakarta.faces.component.UIComponent;
import jakarta.faces.component.UIInput;
import jakarta.faces.context.FacesContext;
import jakarta.faces.validator.Validator;

public class TCKValidator implements Validator {

  private static StringBuffer log = new StringBuffer();

  private String id;

  private boolean markInvalid;

  public TCKValidator() {
  }

  public TCKValidator(String id, boolean markInvalid) {
    this.id = id;
    this.markInvalid = markInvalid;
  }

  public void validate(FacesContext context, UIComponent component,
      Object value) {
    log.append("/" + id);
    if (markInvalid) {
      ((UIInput) component).setValid(false);
    }
  }

  public void markInvalid(boolean markInvalid) {
    this.markInvalid = markInvalid;
  }

  public static String getTrace() {
    return log.toString();
  }

  public static void clearTrace() {
    log = new StringBuffer();
  }
}
