/*
 * JBoss, Home of Professional Open Source
 * Copyright 2008, JBoss Inc., and individual contributors as indicated
 * by the @authors tag. See the copyright.txt in the distribution for a
 * full listing of individual contributors.
 *
 * This is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation; either version 2.1 of
 * the License, or (at your option) any later version.
 *
 * This software is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this software; if not, write to the Free
 * Software Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA
 * 02110-1301 USA, or see the FSF site: http://www.fsf.org.
 */

package org.jboss.marshalling.util;

import org.jboss.marshalling.reflect.SerializableField;
import java.io.IOException;

/**
 *
 */
public class FloatReadField extends ReadField {

    private final float value;

    public FloatReadField(final SerializableField field, final float value) {
        super(field.getName(), false);
        this.value = value;
    }

    public FloatReadField(final SerializableField field) {
        super(field.getName(), true);
        value = 0;
    }

    public float getFloat() throws IOException {
        return value;
    }
}
