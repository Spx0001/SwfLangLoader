/*
 * This file is part of ArakneLangLoader.
 *
 * ArakneLangLoader is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * ArakneLangLoader is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with ArakneLangLoader.  If not, see <https://www.gnu.org/licenses/>.
 *
 * Copyright (c) 2020 Vincent Quatrevieux
 */

package fr.arakne.swflangloader.parser;

/**
 * Assignation type
 */
public interface AssignationType {
    /**
     * Parse a simple assignation
     *
     * @param varName The assigned variable name
     * @param value The assigned raw value
     *
     * @return The assignation
     */
    default public Assignation parseSimple(String varName, String value) {
        return Assignation.NULL;
    }

    /**
     * Parse a map assignation
     *
     * @param varName The assigned variable name
     * @param key The assignation raw key
     * @param value The assigned raw value
     *
     * @return The assignation
     */
    default public Assignation parseAssociative(String varName, String key, String value) {
        return Assignation.NULL;
    }
}
