/**
 * Copyright (c) 2005-2011 by Appcelerator, Inc. All Rights Reserved.
 * Licensed under the terms of the Eclipse Public License (EPL).
 * Please see the license.txt included with this distribution for details.
 * Any modifications to this file must keep this entire header intact.
 */
package org.python.pydev.core;

public interface ISourceModule extends IModule {

    /**
     * @return a Module (it is declared as object because in the core we do not have access to the SimpleNode or Module)
     */
    public Object getAst();
}
