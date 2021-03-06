/**
 * Copyright (C) 2014-2016 LinkedIn Corp. (pinot-core@linkedin.com)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.linkedin.pinot.core.io.compression;

import java.io.IOException;
import java.nio.ByteBuffer;


/**
 * Interface to compress a chunk of data.
 */
public interface ChunkCompressor {

  /**
   * This method compresses the given data.
   *
   * @param inUncompressed Input data to be compressed.
   * @param outCompressed Output compressed data.
   * @return Size of the compressed output data.
   *
   * @throws IOException
   */
  int compress(ByteBuffer inUncompressed, ByteBuffer outCompressed)
      throws IOException;
}
