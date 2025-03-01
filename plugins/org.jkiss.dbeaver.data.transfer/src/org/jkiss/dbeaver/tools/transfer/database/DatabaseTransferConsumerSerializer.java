/*
 * DBeaver - Universal Database Manager
 * Copyright (C) 2010-2023 DBeaver Corp and others
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
package org.jkiss.dbeaver.tools.transfer.database;

import org.jkiss.code.NotNull;
import org.jkiss.dbeaver.Log;
import org.jkiss.dbeaver.model.exec.DBCException;
import org.jkiss.dbeaver.model.runtime.DBRRunnableContext;
import org.jkiss.dbeaver.model.task.DBTTask;
import org.jkiss.dbeaver.tools.transfer.serialize.DTObjectSerializer;
import org.jkiss.dbeaver.tools.transfer.serialize.SerializerContext;

import java.util.Map;

/**
 * This serialized does nothing. All settings are stored in DatabaseConsumerSettings.
 * Data transfer job initializes all pipe nodes with their settings and passed input (producer) object.
 * Thus consumer can find its settings (by searching in ConsumerSettings by producer object).
 */
public class DatabaseTransferConsumerSerializer implements DTObjectSerializer<DBTTask, DatabaseTransferConsumer> {

    private static final Log log = Log.getLog(DatabaseTransferConsumerSerializer.class);

    @Override
    public void serializeObject(@NotNull DBRRunnableContext runnableContext, @NotNull DBTTask context, @NotNull DatabaseTransferConsumer object, @NotNull Map<String, Object> state) {

    }

    @Override
    public DatabaseTransferConsumer deserializeObject(@NotNull DBRRunnableContext runnableContext, @NotNull SerializerContext serializeContext, @NotNull DBTTask objectContext, @NotNull Map<String, Object> state) throws DBCException {
        return new DatabaseTransferConsumer();
    }
}
