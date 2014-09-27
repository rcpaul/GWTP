/**
 * Copyright 2014 ArcBees Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */

package com.gwtplatform.dispatch.rest.client.actionhandler;

import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.inject.Provider;
import com.gwtplatform.dispatch.client.actionhandler.AbstractClientActionHandler;
import com.gwtplatform.dispatch.client.actionhandler.ClientActionHandler;
import com.gwtplatform.dispatch.client.actionhandler.ExecuteCommand;
import com.gwtplatform.dispatch.client.actionhandler.UndoCommand;
import com.gwtplatform.dispatch.rest.shared.RestAction;
import com.gwtplatform.dispatch.shared.DispatchRequest;

public class SampleClientActionHandler extends AbstractClientActionHandler<RestAction, Object> {

    public SampleClientActionHandler() {
        super(RestAction.class);
    }

    @Override
    public DispatchRequest execute(RestAction action, AsyncCallback<Object> resultCallback,
            ExecuteCommand<RestAction, Object> executeCommand) {
        return null;
    }

    @Override
    public DispatchRequest undo(RestAction action, Object result, AsyncCallback<Void> callback,
            UndoCommand<RestAction, Object> undoCommand) {
        return null;
    }
}
