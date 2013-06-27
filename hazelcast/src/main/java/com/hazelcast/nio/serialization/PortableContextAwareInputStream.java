/*
 * Copyright (c) 2008-2013, Hazelcast, Inc. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.hazelcast.nio.serialization;

import java.io.InputStream;

/**
 * @mdogan 06/15/13
 */
abstract class PortableContextAwareInputStream extends InputStream {

    private int factoryId;

    private int dataClassId;

    private int dataVersion;

    final int getFactoryId() {
        return factoryId;
    }

    final void setFactoryId(int factoryId) {
        this.factoryId = factoryId;
    }

    final int getDataClassId() {
        return dataClassId;
    }

    final void setDataClassId(int classId) {
        this.dataClassId = classId;
    }

    final int getDataVersion() {
        return dataVersion;
    }

    final void setDataVersion(int dataVersion) {
        this.dataVersion = dataVersion;
    }

}