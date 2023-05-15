/*
 * MIT License
 *
 * Copyright (c) 2023 BlvckBytes
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package me.blvckbytes.bbreflect.packets.communicator;

import me.blvckbytes.bbreflect.version.ServerVersion;

public enum EInventoryClickType {
  PICKUP,
  QUICK_MOVE,
  SWAP,
  CLONE,
  THROW,
  QUICK_CRAFT,
  PICKUP_ALL,

  UNKNOWN
  ;

  private static final EInventoryClickType[] values = values();

  public static EInventoryClickType fromOrdinal(int ordinal, ServerVersion version) {
    // NOTE: For now, the server version is not taken into account, but this might change in the future

    if (ordinal < 0 || ordinal >= values.length)
      return UNKNOWN;

    return values[ordinal];
  }
}