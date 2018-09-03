/*
 * Copyright 2014-2018 Chronicle Software
 *
 * http://chronicle.software
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
package net.openhft.chronicle.queue.impl.table;

import net.openhft.chronicle.bytes.MappedBytes;
import net.openhft.chronicle.core.values.LongValue;
import net.openhft.chronicle.queue.impl.TableStore;
import net.openhft.chronicle.wire.WireOut;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.io.File;
import java.util.function.Function;

public class ReadonlyTableStore<T extends Metadata> implements TableStore<T> {
    private final T metadata;

    public ReadonlyTableStore(T metadata) {
        this.metadata = metadata;
    }

    @Override
    public T metadata() {
        return metadata;
    }

    @Override
    public void close() {
    }

    @Override
    public LongValue acquireValueFor(CharSequence key, long defaultValue) {
        throw new UnsupportedOperationException("Read only");
    }

    @Override
    public <R> R doWithExclusiveLock(Function<TableStore<T>, ? extends R> code) {
        UnsupportedOperationException read_only = new UnsupportedOperationException("Read only");
        read_only.printStackTrace();
        throw read_only;
    }

    @Nullable
    @Override
    public File file() {
        UnsupportedOperationException read_only = new UnsupportedOperationException("Read only");
        read_only.printStackTrace();
        throw read_only;
    }

    @NotNull
    @Override
    public MappedBytes bytes() {
        UnsupportedOperationException read_only = new UnsupportedOperationException("Read only");
        read_only.printStackTrace();
        throw read_only;
    }

    @NotNull
    @Override
    public String dump() {
        UnsupportedOperationException read_only = new UnsupportedOperationException("Read only");
        read_only.printStackTrace();
        throw read_only;
    }

    @Override
    public void reserve() throws IllegalStateException {
        UnsupportedOperationException read_only = new UnsupportedOperationException("Read only");
        read_only.printStackTrace();
        throw read_only;
    }

    @Override
    public void release() throws IllegalStateException {
        UnsupportedOperationException read_only = new UnsupportedOperationException("Read only");
        read_only.printStackTrace();
        throw read_only;
    }

    @Override
    public long refCount() {
        UnsupportedOperationException read_only = new UnsupportedOperationException("Read only");
        read_only.printStackTrace();
        throw read_only;
    }

    @Override
    public boolean tryReserve() {
        return false;
    }

    @Override
    public void writeMarshallable(@NotNull WireOut wire) {
        UnsupportedOperationException read_only = new UnsupportedOperationException("Read only");
        read_only.printStackTrace();
        throw read_only;
    }
}
